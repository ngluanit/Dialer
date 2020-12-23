package com.moez.QKSMS.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/moez/QKSMS/model/PhoneNumber;", "Lio/realm/RealmObject;", "id", "", "accountType", "", "address", "type", "isDefault", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAccountType", "()Ljava/lang/String;", "setAccountType", "(Ljava/lang/String;)V", "getAddress", "setAddress", "getId", "()J", "setId", "(J)V", "()Z", "setDefault", "(Z)V", "getType", "setType", "domain_debug"})
public class PhoneNumber extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private long id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String accountType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    private boolean isDefault;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccountType() {
        return null;
    }
    
    public final void setAccountType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isDefault() {
        return false;
    }
    
    public final void setDefault(boolean p0) {
    }
    
    public PhoneNumber(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String accountType, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String type, boolean isDefault) {
        super();
    }
    
    public PhoneNumber() {
        super();
    }
}