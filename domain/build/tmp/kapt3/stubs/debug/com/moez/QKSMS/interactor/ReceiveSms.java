package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/moez/QKSMS/interactor/ReceiveSms;", "Lcom/moez/QKSMS/interactor/Interactor;", "Lcom/moez/QKSMS/interactor/ReceiveSms$Params;", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "blockingClient", "Lcom/moez/QKSMS/blocking/BlockingClient;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "messageRepo", "Lcom/moez/QKSMS/repository/MessageRepository;", "notificationManager", "Lcom/moez/QKSMS/manager/NotificationManager;", "updateBadge", "Lcom/moez/QKSMS/interactor/UpdateBadge;", "shortcutManager", "Lcom/moez/QKSMS/manager/ShortcutManager;", "(Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/blocking/BlockingClient;Lcom/moez/QKSMS/util/Preferences;Lcom/moez/QKSMS/repository/MessageRepository;Lcom/moez/QKSMS/manager/NotificationManager;Lcom/moez/QKSMS/interactor/UpdateBadge;Lcom/moez/QKSMS/manager/ShortcutManager;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "Params", "domain_debug"})
public final class ReceiveSms extends com.moez.QKSMS.interactor.Interactor<com.moez.QKSMS.interactor.ReceiveSms.Params> {
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.blocking.BlockingClient blockingClient = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    private final com.moez.QKSMS.repository.MessageRepository messageRepo = null;
    private final com.moez.QKSMS.manager.NotificationManager notificationManager = null;
    private final com.moez.QKSMS.interactor.UpdateBadge updateBadge = null;
    private final com.moez.QKSMS.manager.ShortcutManager shortcutManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.ReceiveSms.Params params) {
        return null;
    }
    
    @javax.inject.Inject()
    public ReceiveSms(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.blocking.BlockingClient blockingClient, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.UpdateBadge updateBadge, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.ShortcutManager shortcutManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/moez/QKSMS/interactor/ReceiveSms$Params;", "", "subId", "", "messages", "", "Landroid/telephony/SmsMessage;", "(I[Landroid/telephony/SmsMessage;)V", "getMessages", "()[Landroid/telephony/SmsMessage;", "[Landroid/telephony/SmsMessage;", "getSubId", "()I", "domain_debug"})
    public static final class Params {
        private final int subId = 0;
        @org.jetbrains.annotations.NotNull()
        private final android.telephony.SmsMessage[] messages = null;
        
        public final int getSubId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.telephony.SmsMessage[] getMessages() {
            return null;
        }
        
        public Params(int subId, @org.jetbrains.annotations.NotNull()
        android.telephony.SmsMessage[] messages) {
            super();
        }
    }
}