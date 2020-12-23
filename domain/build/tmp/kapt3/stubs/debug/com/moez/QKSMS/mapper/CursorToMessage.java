package com.moez.QKSMS.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\nJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/moez/QKSMS/mapper/CursorToMessage;", "Lcom/moez/QKSMS/mapper/Mapper;", "Lkotlin/Pair;", "Landroid/database/Cursor;", "Lcom/moez/QKSMS/mapper/CursorToMessage$MessageColumns;", "Lcom/moez/QKSMS/model/Message;", "getMessageCursor", "id", "", "getMessagesCursor", "MessageColumns", "domain_debug"})
public abstract interface CursorToMessage extends com.moez.QKSMS.mapper.Mapper<kotlin.Pair<? extends android.database.Cursor, ? extends com.moez.QKSMS.mapper.CursorToMessage.MessageColumns>, com.moez.QKSMS.model.Message> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.database.Cursor getMessagesCursor();
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.database.Cursor getMessageCursor(long id);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bH\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020OH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0012\u0010\bR\u001b\u0010\u0014\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0015\u0010\bR\u001b\u0010\u0017\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0018\u0010\bR\u001b\u0010\u001a\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\bR\u001b\u0010\u001d\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR\u001b\u0010 \u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR\u001b\u0010#\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b\'\u0010\bR\u001b\u0010)\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b*\u0010\bR\u001b\u0010,\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b-\u0010\bR\u001b\u0010/\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b0\u0010\bR\u001b\u00102\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR\u001b\u00105\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b6\u0010\bR\u001b\u00108\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\n\u001a\u0004\b9\u0010\bR\u001b\u0010;\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b<\u0010\bR\u001b\u0010>\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010\n\u001a\u0004\b?\u0010\bR\u001b\u0010A\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bB\u0010\bR\u001b\u0010D\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010\n\u001a\u0004\bE\u0010\bR\u001b\u0010G\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bH\u0010\bR\u001b\u0010J\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bL\u0010\n\u001a\u0004\bK\u0010\b\u00a8\u0006P"}, d2 = {"Lcom/moez/QKSMS/mapper/CursorToMessage$MessageColumns;", "", "cursor", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)V", "date", "", "getDate", "()I", "date$delegate", "Lkotlin/Lazy;", "dateSent", "getDateSent", "dateSent$delegate", "locked", "getLocked", "locked$delegate", "mmsDeliveryReport", "getMmsDeliveryReport", "mmsDeliveryReport$delegate", "mmsErrorType", "getMmsErrorType", "mmsErrorType$delegate", "mmsMessageBox", "getMmsMessageBox", "mmsMessageBox$delegate", "mmsMessageType", "getMmsMessageType", "mmsMessageType$delegate", "mmsReadReport", "getMmsReadReport", "mmsReadReport$delegate", "mmsSeen", "getMmsSeen", "mmsSeen$delegate", "mmsStatus", "getMmsStatus", "mmsStatus$delegate", "mmsSubject", "getMmsSubject", "mmsSubject$delegate", "mmsSubjectCharset", "getMmsSubjectCharset", "mmsSubjectCharset$delegate", "msgId", "getMsgId", "msgId$delegate", "msgType", "getMsgType", "msgType$delegate", "read", "getRead", "read$delegate", "smsAddress", "getSmsAddress", "smsAddress$delegate", "smsBody", "getSmsBody", "smsBody$delegate", "smsErrorCode", "getSmsErrorCode", "smsErrorCode$delegate", "smsSeen", "getSmsSeen", "smsSeen$delegate", "smsStatus", "getSmsStatus", "smsStatus$delegate", "smsType", "getSmsType", "smsType$delegate", "subId", "getSubId", "subId$delegate", "threadId", "getThreadId", "threadId$delegate", "getColumnIndex", "columnsName", "", "domain_debug"})
    public static final class MessageColumns {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy msgType$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy msgId$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy date$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy dateSent$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy read$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy threadId$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy locked$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy subId$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy smsAddress$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy smsBody$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy smsSeen$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy smsType$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy smsStatus$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy smsErrorCode$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsSubject$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsSubjectCharset$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsSeen$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsMessageType$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsMessageBox$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsDeliveryReport$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsReadReport$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsErrorType$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy mmsStatus$delegate = null;
        private final android.database.Cursor cursor = null;
        
        public final int getMsgType() {
            return 0;
        }
        
        public final int getMsgId() {
            return 0;
        }
        
        public final int getDate() {
            return 0;
        }
        
        public final int getDateSent() {
            return 0;
        }
        
        public final int getRead() {
            return 0;
        }
        
        public final int getThreadId() {
            return 0;
        }
        
        public final int getLocked() {
            return 0;
        }
        
        public final int getSubId() {
            return 0;
        }
        
        public final int getSmsAddress() {
            return 0;
        }
        
        public final int getSmsBody() {
            return 0;
        }
        
        public final int getSmsSeen() {
            return 0;
        }
        
        public final int getSmsType() {
            return 0;
        }
        
        public final int getSmsStatus() {
            return 0;
        }
        
        public final int getSmsErrorCode() {
            return 0;
        }
        
        public final int getMmsSubject() {
            return 0;
        }
        
        public final int getMmsSubjectCharset() {
            return 0;
        }
        
        public final int getMmsSeen() {
            return 0;
        }
        
        public final int getMmsMessageType() {
            return 0;
        }
        
        public final int getMmsMessageBox() {
            return 0;
        }
        
        public final int getMmsDeliveryReport() {
            return 0;
        }
        
        public final int getMmsReadReport() {
            return 0;
        }
        
        public final int getMmsErrorType() {
            return 0;
        }
        
        public final int getMmsStatus() {
            return 0;
        }
        
        private final int getColumnIndex(java.lang.String columnsName) {
            return 0;
        }
        
        public MessageColumns(@org.jetbrains.annotations.NotNull()
        android.database.Cursor cursor) {
            super();
        }
    }
}