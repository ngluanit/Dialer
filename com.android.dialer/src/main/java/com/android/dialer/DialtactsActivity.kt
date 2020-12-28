/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.dialer

import android.Manifest
import android.app.Fragment
import android.app.FragmentTransaction
import android.app.role.RoleManager
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Trace
import android.provider.CallLog
import android.provider.Settings
import android.speech.RecognizerIntent
import android.telecom.PhoneAccount
import android.telecom.TelecomManager
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.util.Log
import android.view.*
import android.view.View.OnDragListener
import android.view.View.OnTouchListener
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.android.contacts.common.dialog.ClearFrequentsDialog
import com.android.contacts.common.interactions.ImportExportDialogFragment
import com.android.contacts.common.interactions.TouchPointManager
import com.android.contacts.common.list.OnPhoneNumberPickerActionListener
import com.android.contacts.common.util.PermissionsUtil
import com.android.contacts.common.widget.FloatingActionButtonController
import com.android.dialer.calllog.CallLogActivity
import com.android.dialer.calllog.CallLogFragment
import com.android.dialer.database.DialerDatabaseHelper
import com.android.dialer.databinding.DialtactsActivityBinding
import com.android.dialer.dialpad.DialpadFragment
import com.android.dialer.dialpad.DialpadFragment.OnDialpadQueryChangedListener
import com.android.dialer.dialpad.SmartDialNameMatcher
import com.android.dialer.dialpad.SmartDialPrefix
import com.android.dialer.interactions.PhoneNumberInteraction
import com.android.dialer.list.*
import com.android.dialer.logging.Logger
import com.android.dialer.logging.ScreenEvent
import com.android.dialer.settings.DialerSettingsActivity
import com.android.dialer.util.*
import com.android.dialer.util.IntentUtil.CallIntentBuilder
import com.android.dialer.voicemail.VoicemailArchiveActivity
import com.android.dialer.widget.ActionBarController
import com.android.dialer.widget.ActionBarController.ActivityUi
import com.android.dialer.widget.SearchEditTextLayout
import com.android.dialerbind.DatabaseHelperManager
import com.android.dialerbind.ObjectFactory
import com.android.phone.common.animation.AnimUtils
import com.android.phone.common.animation.AnimationListenerAdapter
import com.google.common.annotations.VisibleForTesting
import com.moez.QKSMS.common.Navigator
import com.moez.QKSMS.common.util.extensions.viewBinding
import com.moez.QKSMS.feature.conversations.ConversationItemTouchCallback
import com.moez.QKSMS.feature.conversations.ConversationsAdapter
import com.moez.QKSMS.feature.main.*
import com.moez.QKSMS.manager.ChangelogManager
import dagger.android.AndroidInjection
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject
import javax.inject.Inject

/**
 * The dialer tab's title is 'phone', a more common name (see strings.xml).
 */
class DialtactsActivity : TransactionSafeActivity(), View.OnClickListener, OnDialpadQueryChangedListener, OnListFragmentScrolledListener, CallLogFragment.HostInterface, DialpadFragment.HostInterface, ListsFragment.HostInterface, SpeedDialFragment.HostInterface, SearchFragment.HostInterface, OnDragDropListener, OnPhoneNumberPickerActionListener, PopupMenu.OnMenuItemClickListener, OnPageChangeListener, ActivityUi, MainView {
    private var mParentLayout: CoordinatorLayout? = null

    /**
     * Fragment containing the dialpad that slides into view
     */
    protected var mDialpadFragment: DialpadFragment? = null

    /**
     * Fragment for searching phone numbers using the alphanumeric keyboard.
     */
    private var mRegularSearchFragment: RegularSearchFragment? = null

    /**
     * Fragment for searching phone numbers using the dialpad.
     */
    private var mSmartDialSearchFragment: SmartDialSearchFragment? = null

    /**
     * Animation that slides in.
     */
    private var mSlideIn: Animation? = null

    /**
     * Animation that slides out.
     */
    private var mSlideOut: Animation? = null
    var mSlideInListener: AnimationListenerAdapter = object : AnimationListenerAdapter() {
        override fun onAnimationEnd(animation: Animation) {
            maybeEnterSearchUi()
        }
    }

    /**
     * Listener for after slide out animation completes on dialer fragment.
     */
    var mSlideOutListener: AnimationListenerAdapter = object : AnimationListenerAdapter() {
        override fun onAnimationEnd(animation: Animation) {
            commitDialpadFragmentHide()
        }
    }

    /**
     * Fragment containing the speed dial list, call history list, and all contacts list.
     */
    private var mListsFragment: ListsFragment? = null

    /**
     * Tracks whether onSaveInstanceState has been called. If true, no fragment transactions can
     * be commited.
     */
    private var mStateSaved = false
    private var mIsRestarting = false
    private var mInDialpadSearch = false
    private var mInRegularSearch = false
    private var mClearSearchOnPause = false
    private var mIsDialpadShown = false
    private var mShowDialpadOnResume = false

    /**
     * Whether or not the device is in landscape orientation.
     */
    private var mIsLandscape = false

    /**
     * True if the dialpad is only temporarily showing due to being in call
     */
    private var mInCallDialpadUp = false

    /**
     * True when this activity has been launched for the first time.
     */
    private var mFirstLaunch = false

    /**
     * Search query to be applied to the SearchView in the ActionBar once
     * onCreateOptionsMenu has been called.
     */
    private var mPendingSearchViewQuery: String? = null
    private var mOverflowMenu: PopupMenu? = null
    private var mSearchView: EditText? = null
    private var mVoiceSearchButton: View? = null
    private var mSearchQuery: String? = null
    private var mDialpadQuery: String? = null
    private var mDialerDatabaseHelper: DialerDatabaseHelper? = null
    private var mDragDropController: DragDropController? = null
    private var mActionBarController: ActionBarController? = null
    private var mFloatingActionButtonController: FloatingActionButtonController? = null
    private var mActionBarHeight = 0
    private var mPreviouslySelectedTabIndex = 0
    @Inject
    lateinit var conversationsAdapter: ConversationsAdapter

