package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0006H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H&J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0006H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\bH&J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u0015H&\u00a2\u0006\u0002\u0010\u001dJ\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001fH&\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H&J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120#H&J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00120#H&J\u0014\u0010%\u001a\u00020\u00032\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006H&J(\u0010&\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0015H&J\u0014\u0010*\u001a\u00020\u00032\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006H&J\u0014\u0010+\u001a\u00020\u00032\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006H&J\u0014\u0010,\u001a\u00020\u00032\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006H&J\u0014\u0010-\u001a\u00020\u00032\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0015H&J\u0016\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00122\u0006\u00102\u001a\u000203H&J\u0018\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0015H&J\u0014\u00107\u001a\u00020\u00032\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006H&\u00a8\u00068"}, d2 = {"Lcom/moez/QKSMS/repository/ConversationRepository;", "", "deleteConversations", "", "threadIds", "", "", "getBlockedConversations", "Lio/realm/RealmResults;", "Lcom/moez/QKSMS/model/Conversation;", "getBlockedConversationsAsync", "getConversation", "threadId", "getConversationAsync", "getConversations", "archived", "", "getConversationsSnapshot", "", "getOrCreateConversation", "address", "", "addresses", "getRecipient", "Lcom/moez/QKSMS/model/Recipient;", "recipientId", "getRecipients", "getThreadId", "recipient", "(Ljava/lang/String;)Ljava/lang/Long;", "recipients", "", "(Ljava/util/Collection;)Ljava/lang/Long;", "getTopConversations", "getUnmanagedConversations", "Lio/reactivex/Observable;", "getUnmanagedRecipients", "markArchived", "markBlocked", "blockingClient", "", "blockReason", "markPinned", "markUnarchived", "markUnblocked", "markUnpinned", "saveDraft", "draft", "searchConversations", "Lcom/moez/QKSMS/model/SearchResult;", "query", "", "setConversationName", "id", "name", "updateConversations", "domain_debug"})
public abstract interface ConversationRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Conversation> getConversations(boolean archived);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.moez.QKSMS.model.Conversation> getConversationsSnapshot();
    
    /**
     * Returns the top conversations that were active in the last week
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.moez.QKSMS.model.Conversation> getTopConversations();
    
    public abstract void setConversationName(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.moez.QKSMS.model.SearchResult> searchConversations(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Conversation> getBlockedConversations();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Conversation> getBlockedConversationsAsync();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.moez.QKSMS.model.Conversation getConversationAsync(long threadId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Conversation getConversation(long threadId);
    
    /**
     * Returns all conversations with an id in [threadIds]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Conversation> getConversations(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.moez.QKSMS.model.Conversation>> getUnmanagedConversations();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.Recipient> getRecipients();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.moez.QKSMS.model.Recipient>> getUnmanagedRecipients();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Recipient getRecipient(long recipientId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getThreadId(@org.jetbrains.annotations.NotNull()
    java.lang.String recipient);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getThreadId(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> recipients);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Conversation getOrCreateConversation(long threadId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Conversation getOrCreateConversation(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Conversation getOrCreateConversation(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addresses);
    
    public abstract void saveDraft(long threadId, @org.jetbrains.annotations.NotNull()
    java.lang.String draft);
    
    /**
     * Updates message-related fields in the conversation, like the date and snippet
     */
    public abstract void updateConversations(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    public abstract void markArchived(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    public abstract void markUnarchived(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    public abstract void markPinned(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    public abstract void markUnpinned(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    public abstract void markBlocked(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> threadIds, int blockingClient, @org.jetbrains.annotations.Nullable()
    java.lang.String blockReason);
    
    public abstract void markUnblocked(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    public abstract void deleteConversations(@org.jetbrains.annotations.NotNull()
    long... threadIds);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}