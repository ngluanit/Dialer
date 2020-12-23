package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\nH&\u00a8\u0006\u0010"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepository;", "", "getBackupProgress", "Lio/reactivex/Observable;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "getBackups", "", "Lcom/moez/QKSMS/model/BackupFile;", "getRestoreProgress", "performBackup", "", "performRestore", "filePath", "", "stopRestore", "Progress", "domain_debug"})
public abstract interface BackupRepository {
    
    public abstract void performBackup();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.moez.QKSMS.repository.BackupRepository.Progress> getBackupProgress();
    
    /**
     * Returns a list of all local backups
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.moez.QKSMS.model.BackupFile>> getBackups();
    
    public abstract void performRestore(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath);
    
    public abstract void stopRestore();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.moez.QKSMS.repository.BackupRepository.Progress> getRestoreProgress();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u001b\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "", "running", "", "indeterminate", "(ZZ)V", "getIndeterminate", "()Z", "getRunning", "Finished", "Idle", "Parsing", "Running", "Saving", "Syncing", "Lcom/moez/QKSMS/repository/BackupRepository$Progress$Idle;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress$Parsing;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress$Running;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress$Saving;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress$Syncing;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress$Finished;", "domain_debug"})
    public static abstract class Progress {
        private final boolean running = false;
        private final boolean indeterminate = false;
        
        public final boolean getRunning() {
            return false;
        }
        
        public final boolean getIndeterminate() {
            return false;
        }
        
        private Progress(boolean running, boolean indeterminate) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepository$Progress$Idle;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "()V", "domain_debug"})
        public static final class Idle extends com.moez.QKSMS.repository.BackupRepository.Progress {
            
            public Idle() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepository$Progress$Parsing;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "()V", "domain_debug"})
        public static final class Parsing extends com.moez.QKSMS.repository.BackupRepository.Progress {
            
            public Parsing() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepository$Progress$Running;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "max", "", "count", "(II)V", "getCount", "()I", "getMax", "domain_debug"})
        public static final class Running extends com.moez.QKSMS.repository.BackupRepository.Progress {
            private final int max = 0;
            private final int count = 0;
            
            public final int getMax() {
                return 0;
            }
            
            public final int getCount() {
                return 0;
            }
            
            public Running(int max, int count) {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepository$Progress$Saving;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "()V", "domain_debug"})
        public static final class Saving extends com.moez.QKSMS.repository.BackupRepository.Progress {
            
            public Saving() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepository$Progress$Syncing;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "()V", "domain_debug"})
        public static final class Syncing extends com.moez.QKSMS.repository.BackupRepository.Progress {
            
            public Syncing() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moez/QKSMS/repository/BackupRepository$Progress$Finished;", "Lcom/moez/QKSMS/repository/BackupRepository$Progress;", "()V", "domain_debug"})
        public static final class Finished extends com.moez.QKSMS.repository.BackupRepository.Progress {
            
            public Finished() {
                super(false, false);
            }
        }
    }
}