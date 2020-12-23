package com.moez.QKSMS.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016JA\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062*\u0010\u000b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r0\f\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\rH\u0016\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/moez/QKSMS/manager/AnalyticsManagerImpl;", "Lcom/moez/QKSMS/manager/AnalyticsManager;", "()V", "setUserProperty", "", "key", "", "value", "", "track", "event", "properties", "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class AnalyticsManagerImpl implements com.moez.QKSMS.manager.AnalyticsManager {
    
    @java.lang.Override()
    public void track(@org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, ? extends java.lang.Object>... properties) {
    }
    
    @java.lang.Override()
    public void setUserProperty(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
    }
    
    @javax.inject.Inject()
    public AnalyticsManagerImpl() {
        super();
    }
}