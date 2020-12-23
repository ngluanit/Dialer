package com.moez.QKSMS.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/moez/QKSMS/receiver/SmsDeliveredReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "markDelivered", "Lcom/moez/QKSMS/interactor/MarkDelivered;", "getMarkDelivered", "()Lcom/moez/QKSMS/interactor/MarkDelivered;", "setMarkDelivered", "(Lcom/moez/QKSMS/interactor/MarkDelivered;)V", "markDeliveryFailed", "Lcom/moez/QKSMS/interactor/MarkDeliveryFailed;", "getMarkDeliveryFailed", "()Lcom/moez/QKSMS/interactor/MarkDeliveryFailed;", "setMarkDeliveryFailed", "(Lcom/moez/QKSMS/interactor/MarkDeliveryFailed;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsDebug"})
public final class SmsDeliveredReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.interactor.MarkDelivered markDelivered;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.interactor.MarkDeliveryFailed markDeliveryFailed;
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.interactor.MarkDelivered getMarkDelivered() {
        return null;
    }
    
    public final void setMarkDelivered(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.MarkDelivered p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.interactor.MarkDeliveryFailed getMarkDeliveryFailed() {
        return null;
    }
    
    public final void setMarkDeliveryFailed(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.MarkDeliveryFailed p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public SmsDeliveredReceiver() {
        super();
    }
}