package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0004\"#$%B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0012H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepositoryImpl;", "Lcom/moez/QKSMS/repository/BackupRepository;", "context", "Landroid/content/Context;", "moshi", "Lcom/squareup/moshi/Moshi;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "syncRepo", "Lcom/moez/QKSMS/repository/SyncRepository;", "(Landroid/content/Context;Lcom/squareup/moshi/Moshi;Lcom/moez/QKSMS/util/Preferences;Lcom/moez/QKSMS/repository/SyncRepository;)V", "backupProgress", "Lio/reactivex/subjects/Subject;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "restoreProgress", "stopFlag", "", "getBackupProgress", "Lio/reactivex/Observable;", "getBackups", "", "Lcom/moez/QKSMS/model/BackupFile;", "getRestoreProgress", "isBackupOrRestoreRunning", "messageToBackupMessage", "Lcom/moez/QKSMS/repository/BackupRepositoryImpl$BackupMessage;", "message", "Lcom/moez/QKSMS/model/Message;", "performBackup", "", "performRestore", "filePath", "", "stopRestore", "Backup", "BackupMessage", "BackupMetadata", "Companion", "data_noAnalyticsDebug"})
@javax.inject.Singleton()
public final class BackupRepositoryImpl implements com.moez.QKSMS.repository.BackupRepository {
    private final io.reactivex.subjects.Subject<com.moez.QKSMS.repository.BackupRepository.Progress> backupProgress = null;
    private final io.reactivex.subjects.Subject<com.moez.QKSMS.repository.BackupRepository.Progress> restoreProgress = null;
    private volatile boolean stopFlag;
    private final android.content.Context context = null;
    private final com.squareup.moshi.Moshi moshi = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    private final com.moez.QKSMS.repository.SyncRepository syncRepo = null;
    private static final java.lang.String BACKUP_DIRECTORY = null;
    public static final com.moez.QKSMS.repository.BackupRepositoryImpl.Companion Companion = null;
    
    @java.lang.Override()
    public void performBackup() {
    }
    
    private final com.moez.QKSMS.repository.BackupRepositoryImpl.BackupMessage messageToBackupMessage(com.moez.QKSMS.model.Message message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.moez.QKSMS.repository.BackupRepository.Progress> getBackupProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.moez.QKSMS.model.BackupFile>> getBackups() {
        return null;
    }
    
    @java.lang.Override()
    public void performRestore(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
    }
    
    @java.lang.Override()
    public void stopRestore() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.moez.QKSMS.repository.BackupRepository.Progress> getRestoreProgress() {
        return null;
    }
    
    private final boolean isBackupOrRestoreRunning() {
        return false;
    }
    
    @javax.inject.Inject()
    public BackupRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.SyncRepository syncRepo) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepositoryImpl$Backup;", "", "messageCount", "", "messages", "", "Lcom/moez/QKSMS/repository/BackupRepositoryImpl$BackupMessage;", "(ILjava/util/List;)V", "getMessageCount", "()I", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "data_noAnalyticsDebug"})
    public static final class Backup {
        private final int messageCount = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.moez.QKSMS.repository.BackupRepositoryImpl.BackupMessage> messages = null;
        
        public final int getMessageCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.moez.QKSMS.repository.BackupRepositoryImpl.BackupMessage> getMessages() {
            return null;
        }
        
        public Backup(int messageCount, @org.jetbrains.annotations.NotNull()
        java.util.List<com.moez.QKSMS.repository.BackupRepositoryImpl.BackupMessage> messages) {
            super();
        }
        
        public Backup() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.moez.QKSMS.repository.BackupRepositoryImpl.BackupMessage> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.repository.BackupRepositoryImpl.Backup copy(int messageCount, @org.jetbrains.annotations.NotNull()
        java.util.List<com.moez.QKSMS.repository.BackupRepositoryImpl.BackupMessage> messages) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * Simpler version of [Backup] which allows us to read certain fields from the backup without
     * needing to parse the entire file
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepositoryImpl$BackupMetadata;", "", "messageCount", "", "(I)V", "getMessageCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "data_noAnalyticsDebug"})
    public static final class BackupMetadata {
        private final int messageCount = 0;
        
        public final int getMessageCount() {
            return 0;
        }
        
        public BackupMetadata(int messageCount) {
            super();
        }
        
        public BackupMetadata() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        /**
         * Simpler version of [Backup] which allows us to read certain fields from the backup without
         * needing to parse the entire file
         */
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.repository.BackupRepositoryImpl.BackupMetadata copy(int messageCount) {
            return null;
        }
        
        /**
         * Simpler version of [Backup] which allows us to read certain fields from the backup without
         * needing to parse the entire file
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Simpler version of [Backup] which allows us to read certain fields from the backup without
         * needing to parse the entire file
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Simpler version of [Backup] which allows us to read certain fields from the backup without
         * needing to parse the entire file
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\'\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jy\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b\u00a8\u00061"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepositoryImpl$BackupMessage;", "", "type", "", "address", "", "date", "", "dateSent", "read", "", "status", "body", "protocol", "serviceCenter", "locked", "subId", "(ILjava/lang/String;JJZILjava/lang/String;ILjava/lang/String;ZI)V", "getAddress", "()Ljava/lang/String;", "getBody", "getDate", "()J", "getDateSent", "getLocked", "()Z", "getProtocol", "()I", "getRead", "getServiceCenter", "getStatus", "getSubId", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_noAnalyticsDebug"})
    public static final class BackupMessage {
        private final int type = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String address = null;
        private final long date = 0L;
        private final long dateSent = 0L;
        private final boolean read = false;
        private final int status = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String body = null;
        private final int protocol = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String serviceCenter = null;
        private final boolean locked = false;
        private final int subId = 0;
        
        public final int getType() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final long getDate() {
            return 0L;
        }
        
        public final long getDateSent() {
            return 0L;
        }
        
        public final boolean getRead() {
            return false;
        }
        
        public final int getStatus() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBody() {
            return null;
        }
        
        public final int getProtocol() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getServiceCenter() {
            return null;
        }
        
        public final boolean getLocked() {
            return false;
        }
        
        public final int getSubId() {
            return 0;
        }
        
        public BackupMessage(int type, @org.jetbrains.annotations.NotNull()
        java.lang.String address, long date, long dateSent, boolean read, int status, @org.jetbrains.annotations.NotNull()
        java.lang.String body, int protocol, @org.jetbrains.annotations.Nullable()
        java.lang.String serviceCenter, boolean locked, int subId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long component4() {
            return 0L;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final int component6() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        public final int component8() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        public final boolean component10() {
            return false;
        }
        
        public final int component11() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.repository.BackupRepositoryImpl.BackupMessage copy(int type, @org.jetbrains.annotations.NotNull()
        java.lang.String address, long date, long dateSent, boolean read, int status, @org.jetbrains.annotations.NotNull()
        java.lang.String body, int protocol, @org.jetbrains.annotations.Nullable()
        java.lang.String serviceCenter, boolean locked, int subId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepositoryImpl$Companion;", "", "()V", "BACKUP_DIRECTORY", "", "data_noAnalyticsDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}