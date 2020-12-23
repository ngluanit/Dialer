package com.moez.QKSMS.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0016\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\u000eJX\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006("}, d2 = {"Lcom/moez/QKSMS/model/ScheduledMessage;", "Lio/realm/RealmObject;", "id", "", "date", "subId", "", "recipients", "Lio/realm/RealmList;", "", "sendAsGroup", "", "body", "attachments", "(JJILio/realm/RealmList;ZLjava/lang/String;Lio/realm/RealmList;)V", "getAttachments", "()Lio/realm/RealmList;", "setAttachments", "(Lio/realm/RealmList;)V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "getId", "setId", "getRecipients", "setRecipients", "getSendAsGroup", "()Z", "setSendAsGroup", "(Z)V", "getSubId", "()I", "setSubId", "(I)V", "copy", "domain_debug"})
public class ScheduledMessage extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private long id;
    private long date;
    private int subId;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<java.lang.String> recipients;
    private boolean sendAsGroup;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String body;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<java.lang.String> attachments;
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.model.ScheduledMessage copy(long id, long date, int subId, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> recipients, boolean sendAsGroup, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> attachments) {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    public final int getSubId() {
        return 0;
    }
    
    public final void setSubId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<java.lang.String> getRecipients() {
        return null;
    }
    
    public final void setRecipients(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> p0) {
    }
    
    public final boolean getSendAsGroup() {
        return false;
    }
    
    public final void setSendAsGroup(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<java.lang.String> getAttachments() {
        return null;
    }
    
    public final void setAttachments(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> p0) {
    }
    
    public ScheduledMessage(long id, long date, int subId, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> recipients, boolean sendAsGroup, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> attachments) {
        super();
    }
    
    public ScheduledMessage() {
        super();
    }
}