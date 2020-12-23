package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016JD\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a8\u0006\u0016"}, d2 = {"Lcom/moez/QKSMS/repository/ScheduledMessageRepositoryImpl;", "Lcom/moez/QKSMS/repository/ScheduledMessageRepository;", "()V", "deleteScheduledMessage", "", "id", "", "getScheduledMessage", "Lcom/moez/QKSMS/model/ScheduledMessage;", "getScheduledMessages", "Lio/realm/RealmResults;", "saveScheduledMessage", "date", "subId", "", "recipients", "", "", "sendAsGroup", "", "body", "attachments", "data_noAnalyticsDebug"})
public final class ScheduledMessageRepositoryImpl implements com.moez.QKSMS.repository.ScheduledMessageRepository {
    
    @java.lang.Override()
    public void saveScheduledMessage(long date, int subId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> recipients, boolean sendAsGroup, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> attachments) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.realm.RealmResults<com.moez.QKSMS.model.ScheduledMessage> getScheduledMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.moez.QKSMS.model.ScheduledMessage getScheduledMessage(long id) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteScheduledMessage(long id) {
    }
    
    @javax.inject.Inject()
    public ScheduledMessageRepositoryImpl() {
        super();
    }
}