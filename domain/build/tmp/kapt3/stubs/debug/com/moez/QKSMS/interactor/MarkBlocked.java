package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/moez/QKSMS/interactor/MarkBlocked;", "Lcom/moez/QKSMS/interactor/Interactor;", "Lcom/moez/QKSMS/interactor/MarkBlocked$Params;", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "markRead", "Lcom/moez/QKSMS/interactor/MarkRead;", "(Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/interactor/MarkRead;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "Params", "domain_debug"})
public final class MarkBlocked extends com.moez.QKSMS.interactor.Interactor<com.moez.QKSMS.interactor.MarkBlocked.Params> {
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.interactor.MarkRead markRead = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.MarkBlocked.Params params) {
        return null;
    }
    
    @javax.inject.Inject()
    public MarkBlocked(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.MarkRead markRead) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/moez/QKSMS/interactor/MarkBlocked$Params;", "", "threadIds", "", "", "blockingClient", "", "blockReason", "", "(Ljava/util/List;ILjava/lang/String;)V", "getBlockReason", "()Ljava/lang/String;", "getBlockingClient", "()I", "getThreadIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_debug"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> threadIds = null;
        private final int blockingClient = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String blockReason = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getThreadIds() {
            return null;
        }
        
        public final int getBlockingClient() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBlockReason() {
            return null;
        }
        
        public Params(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> threadIds, int blockingClient, @org.jetbrains.annotations.Nullable()
        java.lang.String blockReason) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.interactor.MarkBlocked.Params copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> threadIds, int blockingClient, @org.jetbrains.annotations.Nullable()
        java.lang.String blockReason) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}