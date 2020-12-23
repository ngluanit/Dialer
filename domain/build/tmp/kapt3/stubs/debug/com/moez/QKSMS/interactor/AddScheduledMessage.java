package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/moez/QKSMS/interactor/AddScheduledMessage;", "Lcom/moez/QKSMS/interactor/Interactor;", "Lcom/moez/QKSMS/interactor/AddScheduledMessage$Params;", "scheduledMessageRepo", "Lcom/moez/QKSMS/repository/ScheduledMessageRepository;", "updateScheduledMessageAlarms", "Lcom/moez/QKSMS/interactor/UpdateScheduledMessageAlarms;", "(Lcom/moez/QKSMS/repository/ScheduledMessageRepository;Lcom/moez/QKSMS/interactor/UpdateScheduledMessageAlarms;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "Params", "domain_debug"})
public final class AddScheduledMessage extends com.moez.QKSMS.interactor.Interactor<com.moez.QKSMS.interactor.AddScheduledMessage.Params> {
    private final com.moez.QKSMS.repository.ScheduledMessageRepository scheduledMessageRepo = null;
    private final com.moez.QKSMS.interactor.UpdateScheduledMessageAlarms updateScheduledMessageAlarms = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.AddScheduledMessage.Params params) {
        return null;
    }
    
    @javax.inject.Inject()
    public AddScheduledMessage(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ScheduledMessageRepository scheduledMessageRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.UpdateScheduledMessageAlarms updateScheduledMessageAlarms) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/moez/QKSMS/interactor/AddScheduledMessage$Params;", "", "date", "", "subId", "", "recipients", "", "", "sendAsGroup", "", "body", "attachments", "(JILjava/util/List;ZLjava/lang/String;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "getBody", "()Ljava/lang/String;", "getDate", "()J", "getRecipients", "getSendAsGroup", "()Z", "getSubId", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "domain_debug"})
    public static final class Params {
        private final long date = 0L;
        private final int subId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> recipients = null;
        private final boolean sendAsGroup = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String body = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> attachments = null;
        
        public final long getDate() {
            return 0L;
        }
        
        public final int getSubId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRecipients() {
            return null;
        }
        
        public final boolean getSendAsGroup() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBody() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAttachments() {
            return null;
        }
        
        public Params(long date, int subId, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> recipients, boolean sendAsGroup, @org.jetbrains.annotations.NotNull()
        java.lang.String body, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> attachments) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component3() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.interactor.AddScheduledMessage.Params copy(long date, int subId, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> recipients, boolean sendAsGroup, @org.jetbrains.annotations.NotNull()
        java.lang.String body, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> attachments) {
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