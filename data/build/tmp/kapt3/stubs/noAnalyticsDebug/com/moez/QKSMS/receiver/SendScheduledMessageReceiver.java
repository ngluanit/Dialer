package com.moez.QKSMS.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/moez/QKSMS/receiver/SendScheduledMessageReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "messageRepo", "Lcom/moez/QKSMS/repository/MessageRepository;", "getMessageRepo", "()Lcom/moez/QKSMS/repository/MessageRepository;", "setMessageRepo", "(Lcom/moez/QKSMS/repository/MessageRepository;)V", "sendScheduledMessage", "Lcom/moez/QKSMS/interactor/SendScheduledMessage;", "getSendScheduledMessage", "()Lcom/moez/QKSMS/interactor/SendScheduledMessage;", "setSendScheduledMessage", "(Lcom/moez/QKSMS/interactor/SendScheduledMessage;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsDebug"})
public final class SendScheduledMessageReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.repository.MessageRepository messageRepo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.interactor.SendScheduledMessage sendScheduledMessage;
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.repository.MessageRepository getMessageRepo() {
        return null;
    }
    
    public final void setMessageRepo(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.MessageRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.interactor.SendScheduledMessage getSendScheduledMessage() {
        return null;
    }
    
    public final void setSendScheduledMessage(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.SendScheduledMessage p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public SendScheduledMessageReceiver() {
        super();
    }
}