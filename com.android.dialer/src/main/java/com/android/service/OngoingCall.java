package com.android.service;

import android.os.Build;
import android.telecom.Call;
import android.telecom.VideoProfile;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import io.reactivex.subjects.BehaviorSubject;

public class OngoingCall {

    public static BehaviorSubject<Integer> state = BehaviorSubject.create();
    private static Call sCall;

    public Call getsCall() {
        return sCall;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private Object callback = new Call.Callback() {
        @Override
        public void onStateChanged(Call call, int newState) {
            super.onStateChanged(call, newState);
            state.onNext(newState);
        }
    };
    @RequiresApi(api = Build.VERSION_CODES.M)
    public final void setCall(@Nullable Call value) {
        if (sCall != null) {
            sCall.unregisterCallback((Call.Callback) callback);
        }

        if (value != null) {
            value.registerCallback((Call.Callback) callback);
            state.onNext(value.getState());
        }

        sCall = value;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void answer() {
        if (sCall != null) {
            sCall.answer(VideoProfile.STATE_AUDIO_ONLY);
//            System.exit(0);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void hangup() {
        if (sCall != null) {
            sCall.disconnect();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void hold(boolean hold) {
        if (sCall != null) {
            if (hold) sCall.hold();
            else sCall.unhold();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void addCall(Call call) {
        if (sCall != null) {
            sCall.conference(call);
        }
    }

}