package com.moez.QKSMS.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0012\u0013J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0014"}, d2 = {"Lcom/moez/QKSMS/blocking/BlockingClient;", "", "block", "Lio/reactivex/Completable;", "addresses", "", "", "getAction", "Lio/reactivex/Single;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action;", "address", "getClientCapability", "Lcom/moez/QKSMS/blocking/BlockingClient$Capability;", "isAvailable", "", "openSettings", "", "unblock", "Action", "Capability", "domain_debug"})
public abstract interface BlockingClient {
    
    /**
     * Returns true if the target blocking client is available for use, ie. it is installed
     */
    public abstract boolean isAvailable();
    
    /**
     * Returns the level of access that the given blocking client provides to QKSMS
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.moez.QKSMS.blocking.BlockingClient.Capability getClientCapability();
    
    /**
     * Returns the recommendation action to perform given a message from the [address]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.moez.QKSMS.blocking.BlockingClient.Action> getAction(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    /**
     * Blocks the numbers or opens the manager
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable block(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses);
    
    /**
     * Unblocks the numbers or opens the manager
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable unblock(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses);
    
    /**
     * Opens the settings page for the blocking manager
     */
    public abstract void openSettings();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/moez/QKSMS/blocking/BlockingClient$Capability;", "", "(Ljava/lang/String;I)V", "BLOCK_WITHOUT_PERMISSION", "BLOCK_WITH_PERMISSION", "CANT_BLOCK", "domain_debug"})
    public static enum Capability {
        /*public static final*/ BLOCK_WITHOUT_PERMISSION /* = new BLOCK_WITHOUT_PERMISSION() */,
        /*public static final*/ BLOCK_WITH_PERMISSION /* = new BLOCK_WITH_PERMISSION() */,
        /*public static final*/ CANT_BLOCK /* = new CANT_BLOCK() */;
        
        Capability() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/moez/QKSMS/blocking/BlockingClient$Action;", "", "()V", "Block", "DoNothing", "Unblock", "Lcom/moez/QKSMS/blocking/BlockingClient$Action$Block;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action$Unblock;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action$DoNothing;", "domain_debug"})
    public static abstract class Action {
        
        private Action() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/moez/QKSMS/blocking/BlockingClient$Action$Block;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "domain_debug"})
        public static final class Block extends com.moez.QKSMS.blocking.BlockingClient.Action {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String reason = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getReason() {
                return null;
            }
            
            public Block(@org.jetbrains.annotations.Nullable()
            java.lang.String reason) {
                super();
            }
            
            public Block() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moez/QKSMS/blocking/BlockingClient$Action$Unblock;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action;", "()V", "domain_debug"})
        public static final class Unblock extends com.moez.QKSMS.blocking.BlockingClient.Action {
            public static final com.moez.QKSMS.blocking.BlockingClient.Action.Unblock INSTANCE = null;
            
            private Unblock() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moez/QKSMS/blocking/BlockingClient$Action$DoNothing;", "Lcom/moez/QKSMS/blocking/BlockingClient$Action;", "()V", "domain_debug"})
        public static final class DoNothing extends com.moez.QKSMS.blocking.BlockingClient.Action {
            public static final com.moez.QKSMS.blocking.BlockingClient.Action.DoNothing INSTANCE = null;
            
            private DoNothing() {
                super();
            }
        }
    }
}