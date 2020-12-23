package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/moez/QKSMS/repository/ContactRepositoryImpl;", "Lcom/moez/QKSMS/repository/ContactRepository;", "context", "Landroid/content/Context;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "(Landroid/content/Context;Lcom/moez/QKSMS/util/Preferences;)V", "findContactUri", "Lio/reactivex/Single;", "Landroid/net/Uri;", "address", "", "getContacts", "Lio/realm/RealmResults;", "Lcom/moez/QKSMS/model/Contact;", "getUnmanagedContact", "lookupKey", "getUnmanagedContactGroups", "Lio/reactivex/Observable;", "", "Lcom/moez/QKSMS/model/ContactGroup;", "getUnmanagedContacts", "starred", "", "setDefaultPhoneNumber", "", "phoneNumberId", "", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class ContactRepositoryImpl implements com.moez.QKSMS.repository.ContactRepository {
    private final android.content.Context context = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<android.net.Uri> findContactUri(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.realm.RealmResults<com.moez.QKSMS.model.Contact> getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.moez.QKSMS.model.Contact getUnmanagedContact(@org.jetbrains.annotations.NotNull()
    java.lang.String lookupKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.moez.QKSMS.model.Contact>> getUnmanagedContacts(boolean starred) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.moez.QKSMS.model.ContactGroup>> getUnmanagedContactGroups() {
        return null;
    }
    
    @java.lang.Override()
    public void setDefaultPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String lookupKey, long phoneNumberId) {
    }
    
    @javax.inject.Inject()
    public ContactRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs) {
        super();
    }
}