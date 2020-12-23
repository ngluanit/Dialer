package com.moez.QKSMS.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/moez/QKSMS/util/PhoneNumberUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "countryCode", "", "kotlin.jvm.PlatformType", "phoneNumberUtil", "Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;", "compare", "", "first", "second", "formatNumber", "number", "", "isPossibleNumber", "isReallyDialable", "digit", "", "normalizeNumber", "parse", "Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class PhoneNumberUtils {
    private final java.lang.String countryCode = null;
    private final io.michaelrocks.libphonenumber.android.PhoneNumberUtil phoneNumberUtil = null;
    
    /**
     * Android's implementation is too loose and causes false positives
     * libphonenumber is stricter but too slow
     *
     * This method will run successfully stricter checks without compromising much speed
     */
    public final boolean compare(@org.jetbrains.annotations.NotNull()
    java.lang.String first, @org.jetbrains.annotations.NotNull()
    java.lang.String second) {
        return false;
    }
    
    public final boolean isPossibleNumber(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence number) {
        return false;
    }
    
    public final boolean isReallyDialable(char digit) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatNumber(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String normalizeNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String number) {
        return null;
    }
    
    private final io.michaelrocks.libphonenumber.android.Phonenumber.PhoneNumber parse(java.lang.CharSequence number) {
        return null;
    }
    
    @javax.inject.Inject()
    public PhoneNumberUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}