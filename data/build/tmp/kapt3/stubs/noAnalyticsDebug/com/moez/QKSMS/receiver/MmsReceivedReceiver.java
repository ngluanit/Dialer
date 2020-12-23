package com.moez.QKSMS.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u001c\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/moez/QKSMS/receiver/MmsReceivedReceiver;", "Lcom/klinker/android/send_message/MmsReceivedReceiver;", "()V", "receiveMms", "Lcom/moez/QKSMS/interactor/ReceiveMms;", "getReceiveMms", "()Lcom/moez/QKSMS/interactor/ReceiveMms;", "setReceiveMms", "(Lcom/moez/QKSMS/interactor/ReceiveMms;)V", "onMessageReceived", "", "messageUri", "Landroid/net/Uri;", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsDebug"})
public final class MmsReceivedReceiver extends com.klinker.android.send_message.MmsReceivedReceiver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.interactor.ReceiveMms receiveMms;
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.interactor.ReceiveMms getReceiveMms() {
        return null;
    }
    
    public final void setReceiveMms(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.ReceiveMms p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onMessageReceived(@org.jetbrains.annotations.Nullable()
    android.net.Uri messageUri) {
    }
    
    public MmsReceivedReceiver() {
        super();
    }
}