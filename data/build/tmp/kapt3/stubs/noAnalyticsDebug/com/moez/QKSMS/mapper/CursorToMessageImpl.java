package com.moez.QKSMS.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u001c\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/moez/QKSMS/mapper/CursorToMessageImpl;", "Lcom/moez/QKSMS/mapper/CursorToMessage;", "context", "Landroid/content/Context;", "cursorToPart", "Lcom/moez/QKSMS/mapper/CursorToPart;", "keys", "Lcom/moez/QKSMS/manager/KeyManager;", "permissionManager", "Lcom/moez/QKSMS/manager/PermissionManager;", "preferences", "Lcom/moez/QKSMS/util/Preferences;", "(Landroid/content/Context;Lcom/moez/QKSMS/mapper/CursorToPart;Lcom/moez/QKSMS/manager/KeyManager;Lcom/moez/QKSMS/manager/PermissionManager;Lcom/moez/QKSMS/util/Preferences;)V", "projection", "", "", "[Ljava/lang/String;", "uri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getMessageCursor", "Landroid/database/Cursor;", "id", "", "getMessagesCursor", "getMmsAddress", "messageId", "map", "Lcom/moez/QKSMS/model/Message;", "from", "Lkotlin/Pair;", "Lcom/moez/QKSMS/mapper/CursorToMessage$MessageColumns;", "data_noAnalyticsDebug"})
public final class CursorToMessageImpl implements com.moez.QKSMS.mapper.CursorToMessage {
    private final android.net.Uri uri = null;
    private final java.lang.String[] projection = null;
    private final android.content.Context context = null;
    private final com.moez.QKSMS.mapper.CursorToPart cursorToPart = null;
    private final com.moez.QKSMS.manager.KeyManager keys = null;
    private final com.moez.QKSMS.manager.PermissionManager permissionManager = null;
    private final com.moez.QKSMS.util.Preferences preferences = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.moez.QKSMS.model.Message map(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends android.database.Cursor, com.moez.QKSMS.mapper.CursorToMessage.MessageColumns> from) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.database.Cursor getMessagesCursor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.database.Cursor getMessageCursor(long id) {
        return null;
    }
    
    private final java.lang.String getMmsAddress(long messageId) {
        return null;
    }
    
    @javax.inject.Inject()
    public CursorToMessageImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.mapper.CursorToPart cursorToPart, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.KeyManager keys, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.PermissionManager permissionManager, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences preferences) {
        super();
    }
}