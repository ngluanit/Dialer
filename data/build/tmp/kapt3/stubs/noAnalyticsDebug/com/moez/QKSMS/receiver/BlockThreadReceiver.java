package com.moez.QKSMS.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Lcom/moez/QKSMS/receiver/BlockThreadReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "blockingClient", "Lcom/moez/QKSMS/blocking/BlockingClient;", "getBlockingClient", "()Lcom/moez/QKSMS/blocking/BlockingClient;", "setBlockingClient", "(Lcom/moez/QKSMS/blocking/BlockingClient;)V", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "getConversationRepo", "()Lcom/moez/QKSMS/repository/ConversationRepository;", "setConversationRepo", "(Lcom/moez/QKSMS/repository/ConversationRepository;)V", "markBlocked", "Lcom/moez/QKSMS/interactor/MarkBlocked;", "getMarkBlocked", "()Lcom/moez/QKSMS/interactor/MarkBlocked;", "setMarkBlocked", "(Lcom/moez/QKSMS/interactor/MarkBlocked;)V", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "getPrefs", "()Lcom/moez/QKSMS/util/Preferences;", "setPrefs", "(Lcom/moez/QKSMS/util/Preferences;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsDebug"})
public final class BlockThreadReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.blocking.BlockingClient blockingClient;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.repository.ConversationRepository conversationRepo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.interactor.MarkBlocked markBlocked;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.util.Preferences prefs;
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.blocking.BlockingClient getBlockingClient() {
        return null;
    }
    
    public final void setBlockingClient(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.blocking.BlockingClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.repository.ConversationRepository getConversationRepo() {
        return null;
    }
    
    public final void setConversationRepo(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.interactor.MarkBlocked getMarkBlocked() {
        return null;
    }
    
    public final void setMarkBlocked(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.MarkBlocked p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.util.Preferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public BlockThreadReceiver() {
        super();
    }
}