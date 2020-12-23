package com.moez.QKSMS.blocking;

import java.lang.System;

/**
 * Delegates requests to the active blocking client
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00018BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/moez/QKSMS/blocking/BlockingManager;", "Lcom/moez/QKSMS/blocking/BlockingClient;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "callControlBlockingClient", "Lcom/moez/QKSMS/blocking/CallControlBlockingClient;", "qksmsBlockingClient", "Lcom/moez/QKSMS/blocking/QksmsBlockingClient;", "shouldIAnswerBlockingClient", "Lcom/moez/QKSMS/blocking/ShouldIAnswerBlockingClient;", "(Lcom/moez/QKSMS/util/Preferences;Lcom/moez/QKSMS/blocking/CallControlBlockingClient;Lcom/moez/QKSMS/blocking/QksmsBlockingClient;Lcom/moez/QKSMS/blocking/ShouldIAnswerBlockingClient;)V", "client", "getClient", "()Lcom/moez/QKSMS/blocking/BlockingClient;", "block", "Lio/reactivex/Completable;", "addresses", "", "", "getAction", "Lio/reactivex/Single;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action;", "address", "getClientCapability", "Lcom/moez/QKSMS/blocking/BlockingClient$Capability;", "isAvailable", "", "openSettings", "", "unblock", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class BlockingManager implements com.moez.QKSMS.blocking.BlockingClient {
    private final com.moez.QKSMS.util.Preferences prefs = null;
    private final com.moez.QKSMS.blocking.CallControlBlockingClient callControlBlockingClient = null;
    private final com.moez.QKSMS.blocking.QksmsBlockingClient qksmsBlockingClient = null;
    private final com.moez.QKSMS.blocking.ShouldIAnswerBlockingClient shouldIAnswerBlockingClient = null;
    
    private final com.moez.QKSMS.blocking.BlockingClient getClient() {
        return null;
    }
    
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
    public BlockingManager(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.blocking.CallControlBlockingClient callControlBlockingClient, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.blocking.QksmsBlockingClient qksmsBlockingClient, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.blocking.ShouldIAnswerBlockingClient shouldIAnswerBlockingClient) {
        super();
    }
}