package com.android.service;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.telecom.Call;
import android.text.TextUtils;
import android.view.HapticFeedbackConstants;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.android.dialer.R;
import com.android.dialer.databinding.ActivityCallingBinding;
import com.android.phone.common.dialpad.DialpadKeyButton;
import com.android.phone.common.dialpad.DialpadView;
import com.moez.QKSMS.common.QKApplication;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

import static com.android.dialer.util.Constant.asString;

public class CallingActivity extends AppCompatActivity implements DialpadKeyButton.OnPressedListener {

    private ActivityCallingBinding binding;
    private static CallingActivity instance = null;
    private static final int PRIORITY_RECEIVE = 2;
    private static final int DIAL_TONE_STREAM_TYPE = AudioManager.STREAM_DTMF;
    private static final int TONE_RELATIVE_VOLUME = 80;
    private final HashSet<View> mPressedDialpadKeys = new HashSet<View>(12);

    private CompositeDisposable mDisposable;
    private String mPhoneNumberDisplay;
    private String mPhoneNumber;
    private OngoingCall mOngoingCall;
    private AudioManager mAudioManager;
    private boolean isSpeaker, isMicro, isHold;
    private static NotificationManager notifyManager = null;
    private static Call mCall;
    private static boolean isBroastcast;
    private int count = 1;
    private Timer timer;
    private boolean mDTMFToneEnabled;

    private DialpadView mDialpadView;
    private static final int TONE_LENGTH_INFINITE = -1;
    private EditText mDigits;
    private boolean isCheckVisibleViewTime = false;
    private ToneGenerator mToneGenerator;
    private final Object mToneGeneratorLock = new Object();
    private static boolean isLockScreen = false;

    public static CallingActivity getInstance() {
        if (instance == null) {
            instance = new CallingActivity();
        }
        return instance;
    }

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calling);

        fullScreenCall();

        mAudioManager = (AudioManager) getApplicationContext().getSystemService(AUDIO_SERVICE);
        mOngoingCall = new OngoingCall();
        mDisposable = new CompositeDisposable();

        initView();
        getData();

        mPhoneNumber = mCall.getDetails().getHandle().getSchemeSpecificPart();
        String nameContact = getContactName(mPhoneNumber, this);
        if (TextUtils.isEmpty(nameContact)) {
            mPhoneNumberDisplay = mPhoneNumber;
        } else {
            mPhoneNumberDisplay = nameContact;
        }

        View oneButton = findViewById(R.id.one);
        if (oneButton != null) {
            configureKeypadListeners(binding.layoutKeypad);
        }

        //binding.btnAnswerIncoming.startAnimation(contact_AnimationController.animationAnswer(true));
        onClick();
    }
    private void initView() {
        mDialpadView = findViewById(R.id.dialpad_view);
        mDialpadView.setCanDigitsBeEdited(true);
        mDigits = mDialpadView.getDigits();
        mDigits.setKeyListener(contact_UnicodeDialerKeyListener.INSTANCE);
        findViewById(R.id.deleteButton).setVisibility(View.INVISIBLE);
        findViewById(R.id.dialpad_back).setVisibility(View.VISIBLE);
        findViewById(R.id.dialpad_overflow).setVisibility(View.GONE);
    }

    private void getData() {
//        theme = Theme.Companion.parseJson(SharePreManager.getInstance().getString(Constants.PUT_OBJECT));
////        glide4Engine.loadImageOriginal(img, theme.getThumb());
//        glide4Engine.loadImageGifOriginal(imgGif, theme.getGifUrl());
//        if (SharedPreferenceHelper.getInstance(this).getBool(Constants.IS_CALL_SCREEN)) {
//            Glide.with(this).load(SharedPreferenceHelper.getInstance(this).get("theme")).into(binding.imgGif);
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPressedDialpadKeys.clear();
        mDTMFToneEnabled = Settings.System.getInt(getContentResolver(),
                Settings.System.DTMF_TONE_WHEN_DIALING, 1) == 1;
    }
    @Override
    protected void onPause() {
        super.onPause();
        mPressedDialpadKeys.clear();
    }

    private void onClick() {
        binding.btnHangupOutgoing.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                onHangupClicked();
            }
        });
        binding.imgSpeaker.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                if (isSpeaker) {
                    isSpeaker = false;
                    mAudioManager.setSpeakerphoneOn(false);
                    binding.imgSpeaker.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.background_dialer_white)));
                } else {
                    isSpeaker = true;
                    mAudioManager.setSpeakerphoneOn(true);
                    binding.imgSpeaker.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.dialer_theme_color)));
                }
            }
        });

        binding.imgMicro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMicro) {
                    isMicro = false;
                    mAudioManager.setMicrophoneMute(false);
                    binding.imgMicro.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.background_dialer_white)));
                } else {
                    isMicro = true;
                    mAudioManager.setMicrophoneMute(true);
                    binding.imgMicro.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.dialer_theme_color)));
                }
            }
        });

        binding.imgKeypad.setOnClickListener(v -> {
            isCheckVisibleViewTime = true;
            binding.imgContact.setVisibility(View.GONE);
            binding.layoutOption.setVisibility(View.GONE);
            binding.layoutIncoming.setVisibility(View.GONE);
            binding.tvPhoneNumber.setVisibility(View.GONE);
            binding.tvTimeCallCreate.setVisibility(View.GONE);
            binding.callInfo.setVisibility(View.GONE);
            binding.layoutKeypad.setVisibility(View.VISIBLE);
            binding.layoutKeypad.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.slide_up));
        });

        binding.imgHold.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                if (isHold) {
                    isHold = false;
                    mOngoingCall.hold(false);
                    binding.imgHold.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.background_dialer_white)));
                } else {
                    isHold = true;
                    mOngoingCall.hold(true);
                    binding.imgHold.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.dialer_theme_color)));
                }
            }
        });

        findViewById(R.id.dialpad_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCheckVisibleViewTime = false;
                binding.layoutKeypad.setVisibility(View.GONE);
                binding.layoutKeypad.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down));
                binding.layoutOption.setVisibility(View.VISIBLE);
                binding.tvPhoneNumber.setVisibility(View.VISIBLE);
                binding.tvTimeCallCreate.setVisibility(View.VISIBLE);
                binding.callInfo.setVisibility(View.VISIBLE);
                binding.imgContact.setVisibility(View.VISIBLE);
            }
        });

        binding.imgAddCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                startActivity(intent);j
