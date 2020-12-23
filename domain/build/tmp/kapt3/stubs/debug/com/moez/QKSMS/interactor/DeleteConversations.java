package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/moez/QKSMS/interactor/DeleteConversations;", "Lcom/moez/QKSMS/interactor/Interactor;", "", "", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "notificationManager", "Lcom/moez/QKSMS/manager/NotificationManager;", "updateBadge", "Lcom/moez/QKSMS/interactor/UpdateBadge;", "(Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/manager/NotificationManager;Lcom/moez/QKSMS/interactor/UpdateBadge;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "domain_debug"})
public final class DeleteConversations extends com.moez.QKSMS.interactor.Interactor<java.util.List<? extends java.lang.Long>> {
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.manager.NotificationManager notificationManager = null;
    private final com.moez.QKSMS.interactor.UpdateBadge updateBadge = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> params) {
        return null;
    }
    
    @javax.inject.Inject()
    public DeleteConversations(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.UpdateBadge updateBadge) {
        super();
    }
}