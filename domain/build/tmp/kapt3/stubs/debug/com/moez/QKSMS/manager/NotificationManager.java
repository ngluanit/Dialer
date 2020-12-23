package com.moez.QKSMS.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/moez/QKSMS/manager/NotificationManager;", "", "buildNotificationChannelId", "", "threadId", "", "createNotificationChannel", "", "getNotificationForBackup", "Landroidx/core/app/NotificationCompat$Builder;", "notifyFailed", "update", "domain_debug"})
public abstract interface NotificationManager {
    
    public abstract void update(long threadId);
    
    public abstract void notifyFailed(long threadId);
    
    public abstract void createNotificationChannel(long threadId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String buildNotificationChannelId(long threadId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.core.app.NotificationCompat.Builder getNotificationForBackup();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}