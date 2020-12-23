package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006+"}, d2 = {"Lcom/moez/QKSMS/repository/SyncRepositoryImpl;", "Lcom/moez/QKSMS/repository/SyncRepository;", "contentResolver", "Landroid/content/ContentResolver;", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "cursorToConversation", "Lcom/moez/QKSMS/mapper/CursorToConversation;", "cursorToMessage", "Lcom/moez/QKSMS/mapper/CursorToMessage;", "cursorToRecipient", "Lcom/moez/QKSMS/mapper/CursorToRecipient;", "cursorToContact", "Lcom/moez/QKSMS/mapper/CursorToContact;", "cursorToContactGroup", "Lcom/moez/QKSMS/mapper/CursorToContactGroup;", "cursorToContactGroupMember", "Lcom/moez/QKSMS/mapper/CursorToContactGroupMember;", "keys", "Lcom/moez/QKSMS/manager/KeyManager;", "phoneNumberUtils", "Lcom/moez/QKSMS/util/PhoneNumberUtils;", "rxPrefs", "Lcom/f2prateek/rx/preferences2/RxSharedPreferences;", "(Landroid/content/ContentResolver;Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/mapper/CursorToConversation;Lcom/moez/QKSMS/mapper/CursorToMessage;Lcom/moez/QKSMS/mapper/CursorToRecipient;Lcom/moez/QKSMS/mapper/CursorToContact;Lcom/moez/QKSMS/mapper/CursorToContactGroup;Lcom/moez/QKSMS/mapper/CursorToContactGroupMember;Lcom/moez/QKSMS/manager/KeyManager;Lcom/moez/QKSMS/util/PhoneNumberUtils;Lcom/f2prateek/rx/preferences2/RxSharedPreferences;)V", "syncProgress", "Lio/reactivex/subjects/Subject;", "Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress;", "getSyncProgress", "()Lio/reactivex/subjects/Subject;", "getContactGroups", "", "Lcom/moez/QKSMS/model/ContactGroup;", "contacts", "Lcom/moez/QKSMS/model/Contact;", "getContacts", "syncContacts", "", "syncMessage", "Lcom/moez/QKSMS/model/Message;", "uri", "Landroid/net/Uri;", "syncMessages", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class SyncRepositoryImpl implements com.moez.QKSMS.repository.SyncRepository {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.Subject<com.moez.QKSMS.repository.SyncRepository.SyncProgress> syncProgress = null;
    private final android.content.ContentResolver contentResolver = null;
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.mapper.CursorToConversation cursorToConversation = null;
    private final com.moez.QKSMS.mapper.CursorToMessage cursorToMessage = null;
    private final com.moez.QKSMS.mapper.CursorToRecipient cursorToRecipient = null;
    private final com.moez.QKSMS.mapper.CursorToContact cursorToContact = null;
    private final com.moez.QKSMS.mapper.CursorToContactGroup cursorToContactGroup = null;
    private final com.moez.QKSMS.mapper.CursorToContactGroupMember cursorToContactGroupMember = null;
    private final com.moez.QKSMS.manager.KeyManager keys = null;
    private final com.moez.QKSMS.util.PhoneNumberUtils phoneNumberUtils = null;
    private final com.f2prateek.rx.preferences2.RxSharedPreferences rxPrefs = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.Subject<com.moez.QKSMS.repository.SyncRepository.SyncProgress> getSyncProgress() {
        return null;
    }
    
    @java.lang.Override()
    public void syncMessages() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.moez.QKSMS.model.Message syncMessage(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @java.lang.Override()
    public void syncContacts() {
    }
    
    private final java.util.List<com.moez.QKSMS.model.Contact> getContacts() {
        return null;
    }
    
    private final java.util.List<com.moez.QKSMS.model.ContactGroup> getContactGroups(java.util.List<? extends com.moez.QKSMS.model.Contact> contacts) {
        return null;
    }
    
    @javax.inject.Inject()
    public SyncRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.mapper.CursorToConversation cursorToConversation, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.mapper.CursorToMessage cursorToMessage, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.mapper.CursorToRecipient cursorToRecipient, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.mapper.CursorToContact cursorToContact, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.mapper.CursorToContactGroup cursorToContactGroup, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.mapper.CursorToContactGroupMember cursorToContactGroupMember, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.KeyManager keys, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.PhoneNumberUtils phoneNumberUtils, @org.jetbrains.annotations.NotNull()
    com.f2prateek.rx.preferences2.RxSharedPreferences rxPrefs) {
        super();
    }
}