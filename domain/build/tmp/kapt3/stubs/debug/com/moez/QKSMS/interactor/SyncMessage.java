package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/moez/QKSMS/interactor/SyncMessage;", "Lcom/moez/QKSMS/interactor/Interactor;", "Landroid/net/Uri;", "conversationRepo", "Lcom/moez/QKSMS/repository/ConversationRepository;", "syncManager", "Lcom/moez/QKSMS/repository/SyncRepository;", "updateBadge", "Lcom/moez/QKSMS/interactor/UpdateBadge;", "(Lcom/moez/QKSMS/repository/ConversationRepository;Lcom/moez/QKSMS/repository/SyncRepository;Lcom/moez/QKSMS/interactor/UpdateBadge;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "domain_debug"})
public final class SyncMessage extends com.moez.QKSMS.interactor.Interactor<android.net.Uri> {
    private final com.moez.QKSMS.repository.ConversationRepository conversationRepo = null;
    private final com.moez.QKSMS.repository.SyncRepository syncManager = null;
    private final com.moez.QKSMS.interactor.UpdateBadge updateBadge = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull()
    android.net.Uri params) {
        return null;
    }
    
    @javax.inject.Inject()
    public SyncMessage(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.SyncRepository syncManager, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.interactor.UpdateBadge updateBadge) {
        super();
    }
}