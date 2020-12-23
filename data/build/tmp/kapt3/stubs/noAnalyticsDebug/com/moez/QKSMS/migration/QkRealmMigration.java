package com.moez.QKSMS.migration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/moez/QKSMS/migration/QkRealmMigration;", "Lio/realm/RealmMigration;", "cursorToContact", "Lcom/moez/QKSMS/mapper/CursorToContactImpl;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "(Lcom/moez/QKSMS/mapper/CursorToContactImpl;Lcom/moez/QKSMS/util/Preferences;)V", "migrate", "", "realm", "Lio/realm/DynamicRealm;", "oldVersion", "", "newVersion", "Companion", "data_noAnalyticsDebug"})
public final class QkRealmMigration implements io.realm.RealmMigration {
    private final com.moez.QKSMS.mapper.CursorToContactImpl cursorToContact = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    public static final long SchemaVersion = 10L;
    public static final com.moez.QKSMS.migration.QkRealmMigration.Companion Companion = null;
    
    @android.annotation.SuppressLint(value = {"ApplySharedPref"})
    @java.lang.Override()
    public void migrate(@org.jetbrains.annotations.NotNull()
    io.realm.DynamicRealm realm, long oldVersion, long newVersion) {
    }
    
    @javax.inject.Inject()
    public QkRealmMigration(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.mapper.CursorToContactImpl cursorToContact, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/moez/QKSMS/migration/QkRealmMigration$Companion;", "", "()V", "SchemaVersion", "", "data_noAnalyticsDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}