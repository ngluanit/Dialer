package com.moez.QKSMS.manager;

import java.lang.System;

/**
 * Keeps track of the conversation that the user is currently viewing. This is useful when we
 * receive a message, because it allows us to immediately mark the message read and not display
 * a notification
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/moez/QKSMS/manager/ActiveConversationManager;", "", "getActiveConversation", "", "()Ljava/lang/Long;", "setActiveConversation", "", "threadId", "(Ljava/lang/Long;)V", "domain_debug"})
public abstract interface ActiveConversationManager {
    
    public abstract void setActiveConversation(@org.jetbrains.annotations.Nullable()
    java.lang.Long threadId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getActiveConversation();
}