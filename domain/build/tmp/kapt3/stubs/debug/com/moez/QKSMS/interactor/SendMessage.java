package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/moez/QKSMS/interactor/SendMessage;", "Lcom/moez/QKSMS/interactor/Interactor;", "Lcom/moez/QKSMS/interactor/SendMessage$Params;", "context", "Landroid/content/Context;", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "messageRepo", "Lcom/moez/QKSMS/repository/MessageRepository;", "updateBadge", "Lcom/moez/QKSMS/interactor/UpdateBadge;", "(Landroid/content/Context;Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/repository/MessageRepository;Lcom/moez/QKSMS/interactor/UpdateBadge;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "Params", "domain_debug"})
public final class SendMessage extends com.moez.QKSMS.interactor.Interactor<com.moez.QKSMS.interactor.SendMessage.Params> {
    private final android.content.Context context = null;
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.repository.MessageRepository messageRepo = null;
    private final com.moez.QKSMS.interactor.UpdateBadge updateBadge = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.SendMessage.Params params) {
        return null;
    }
    
    @javax.inject.Inject()
    public SendMessage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.UpdateBadge updateBadge) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/moez/QKSMS/interactor/SendMessage$Params;", "", "subId", "", "threadId", "", "addresses", "", "", "body", "attachments", "Lcom/moez/QKSMS/model/Attachment;", "delay", "(IJLjava/util/List;Ljava/lang/String;Ljava/util/List;I)V", "getAddresses", "()Ljava/util/List;", "getAttachments", "getBody", "()Ljava/lang/String;", "getDelay", "()I", "getSubId", "getThreadId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "domain_debug"})
    public static final class Params {
        private final int subId = 0;
        private final long threadId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> addresses = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String body = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.moez.QKSMS.model.Attachment> attachments = null;
        private final int delay = 0;
        
        public final int getSubId() {
            return 0;
        }
        
        public final long getThreadId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAddresses() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBody() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.moez.QKSMS.model.Attachment> getAttachments() {
            return null;
        }
        
        public final int getDelay() {
            return 0;
        }
        
        public Params(int subId, long threadId, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> addresses, @org.jetbrains.annotations.NotNull()
        java.lang.String body, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.moez.QKSMS.model.Attachment> attachments, int delay) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.moez.QKSMS.model.Attachment> component5() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.interactor.SendMessage.Params copy(int subId, long threadId, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> addresses, @org.jetbrains.annotations.NotNull()
        java.lang.String body, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.moez.QKSMS.model.Attachment> attachments, int delay) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}