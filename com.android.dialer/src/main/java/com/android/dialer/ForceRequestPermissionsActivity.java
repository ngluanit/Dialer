/*
 * Copyright (C) 2015 add by geniusgithub begin
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
package com.android.dialer;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.provider.Telephony;
import android.telecom.TelecomManager;
import android.widget.Toast;

import com.android.contacts.common.util.PermissionsUtil;
import com.android.incallui.Log;

import java.util.ArrayList;
import java.util.Arrays;


@TargetApi(23)
public class ForceRequestPermissionsActivity extends Activity {


    private final static String TAG = "ForceRequestPermissionsActivity";

    private static final int PERMISSIONS_REQUEST_ALL_PERMISSIONS = 1;


/*	 private final int REQUEST_PHONE_PERMISSION =  0X0001;
	 private final int REQUEST_CONTACT_PERMISSION =  0X0002;
	 private final int REQUEST_LOCATION_PERMISSION =  0X0003;
	 private final int REQUEST_STORAGE_PERMISSION =  0X0004;*/

    public static final String PREVIOUS_ACTIVITY_INTENT = "previous_intent";
    private Intent mPreviousActivityIntent;
    private String[] requiredPermissions;
    private ArrayList<String> mForbiddenPermissionList = new ArrayList<String>();
    private static final int REQUEST_DEFAULT_DIALER = 123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        if (intent.getExtras().get(PREVIOUS_ACTIVITY_INTENT) != null) {
            mPreviousActivityIntent = (Intent) intent.getExtras().get(PREVIOUS_ACTIVITY_INTENT);
        } else {
            mPreviousActivityIntent = intent;
        }
        requiredPermissions = PermissionsUtil.sRequiredPermissions;
        setContentView(R.layout.permission_check_activity);

        ActionBar bar = getActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
        }
        TelecomManager telecomManager = (TelecomManager) getSystemService(TELECOM_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (telecomManager.getDefaultDialerPackage().equals(getPackageName())) {
                if (isDefaultSmsApp(this)) {
                    requestNecessaryRequiredPermissions(this);
                } else {
                    showDefaultSmsDialog(this);
                }
            } else {
                checkDefaultDialer(savedInstanceState);
            }
        }

    }

    public static boolean isDefaultSmsApp(Context context) {
        return context.getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(context));
    }

    public static boolean isDefaultDialerApp(Context context) {
        TelecomManager telecomManager = (TelecomManager) context.getSystemService(TELECOM_SERVICE);
        return (telecomManager.getDefaultDialerPackage().equals(context.getPackageName()));
    }

    private void showDefaultSmsDialog(Context context) {
        if (Telephony.Sms.getDefaultSmsPackage(context) != null && !context.getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(context))) {
            RoleManager roleManager = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                roleManager = context.getSystemService(RoleManager.class);

                if (roleManager.isRoleAvailable(RoleManager.ROLE_SMS)) {
                    if (roleManager.isRoleHeld(RoleManager.ROLE_SMS)) {
                        Log.d("role", "role");
                    } else {
                        Intent roleRequestIntent = roleManager.createRequestRoleIntent(
                                RoleManager.ROLE_SMS);
                        ((Activity) context).startActivityForResult(roleRequestIntent, 4141);
                    }
                }
            } else {
                Intent intent = new Intent(Telephony.Sms.Intents.ACTION_CHANGE_DEFAULT);
                intent.putExtra(Telephony.Sms.Intents.EXTRA_PACKAGE_NAME,
                        context.getPackageName());
                ((Activity) context).startActivityForResult(intent, 4141);
            }


        }
    }

    private void checkDefaultDialer(Bundle bundle) {
        Intent intent = null;
        RoleManager roleManager = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (Build.MODEL.equals("Vivo")) {
                Toast.makeText(this, "Go to Settings -> More settings -> Permission management(Applications) -> Default app settings to change the default apps.", Toast.LENGTH_SHORT).show();
                startActivityForResult(new Intent(Settings.ACTION_SETTINGS), 0);
            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    roleManager = getApplicationContext().getSystemService(RoleManager.class);
                    if (roleManager.isRoleAvailable(RoleManager.ROLE_DIALER)) {
                        if (roleManager.isRoleHeld(RoleManager.ROLE_DIALER)) {

                        } else {
                            Intent roleRequestIntent = roleManager.createRequestRoleIntent(
                                    RoleManager.ROLE_DIALER);
                            startActivityForResult(roleRequestIntent, REQUEST_DEFAULT_DIALER);
                        }
                    }

                } else {
                    intent = new Intent(TelecomManager.ACTION_CHANGE_DEFAULT_DIALER)
                            .putExtra(TelecomManager.EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME, getPackageName());
                    startActivityForResult(intent, REQUEST_DEFAULT_DIALER);
                }
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public static boolean startPermissionActivity(Activity activity) {
        if (!PermissionsUtil.hasNecessaryRequiredPermissions(activity)) {
            Intent intent = new Intent(activity, ForceRequestPermissionsActivity.class);
            intent.putExtra(PREVIOUS_ACTIVITY_INTENT, activity.getIntent());
            activity.startActivity(intent);
            activity.finish();
            System.out.println("m,mmmmmmaaaa" + true);
            return true;
        } else if (!isDefaultSmsApp(activity)) {
            Intent intent = new Intent(activity, ForceRequestPermissionsActivity.class);
            intent.putExtra(PREVIOUS_ACTIVITY_INTENT, activity.getIntent());
            activity.startActivity(intent);
            activity.finish();
            System.out.println("m,mmmmmmaaaa" + false);
            return true;
        }else if (!isDefaultDialerApp(activity)){
            Intent intent = new Intent(activity, ForceRequestPermissionsActivity.class);
            intent.putExtra(PREVIOUS_ACTIVITY_INTENT, activity.getIntent());
            activity.startActivity(intent);
            activity.finish();
            System.out.println("m,mmmmmmaaaa" + false);
            return true;
        }
        return false;
    }

    private void redirect() {
        mPreviousActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(mPreviousActivityIntent);
        finish();
        overridePendingTransition(0, 0);
    }


    private void requestNecessaryRequiredPermissions(Context context) {
        if (PermissionsUtil.hasNecessaryRequiredPermissions(context)){
            redirect();
        }else {
            final ArrayList<String> unsatisfiedPermissions = new ArrayList<>();
            for (String permission : requiredPermissions) {
                if (checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
                    unsatisfiedPermissions.add(permission);
                }
            }
            if (unsatisfiedPermissions.size() == 0) {
                finish();
                return;
            }
            requestPermissions(unsatisfiedPermissions.toArray(new String[unsatisfiedPermissions
                    .size()]), PERMISSIONS_REQUEST_ALL_PERMISSIONS);
        }

    }

	

/*
	private void requestSpecialPermissions(String permission, int requestCode){
		String []permissions = new String[]{permission};
		requestPermissions(permissions, requestCode);
	}
*/

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        System.out.println("mzmzmzmmma" + requestCode);
        if (requestCode == REQUEST_DEFAULT_DIALER) {
            if (isDefaultSmsApp(this)) {
                requestNecessaryRequiredPermissions(this);
            } else {
                showDefaultSmsDialog(this);
            }
        } else if (requestCode == 4141) {
            requestNecessaryRequiredPermissions(this);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String[] permissions, int[] grantResults) {

        System.out.println("mzmzmzmz" + requestCode);
        if (requestCode == PERMISSIONS_REQUEST_ALL_PERMISSIONS) {
            mForbiddenPermissionList.clear();
            if (permissions != null && permissions.length > 0
                    && isAllGranted(permissions, grantResults, mForbiddenPermissionList)) {
                redirect();
            } else {
                Dialog dialog = PermissionsUtil.createPermissionSettingDialog(this, mForbiddenPermissionList.toString());
                dialog.show();
            }
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }

    }


    private boolean isAllGranted(String permissions[], int[] grantResult, ArrayList<String> forbiddenPermissionList) {
        boolean isAllGrand = true;
        for (int i = 0; i < permissions.length; i++) {
            if (grantResult[i] != PackageManager.PERMISSION_GRANTED
                    && isPermissionRequired(permissions[i])) {
                forbiddenPermissionList.add(permissions[i]);
                isAllGrand = false;
            }
        }
        return isAllGrand;
    }

    private boolean isPermissionRequired(String p) {
        return Arrays.asList(requiredPermissions).contains(p);
    }

/*	private void doPhonePermission(int[] grantResults){
		if (grantResults[0] == PackageManager.PERMISSION_DENIED){
			Dialog dialog = PermissionsUtil.createPermissionSettingDialog(this, "电话权限");
			dialog.show();
		}else if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
			requestSpecialPermissions(PermissionsUtil.CONTACTS, REQUEST_CONTACT_PERMISSION);
		}
	
	}

	private void doContactPermission(int[] grantResults){
		if (grantResults[0] == PackageManager.PERMISSION_DENIED){
			Dialog dialog = PermissionsUtil.createPermissionSettingDialog(this, "通讯录权限");
			dialog.show();
		}else if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
			requestSpecialPermissions(PermissionsUtil.LOCATION, REQUEST_LOCATION_PERMISSION);
		}

	}
	
	
	private void doLocationPermission(int[] grantResults){
		if (grantResults[0] == PackageManager.PERMISSION_DENIED){
			Dialog dialog = PermissionsUtil.createPermissionSettingDialog(this, "位置权限");
			dialog.show();
		}else if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
			requestSpecialPermissions(PermissionsUtil.STORAGE, REQUEST_STORAGE_PERMISSION);
		}
	
	}
	
	
	private void doStoragePermission(int[] grantResults){
		if (grantResults[0] == PackageManager.PERMISSION_DENIED){
			Dialog dialog = PermissionsUtil.createPermissionSettingDialog(this, "存储权限");
			dialog.show();
		}else if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
			redirect();
		}
	
	}*/
}
