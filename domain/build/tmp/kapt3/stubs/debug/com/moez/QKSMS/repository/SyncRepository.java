package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\b\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/moez/QKSMS/repository/SyncRepository;", "", "syncProgress", "Lio/reactivex/Observable;", "Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress;", "getSyncProgress", "()Lio/reactivex/Observable;", "syncContacts", "", "syncMessage", "Lcom/moez/QKSMS/model/Message;", "uri", "Landroid/net/Uri;", "syncMessages", "SyncProgress", "domain_debug"})
public abstract interface SyncRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.moez.QKSMS.repository.SyncRepository.SyncProgress> getSyncProgress();
    
    public abstract void syncMessages();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.Message syncMessage(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri);
    
    public abstract void syncContacts();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress;", "", "()V", "Idle", "Running", "Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress$Idle;", "Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress$Running;", "domain_debug"})
    public static abstract class SyncProgress {
        
        private SyncProgress() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress$Idle;", "Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress;", "()V", "domain_debug"})
        public static final class Idle extends com.moez.QKSMS.repository.SyncRepository.SyncProgress {
            public static final com.moez.QKSMS.repository.SyncRepository.SyncProgress.Idle INSTANCE = null;
            
            private Idle() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress$Running;", "Lcom/moez/QKSMS/repository/SyncRepository$SyncProgress;", "max", "", "progress", "indeterminate", "", "(IIZ)V", "getIndeterminate", "()Z", "getMax", "()I", "getProgress", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "domain_debug"})
        public static final class Running extends com.moez.QKSMS.repository.SyncRepository.SyncProgress {
            private final int max = 0;
            private final int progress = 0;
            private final boolean indeterminate = false;
            
            public final int getMax() {
                return 0;
            }
            
            public final int getProgress() {
                return 0;
            }
            
            public final boolean getIndeterminate() {
                return false;
            }
            
            public Running(int max, int progress, boolean indeterminate) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final boolean component3() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.moez.QKSMS.repository.SyncRepository.SyncProgress.Running copy(int max, int progress, boolean indeterminate) {
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
    }
}