package com.moez.QKSMS.experiment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00028\u0000X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R#\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\"\u0010\u000eR\u001e\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(\u00a8\u0006)"}, d2 = {"Lcom/moez/QKSMS/experiment/Experiment;", "T", "", "context", "Landroid/content/Context;", "analytics", "Lcom/moez/QKSMS/manager/AnalyticsManager;", "(Landroid/content/Context;Lcom/moez/QKSMS/manager/AnalyticsManager;)V", "getAnalytics", "()Lcom/moez/QKSMS/manager/AnalyticsManager;", "getContext", "()Landroid/content/Context;", "default", "getDefault", "()Ljava/lang/Object;", "key", "", "getKey", "()Ljava/lang/String;", "prefKey", "getPrefKey", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "qualifies", "", "getQualifies", "()Z", "qualifies$delegate", "variant", "getVariant", "variant$delegate", "variants", "", "Lcom/moez/QKSMS/experiment/Variant;", "getVariants", "()Ljava/util/List;", "domain_debug"})
public abstract class Experiment<T extends java.lang.Object> {
    private final kotlin.Lazy prefs$delegate = null;
    
    /**
     * Returns true if the current device qualifies for the experiment
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy qualifies$delegate = null;
    private final kotlin.Lazy variant$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moez.QKSMS.manager.AnalyticsManager analytics = null;
    
    private final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    private final java.lang.String getPrefKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getKey();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.util.List<com.moez.QKSMS.experiment.Variant<T>> getVariants();
    
    protected abstract T getDefault();
    
    /**
     * Returns true if the current device qualifies for the experiment
     */
    protected boolean getQualifies() {
        return false;
    }
    
    public final T getVariant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.manager.AnalyticsManager getAnalytics() {
        return null;
    }
    
    public Experiment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.AnalyticsManager analytics) {
        super();
    }
}