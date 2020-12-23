package com.moez.QKSMS.migration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/moez/QKSMS/migration/QkMigration;", "", "context", "Landroid/content/Context;", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "qksmsBlockingClient", "Lcom/moez/QKSMS/blocking/QksmsBlockingClient;", "(Landroid/content/Context;Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/util/Preferences;Lcom/moez/QKSMS/blocking/QksmsBlockingClient;)V", "performMigration", "", "upgradeTo370", "data_noAnalyticsDebug"})
public final class QkMigration {
    private final android.content.Context context = null;
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    private final com.moez.QKSMS.blocking.QksmsBlockingClient qksmsBlockingClient = null;
    
    public final void performMigration() {
    }
    
    private final void upgradeTo370() {
    }
    
    @javax.inject.Inject()
    public QkMigration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.blocking.QksmsBlockingClient qksmsBlockingClient) {
        super();
    }
}