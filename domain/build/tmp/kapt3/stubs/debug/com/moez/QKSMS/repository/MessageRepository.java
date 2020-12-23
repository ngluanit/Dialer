package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u00020\b\"\u00020\u0005H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0005H&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\f\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0005H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0005H&J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0005H&J0\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0005H&J\b\u0010 \u001a\u00020\u0003H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001aH&J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001aH&J\u0014\u0010%\u001a\u00020\u00032\n\u0010&\u001a\u00020\b\"\u00020\u0005H&J\u0010\u0010\'\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010*\u001a\u00020\u00032\n\u0010&\u001a\u00020\b\"\u00020\u0005H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u000bH&J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u0004\u001a\u00020\u0005H&JF\u0010/\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00052\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0011012\u0006\u0010\u001c\u001a\u00020\u00112\f\u00102\u001a\b\u0012\u0004\u0012\u000203012\b\b\u0002\u00104\u001a\u00020\u001aH&J\u0010\u00105\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u000bH&\u00a8\u00066"}, d2 = {"Lcom/moez/QKSMS/repository/MessageRepository;", "", "cancelDelayedSms", "", "id", "", "deleteMessages", "messageIds", "", "getLastIncomingMessage", "Lio/realm/RealmResults;", "Lcom/moez/QKSMS/model/Message;", "threadId", "getMessage", "getMessageForPart", "getMessages", "query", "", "getPart", "Lcom/moez/QKSMS/model/MmsPart;", "getPartsForConversation", "getUnreadCount", "getUnreadMessages", "getUnreadUnseenMessages", "insertReceivedSms", "subId", "", "address", "body", "sentTime", "insertSentSms", "date", "markAllSeen", "markDelivered", "markDeliveryFailed", "resultCode", "markFailed", "markRead", "threadIds", "markSeen", "markSending", "markSent", "markUnread", "resendMms", "message", "savePart", "Ljava/io/File;", "sendMessage", "addresses", "", "attachments", "Lcom/moez/QKSMS/model/Attachment;", "delay", "sendSms", "domain_debug"})
public abstract interface MessageRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Message> getMessages(long threadId, @org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Message getMessage(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Message getMessageForPart(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Message> getLastIncomingMessage(long threadId);
    
    public abstract long getUnreadCount();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.MmsPart getPart(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.MmsPart> getPartsForConversation(long threadId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.io.File savePart(long id);
    
    /**
     * Retrieves the list of messages which should be shown in the notification
     * for a given conversation
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Message> getUnreadUnseenMessages(long threadId);
    
    /**
     * Retrieves the list of messages which should be shown in the quickreply popup
     * for a given conversation
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Message> getUnreadMessages(long threadId);
    
    public abstract void markAllSeen();
    
    public abstract void markSeen(long threadId);
    
    public abstract void markRead(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    public abstract void markUnread(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    public abstract void sendMessage(int subId, long threadId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.moez.QKSMS.model.Attachment> attachments, int delay);
    
    /**
     * Attempts to send the SMS message. This can be called if the message has already been persisted
     */
    public abstract void sendSms(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.model.Message message);
    
    public abstract void resendMms(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.model.Message message);
    
    /**
     * Attempts to cancel sending the message with the given id
     */
    public abstract void cancelDelayedSms(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.moez.QKSMS.model.Message insertSentSms(int subId, long threadId, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String body, long date);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.moez.QKSMS.model.Message insertReceivedSms(int subId, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String body, long sentTime);
    
    /**
     * Marks the message as sending, in case we need to retry sending it
     */
    public abstract void markSending(long id);
    
    public abstract void markSent(long id);
    
    public abstract void markFailed(long id, int resultCode);
    
    public abstract void markDelivered(long id);
    
    public abstract void markDeliveryFailed(long id, int resultCode);
    
    public abstract void deleteMessages(@org.jetbrains.annotations.NotNull()
    long... messageIds);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}