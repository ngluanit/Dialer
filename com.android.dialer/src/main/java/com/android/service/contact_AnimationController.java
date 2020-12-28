package com.android.service;

import android.content.Context;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;

import com.android.dialer.DialerApplication;

public class
contact_AnimationController {
    public static TranslateAnimation animationAnswer(boolean z) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) m5385a(DialerApplication.getInstance(), z ? -50 : -20), 0.0f);
        translateAnimation.setInterpolator(new OvershootInterpolator());
        translateAnimation.setDuration(500);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(2);
        return translateAnimation;
    }

    public static TranslateAnimation animationAnswerThumb(boolean z) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) m5385a(DialerApplication.getInstance(), z ? -30 : -10), 0.0f);
        translateAnimation.setInterpolator(new OvershootInterpolator());
        translateAnimation.setDuration(500);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(2);
        return translateAnimation;

    }

    public static int m5385a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }
}
