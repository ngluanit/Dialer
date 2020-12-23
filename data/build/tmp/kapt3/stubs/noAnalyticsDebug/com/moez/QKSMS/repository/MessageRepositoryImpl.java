package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u00102\n\u0010\u0006\u001a\u00020\u0014\"\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J(\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0012H\u0016J0\u0010,\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\u0010H\u0016J\u0010\u0010/\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u00100\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00101\u001a\u00020(H\u0016J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00101\u001a\u00020(H\u0016J\u0014\u00103\u001a\u00020\u00102\n\u00104\u001a\u00020\u0014\"\u00020\u0012H\u0016J\u0010\u00105\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u00106\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u00107\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u00108\u001a\u00020\u00102\n\u00104\u001a\u00020\u0014\"\u00020\u0012H\u0016J\u0010\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0019H\u0016J\u0012\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JD\u0010=\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f0?2\u0006\u0010*\u001a\u00020\u001f2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0?2\u0006\u0010B\u001a\u00020(H\u0016J\u0010\u0010C\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/moez/QKSMS/repository/MessageRepositoryImpl;", "Lcom/moez/QKSMS/repository/MessageRepository;", "activeConversationManager", "Lcom/moez/QKSMS/manager/ActiveConversationManager;", "context", "Landroid/content/Context;", "messageIds", "Lcom/moez/QKSMS/manager/KeyManager;", "phoneNumberUtils", "Lcom/moez/QKSMS/util/PhoneNumberUtils;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "syncRepository", "Lcom/moez/QKSMS/repository/SyncRepository;", "(Lcom/moez/QKSMS/manager/ActiveConversationManager;Landroid/content/Context;Lcom/moez/QKSMS/manager/KeyManager;Lcom/moez/QKSMS/util/PhoneNumberUtils;Lcom/moez/QKSMS/util/Preferences;Lcom/moez/QKSMS/repository/SyncRepository;)V", "cancelDelayedSms", "", "id", "", "deleteMessages", "", "getIntentForDelayedSms", "Landroid/app/PendingIntent;", "getLastIncomingMessage", "Lio/realm/RealmResults;", "Lcom/moez/QKSMS/model/Message;", "threadId", "getMessage", "getMessageForPart", "getMessages", "query", "", "getPart", "Lcom/moez/QKSMS/model/MmsPart;", "getPartsForConversation", "getUnreadCount", "getUnreadMessages", "getUnreadUnseenMessages", "insertReceivedSms", "subId", "", "address", "body", "sentTime", "insertSentSms", "date", "markAllSeen", "markDelivered", "markDeliveryFailed", "resultCode", "markFailed", "markRead", "threadIds", "markSeen", "markSending", "markSent", "markUnread", "resendMms", "message", "savePart", "Ljava/io/File;", "sendMessage", "addresses", "", "attachments", "Lcom/moez/QKSMS/model/Attachment;", "delay", "sendSms", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class MessageRepositoryImpl implements com.moez.QKSMS.repository.MessageRepository {
    private final com.moez.QKSMS.manager.ActiveConversationManager activeConversationManager = null;
    private final android.content.Context context = null;
    private final com.moez.QKSMS.manager.KeyManager messageIds = null;
    private final com.moez.QKSMS.util.PhoneNumberUtils phoneNumberUtils = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    private final com.moez.QKSMS.repository.SyncRepository syncRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.realm.RealmResults<com.moez.QKSMS.model.Message> getMessages(long threadId, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.moez.QKSMS.model.Message getMessage(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.moez.QKSMS.model.Message getMessageForPart(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.realm.RealmResults<com.moez.QKSMS.model.Message> getLastIncomingMessage(long threadId) {
        return null;
    }
    
    @java.lang.Override()
    public long getUnreadCount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.moez.QKSMS.model.MmsPart getPart(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.realm.RealmResults<com.moez.QKSMS.model.MmsPart> getPartsForConversation(long threadId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.io.File savePart(long id) {
        return null;
    }
    
    /**
     * Retrieves the list of messages which should be shown in the notification
     * for a given conversation
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.realm.RealmResults<com.moez.QKSMS.model.Message> getUnreadUnseenMessages(long threadId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.realm.RealmResults<com.moez.QKSMS.model.Message> getUnreadMessages(long threadId) {
        return null;
    }
    
    @java.lang.Override()
    public void markAllSeen() {
    }
    
    @java.lang.Override()
    public void markSeen(long threadId) {
    }
    
    @java.lang.Override()
    public void markRead(@org.jetbrains.annotations.NotNull()
    long... threadIds) {
    }
    
    @java.lang.Override()
    public void markUnread(@org.jetbrains.annotations.NotNull()
    long... threadIds) {
    }
    
    @java.lang.Override()
    public void sendMessage(int subId, long threadId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.moez.QKSMS.model.Attachment> attachments, int delay) {
    }
    
    @java.lang.Override()
    public void sendSms(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.model.Message message) {
    }
    
    @java.lang.Override()
    public void resendMms(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.model.Message message) {
    }
    
    @java.lang.Override()
    public void cancelDelayedSms(long id) {
    }
    
    private final android.app.PendingIntent getIntentForDelayedSms(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.moez.QKSMS.model.Message insertSentSms(int subId, long threadId, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String body, long date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.moez.QKSMS.model.Message insertReceivedSms(int subId, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String body, long sentTime) {
        return null;
    }
    
    /**
     * Marks the message as sending, in case we need to retry sending it
     */
    @java.lang.Override()
    public void markSending(long id) {
    }
    
    @java.lang.Override()
    public void markSent(long id) {
    }
    
    @java.lang.Override()
    public void markFailed(long id, int resultCode) {
    }
    
    @java.lang.Override()
    public void markDelivered(long id) {
    }
    
    @java.lang.Override()
    public void markDeliveryFailed(long id, int resultCode) {
    }
    
    @java.lang.Override()
    public void deleteMessages(@org.jetbrains.annotations.NotNull()
    long... messageIds) {
    }
    
    @javax.inject.Inject()
    public MessageRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.ActiveConversationManager activeConversationManager, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.KeyManager messageIds, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.PhoneNumberUtils phoneNumberUtils, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.SyncRepository syncRepository) {
        super();
    }
}