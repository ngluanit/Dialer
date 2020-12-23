package com.moez.QKSMS.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/moez/QKSMS/blocking/QksmsBlockingClient;", "Lcom/moez/QKSMS/blocking/BlockingClient;", "blockingRepo", "Lcom/moez/QKSMS/repository/BlockingRepository;", "(Lcom/moez/QKSMS/repository/BlockingRepository;)V", "block", "Lio/reactivex/Completable;", "addresses", "", "", "getAction", "Lio/reactivex/Single;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action;", "address", "getClientCapability", "Lcom/moez/QKSMS/blocking/BlockingClient$Capability;", "isAvailable", "", "openSettings", "", "unblock", "data_noAnalyticsDebug"})
public final class QksmsBlockingClient implements com.moez.QKSMS.blocking.BlockingClient {
    private final com.moez.QKSMS.repository.BlockingRepository blockingRepo = null;
    
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
    public QksmsBlockingClient(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.BlockingRepository blockingRepo) {
        super();
    }
}