package com.moez.QKSMS.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\r0\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/moez/QKSMS/mapper/RatingManagerImpl;", "Lcom/moez/QKSMS/manager/RatingManager;", "rxPrefs", "Lcom/f2prateek/rx/preferences2/RxSharedPreferences;", "analyticsManager", "Lcom/moez/QKSMS/manager/AnalyticsManager;", "(Lcom/f2prateek/rx/preferences2/RxSharedPreferences;Lcom/moez/QKSMS/manager/AnalyticsManager;)V", "dismissed", "Lcom/f2prateek/rx/preferences2/Preference;", "", "kotlin.jvm.PlatformType", "rated", "sessions", "", "shouldShowRating", "Lio/reactivex/Observable;", "getShouldShowRating", "()Lio/reactivex/Observable;", "addSession", "", "dismiss", "rate", "Companion", "data_noAnalyticsDebug"})
public final class RatingManagerImpl implements com.moez.QKSMS.manager.RatingManager {
    private final com.f2prateek.rx.preferences2.Preference<java.lang.Integer> sessions = null;
    private final com.f2prateek.rx.preferences2.Preference<java.lang.Boolean> rated = null;
    private final com.f2prateek.rx.preferences2.Preference<java.lang.Boolean> dismissed = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.lang.Boolean> shouldShowRating = null;
    private final com.moez.QKSMS.manager.AnalyticsManager analyticsManager = null;
    private static final int RATING_THRESHOLD = 10;
    public static final com.moez.QKSMS.mapper.RatingManagerImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> getShouldShowRating() {
        return null;
    }
    
    @java.lang.Override()
    public void addSession() {
    }
    
    @java.lang.Override()
    public void rate() {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    @javax.inject.Inject()
    public RatingManagerImpl(@org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences rxPrefs, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.AnalyticsManager analyticsManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/moez/QKSMS/mapper/RatingManagerImpl$Companion;", "", "()V", "RATING_THRESHOLD", "", "data_noAnalyticsDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}