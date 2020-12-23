package com.moez.QKSMS.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/moez/QKSMS/receiver/MmsUpdatedReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "syncMessage", "Lcom/moez/QKSMS/interactor/SyncMessage;", "getSyncMessage", "()Lcom/moez/QKSMS/interactor/SyncMessage;", "setSyncMessage", "(Lcom/moez/QKSMS/interactor/SyncMessage;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "data_noAnalyticsDebug"})
public final class MmsUpdatedReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.interactor.SyncMessage syncMessage;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String URI = "uri";
    public static final com.moez.QKSMS.receiver.MmsUpdatedReceiver.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.interactor.SyncMessage getSyncMessage() {
        return null;
    }
    
    public final void setSyncMessage(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.SyncMessage p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public MmsUpdatedReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/moez/QKSMS/receiver/MmsUpdatedReceiver$Companion;", "", "()V", "URI", "", "data_noAnalyticsDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}