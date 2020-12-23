package com.moez.QKSMS.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lcom/moez/QKSMS/manager/ActiveConversationManagerImpl;", "Lcom/moez/QKSMS/manager/ActiveConversationManager;", "()V", "threadId", "", "Ljava/lang/Long;", "getActiveConversation", "()Ljava/lang/Long;", "setActiveConversation", "", "(Ljava/lang/Long;)V", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class ActiveConversationManagerImpl implements com.moez.QKSMS.manager.ActiveConversationManager {
    private java.lang.Long threadId;
    
    @java.lang.Override()
    public void setActiveConversation(@org.jetbrains.annotations.Nullable()
    java.lang.Long threadId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getActiveConversation() {
        return null;
    }
    
    @javax.inject.Inject()
    public ActiveConversationManagerImpl() {
        super();
    }
}