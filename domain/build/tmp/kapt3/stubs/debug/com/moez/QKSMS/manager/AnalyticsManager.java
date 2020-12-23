package com.moez.QKSMS.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H&JA\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000b0\n\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bH&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/moez/QKSMS/manager/AnalyticsManager;", "", "setUserProperty", "", "key", "", "value", "track", "event", "properties", "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "domain_debug"})
public abstract interface AnalyticsManager {
    
    public abstract void track(@org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, ? extends java.lang.Object>... properties);
    
    public abstract void setUserProperty(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object value);
}