package com.moez.QKSMS.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u0004\u0018\u00010\u000fJ\u0006\u0010!\u001a\u00020\"R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/moez/QKSMS/model/MmsPart;", "Lio/realm/RealmObject;", "()V", "id", "", "getId", "()J", "setId", "(J)V", "messages", "Lio/realm/RealmResults;", "Lcom/moez/QKSMS/model/Message;", "getMessages", "()Lio/realm/RealmResults;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "seq", "", "getSeq", "()I", "setSeq", "(I)V", "text", "getText", "setText", "type", "getType", "setType", "getSummary", "getUri", "Landroid/net/Uri;", "domain_debug"})
public class MmsPart extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    private int seq;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String text;
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.LinkingObjects(value = "parts")
    private final io.realm.RealmResults<com.moez.QKSMS.model.Message> messages = null;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSeq() {
        return 0;
    }
    
    public final void setSeq(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmResults<com.moez.QKSMS.model.Message> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public MmsPart() {
        super();
    }
}