    /**
     * The text returned from a voice search query.  Set in [.onActivityResult] and used in
     * [.onResume] to populate the search box.
     */
    private var mVoiceSearchQuery: String? = null
    override val onNewIntentIntent: Subject<Intent> = PublishSubject.create()
    override val activityResumedIntent: Subject<Boolean> = PublishSubject.create()
    override val queryChangedIntent: Observable<CharSequence> = PublishSubject.create()
    override val composeIntent: Observable<Unit> = PublishSubject.create()
    override val drawerOpenIntent: Observable<Boolean> = PublishSubject.create()
    override val homeIntent: Subject<Unit> = PublishSubject.create()
    override val navigationIntent: Observable<NavItem> = PublishSubject.create()
    override val optionsItemIntent: Subject<Int> = PublishSubject.create()
    override val plusBannerIntent: Subject<Int> = PublishSubject.create()
    override val dismissRatingIntent: Subject<Int> = PublishSubject.create()
    override val rateIntent: Subject<Int> = PublishSubject.create()
    override val conversationsSelectedIntent: Observable<List<Long>> = PublishSubject.create()
    override val confirmDeleteIntent: Subject<List<Long>> = PublishSubject.create()
    override val swipeConversationIntent: Observable<Pair<Long, Int>> = PublishSubject.create()
    override val changelogMoreIntent: Subject<Int> = PublishSubject.create()
    override val undoArchiveIntent: Subject<Unit> = PublishSubject.create()
    override val snackbarButtonIntent: Observable<Unit> = PublishSubject.create()
    private val binding by viewBinding(DialtactsActivityBinding::inflate)

    @Inject
    lateinit var itemTouchCallback: ConversationItemTouchCallback
    @Inject
    lateinit var navigator: Navigator
    override fun requestDefaultSms() {
       // navigator.showDefaultSmsDialog(this)
    }

    override fun requestPermissions() {
        ActivityCompat.requestPermissions(this, arrayOf(
                Manifest.permission.READ_SMS,
                Manifest.permission.SEND_SMS,
                Manifest.permission.READ_CONTACTS), 0)
    }

    override fun clearSearch() {}
    override fun clearSelection() {}
    override fun themeChanged() {}
    override fun showBlockingDialog(conversations: List<Long>, block: Boolean) {}
    override fun showDeleteDialog(conversations: List<Long>) {}
    override fun showChangelog(changelog: ChangelogManager.Changelog) {}
    override fun showArchivedSnackbar() {}
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by lazy { ViewModelProviders.of(this, viewModelFactory)[MainViewModel::class.java] }
    private val REQUEST_DEFAULT_DIALER = 123

    protected inner class OptionsPopupMenu(context: Context?, anchor: View?) : PopupMenu(context, anchor, Gravity.END) {
        override fun show() {
            val hasContactsPermission = PermissionsUtil.hasContactsPermissions(this@DialtactsActivity)
            val menu = menu
            val clearFrequents = menu.findItem(R.id.menu_clear_frequents)
            clearFrequents.isVisible = mListsFragment != null && mListsFragment!!.speedDialFragment != null &&
                    mListsFragment!!.speedDialFragment.hasFrequents() && hasContactsPermission
            menu.findItem(R.id.menu_import_export).isVisible = hasContactsPermission
            menu.findItem(R.id.menu_add_contact).isVisible = hasContactsPermission
            menu.findItem(R.id.menu_history).isVisible = PermissionsUtil.hasPhonePermissions(this@DialtactsActivity)
            super.show()
        }
    }

    /**
     * Listener that listens to drag events and sends their x and y coordinates to a
     * [DragDropController].
     */
    private inner class LayoutOnDragListener : OnDragListener {
        override fun onDrag(v: View, event: DragEvent): Boolean {
            if (event.action == DragEvent.ACTION_DRAG_LOCATION) {
                mDragDropController!!.handleDragHovered(v, event.x.toInt(), event.y.toInt())
            }
            return true
        }
    }

