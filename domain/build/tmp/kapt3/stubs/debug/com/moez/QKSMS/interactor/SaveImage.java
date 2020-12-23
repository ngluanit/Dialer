package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/moez/QKSMS/interactor/SaveImage;", "Lcom/moez/QKSMS/interactor/Interactor;", "", "messageRepo", "Lcom/moez/QKSMS/repository/MessageRepository;", "(Lcom/moez/QKSMS/repository/MessageRepository;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "domain_debug"})
public final class SaveImage extends com.moez.QKSMS.interactor.Interactor<java.lang.Long> {
    private final com.moez.QKSMS.repository.MessageRepository messageRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<?> buildObservable(long params) {
        return null;
    }
    
    @javax.inject.Inject()
    public SaveImage(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.repository.MessageRepository messageRepo) {
        super();
    }
}