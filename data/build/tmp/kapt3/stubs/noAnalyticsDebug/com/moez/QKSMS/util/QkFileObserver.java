package com.moez.QKSMS.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/moez/QKSMS/util/QkFileObserver;", "Landroid/os/FileObserver;", "path", "", "(Ljava/lang/String;)V", "observable", "Lio/reactivex/Observable;", "getObservable", "()Lio/reactivex/Observable;", "subject", "Lio/reactivex/subjects/Subject;", "kotlin.jvm.PlatformType", "onEvent", "", "event", "", "data_noAnalyticsDebug"})
public final class QkFileObserver extends android.os.FileObserver {
    private final io.reactivex.subjects.Subject<java.lang.String> subject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.lang.String> observable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.String> getObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void onEvent(int event, @org.jetbrains.annotations.Nullable()
    java.lang.String path) {
    }
    
    public QkFileObserver(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        super(null);
    }
}