    /**
     * Listener used to send search queries to the phone search fragment.
     */
    fun checkDefaultDialer() {
        lateinit var intent: Intent
        lateinit var roleManager: RoleManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (Build.MODEL == "Vivo") {
                Toast.makeText(this, "Go to Settings -> More settings -> Permission management(Applications) -> Default app settings to change the default apps.", Toast.LENGTH_SHORT).show()
                startActivityForResult(Intent(Settings.ACTION_SETTINGS), 0)
            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    roleManager = applicationContext.getSystemService(RoleManager::class.java)
                    if (roleManager.isRoleAvailable(RoleManager.ROLE_DIALER)) {
                        if (roleManager.isRoleHeld(RoleManager.ROLE_DIALER)) {
                        } else {
                            val roleRequestIntent = roleManager.createRequestRoleIntent(
                                    RoleManager.ROLE_DIALER)
                            startActivityForResult(roleRequestIntent, 2)
                        }
                    }
                } else {
                    intent = Intent(TelecomManager.ACTION_CHANGE_DEFAULT_DIALER)
                            .putExtra(TelecomManager.EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME, packageName)
                    startActivityForResult(intent, REQUEST_DEFAULT_DIALER)
                }
            }
        }
    }

    private val mPhoneSearchQueryTextListener: TextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            val newText = s.toString()
            if (newText == mSearchQuery) {
                // If the query hasn't changed (perhaps due to activity being destroyed
                // and restored, or user launching the same DIAL intent twice), then there is
                // no need to do anything here.
                return
            }
            if (DEBUG) {
                Log.d(TAG, "onTextChange for mSearchView called with new query: $newText")
                Log.d(TAG, "Previous Query: $mSearchQuery")
            }
            mSearchQuery = newText

            // Show search fragment only when the query string is changed to non-empty text.
            if (!TextUtils.isEmpty(newText)) {
                // Call enterSearchUi only if we are switching search modes, or showing a search
                // fragment for the first time.
                val sameSearchMode = mIsDialpadShown && mInDialpadSearch ||
                        !mIsDialpadShown && mInRegularSearch
                if (!sameSearchMode) {
                    enterSearchUi(mIsDialpadShown, mSearchQuery, true /* animate */)
                }
            }
            if (mSmartDialSearchFragment != null && mSmartDialSearchFragment!!.isVisible) {
                mSmartDialSearchFragment!!.setQueryString(mSearchQuery, false /* delaySelection */)
            } else if (mRegularSearchFragment != null && mRegularSearchFragment!!.isVisible) {
                mRegularSearchFragment!!.setQueryString(mSearchQuery, false /* delaySelection */)
            }
        }

        override fun afterTextChanged(s: Editable) {}
    }

    /**
     * Open the search UI when the user clicks on the search box.
     */
    private val mSearchViewOnClickListener = View.OnClickListener {
        if (!isInSearchUi) {
            println("mmmmmmsmmsms"+mListsFragment!!.currentTabIndex)
            mActionBarController!!.onSearchBoxTapped()
            if (mListsFragment!!.currentTabIndex==ListsFragment.TAB_INDEX_VOICEMAIL||mListsFragment!!.currentTabIndex==ListsFragment.TAB_INDEX_VOICEMAIL){

            }else{
                enterSearchUi(false /* smartDialSearch */, mSearchView!!.text.toString(),
                        true /* animate */)
            }

        }
    }

    /**
     * Handles the user closing the soft keyboard.
     */
    private val mSearchEditTextLayoutListener = View.OnKeyListener { v, keyCode, event ->
        if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_DOWN) {
            if (TextUtils.isEmpty(mSearchView!!.text.toString())) {
                // If the search term is empty, close the search UI.
                maybeExitSearchUi()
            } else {
                // If the search term is not empty, show the dialpad fab.
                showFabInSearchUi()
            }
        }
        false
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        if (ev.action == MotionEvent.ACTION_DOWN) {
            TouchPointManager.getInstance().setPoint(ev.rawX.toInt(), ev.rawY.toInt())
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Trace.beginSection(TAG + " onCreate")
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.bindView(this)

        itemTouchCallback.adapter = conversationsAdapter
        // add by geniusgithub
        val hasStartPermissionActivity = ForceRequestPermissionsActivity.startPermissionActivity(this)
//        val telecomManager = getSystemService(Context.TELECOM_SERVICE) as TelecomManager
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (telecomManager.defaultDialerPackage == packageName) {
//                startActivity(Intent(this,ForceRequestPermissionsActivity::class.java))
//            } else {
//                startActivity(Intent(this,ForceRequestPermissionsActivity::class.java))
//            }
//        }
        // add by geniusgithub
        mFirstLaunch = true
        val resources = resources
        mActionBarHeight = resources.getDimensionPixelSize(R.dimen.action_bar_height_large)
        Trace.beginSection(TAG + " setContentView")
        Trace.endSection()
        window.setBackgroundDrawable(null)
        Trace.beginSection(TAG + " setup Views")
        val actionBar = supportActionBar
        actionBar!!.setCustomView(R.layout.search_edittext)
        actionBar.setDisplayShowCustomEnabled(true)
        actionBar.setBackgroundDrawable(null)
        val searchEditTextLayout = actionBar
                .customView.findViewById<View>(R.id.search_view_container) as SearchEditTextLayout
        searchEditTextLayout.setPreImeKeyListener(mSearchEditTextLayoutListener)
        mActionBarController = ActionBarController(this, searchEditTextLayout)
        mSearchView = searchEditTextLayout.findViewById<View>(R.id.search_view) as EditText
        mSearchView!!.addTextChangedListener(mPhoneSearchQueryTextListener)
        mVoiceSearchButton = searchEditTextLayout.findViewById(R.id.voice_search_button)
        searchEditTextLayout.findViewById<View>(R.id.search_magnifying_glass)
                .setOnClickListener(mSearchViewOnClickListener)
        searchEditTextLayout.findViewById<View>(R.id.search_box_start_search)
                .setOnClickListener(mSearchViewOnClickListener)
        searchEditTextLayout.setOnClickListener(mSearchViewOnClickListener)
        searchEditTextLayout.setCallback(object : SearchEditTextLayout.Callback {
            override fun onBackButtonClicked() {
                onBackPressed()
            }

            override fun onSearchViewClicked() {
                // Hide FAB, as the keyboard is shown.
                mFloatingActionButtonController!!.scaleOut()
            }
        })
        mIsLandscape = (getResources().configuration.orientation
                == Configuration.ORIENTATION_LANDSCAPE)
        mPreviouslySelectedTabIndex = ListsFragment.TAB_INDEX_SPEED_DIAL
        val floatingActionButtonContainer = findViewById<View>(
                R.id.floating_action_button_container)
        val floatingActionButton = findViewById<View>(R.id.floating_action_button) as ImageButton
        floatingActionButton.setOnClickListener(this)
        mFloatingActionButtonController = FloatingActionButtonController(this,
                floatingActionButtonContainer, floatingActionButton)
        val optionsMenuButton = searchEditTextLayout.findViewById<View>(R.id.dialtacts_options_menu_button) as ImageButton
        optionsMenuButton.setOnClickListener(this)
        mOverflowMenu = buildOptionsMenu(searchEditTextLayout)
        optionsMenuButton.setOnTouchListener((mOverflowMenu as OptionsPopupMenu).getDragToOpenListener())

        // Add the favorites fragment but only if savedInstanceState is null. Otherwise the
        // fragment manager is responsible for recreating it.
        if (savedInstanceState == null) {
            fragmentManager.beginTransaction()
                    .add(R.id.dialtacts_frame, ListsFragment(), TAG_FAVORITES_FRAGMENT)
                    .commit()
        } else {
            mSearchQuery = savedInstanceState.getString(KEY_SEARCH_QUERY)
            mInRegularSearch = savedInstanceState.getBoolean(KEY_IN_REGULAR_SEARCH_UI)
            mInDialpadSearch = savedInstanceState.getBoolean(KEY_IN_DIALPAD_SEARCH_UI)
            mFirstLaunch = savedInstanceState.getBoolean(KEY_FIRST_LAUNCH)
            mShowDialpadOnResume = savedInstanceState.getBoolean(KEY_IS_DIALPAD_SHOWN)
            mActionBarController!!.restoreInstanceState(savedInstanceState)
        }
        val isLayoutRtl = DialerUtils.isRtl()
        if (mIsLandscape) {
            mSlideIn = AnimationUtils.loadAnimation(this,
                    if (isLayoutRtl) R.anim.dialpad_slide_in_left else R.anim.dialpad_slide_in_right)
            mSlideOut = AnimationUtils.loadAnimation(this,
                    if (isLayoutRtl) R.anim.dialpad_slide_out_left else R.anim.dialpad_slide_out_right)
        } else {
            mSlideIn = AnimationUtils.loadAnimation(this, R.anim.dialpad_slide_in_bottom)
            mSlideOut = AnimationUtils.loadAnimation(this, R.anim.dialpad_slide_out_bottom)
        }
        mSlideIn?.setInterpolator(AnimUtils.EASE_IN)
        mSlideOut?.setInterpolator(AnimUtils.EASE_OUT)
        mSlideIn?.setAnimationListener(mSlideInListener)
        mSlideOut?.setAnimationListener(mSlideOutListener)
        mParentLayout = findViewById<View>(R.id.dialtacts_mainlayout) as CoordinatorLayout
        mParentLayout!!.setOnDragListener(LayoutOnDragListener())
        floatingActionButtonContainer.viewTreeObserver.addOnGlobalLayoutListener(
                object : OnGlobalLayoutListener {
                    override fun onGlobalLayout() {
                        val observer = floatingActionButtonContainer.viewTreeObserver
                        if (!observer.isAlive) {
                            return
                        }
                        observer.removeOnGlobalLayoutListener(this)
                        val screenWidth = mParentLayout!!.width
                        mFloatingActionButtonController!!.setScreenWidth(screenWidth)
                        mFloatingActionButtonController!!.align(
                                fabAlignment, false /* animate */)
                    }
                })
        Trace.endSection()
        Trace.beginSection(TAG + " initialize smart dialing")
        mDialerDatabaseHelper = DatabaseHelperManager.getDatabaseHelper(this)
        SmartDialPrefix.initializeNanpSettings(this)
        Trace.endSection()
        Trace.endSection()
    }

    override fun render(state: MainState) {
        when (state.page) {
            is Inbox -> {
                Constant.getModelList(state.page.data)
                println("zzmzmzmz" + state.page.data?.size)
                if (Constant.getModelList(state.page.data).size > 0) {
                    println(",zmzmzmzzm" + Constant.conversationList.size)
                }
            }

        }

    }

    override fun onResume() {
        Trace.beginSection(TAG + " onResume")
        super.onResume()
        mStateSaved = false
        if (mFirstLaunch) {
            displayFragment(intent)
        } else if (!phoneIsInUse() && mInCallDialpadUp) {
            hideDialpadFragment(false, true)
            mInCallDialpadUp = false
        } else if (mShowDialpadOnResume) {
            showDialpadFragment(false)
            mShowDialpadOnResume = false
        }

        // If there was a voice query result returned in the {@link #onActivityResult} callback, it
        // will have been stashed in mVoiceSearchQuery since the search results fragment cannot be
        // shown until onResume has completed.  Active the search UI and set the search term now.
        if (!TextUtils.isEmpty(mVoiceSearchQuery)) {
            mActionBarController!!.onSearchBoxTapped()
            mSearchView!!.setText(mVoiceSearchQuery)
            mVoiceSearchQuery = null
        }
        mFirstLaunch = false
        if (mIsRestarting) {
            // This is only called when the activity goes from resumed -> paused -> resumed, so it
            // will not cause an extra view to be sent out on rotation
            if (mIsDialpadShown) {
                Logger.logScreenView(ScreenEvent.DIALPAD, this)
            }
            mIsRestarting = false
        }
        prepareVoiceSearchButton()
        mDialerDatabaseHelper!!.startSmartDialUpdateThread()
        mFloatingActionButtonController!!.align(fabAlignment, false /* animate */)
        if (CallLog.Calls.CONTENT_TYPE == intent.type) {
            // Externally specified extras take precedence to EXTRA_SHOW_TAB, which is only
            // used internally.
            val extras = intent.extras
            if (extras != null
                    && extras.getInt(CallLog.Calls.EXTRA_CALL_TYPE_FILTER) == CallLog.Calls.VOICEMAIL_TYPE) {
                mListsFragment!!.showTab(ListsFragment.TAB_INDEX_VOICEMAIL)
            } else {
                mListsFragment!!.showTab(ListsFragment.TAB_INDEX_HISTORY)
            }
        } else if (intent.hasExtra(EXTRA_SHOW_TAB)) {
            val index = intent.getIntExtra(EXTRA_SHOW_TAB, ListsFragment.TAB_INDEX_SPEED_DIAL)
            if (index < mListsFragment!!.tabCount) {
                mListsFragment!!.showTab(index)
            }
        }
        setSearchBoxHint()
        Trace.endSection()
        StatisticsUtil.onResume(this)
    }

    override fun onRestart() {
        super.onRestart()
        mIsRestarting = true
    }

    override fun onPause() {
        // Only clear missed calls if the pause was not triggered by an orientation change
        // (or any other confirguration change)
        if (!isChangingConfigurations) {
            updateMissedCalls()
        }
        if (mClearSearchOnPause) {
            hideDialpadAndSearchUi()
            mClearSearchOnPause = false
        }
//        if (mSlideOut!!.hasStarted() && !mSlideOut!!.hasEnded()) {
//            commitDialpadFragmentHide()
//        }
        StatisticsUtil.onPause(this)
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY_SEARCH_QUERY, mSearchQuery)
        outState.putBoolean(KEY_IN_REGULAR_SEARCH_UI, mInRegularSearch)
        outState.putBoolean(KEY_IN_DIALPAD_SEARCH_UI, mInDialpadSearch)
        outState.putBoolean(KEY_FIRST_LAUNCH, mFirstLaunch)
        outState.putBoolean(KEY_IS_DIALPAD_SHOWN, mIsDialpadShown)
        mActionBarController!!.saveInstanceState(outState)
        mStateSaved = true
    }

    override fun onAttachFragment(fragment: Fragment) {
        if (fragment is DialpadFragment) {
            mDialpadFragment = fragment
            if (!mIsDialpadShown && !mShowDialpadOnResume) {
                val transaction = fragmentManager.beginTransaction()
                transaction.hide(mDialpadFragment)
                transaction.commit()
            }
        } else if (fragment is SmartDialSearchFragment) {
            mSmartDialSearchFragment = fragment
            mSmartDialSearchFragment!!.setOnPhoneNumberPickerActionListener(this)
            if (!TextUtils.isEmpty(mDialpadQuery)) {
                mSmartDialSearchFragment!!.setAddToContactNumber(mDialpadQuery)
            }
        } else if (fragment is SearchFragment) {
            mRegularSearchFragment = fragment as RegularSearchFragment
            mRegularSearchFragment!!.setOnPhoneNumberPickerActionListener(this)
        } else if (fragment is ListsFragment) {
            mListsFragment = fragment
            mListsFragment!!.addOnPageChangeListener(this)
        }
    }

    protected fun handleMenuSettings() {
        val intent = Intent(this, DialerSettingsActivity::class.java)
        startActivity(intent)
    }

    override fun onClick(view: View) {
        val resId = view.id
        if (resId == R.id.floating_action_button) {
            if (mListsFragment!!.currentTabIndex
                    == ListsFragment.TAB_INDEX_ALL_CONTACTS && !mInRegularSearch) {
                DialerUtils.startActivityWithErrorToast(
                        this,
                        IntentUtil.getNewContactIntent(),
                        R.string.add_contact_not_available)
            } else if(mListsFragment!!.currentTabIndex
                    == ListsFragment.TAB_INDEX_VOICEMAIL && !mInRegularSearch){
                navigator.showCompose()
            }else if (!mIsDialpadShown) {
                mInCallDialpadUp = false
                showDialpadFragment(true)
            }
        } else if (resId == R.id.voice_search_button) {
            try {
                startActivityForResult(Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH),
                        ACTIVITY_REQUEST_CODE_VOICE_SEARCH)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this@DialtactsActivity, R.string.voice_search_not_available,
                        Toast.LENGTH_SHORT).show()
            }
        } else if (resId == R.id.dialtacts_options_menu_button) {
            mOverflowMenu!!.show()
        } else {
            Log.wtf(TAG, "Unexpected onClick event from $view")
        }
    }

    override fun onMenuItemClick(item: MenuItem): Boolean {
        if (!isSafeToCommitTransactions) {
            return true
        }
        val resId = item.itemId
        if (resId == R.id.menu_history) { // Use explicit CallLogActivity intent instead of ACTION_VIEW +
            // CONTENT_TYPE, so that we always open our call log from our dialer
            val intent = Intent(this, CallLogActivity::class.java)
            startActivity(intent)
        } else if (resId == R.id.menu_add_contact) {
            DialerUtils.startActivityWithErrorToast(
                    this,
                    IntentUtil.getNewContactIntent(),
                    R.string.add_contact_not_available)
        } else if (resId == R.id.menu_import_export) {
            // We hard-code the "contactsAreAvailable" argument because doing it properly would
            // involve querying a {@link ProviderStatusLoader}, which we don't want to do right
            // now in Dialtacts for (potential) performance reasons. Compare with how it is
            // done in {@link PeopleActivity}.
            if (mListsFragment!!.currentTabIndex == ListsFragment.TAB_INDEX_SPEED_DIAL) {
                ImportExportDialogFragment.show(fragmentManager, true,
                        DialtactsActivity::class.java, ImportExportDialogFragment.EXPORT_MODE_FAVORITES)
            } else {
                ImportExportDialogFragment.show(fragmentManager, true,
                        DialtactsActivity::class.java, ImportExportDialogFragment.EXPORT_MODE_DEFAULT)
            }
            Logger.logScreenView(ScreenEvent.IMPORT_EXPORT_CONTACTS, this)
            return true
        } else if (resId == R.id.menu_clear_frequents) {
            ClearFrequentsDialog.show(getFragmentManager());
            Logger.logScreenView(ScreenEvent.CLEAR_FREQUENTS, this);

            return true
        } else if (resId == R.id.menu_call_settings) {
            handleMenuSettings()
            Logger.logScreenView(ScreenEvent.SETTINGS, this)
            return true
        } else if (resId == R.id.menu_archive) {
            val intent = Intent(this, VoicemailArchiveActivity::class.java)
            startActivity(intent)
            return true
        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == ACTIVITY_REQUEST_CODE_VOICE_SEARCH) {
            if (resultCode == RESULT_OK) {
                val matches = data!!.getStringArrayListExtra(
                        RecognizerIntent.EXTRA_RESULTS)
                if (matches.size > 0) {
                    val match = matches[0]
                    mVoiceSearchQuery = match
                } else {
                    Log.e(TAG, "Voice search - nothing heard")
                }
            } else {
                Log.e(TAG, "Voice search failed")
            }
        } else if (requestCode == REQUEST_DEFAULT_DIALER) {
            navigator.showDefaultSmsDialog(this)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    /**
     * Update the number of unread voicemails (potentially other tabs) displayed next to the tab
     * icon.
     */
    fun updateTabUnreadCounts() {
        mListsFragment!!.updateTabUnreadCounts()
    }

    /**
     * Initiates a fragment transaction to show the dialpad fragment. Animations and other visual
     * updates are handled by a callback which is invoked after the dialpad fragment is shown.
     *
     * @see .onDialpadShown
     */
    private fun showDialpadFragment(animate: Boolean) {
        if (mIsDialpadShown || mStateSaved) {
            return
        }
        mIsDialpadShown = true
        mListsFragment!!.userVisibleHint = false
        val ft = fragmentManager.beginTransaction()
        if (mDialpadFragment == null) {
            mDialpadFragment = DialpadFragment()
            ft.add(R.id.dialtacts_container, mDialpadFragment, TAG_DIALPAD_FRAGMENT)
        } else {
            ft.show(mDialpadFragment)
        }
        mDialpadFragment!!.animate = animate
        Logger.logScreenView(ScreenEvent.DIALPAD, this)
        ft.commit()
        if (animate) {
            mFloatingActionButtonController!!.scaleOut()
        } else {
            mFloatingActionButtonController!!.isVisible = false
            maybeEnterSearchUi()
        }
        mActionBarController!!.onDialpadUp()
        mListsFragment!!.view!!.animate().alpha(0f).withLayer()

        //adjust the title, so the user will know where we're at when the activity start/resumes.
        setTitle(R.string.launcherDialpadActivityLabel)
    }

    /**
     * Callback from child DialpadFragment when the dialpad is shown.
     */
    fun onDialpadShown() {
        Assert.assertNotNull(mDialpadFragment)
        if (mDialpadFragment!!.animate) {
            mDialpadFragment!!.view!!.startAnimation(mSlideIn)
        } else {
            mDialpadFragment!!.setYFraction(0f)
        }
        updateSearchFragmentPosition()
    }

    /**
     * Initiates animations and other visual updates to hide the dialpad. The fragment is hidden in
     * a callback after the hide animation ends.
     *
     * @see .commitDialpadFragmentHide
     */
    fun hideDialpadFragment(animate: Boolean, clearDialpad: Boolean) {
        if (mDialpadFragment == null || mDialpadFragment!!.view == null) {
            return
        }
        if (clearDialpad) {
            // Temporarily disable accessibility when we clear the dialpad, since it should be
            // invisible and should not announce anything.
            mDialpadFragment!!.digitsWidget.importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
            mDialpadFragment!!.clearDialpad()
            mDialpadFragment!!.digitsWidget.importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_AUTO
        }
        if (!mIsDialpadShown) {
            return
        }
        mIsDialpadShown = false
        mDialpadFragment!!.animate = animate
        mListsFragment!!.userVisibleHint = true
        mListsFragment!!.sendScreenViewForCurrentPosition()
        updateSearchFragmentPosition()
        mFloatingActionButtonController!!.align(fabAlignment, animate)
        if (animate) {
            mDialpadFragment!!.view!!.startAnimation(mSlideOut)
        } else {
            commitDialpadFragmentHide()
        }
        mActionBarController!!.onDialpadDown()
        if (isInSearchUi) {
            if (TextUtils.isEmpty(mSearchQuery)) {
                exitSearchUi()
            }
        }
        //reset the title to normal.
        setTitle(R.string.launcherActivityLabel)
    }

    /**
     * Finishes hiding the dialpad fragment after any animations are completed.
     */
    private fun commitDialpadFragmentHide() {
        if (!mStateSaved && mDialpadFragment != null && !mDialpadFragment!!.isHidden) {
            val ft = fragmentManager.beginTransaction()
            ft.hide(mDialpadFragment)
            ft.commit()
        }
        mFloatingActionButtonController!!.scaleIn(AnimUtils.NO_DELAY)
    }

    private fun updateSearchFragmentPosition() {
        var fragment: SearchFragment? = null
        if (mSmartDialSearchFragment != null && mSmartDialSearchFragment!!.isVisible) {
            fragment = mSmartDialSearchFragment
        } else if (mRegularSearchFragment != null && mRegularSearchFragment!!.isVisible) {
            fragment = mRegularSearchFragment
        }
        if (fragment != null && fragment.isVisible) {
            fragment.updatePosition(true /* animate */)
        }
    }

    override fun isInSearchUi(): Boolean {
        return mInDialpadSearch || mInRegularSearch
    }

    override fun hasSearchQuery(): Boolean {
        return !TextUtils.isEmpty(mSearchQuery)
    }

    override fun shouldShowActionBar(): Boolean {
        return mListsFragment!!.shouldShowActionBar()
    }

    private fun setNotInSearchUi() {
        mInDialpadSearch = false
        mInRegularSearch = false
    }

    private fun hideDialpadAndSearchUi() {
        if (mIsDialpadShown) {
            hideDialpadFragment(false, true)
        } else {
            exitSearchUi()
        }
    }

    private fun prepareVoiceSearchButton() {
        val voiceIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        if (canIntentBeHandled(voiceIntent)) {
            mVoiceSearchButton!!.visibility = View.VISIBLE
            mVoiceSearchButton!!.setOnClickListener(this)
        } else {
            mVoiceSearchButton!!.visibility = View.GONE
        }
    }

    val isNearbyPlacesSearchEnabled: Boolean
        get() = false
    protected val searchBoxHint: Int
        protected get() = R.string.dialer_hint_find_contact

    /**
     * Sets the hint text for the contacts search box
     */
    private fun setSearchBoxHint() {
        val searchEditTextLayout = supportActionBar
                ?.getCustomView()?.findViewById<View>(R.id.search_view_container) as SearchEditTextLayout
        (searchEditTextLayout.findViewById<View>(R.id.search_box_start_search) as TextView)
                .setHint(searchBoxHint)
    }

    protected fun buildOptionsMenu(invoker: View?): OptionsPopupMenu {
        val popupMenu = OptionsPopupMenu(this, invoker)
        popupMenu.inflate(R.menu.dialtacts_options)
        if (ObjectFactory.isVoicemailArchiveEnabled(this)) {
            popupMenu.menu.findItem(R.id.menu_archive).isVisible = true
        }
        popupMenu.setOnMenuItemClickListener(this)
        return popupMenu
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.main, menu);
        if (mPendingSearchViewQuery != null) {
            mSearchView!!.setText(mPendingSearchViewQuery)
            mPendingSearchViewQuery = null
        }
        if (mActionBarController != null) {
            mActionBarController!!.restoreActionBarOffset()
        }
        return false
    }

    /**
     * Returns true if the intent is due to hitting the green send key (hardware call button:
     * KEYCODE_CALL) while in a call.
     *
     * @param intent the intent that launched this activity
     * @return true if the intent is due to hitting the green send key while in a call
     */
    private fun isSendKeyWhileInCall(intent: Intent): Boolean {
        // If there is a call in progress and the user launched the dialer by hitting the call
        // button, go straight to the in-call screen.
        val callKey = Intent.ACTION_CALL_BUTTON == intent.action
        if (callKey) {
            TelecomUtil.showInCallScreen(this, false)
            return true
        }
        return false
    }

    /**
     * Sets the current tab based on the intent's request type
     *
     * @param intent Intent that contains information about which tab should be selected
     */
    private fun displayFragment(intent: Intent) {
        // If we got here by hitting send and we're in call forward along to the in-call activity
        if (isSendKeyWhileInCall(intent)) {
            finish()
            return
        }
        val showDialpadChooser = phoneIsInUse() && !DialpadFragment.isAddCallMode(intent)
        if (showDialpadChooser || intent.data != null && isDialIntent(intent)) {
            showDialpadFragment(false)
            mDialpadFragment!!.setStartedFromNewIntent(true)
            if (showDialpadChooser && !mDialpadFragment!!.isVisible) {
                mInCallDialpadUp = true
            }
        }
    }

    public override fun onNewIntent(newIntent: Intent) {
        super.onNewIntent(newIntent)
        intent = newIntent
        mStateSaved = false
        displayFragment(newIntent)
        invalidateOptionsMenu()
    }

    /**
     * Returns true if the given intent contains a phone number to populate the dialer with
     */
    private fun isDialIntent(intent: Intent): Boolean {
        val action = intent.action
        if (Intent.ACTION_DIAL == action || ACTION_TOUCH_DIALER == action) {
            return true
        }
        if (Intent.ACTION_VIEW == action) {
            val data = intent.data
            if (data != null && PhoneAccount.SCHEME_TEL == data.scheme) {
                return true
            }
        }
        return false
    }

    /**
     * Shows the search fragment
     */
    private fun enterSearchUi(smartDialSearch: Boolean, query: String?, animate: Boolean) {
        if (mStateSaved || fragmentManager.isDestroyed) {
            // Weird race condition where fragment is doing work after the activity is destroyed
            // due to talkback being on (b/10209937). Just return since we can't do any
            // constructive here.
            return
        }
        if (DEBUG) {
            Log.d(TAG, "Entering search UI - smart dial $smartDialSearch")
        }
        val transaction = fragmentManager.beginTransaction()
        if (mInDialpadSearch && mSmartDialSearchFragment != null) {
            transaction.remove(mSmartDialSearchFragment)
        } else if (mInRegularSearch && mRegularSearchFragment != null) {
            transaction.remove(mRegularSearchFragment)
        }
        val tag: String
        tag = if (smartDialSearch) {
            TAG_SMARTDIAL_SEARCH_FRAGMENT
        } else {
            TAG_REGULAR_SEARCH_FRAGMENT
        }
        mInDialpadSearch = smartDialSearch
        mInRegularSearch = !smartDialSearch
        mFloatingActionButtonController!!.scaleOut()
        var fragment: SearchFragment? = fragmentManager.findFragmentByTag(tag) as? SearchFragment
        if (animate) {
            transaction.setCustomAnimations(android.R.animator.fade_in, 0)
        } else {
            transaction.setTransition(FragmentTransaction.TRANSIT_NONE)
        }
        if (fragment == null) {
            if (smartDialSearch) {
                fragment = SmartDialSearchFragment()
            } else {
                fragment = ObjectFactory.newRegularSearchFragment()
                fragment.setOnTouchListener(OnTouchListener { v, event -> // Show the FAB when the user touches the lists fragment and the soft
                    // keyboard is hidden.
                    hideDialpadFragment(true, false)
                    showFabInSearchUi()
                    false
                })
            }
            transaction.add(R.id.dialtacts_frame, fragment, tag)
        } else {
            transaction.show(fragment)
        }
        // DialtactsActivity will provide the options menu
        fragment!!.setHasOptionsMenu(false)
        fragment.setShowEmptyListForNullQuery(true)
        if (!smartDialSearch) {
            fragment.setQueryString(query, false /* delaySelection */)
        }
        transaction.commit()
        if (animate) {
            mListsFragment!!.view!!.animate().alpha(0f).withLayer()
        }
        mListsFragment!!.userVisibleHint = false
        if (smartDialSearch) {
            Logger.logScreenView(ScreenEvent.SMART_DIAL_SEARCH, this)
        } else {
            Logger.logScreenView(ScreenEvent.REGULAR_SEARCH, this)
        }
    }

    /**
     * Hides the search fragment
     */
    private fun exitSearchUi() {
        // See related bug in enterSearchUI();
        if (fragmentManager.isDestroyed || mStateSaved) {
            return
        }
        mSearchView!!.text = null
        if (mDialpadFragment != null) {
            mDialpadFragment!!.clearDialpad()
        }
        setNotInSearchUi()

        // Restore the FAB for the lists fragment.
        if (fabAlignment != FloatingActionButtonController.ALIGN_END) {
            mFloatingActionButtonController!!.isVisible = false
        }
        mFloatingActionButtonController!!.scaleIn(FAB_SCALE_IN_DELAY_MS)
        onPageScrolled(mListsFragment!!.currentTabIndex, 0f, 0 /* pixelOffset */)
        onPageSelected(mListsFragment!!.currentTabIndex)
        val transaction = fragmentManager.beginTransaction()
        if (mSmartDialSearchFragment != null) {
            transaction.remove(mSmartDialSearchFragment)
        }
        if (mRegularSearchFragment != null) {
            transaction.remove(mRegularSearchFragment)
        }
        transaction.commit()
        mListsFragment!!.view!!.animate().alpha(1f).withLayer()
        if (mDialpadFragment == null || !mDialpadFragment!!.isVisible) {
            // If the dialpad fragment wasn't previously visible, then send a screen view because
            // we are exiting regular search. Otherwise, the screen view will be sent by
            // {@link #hideDialpadFragment}.
            mListsFragment!!.sendScreenViewForCurrentPosition()
            mListsFragment!!.userVisibleHint = true
        }
        mActionBarController!!.onSearchUiExited()
    }

    override fun onBackPressed() {
        if (mStateSaved) {
            return
        }
        if (mIsDialpadShown) {
            if (TextUtils.isEmpty(mSearchQuery) ||
                    (mSmartDialSearchFragment != null && mSmartDialSearchFragment!!.isVisible
                            && mSmartDialSearchFragment!!.adapter.count == 0)) {
                exitSearchUi()
            }
            hideDialpadFragment(true, false)
        } else if (isInSearchUi) {
            exitSearchUi()
            DialerUtils.hideInputMethod(mParentLayout)
        } else {
            super.onBackPressed()
        }
    }

    private fun maybeEnterSearchUi() {
        if (!isInSearchUi) {
            enterSearchUi(true /* isSmartDial */, mSearchQuery, false)
        }
    }

    /**
     * @return True if the search UI was exited, false otherwise
     */
    private fun maybeExitSearchUi(): Boolean {
        if (isInSearchUi && TextUtils.isEmpty(mSearchQuery)) {
            exitSearchUi()
            DialerUtils.hideInputMethod(mParentLayout)
            return true
        }
        return false
    }

    private fun showFabInSearchUi() {
        mFloatingActionButtonController!!.changeIcon(
                resources.getDrawable(R.drawable.fab_ic_dial),
                resources.getString(R.string.action_menu_dialpad_button))
        mFloatingActionButtonController!!.align(fabAlignment, false /* animate */)
        mFloatingActionButtonController!!.scaleIn(FAB_SCALE_IN_DELAY_MS)
    }

    override fun onDialpadQueryChanged(query: String) {
        mDialpadQuery = query
        if (mSmartDialSearchFragment != null) {
            mSmartDialSearchFragment!!.setAddToContactNumber(query)
        }
        val normalizedQuery = SmartDialNameMatcher.normalizeNumber(query,
                SmartDialNameMatcher.LATIN_SMART_DIAL_MAP)
        if (!TextUtils.equals(mSearchView!!.text, normalizedQuery)) {
            if (DEBUG) {
                Log.d(TAG, "onDialpadQueryChanged - new query: $query")
            }
            if (mDialpadFragment == null || !mDialpadFragment!!.isVisible) {
                // This callback can happen if the dialpad fragment is recreated because of
                // activity destruction. In that case, don't update the search view because
                // that would bring the user back to the search fragment regardless of the
                // previous state of the application. Instead, just return here and let the
                // fragment manager correctly figure out whatever fragment was last displayed.
                if (!TextUtils.isEmpty(normalizedQuery)) {
                    mPendingSearchViewQuery = normalizedQuery
                }
                return
            }
            mSearchView!!.setText(normalizedQuery)
        }
        try {
            if (mDialpadFragment != null && mDialpadFragment!!.isVisible) {
                mDialpadFragment!!.process_quote_emergency_unquote(normalizedQuery)
            }
        } catch (ignored: Exception) {
            // Skip any exceptions for this piece of code
        }
    }

    override fun onDialpadSpacerTouchWithEmptyQuery(): Boolean {
        if (mInDialpadSearch && mSmartDialSearchFragment != null && !mSmartDialSearchFragment!!.isShowingPermissionRequest) {
            hideDialpadFragment(true /* animate */, true /* clearDialpad */)
            return true
        }
        return false
    }

    override fun onListFragmentScrollStateChange(scrollState: Int) {
        if (scrollState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
            hideDialpadFragment(true, false)
            DialerUtils.hideInputMethod(mParentLayout)
        }
    }

    override fun onListFragmentScroll(firstVisibleItem: Int, visibleItemCount: Int,
                                      totalItemCount: Int) {
        // TODO: No-op for now. This should eventually show/hide the actionBar based on
        // interactions with the ListsFragments.
    }

    private fun phoneIsInUse(): Boolean {
        return TelecomUtil.isInCall(this)
    }

    private fun canIntentBeHandled(intent: Intent): Boolean {
        val packageManager = packageManager
        val resolveInfo = packageManager.queryIntentActivities(intent,
                PackageManager.MATCH_DEFAULT_ONLY)
        return resolveInfo != null && resolveInfo.size > 0
    }

    /**
     * Called when the user has long-pressed a contact tile to start a drag operation.
     */
    override fun onDragStarted(x: Int, y: Int, view: PhoneFavoriteSquareTileView) {
        mListsFragment!!.showRemoveView(true)
    }

    override fun onDragHovered(x: Int, y: Int, view: PhoneFavoriteSquareTileView) {}

    /**
     * Called when the user has released a contact tile after long-pressing it.
     */
    override fun onDragFinished(x: Int, y: Int) {
        mListsFragment!!.showRemoveView(false)
    }

    override fun onDroppedOnRemove() {}

    /**
     * Allows the SpeedDialFragment to attach the drag controller to mRemoveViewContainer
     * once it has been attached to the activity.
     */
    override fun setDragDropController(dragController: DragDropController) {
        mDragDropController = dragController
        mListsFragment!!.removeView.setDragDropController(dragController)
    }

    /**
     * Implemented to satisfy [SpeedDialFragment.HostInterface]
     */
    override fun showAllContactsTab() {
        if (mListsFragment != null) {
            mListsFragment!!.showTab(ListsFragment.TAB_INDEX_ALL_CONTACTS)
        }
    }

    /**
     * Implemented to satisfy [CallLogFragment.HostInterface]
     */
    override fun showDialpad() {
        showDialpadFragment(true)
    }

    override fun onPickDataUri(dataUri: Uri, isVideoCall: Boolean, callInitiationType: Int) {
        mClearSearchOnPause = true
        PhoneNumberInteraction.startInteractionForPhoneCall(
                this@DialtactsActivity, dataUri, isVideoCall, callInitiationType)
    }

    override fun onPickPhoneNumber(phoneNumber: String, isVideoCall: Boolean, callInitiationType: Int) {
        var phoneNumber: String? = phoneNumber
        if (phoneNumber == null) {
            // Invalid phone number, but let the call go through so that InCallUI can show
            // an error message.
            phoneNumber = ""
        }
        val intent = CallIntentBuilder(phoneNumber)
                .setIsVideoCall(isVideoCall)
                .setCallInitiationType(callInitiationType)
                .build()
        DialerUtils.startActivityWithErrorToast(this, intent)
        mClearSearchOnPause = true
    }

    override fun onShortcutIntentCreated(intent: Intent) {
        Log.w(TAG, "Unsupported intent has come ($intent). Ignoring.")
    }

    override fun onHomeInActionBarSelected() {
        exitSearchUi()
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        val tabIndex = mListsFragment!!.currentTabIndex

        // Scroll the button from center to end when moving from the Speed Dial to Call History tab.
        // In RTL, scroll when the current tab is Call History instead, since the order of the tabs
        // is reversed and the ViewPager returns the left tab position during scroll.
        val isRtl = DialerUtils.isRtl()
        if (!isRtl && tabIndex == ListsFragment.TAB_INDEX_SPEED_DIAL && !mIsLandscape) {
            mFloatingActionButtonController!!.onPageScrolled(positionOffset)
        } else if (isRtl && tabIndex == ListsFragment.TAB_INDEX_HISTORY && !mIsLandscape) {
            mFloatingActionButtonController!!.onPageScrolled(1 - positionOffset)
        } else if (tabIndex != ListsFragment.TAB_INDEX_SPEED_DIAL) {
            mFloatingActionButtonController!!.onPageScrolled(1f)
        }
    }

    override fun onPageSelected(position: Int) {
        updateMissedCalls()
        val tabIndex = mListsFragment!!.currentTabIndex
        mPreviouslySelectedTabIndex = tabIndex
        if (tabIndex == ListsFragment.TAB_INDEX_ALL_CONTACTS) {
            mFloatingActionButtonController!!.changeIcon(
                    resources.getDrawable(R.drawable.ic_person_add_24dp),
                    resources.getString(R.string.search_shortcut_create_new_contact))
        }else if (tabIndex==ListsFragment.TAB_INDEX_VOICEMAIL){
            mFloatingActionButtonController!!.changeIcon(
                    resources.getDrawable(R.drawable.ic_person_add_24dp),
                    "Create new Sms")
        } else{
            mFloatingActionButtonController!!.changeIcon(
                    resources.getDrawable(R.drawable.fab_ic_dial),
                    resources.getString(R.string.action_menu_dialpad_button))
        }
    }

    override fun onPageScrollStateChanged(state: Int) {}
    override fun isActionBarShowing(): Boolean {
        return mActionBarController!!.isActionBarShowing
    }

    override fun getActionBarController(): ActionBarController {
        return mActionBarController!!
    }

    override fun isDialpadShown(): Boolean {
        return mIsDialpadShown
    }

    override fun getDialpadHeight(): Int {
        return if (mDialpadFragment != null) {
            mDialpadFragment!!.dialpadHeight
        } else 0
    }

    override fun getActionBarHideOffset(): Int {
        return supportActionBar!!.hideOffset
    }

    override fun setActionBarHideOffset(offset: Int) {
        supportActionBar!!.hideOffset = offset
    }

    override fun getActionBarHeight(): Int {
        return mActionBarHeight
    }

    private val fabAlignment: Int
        private get() = if (!mIsLandscape && !isInSearchUi && mListsFragment!!.currentTabIndex == ListsFragment.TAB_INDEX_SPEED_DIAL) {
            FloatingActionButtonController.ALIGN_MIDDLE
        } else FloatingActionButtonController.ALIGN_END

    private fun updateMissedCalls() {
        if (mPreviouslySelectedTabIndex == ListsFragment.TAB_INDEX_HISTORY) {
            mListsFragment!!.markMissedCallsAsReadAndRemoveNotifications()
        }
    }

    companion object {
        private const val TAG = "DialtactsActivity"
        const val DEBUG = false
        const val SHARED_PREFS_NAME = "com.android.dialer_preferences"
        private const val KEY_IN_REGULAR_SEARCH_UI = "in_regular_search_ui"
        private const val KEY_IN_DIALPAD_SEARCH_UI = "in_dialpad_search_ui"
        private const val KEY_SEARCH_QUERY = "search_query"
        private const val KEY_FIRST_LAUNCH = "first_launch"
        private const val KEY_IS_DIALPAD_SHOWN = "is_dialpad_shown"

        @VisibleForTesting
        val TAG_DIALPAD_FRAGMENT = "dialpad"
        private const val TAG_REGULAR_SEARCH_FRAGMENT = "search"
        private const val TAG_SMARTDIAL_SEARCH_FRAGMENT = "smartdial"
        private const val TAG_FAVORITES_FRAGMENT = "favorites"

        /**
         * Just for backward compatibility. Should behave as same as [Intent.ACTION_DIAL].
         */
        private const val ACTION_TOUCH_DIALER = "com.android.phone.action.TOUCH_DIALER"
        const val EXTRA_SHOW_TAB = "EXTRA_SHOW_TAB"
        private const val ACTIVITY_REQUEST_CODE_VOICE_SEARCH = 1
        private const val FAB_SCALE_IN_DELAY_MS = 300
    }
}