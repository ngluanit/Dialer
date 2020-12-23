package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&JD\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&\u00a8\u0006\u0015"}, d2 = {"Lcom/moez/QKSMS/repository/ScheduledMessageRepository;", "", "deleteScheduledMessage", "", "id", "", "getScheduledMessage", "Lcom/moez/QKSMS/model/ScheduledMessage;", "getScheduledMessages", "Lio/realm/RealmResults;", "saveScheduledMessage", "date", "subId", "", "recipients", "", "", "sendAsGroup", "", "body", "attachments", "domain_debug"})
public abstract interface ScheduledMessageRepository {
    
    /**
     * Saves a scheduled message
     */
    public abstract void saveScheduledMessage(long date, int subId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> recipients, boolean sendAsGroup, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> attachments);
    
    /**
     * Returns all of the scheduled messages, sorted chronologically
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.ScheduledMessage> getScheduledMessages();
    
    /**
     * Returns the scheduled message with the given [id]
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.ScheduledMessage getScheduledMessage(long id);
    
    /**
     * Deletes the scheduled message with the given [id]
     */
    public abstract void deleteScheduledMessage(long id);
}