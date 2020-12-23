package com.moez.QKSMS.listener;

import java.lang.System;

/**
 * Listens for a contact being added, and then syncs it to Realm
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/moez/QKSMS/listener/ContactAddedListenerImpl;", "Lcom/moez/QKSMS/listener/ContactAddedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "listen", "Lio/reactivex/Observable;", "Companion", "ContactContentObserver", "data_noAnalyticsDebug"})
public final class ContactAddedListenerImpl implements com.moez.QKSMS.listener.ContactAddedListener {
    private final android.content.Context context = null;
    private static final android.net.Uri URI = null;
    public static final com.moez.QKSMS.listener.ContactAddedListenerImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<?> listen() {
        return null;
    }
    
    @javax.inject.Inject()
    public ContactAddedListenerImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00070\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/moez/QKSMS/listener/ContactAddedListenerImpl$ContactContentObserver;", "Landroid/database/ContentObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "observable", "Lio/reactivex/Observable;", "", "getObservable", "()Lio/reactivex/Observable;", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "onChange", "selfChange", "", "uri", "Landroid/net/Uri;", "data_noAnalyticsDebug"})
    static final class ContactContentObserver extends android.database.ContentObserver {
        private final io.reactivex.subjects.BehaviorSubject<kotlin.Unit> subject = null;
        @org.jetbrains.annotations.NotNull()
        private final io.reactivex.Observable<kotlin.Unit> observable = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.reactivex.Observable<kotlin.Unit> getObservable() {
            return null;
        }
        
        @java.lang.Override()
        public void onChange(boolean selfChange) {
        }
        
        @java.lang.Override()
        public void onChange(boolean selfChange, @org.jetbrains.annotations.Nullable()
        android.net.Uri uri) {
        }
        
        public ContactContentObserver(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/moez/QKSMS/listener/ContactAddedListenerImpl$Companion;", "", "()V", "URI", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "data_noAnalyticsDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}