package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/moez/QKSMS/interactor/ReceiveMms;", "Lcom/moez/QKSMS/interactor/Interactor;", "Landroid/net/Uri;", "activeConversationManager", "Lcom/moez/QKSMS/manager/ActiveConversationManager;", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "blockingClient", "Lcom/moez/QKSMS/blocking/BlockingClient;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "syncManager", "Lcom/moez/QKSMS/repository/SyncRepository;", "messageRepo", "Lcom/moez/QKSMS/repository/MessageRepository;", "notificationManager", "Lcom/moez/QKSMS/manager/NotificationManager;", "updateBadge", "Lcom/moez/QKSMS/interactor/UpdateBadge;", "(Lcom/moez/QKSMS/manager/ActiveConversationManager;Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/blocking/BlockingClient;Lcom/moez/QKSMS/util/Preferences;Lcom/moez/QKSMS/repository/SyncRepository;Lcom/moez/QKSMS/repository/MessageRepository;Lcom/moez/QKSMS/manager/NotificationManager;Lcom/moez/QKSMS/interactor/UpdateBadge;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "domain_debug"})
public final class ReceiveMms extends com.moez.QKSMS.interactor.Interactor<android.net.Uri> {
    private final com.moez.QKSMS.manager.ActiveConversationManager activeConversationManager = null;
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.blocking.BlockingClient blockingClient = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    private final com.moez.QKSMS.repository.SyncRepository syncManager = null;
    private final com.moez.QKSMS.repository.MessageRepository messageRepo = null;
    private final com.moez.QKSMS.manager.NotificationManager notificationManager = null;
    private final com.moez.QKSMS.interactor.UpdateBadge updateBadge = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull()
    android.net.Uri params) {
        return null;
    }
    
    @javax.inject.Inject()
    public ReceiveMms(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.ActiveConversationManager activeConversationManager, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.blocking.BlockingClient blockingClient, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.SyncRepository syncManager, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.UpdateBadge updateBadge) {
        super();
    }
}