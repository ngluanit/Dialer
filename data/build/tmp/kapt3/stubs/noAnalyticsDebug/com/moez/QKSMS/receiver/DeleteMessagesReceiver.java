package com.moez.QKSMS.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/moez/QKSMS/receiver/DeleteMessagesReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "deleteMessages", "Lcom/moez/QKSMS/interactor/DeleteMessages;", "getDeleteMessages", "()Lcom/moez/QKSMS/interactor/DeleteMessages;", "setDeleteMessages", "(Lcom/moez/QKSMS/interactor/DeleteMessages;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsDebug"})
public final class DeleteMessagesReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.moez.QKSMS.interactor.DeleteMessages deleteMessages;
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.interactor.DeleteMessages getDeleteMessages() {
        return null;
    }
    
    public final void setDeleteMessages(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.DeleteMessages p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public DeleteMessagesReceiver() {
        super();
    }
}