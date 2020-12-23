package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0006H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH&J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H&\u00a8\u0006\u0017"}, d2 = {"Lcom/moez/QKSMS/repository/ContactRepository;", "", "findContactUri", "Lio/reactivex/Single;", "Landroid/net/Uri;", "address", "", "getContacts", "Lio/realm/RealmResults;", "Lcom/moez/QKSMS/model/Contact;", "getUnmanagedContact", "lookupKey", "getUnmanagedContactGroups", "Lio/reactivex/Observable;", "", "Lcom/moez/QKSMS/model/ContactGroup;", "getUnmanagedContacts", "starred", "", "setDefaultPhoneNumber", "", "phoneNumberId", "", "domain_debug"})
public abstract interface ContactRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<android.net.Uri> findContactUri(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Contact> getContacts();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Contact getUnmanagedContact(@org.jetbrains.annotations.NotNull()
    java.lang.String lookupKey);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.moez.QKSMS.model.Contact>> getUnmanagedContacts(boolean starred);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.moez.QKSMS.model.ContactGroup>> getUnmanagedContactGroups();
    
    public abstract void setDefaultPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String lookupKey, long phoneNumberId);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}