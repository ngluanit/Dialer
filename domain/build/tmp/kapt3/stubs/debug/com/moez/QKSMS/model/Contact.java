package com.moez.QKSMS.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\"\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006#"}, d2 = {"Lcom/moez/QKSMS/model/Contact;", "Lio/realm/RealmObject;", "lookupKey", "", "numbers", "Lio/realm/RealmList;", "Lcom/moez/QKSMS/model/PhoneNumber;", "name", "photoUri", "starred", "", "lastUpdate", "", "(Ljava/lang/String;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getLastUpdate", "()J", "setLastUpdate", "(J)V", "getLookupKey", "()Ljava/lang/String;", "setLookupKey", "(Ljava/lang/String;)V", "getName", "setName", "getNumbers", "()Lio/realm/RealmList;", "setNumbers", "(Lio/realm/RealmList;)V", "getPhotoUri", "setPhotoUri", "getStarred", "()Z", "setStarred", "(Z)V", "getDefaultNumber", "domain_debug"})
public class Contact extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.PrimaryKey()
    private java.lang.String lookupKey;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<com.moez.QKSMS.model.PhoneNumber> numbers;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String photoUri;
    private boolean starred;
    private long lastUpdate;
    
    @org.jetbrains.annotations.Nullable()
    public final com.moez.QKSMS.model.PhoneNumber getDefaultNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLookupKey() {
        return null;
    }
    
    public final void setLookupKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<com.moez.QKSMS.model.PhoneNumber> getNumbers() {
        return null;
    }
    
    public final void setNumbers(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.moez.QKSMS.model.PhoneNumber> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhotoUri() {
        return null;
    }
    
    public final void setPhotoUri(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getStarred() {
        return false;
    }
    
    public final void setStarred(boolean p0) {
    }
    
    public final long getLastUpdate() {
        return 0L;
    }
    
    public final void setLastUpdate(long p0) {
    }
    
    public Contact(@org.jetbrains.annotations.NotNull()
    java.lang.String lookupKey, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.moez.QKSMS.model.PhoneNumber> numbers, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String photoUri, boolean starred, long lastUpdate) {
        super();
    }
    
    public Contact() {
        super();
    }
}