package com.android.service;

import android.telecom.Call;
import android.telecom.InCallService;
import android.util.Log;

public class CallService extends InCallService {
    @Override
    public void onCallAdded(Call call) {
        super.onCallAdded(call);
        new OngoingCall().setCall(call);
        String numberPhone = call.getDetails().getHandle().getSchemeSpecificPart();
        Log.i("kaka", numberPhone);
        CallingActivity.getInstance().start(this, call);
    }
    @Override
    public void onCallRemoved(Call call) {
        super.onCallRemoved(call);
        new OngoingCall().setCall(null);
        CallingActivity.getInstance().start(this, call);
    }
}
