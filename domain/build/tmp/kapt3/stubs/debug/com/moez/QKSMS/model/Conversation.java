package com.moez.QKSMS.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b.\b\u0016\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010=\u001a\u00020\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010\u000e8F\u00a2\u0006\u0006\u001a\u0004\b:\u0010\u0019R\u0011\u0010;\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b<\u0010\u0015\u00a8\u0006>"}, d2 = {"Lcom/moez/QKSMS/model/Conversation;", "Lio/realm/RealmObject;", "id", "", "archived", "", "blocked", "pinned", "recipients", "Lio/realm/RealmList;", "Lcom/moez/QKSMS/model/Recipient;", "lastMessage", "Lcom/moez/QKSMS/model/Message;", "draft", "", "blockingClient", "", "blockReason", "name", "(JZZZLio/realm/RealmList;Lcom/moez/QKSMS/model/Message;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getArchived", "()Z", "setArchived", "(Z)V", "getBlockReason", "()Ljava/lang/String;", "setBlockReason", "(Ljava/lang/String;)V", "getBlocked", "setBlocked", "getBlockingClient", "()Ljava/lang/Integer;", "setBlockingClient", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "date", "getDate", "()J", "getDraft", "setDraft", "getId", "setId", "(J)V", "getLastMessage", "()Lcom/moez/QKSMS/model/Message;", "setLastMessage", "(Lcom/moez/QKSMS/model/Message;)V", "me", "getMe", "getName", "setName", "getPinned", "setPinned", "getRecipients", "()Lio/realm/RealmList;", "setRecipients", "(Lio/realm/RealmList;)V", "snippet", "getSnippet", "unread", "getUnread", "getTitle", "domain_debug"})
public class Conversation extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private long id;
    @io.realm.annotations.Index()
    private boolean archived;
    @io.realm.annotations.Index()
    private boolean blocked;
    @io.realm.annotations.Index()
    private boolean pinned;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<com.moez.QKSMS.model.Recipient> recipients;
    @org.jetbrains.annotations.Nullable()
    private com.moez.QKSMS.model.Message lastMessage;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String draft;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer blockingClient;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String blockReason;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    
    public final long getDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSnippet() {
        return null;
    }
    
    public final boolean getUnread() {
        return false;
    }
    
    public final boolean getMe() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final boolean getArchived() {
        return false;
    }
    
    public final void setArchived(boolean p0) {
    }
    
    public final boolean getBlocked() {
        return false;
    }
    
    public final void setBlocked(boolean p0) {
    }
    
    public final boolean getPinned() {
        return false;
    }
    
    public final void setPinned(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<com.moez.QKSMS.model.Recipient> getRecipients() {
        return null;
    }
    
    public final void setRecipients(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.moez.QKSMS.model.Recipient> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.moez.QKSMS.model.Message getLastMessage() {
        return null;
    }
    
    public final void setLastMessage(@org.jetbrains.annotations.Nullable()
    com.moez.QKSMS.model.Message p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDraft() {
        return null;
    }
    
    public final void setDraft(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBlockingClient() {
        return null;
    }
    
    public final void setBlockingClient(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlockReason() {
        return null;
    }
    
    public final void setBlockReason(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Conversation(long id, boolean archived, boolean blocked, boolean pinned, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.moez.QKSMS.model.Recipient> recipients, @org.jetbrains.annotations.Nullable()
    com.moez.QKSMS.model.Message lastMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String draft, @org.jetbrains.annotations.Nullable()
    java.lang.Integer blockingClient, @org.jetbrains.annotations.Nullable()
    java.lang.String blockReason, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    public Conversation() {
        super();
    }
}