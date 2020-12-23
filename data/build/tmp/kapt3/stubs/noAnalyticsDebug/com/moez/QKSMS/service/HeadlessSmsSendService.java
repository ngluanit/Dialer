package com.moez.QKSMS.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/moez/QKSMS/service/HeadlessSmsSendService;", "Landroid/app/IntentService;", "()V", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "getConversationRepo", "()Lcom/moez/QKSMS/repository/ConversationRepository;", "setConversationRepo", "(Lcom/moez/QKSMS/repository/ConversationRepository;)V", "sendMessage", "Lcom/moez/QKSMS/interactor/SendMessage;", "getSendMessage", "()Lcom/moez/QKSMS/interactor/SendMessage;", "setSendMessage", "(Lcom/moez/QKSMS/interactor/SendMessage;)V", "getRecipients", "", "uri", "Landroid/net/Uri;", "onHandleIntent", "", "intent", "Landroid/content/Intent;", "data_noAnalyticsDebug"})
public final class HeadlessSmsSendService extends android.app.IntentService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.repository.ConversationRepository conversationRepo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.interactor.SendMessage sendMessage;
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.repository.ConversationRepository getConversationRepo() {
        return null;
    }
    
    public final void setConversationRepo(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.interactor.SendMessage getSendMessage() {
        return null;
    }
    
    public final void setSendMessage(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.SendMessage p0) {
    }
    
    @java.lang.Override()
    protected void onHandleIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final java.lang.String getRecipients(android.net.Uri uri) {
        return null;
    }
    
    public HeadlessSmsSendService() {
        super(null);
    }
}