//                mOngoingCall.hold(true);
//                mOngoingCall.addCall(mOngoingCall.getsCall());
            }
        });

        binding.btnAnswerIncoming.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                onAnswerClicked();
                return false;
            }
        });
        binding.btnHangupIncoming.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                onHangupClicked();
                return false;
            }
        });
    }
    //private void addDataToMap(@NonNull Expression.Stop[] stops) {
//
//    FillLayer statesJoinLayer = new FillLayer("states-join", VECTOR_SOURCE_NAME);
//    statesJoinLayer.setSourceLayer(VECTOR_SOURCE_NAME);
//    statesJoinLayer.withProperties(
//            fillColor(match(toNumber(get(DATA_MATCH_PROP)),
//                    rgba(0, 0, 0, 1), stops))
//    );
//
//    // Add layer to map below the "waterway-label" layer
//    if (mapboxMap != null) {
//        mapboxMap.getStyle(style -> style.addLayerAbove(statesJoinLayer, "waterway-label"));
//    }
//}
//
//    private static class LoadJson extends AsyncTask<Void, Void, Expression.Stop[]> {
//
//        private WeakReference<ChoroplethJsonVectorMixActivity> weakReference;
//        private static final String TAG = "ChJSonVectorMix";
//
//        LoadJson(ChoroplethJsonVectorMixActivity activity) {
//            this.weakReference = new WeakReference<>(activity);
//        }
//
//        @Override
//        protected Expression.Stop[] doInBackground(Void... voids) {
//            try {
//                ChoroplethJsonVectorMixActivity activity = weakReference.get();
//                if (activity != null) {
//
//                    InputStream inputStream = activity.getAssets().open(STATE_UNEMPLOYMENT_INFO_JSON_FILE);
//
//                    activity.statesArray = new JSONArray(convertStreamToString(inputStream));
//
//                    // Create stops array
//                    Expression.Stop[] stops = new Expression.Stop[activity.statesArray.length()];
//
//                    for (int x = 0; x < activity.statesArray.length(); x++) {
//                        try {
//                            // Generate green color value for each state/stop
//                            JSONObject singleState = activity.statesArray.getJSONObject(x);
//                            double green = singleState.getDouble(DATA_STYLE_UNEMPLOYMENT_PROP) / 14 * 255;
//
//                            // Add new stop to array of stops
//                            stops[x] = stop(
//                                    Double.parseDouble(singleState.getString(DATA_MATCH_PROP)),
//                                    rgba(0, green, 0, 1)
//                            );
//
//                        } catch (JSONException exception) {
//                            throw new RuntimeException(exception);
//                        }
//                    }
//
//                    return stops;
//                }
//            } catch (Exception exception) {
//                Timber.d("Exception Loading GeoJSON: %s", exception.toString());
//            }
//            return null;
//        }
//
//        static String convertStreamToString(InputStream is) {
//            Scanner scanner = new Scanner(is).useDelimiter("\\A");
//            return scanner.hasNext() ? scanner.next() : "";
//        }
//
//        @Override
//        protected void onPostExecute(@Nullable Expression.Stop[] stopsArray) {
//            super.onPostExecute(stopsArray);
//            ChoroplethJsonVectorMixActivity activity = weakReference.get();
//            if (activity != null && stopsArray != null) {
//                activity.addDataToMap(stopsArray);
//            }
//        }
//    }
    private void enterReveal() {
        binding.bgMain.post(() -> {
            int cx = binding.bgMain.getMeasuredWidth() / 2;
            int cy = binding.bgMain.getMeasuredHeight() / 2;
            int finalRadius = Math.max(binding.bgMain.getWidth(), binding.bgMain.getHeight()) / 2;
            Animator anim = ViewAnimationUtils.createCircularReveal(binding.bgMain, cx, cy, 0, finalRadius);
            anim.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    binding.imgContact.setVisibility(View.VISIBLE);
                    binding.tvPhoneNumber.setVisibility(View.VISIBLE);
                    binding.callInfo.setVisibility(View.VISIBLE);
                    binding.layoutOption.setVisibility(View.VISIBLE);
                    binding.btnHangupOutgoing.setVisibility(View.VISIBLE);
                    binding.layoutOption.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up));
                    binding.btnHangupOutgoing.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up));
                    binding.tvPhoneNumber.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up));
                    binding.callInfo.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up));
                }

                @Override
                public void onAnimationCancel(Animator animation) {
                }

                @Override
                public void onAnimationRepeat(Animator animation) {
                }
            });
            anim.start();
        });
    }

    private void enterIncallReveal() {
        binding.bgMain.post(() -> {
            int cx = binding.bgMain.getMeasuredWidth() / 2;
            int cy = binding.bgMain.getMeasuredHeight() / 2;
            int finalRadius = Math.max(binding.bgMain.getWidth(), binding.bgMain.getHeight()) / 2;
            Animator anim = ViewAnimationUtils.createCircularReveal(binding.bgMain, cx, cy, 0, finalRadius);
            anim.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    binding.imgContact.setVisibility(View.VISIBLE);
                    binding.tvPhoneNumber.setVisibility(View.VISIBLE);
                    binding.callInfo.setVisibility(View.VISIBLE);
                    binding.layoutIncoming.setVisibility(View.VISIBLE);
                    binding.layoutIncoming.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up));
                    binding.tvPhoneNumber.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up));
                    binding.callInfo.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up));
                }

                @Override
                public void onAnimationCancel(Animator animation) {
                }

                @Override
                public void onAnimationRepeat(Animator animation) {
                }
            });
            anim.start();
        });
    }

    private void configureKeypadListeners(View fragmentView) {
        final int[] buttonIds = new int[]{R.id.one, R.id.two, R.id.three, R.id.four, R.id.five,
                R.id.six, R.id.seven, R.id.eight, R.id.nine, R.id.star, R.id.zero, R.id.pound};

        DialpadKeyButton dialpadKey;

        for (int i = 0; i < buttonIds.length; i++) {
            dialpadKey = (DialpadKeyButton) fragmentView.findViewById(buttonIds[i]);
            dialpadKey.setOnPressedListener(this);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onAnswerClicked() {
        mOngoingCall.answer();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onHangupClicked() {
        mOngoingCall.hangup();
    }
    //        package com.mapbox.mapboxandroiddemo.examples.basics;
//
//import android.os.Bundle;
//
//import com.mapbox.mapboxandroiddemo.R;
//import com.mapbox.mapboxsdk.Mapbox;
//import com.mapbox.mapboxsdk.camera.CameraPosition;
//import com.mapbox.mapboxsdk.geometry.LatLng;
//import com.mapbox.mapboxsdk.maps.MapView;
//import com.mapbox.mapboxsdk.maps.MapboxMap;
//import com.mapbox.mapboxsdk.maps.MapboxMapOptions;
//import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
//import com.mapbox.mapboxsdk.maps.Style;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
///**
// * Add a map view in a dynamically created layout
// */
//        public class MapboxMapOptionActivity extends AppCompatActivity {
//
//            private MapView mapView;
//
//            @Override
//            protected void onCreate(Bundle savedInstanceState) {
//                super.onCreate(savedInstanceState);
//
//                // Mapbox access token is configured here. This needs to be called either in your application
//                // object or in the same activity which contains the mapview.
//                Mapbox.getInstance(this, getString(R.string.access_token));
//
//                MapboxMapOptions options = MapboxMapOptions.createFromAttributes(this, null)
//                        .camera(new CameraPosition.Builder()
//                                .target(new LatLng(43.7383, 7.4094))
//                                .zoom(12)
//                                .build());
//
//                // create map
//                mapView = new MapView(this, options);
//                mapView.onCreate(savedInstanceState);
//                mapView.getMapAsync(new OnMapReadyCallback() {
//                    @Override
//                    public void onMapReady(@NonNull MapboxMap mapboxMap) {
//
//                        mapboxMap.setStyle(Style.OUTDOORS, new Style.OnStyleLoaded() {
//                            @Override
//                            public void onStyleLoaded(@NonNull Style style) {
//
//                                // Map is set up and the style has loaded. Now you can add data or make other map adjustments.
//
//
//                            }
//                        });
//                    }
//                });
//
//                setContentView(mapView);
//            }
//
//            @Override
//            public void onResume() {
//                super.onResume();
//                mapView.onResume();
//            }
//
//            @Override
//            protected void onStart() {
//                super.onStart();
//                mapView.onStart();
//            }
//
//            @Override
//            protected void onStop() {
//                super.onStop();
//                mapView.onStop();
//            }
//
//            @Override
//            public void onPause() {
//                super.onPause();
//                mapView.onPause();
//            }
//
//            @Override
//            public void onLowMemory() {
//                super.onLowMemory();
//                mapView.onLowMemory();
//            }
//
//            @Override
//            protected void onDestroy() {
//                super.onDestroy();
//                mapView.onDestroy();
//            }
//
//            @Override
//            protected void onSaveInstanceState(Bundle outState) {
//                super.onSaveInstanceState(outState);
//                mapView.onSaveInstanceState(outState);
//            }
//        }
    @SuppressLint("AutoDispose")
    @Override
    protected void onStart() {
        super.onStart();
        try {
            assert updateUi(-1) != null ;
        }catch (AssertionError error){
            System.out.println("mzmzmzmz"+error.getMessage());
        }
        mDisposable.add(
                OngoingCall.state
                        .subscribe(this::updateUi));

        mDisposable.add(
                OngoingCall.state
                        .filter(integer -> integer == Call.STATE_DISCONNECTED)
                        .delay(1, TimeUnit.SECONDS)
                        .firstElement()
                        .subscribe(integer -> {
                            finishAndRemoveTask();
                        }));

        final long start = System.currentTimeMillis();
        synchronized (mToneGeneratorLock) {
            if (mToneGenerator == null) {
                try {
                    mToneGenerator = new ToneGenerator(DIAL_TONE_STREAM_TYPE, TONE_RELATIVE_VOLUME);
                } catch (RuntimeException e) {
                    mToneGenerator = null;
                }
            }
        }
        final long total = System.currentTimeMillis() - start;
        if (total > 50) {
        }
        Trace.endSection();
    }

    @SuppressLint("SetTextI18n")
    private Consumer<? super Integer> updateUi(Integer state) {
        binding.callInfo.setText(asString(state));
        binding.tvPhoneNumber.setText(mPhoneNumberDisplay);
        binding.layoutKeypad.setVisibility(View.GONE);
        if (state == Call.STATE_DIALING) {
            binding.bgMain.setBackgroundColor(getResources().getColor(R.color.bg_calling));
            binding.layoutIncoming.setVisibility(View.GONE);
            enterReveal();
            setImage();
        }

        if (state == Call.STATE_RINGING) {
//            checkFlash();
            enterIncallReveal();
            setImage();
            binding.bgMain.setBackgroundColor(getResources().getColor(R.color.bg_calling));
            if (isLockScreen) {
                binding.layoutOption.setVisibility(View.GONE);
                binding.btnHangupOutgoing.setVisibility(View.GONE);
                binding.layoutIncoming.setVisibility(View.VISIBLE);
            } else {
                binding.layoutOption.setVisibility(View.VISIBLE);
                binding.btnHangupOutgoing.setVisibility(View.VISIBLE);
                binding.layoutIncoming.setVisibility(View.GONE);
            }
        }
        if (state == Call.STATE_ACTIVE) {
            try {
                binding.imgGif.setVisibility(View.GONE);
                binding.bgMain.setBackgroundColor(getResources().getColor(R.color.bg_call_active));
                timer = new Timer();

                if (!isCheckVisibleViewTime) {
                    binding.tvTimeCallCreate.setVisibility(View.VISIBLE);
                }
                binding.layoutIncoming.setVisibility(View.GONE);
                enterReveal();

                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(() -> {
                            binding.tvTimeCallCreate.setText(String.format("%02d:%02d",
                                    (count % 3600) / 60, (count % 60)));
                            count++;
                        });
                    }
                }, 1000, 1000);

            } catch (Exception e) {
                Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }

//        if (CollectionsKt.listOf(Call.STATE_DIALING,
//                Call.STATE_RINGING,
//                Call.STATE_ACTIVE).contains(state)) {
//            mImgHangupIncoming.setVisibility(View.VISIBLE);
//        } else
//            mImgHangupIncoming.setVisibility(View.GONE);
        return null;
    }

    private void setImage() {
        Bitmap bitmap = getPhoto(mPhoneNumber);
        if (bitmap != null) {
            binding.imgContact.setVisibility(View.VISIBLE);
            binding.imgContact.setImageBitmap(bitmap);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mDisposable.clear();
        if (timer != null) {
            timer.cancel();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void start(Context context, Call call) {
        mCall = call;
        if (call.getState() == Call.STATE_RINGING) {
            isLockScreen = true;
            @SuppressLint({"NewApi", "LocalSuppress"})
            Intent intent = new Intent(context, CallingActivity.class)
                    .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    .setData(call.getDetails().getHandle());
            context.startActivity(intent);

        } else if (call.getState() == Call.STATE_DISCONNECTED) {

        } else {
            @SuppressLint({"NewApi", "LocalSuppress"})
            Intent intent = new Intent(context, CallingActivity.class)
                    .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    .setData(call.getDetails().getHandle());
            context.startActivity(intent);
        }
    }

    private void keyPressed(int keyCode) {
        if (binding.layoutKeypad == null || binding.layoutKeypad.getTranslationY() != 0) {
            return;
        }
        switch (keyCode) {
            case KeyEvent.KEYCODE_1:
                playTone(ToneGenerator.TONE_DTMF_1, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_2:
                playTone(ToneGenerator.TONE_DTMF_2, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_3:
                playTone(ToneGenerator.TONE_DTMF_3, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_4:
                playTone(ToneGenerator.TONE_DTMF_4, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_5:
                playTone(ToneGenerator.TONE_DTMF_5, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_6:
                playTone(ToneGenerator.TONE_DTMF_6, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_7:
                playTone(ToneGenerator.TONE_DTMF_7, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_8:
                playTone(ToneGenerator.TONE_DTMF_8, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_9:
                playTone(ToneGenerator.TONE_DTMF_9, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_0:
                playTone(ToneGenerator.TONE_DTMF_0, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_POUND:
                playTone(ToneGenerator.TONE_DTMF_P, TONE_LENGTH_INFINITE);
                break;
            case KeyEvent.KEYCODE_STAR:
                playTone(ToneGenerator.TONE_DTMF_S, TONE_LENGTH_INFINITE);
                break;
            default:
                break;
        }

        binding.layoutKeypad.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
        KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN, keyCode);
        mDigits.onKeyDown(keyCode, event);

        // If the cursor is at the end of the text we hide it.
        final int length = mDigits.length();
        if (length == mDigits.getSelectionStart() && length == mDigits.getSelectionEnd()) {
            mDigits.setCursorVisible(false);
        }
    }

    private void playTone(int tone, int durationMs) {
        // if local tone playback is disabled, just return.
        if (!mDTMFToneEnabled) {
            return;
        }

        // Also do nothing if the phone is in silent mode.
        // We need to re-check the ringer mode for *every* playTone()
        // call, rather than keeping a local flag that's updated in
        // onResume(), since it's possible to toggle silent mode without
        // leaving the current activity (via the ENDCALL-longpress menu.)
        AudioManager audioManager =
                (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
        int ringerMode = audioManager.getRingerMode();
        if ((ringerMode == AudioManager.RINGER_MODE_SILENT)
                || (ringerMode == AudioManager.RINGER_MODE_VIBRATE)) {
            return;
        }

        synchronized (mToneGeneratorLock) {
            if (mToneGenerator == null) {
//                Log.w(TAG, "playTone: mToneGenerator == null, tone: " + tone);
                return;
            }

            // Start the new tone (will stop any playing tone)
            mToneGenerator.startTone(tone, durationMs);
        }
    }

    private void stopTone() {
        // if local tone playback is disabled, just return.
        if (!mDTMFToneEnabled) {
            return;
        }
        synchronized (mToneGeneratorLock) {
            if (mToneGenerator == null) {
//                Log.w(TAG, "stopTone: mToneGenerator == null");
                return;
            }
            mToneGenerator.stopTone();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mOngoingCall != null)
            mOngoingCall.hangup();
    }

    public String getContactName(final String phoneNumber, Context context) {
        Uri uri = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(phoneNumber));

        String[] projection = new String[]{ContactsContract.PhoneLookup.DISPLAY_NAME};

        String contactName = "";
        Cursor cursor = context.getContentResolver().query(uri, projection, null, null, null);

        if (cursor != null) {
            if (cursor.moveToFirst()) {
                contactName = cursor.getString(0);
            }
            cursor.close();
        }

        return contactName;
    }

    private Bitmap getPhoto(String phoneNumber) {
        Uri phoneUri = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(phoneNumber));
        ContentResolver cr = QKApplication.Companion.getInstance().getContentResolver();
        Cursor contact = cr.query(phoneUri, new String[]{ContactsContract.Contacts._ID}, null, null, null);
        if (contact != null && contact.moveToFirst()) {
            long userId = contact.getLong(
                    contact.getColumnIndex(
                            ContactsContract.Contacts._ID
                    )
            );
            Uri photoUri = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, userId);
            InputStream input = ContactsContract.Contacts.openContactPhotoInputStream(cr, photoUri);
            contact.close();
            if (input != null) {
                return BitmapFactory.decodeStream(input);
            }
        }
        return BitmapFactory.decodeResource(getResources(), R.drawable.ic_vector_user);
    }

    public void fullScreenCall() {
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else if (Build.VERSION.SDK_INT >= 19) {
            //for new api versions.
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    @Override
    public void onPressed(View view, boolean pressed) {
        if (pressed) {
            int resId = view.getId();
            if (resId == R.id.one) {
                keyPressed(KeyEvent.KEYCODE_1);
            } else if (resId == R.id.two) {
                keyPressed(KeyEvent.KEYCODE_2);
            } else if (resId == R.id.three) {
                keyPressed(KeyEvent.KEYCODE_3);
            } else if (resId == R.id.four) {
                keyPressed(KeyEvent.KEYCODE_4);
            } else if (resId == R.id.five) {
                keyPressed(KeyEvent.KEYCODE_5);
            } else if (resId == R.id.six) {
                keyPressed(KeyEvent.KEYCODE_6);
            } else if (resId == R.id.seven) {
                keyPressed(KeyEvent.KEYCODE_7);
            } else if (resId == R.id.eight) {
                keyPressed(KeyEvent.KEYCODE_8);
            } else if (resId == R.id.nine) {
                keyPressed(KeyEvent.KEYCODE_9);
            } else if (resId == R.id.zero) {
                keyPressed(KeyEvent.KEYCODE_0);
            } else if (resId == R.id.pound) {
                keyPressed(KeyEvent.KEYCODE_POUND);
            } else if (resId == R.id.star) {
                keyPressed(KeyEvent.KEYCODE_STAR);
            } else {
//                Log.wtf(TAG, "Unexpected onTouch(ACTION_DOWN) event from: " + view);
            }
            mPressedDialpadKeys.add(view);
        } else {
            mPressedDialpadKeys.remove(view);
            if (mPressedDialpadKeys.isEmpty()) {
                stopTone();
            }
        }
    }
}

