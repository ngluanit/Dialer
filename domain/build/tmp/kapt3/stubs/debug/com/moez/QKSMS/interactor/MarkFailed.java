package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/moez/QKSMS/interactor/MarkFailed;", "Lcom/moez/QKSMS/interactor/Interactor;", "Lcom/moez/QKSMS/interactor/MarkFailed$Params;", "messageRepo", "Lcom/moez/QKSMS/repository/MessageRepository;", "notificationManager", "Lcom/moez/QKSMS/manager/NotificationManager;", "(Lcom/moez/QKSMS/repository/MessageRepository;Lcom/moez/QKSMS/manager/NotificationManager;)V", "buildObservable", "Lio/reactivex/Flowable;", "", "params", "Params", "domain_debug"})
public final class MarkFailed extends com.moez.QKSMS.interactor.Interactor<com.moez.QKSMS.interactor.MarkFailed.Params> {
    private final com.moez.QKSMS.repository.MessageRepository messageRepo = null;
    private final com.moez.QKSMS.manager.NotificationManager notificationManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> buildObservable(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.MarkFailed.Params params) {
        return null;
    }
    
    @javax.inject.Inject()
    public MarkFailed(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.manager.NotificationManager notificationManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/moez/QKSMS/interactor/MarkFailed$Params;", "", "id", "", "resultCode", "", "(JI)V", "getId", "()J", "getResultCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_debug"})
    public static final class Params {
        private final long id = 0L;
        private final int resultCode = 0;
        
        public final long getId() {
            return 0L;
        }
        
        public final int getResultCode() {
            return 0;
        }
        
        public Params(long id, int resultCode) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.interactor.MarkFailed.Params copy(long id, int resultCode) {
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