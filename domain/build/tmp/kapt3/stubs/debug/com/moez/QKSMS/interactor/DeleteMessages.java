package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/moez/QKSMS/interactor/DeleteMessages;", "Lcom/moez/QKSMS/interactor/Interactor;", "Lcom/moez/QKSMS/interactor/DeleteMessages$Params;", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "messageRepo", "Lcom/moez/QKSMS/repository/MessageRepository;", "notificationManager", "Lcom/moez/QKSMS/manager/NotificationManager;", "updateBadge", "Lcom/moez/QKSMS/interactor/UpdateBadge;", "(Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/repository/MessageRepository;Lcom/moez/QKSMS/manager/NotificationManager;Lcom/moez/QKSMS/interactor/UpdateBadge;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "Params", "domain_debug"})
public final class DeleteMessages extends com.moez.QKSMS.interactor.Interactor<com.moez.QKSMS.interactor.DeleteMessages.Params> {
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.repository.MessageRepository messageRepo = null;
    private final com.moez.QKSMS.manager.NotificationManager notificationManager = null;
    private final com.moez.QKSMS.interactor.UpdateBadge updateBadge = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.DeleteMessages.Params params) {
        return null;
    }
    
    @javax.inject.Inject()
    public DeleteMessages(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.UpdateBadge updateBadge) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ*\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/moez/QKSMS/interactor/DeleteMessages$Params;", "", "messageIds", "", "", "threadId", "(Ljava/util/List;Ljava/lang/Long;)V", "getMessageIds", "()Ljava/util/List;", "getThreadId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Long;)Lcom/moez/QKSMS/interactor/DeleteMessages$Params;", "equals", "", "other", "hashCode", "", "toString", "", "domain_debug"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> messageIds = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long threadId = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getMessageIds() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getThreadId() {
            return null;
        }
        
        public Params(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> messageIds, @org.jetbrains.annotations.Nullable()
        java.lang.Long threadId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.interactor.DeleteMessages.Params copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> messageIds, @org.jetbrains.annotations.Nullable()
        java.lang.Long threadId) {
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