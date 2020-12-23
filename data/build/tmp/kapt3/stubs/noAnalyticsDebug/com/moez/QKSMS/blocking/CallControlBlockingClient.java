package com.moez.QKSMS.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/moez/QKSMS/blocking/CallControlBlockingClient;", "Lcom/moez/QKSMS/blocking/BlockingClient;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "projection", "", "", "[Ljava/lang/String;", "block", "Lio/reactivex/Completable;", "addresses", "", "getAction", "Lio/reactivex/Single;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action;", "address", "getClientCapability", "Lcom/moez/QKSMS/blocking/BlockingClient$Capability;", "isAvailable", "", "openSettings", "", "unblock", "LookupResult", "data_noAnalyticsDebug"})
public final class CallControlBlockingClient implements com.moez.QKSMS.blocking.BlockingClient {
    private final java.lang.String[] projection = null;
    private final android.content.Context context = null;
    
    @java.lang.Override()
    public boolean isAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.moez.QKSMS.blocking.BlockingClient.Capability getClientCapability() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.moez.QKSMS.blocking.BlockingClient.Action> getAction(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable block(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable unblock(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses) {
        return null;
    }
    
    @java.lang.Override()
    public void openSettings() {
    }
    
    @javax.inject.Inject()
    public CallControlBlockingClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/moez/QKSMS/blocking/CallControlBlockingClient$LookupResult;", "", "cursor", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)V", "blockReason", "", "getBlockReason", "()Ljava/lang/String;", "data_noAnalyticsDebug"})
    public static final class LookupResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String blockReason = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBlockReason() {
            return null;
        }
        
        public LookupResult(@org.jetbrains.annotations.NotNull()
        android.database.Cursor cursor) {
            super();
        }
    }
}