package com.moez.QKSMS.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/moez/QKSMS/mapper/CursorToContactGroupImpl;", "Lcom/moez/QKSMS/mapper/CursorToContactGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContactGroupsCursor", "Landroid/database/Cursor;", "map", "Lcom/moez/QKSMS/model/ContactGroup;", "from", "Companion", "data_noAnalyticsDebug"})
public final class CursorToContactGroupImpl implements com.moez.QKSMS.mapper.CursorToContactGroup {
    private final android.content.Context context = null;
    private static final android.net.Uri URI = null;
    private static final java.lang.String[] PROJECTION = null;
    private static final java.lang.String SELECTION = "auto_add=0 AND deleted=0 AND favorites=0 AND title IS NOT NULL";
    private static final int ID = 0;
    private static final int TITLE = 1;
    public static final com.moez.QKSMS.mapper.CursorToContactGroupImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.moez.QKSMS.model.ContactGroup map(@org.jetbrains.annotations.NotNull()
    android.database.Cursor from) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.database.Cursor getContactGroupsCursor() {
        return null;
    }
    
    @javax.inject.Inject()
    public CursorToContactGroupImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/moez/QKSMS/mapper/CursorToContactGroupImpl$Companion;", "", "()V", "ID", "", "PROJECTION", "", "", "[Ljava/lang/String;", "SELECTION", "TITLE", "URI", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "data_noAnalyticsDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}