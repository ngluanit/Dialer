package com.moez.QKSMS.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001sB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010e\u001a\u0002052\u0006\u0010f\u001a\u00020\u0000J\u0006\u0010g\u001a\u00020\u0004J\u0006\u0010h\u001a\u00020\u0004J\u0006\u0010i\u001a\u00020\u0004J\u0006\u0010j\u001a\u00020kJ\u0006\u0010l\u001a\u000205J\u0006\u0010m\u001a\u000205J\u0006\u0010n\u001a\u000205J\u0006\u0010o\u001a\u000205J\u0006\u0010p\u001a\u000205J\u0006\u0010q\u001a\u000205J\u0006\u0010r\u001a\u000205R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010%\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001a\u0010(\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001a\u0010+\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010.\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001e\u00101\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR\u001a\u0010=\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR\u001a\u0010@\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001a\u0010C\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010\u001bR \u0010F\u001a\b\u0012\u0004\u0012\u00020H0GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u00107\"\u0004\bO\u00109R\u001a\u0010P\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\bR\u001a\u0010S\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u00107\"\u0004\bU\u00109R\u001a\u0010V\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0019\"\u0004\bX\u0010\u001bR\u001a\u0010Y\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0006\"\u0004\b[\u0010\bR\u001a\u0010\\\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0006\"\u0004\b^\u0010\bR\u001e\u0010_\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u001f\"\u0004\ba\u0010!R\u001a\u0010b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0006\"\u0004\bd\u0010\b\u00a8\u0006t"}, d2 = {"Lcom/moez/QKSMS/model/Message;", "Lio/realm/RealmObject;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "value", "Lcom/moez/QKSMS/model/Message$AttachmentType;", "attachmentType", "getAttachmentType", "()Lcom/moez/QKSMS/model/Message$AttachmentType;", "setAttachmentType", "(Lcom/moez/QKSMS/model/Message$AttachmentType;)V", "attachmentTypeString", "getAttachmentTypeString", "setAttachmentTypeString", "body", "getBody", "setBody", "boxId", "", "getBoxId", "()I", "setBoxId", "(I)V", "contentId", "", "getContentId", "()J", "setContentId", "(J)V", "date", "getDate", "setDate", "dateSent", "getDateSent", "setDateSent", "deliveryStatus", "getDeliveryStatus", "setDeliveryStatus", "errorCode", "getErrorCode", "setErrorCode", "errorType", "getErrorType", "setErrorType", "id", "getId", "setId", "locked", "", "getLocked", "()Z", "setLocked", "(Z)V", "messageSize", "getMessageSize", "setMessageSize", "messageType", "getMessageType", "setMessageType", "mmsDeliveryStatusString", "getMmsDeliveryStatusString", "setMmsDeliveryStatusString", "mmsStatus", "getMmsStatus", "setMmsStatus", "parts", "Lio/realm/RealmList;", "Lcom/moez/QKSMS/model/MmsPart;", "getParts", "()Lio/realm/RealmList;", "setParts", "(Lio/realm/RealmList;)V", "read", "getRead", "setRead", "readReportString", "getReadReportString", "setReadReportString", "seen", "getSeen", "setSeen", "subId", "getSubId", "setSubId", "subject", "getSubject", "setSubject", "textContentType", "getTextContentType", "setTextContentType", "threadId", "getThreadId", "setThreadId", "type", "getType", "setType", "compareSender", "other", "getCleansedSubject", "getSummary", "getText", "getUri", "Landroid/net/Uri;", "isDelivered", "isFailedMessage", "isMe", "isMms", "isOutgoingMessage", "isSending", "isSms", "AttachmentType", "domain_debug"})
public class Message extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private long id;
    @io.realm.annotations.Index()
    private long threadId;
    private long contentId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    private int boxId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    private long date;
    private long dateSent;
    private boolean seen;
    private boolean read;
    private boolean locked;
    private int subId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String body;
    private int errorCode;
    private int deliveryStatus;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String attachmentTypeString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mmsDeliveryStatusString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String readReportString;
    private int errorType;
    private int messageSize;
    private int messageType;
    private int mmsStatus;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String subject;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String textContentType;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<com.moez.QKSMS.model.MmsPart> parts;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long getThreadId() {
        return 0L;
    }
    
    public final void setThreadId(long p0) {
    }
    
    public final long getContentId() {
        return 0L;
    }
    
    public final void setContentId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getBoxId() {
        return 0;
    }
    
    public final void setBoxId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    public final long getDateSent() {
        return 0L;
    }
    
    public final void setDateSent(long p0) {
    }
    
    public final boolean getSeen() {
        return false;
    }
    
    public final void setSeen(boolean p0) {
    }
    
    public final boolean getRead() {
        return false;
    }
    
    public final void setRead(boolean p0) {
    }
    
    public final boolean getLocked() {
        return false;
    }
    
    public final void setLocked(boolean p0) {
    }
    
    public final int getSubId() {
        return 0;
    }
    
    public final void setSubId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getErrorCode() {
        return 0;
    }
    
    public final void setErrorCode(int p0) {
    }
    
    public final int getDeliveryStatus() {
        return 0;
    }
    
    public final void setDeliveryStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAttachmentTypeString() {
        return null;
    }
    
    public final void setAttachmentTypeString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.moez.QKSMS.model.Message.AttachmentType getAttachmentType() {
        return null;
    }
    
    public final void setAttachmentType(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.model.Message.AttachmentType value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMmsDeliveryStatusString() {
        return null;
    }
    
    public final void setMmsDeliveryStatusString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReadReportString() {
        return null;
    }
    
    public final void setReadReportString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getErrorType() {
        return 0;
    }
    
    public final void setErrorType(int p0) {
    }
    
    public final int getMessageSize() {
        return 0;
    }
    
    public final void setMessageSize(int p0) {
    }
    
    public final int getMessageType() {
        return 0;
    }
    
    public final void setMessageType(int p0) {
    }
    
    public final int getMmsStatus() {
        return 0;
    }
    
    public final void setMmsStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubject() {
        return null;
    }
    
    public final void setSubject(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextContentType() {
        return null;
    }
    
    public final void setTextContentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<com.moez.QKSMS.model.MmsPart> getParts() {
        return null;
    }
    
    public final void setParts(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.moez.QKSMS.model.MmsPart> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    public final boolean isMms() {
        return false;
    }
    
    public final boolean isSms() {
        return false;
    }
    
    public final boolean isMe() {
        return false;
    }
    
    public final boolean isOutgoingMessage() {
        return false;
    }
    
    /**
     * Returns the text that should be copied to the clipboard
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    /**
     * Returns the text that should be displayed when a preview of the message
     * needs to be displayed, such as in the conversation view or in a notification
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    /**
     * Cleanses the subject in case it's useless, so that the UI doesn't have to show it
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCleansedSubject() {
        return null;
    }
    
    public final boolean isSending() {
        return false;
    }
    
    public final boolean isDelivered() {
        return false;
    }
    
    public final boolean isFailedMessage() {
        return false;
    }
    
    public final boolean compareSender(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.model.Message other) {
        return false;
    }
    
    public Message() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/moez/QKSMS/model/Message$AttachmentType;", "", "(Ljava/lang/String;I)V", "TEXT", "IMAGE", "VIDEO", "AUDIO", "SLIDESHOW", "NOT_LOADED", "domain_debug"})
    public static enum AttachmentType {
        /*public static final*/ TEXT /* = new TEXT() */,
        /*public static final*/ IMAGE /* = new IMAGE() */,
        /*public static final*/ VIDEO /* = new VIDEO() */,
        /*public static final*/ AUDIO /* = new AUDIO() */,
        /*public static final*/ SLIDESHOW /* = new SLIDESHOW() */,
        /*public static final*/ NOT_LOADED /* = new NOT_LOADED() */;
        
        AttachmentType() {
        }
    }
}