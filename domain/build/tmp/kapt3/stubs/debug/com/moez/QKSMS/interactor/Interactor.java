package com.moez.QKSMS.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/moez/QKSMS/interactor/Interactor;", "Params", "Lio/reactivex/disposables/Disposable;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "buildObservable", "Lio/reactivex/Flowable;", "params", "(Ljava/lang/Object;)Lio/reactivex/Flowable;", "dispose", "", "execute", "onComplete", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "isDisposed", "", "domain_debug"})
public abstract class Interactor<Params extends java.lang.Object> implements io.reactivex.disposables.Disposable {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<?> buildObservable(Params params);
    
    public final void execute(Params params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    @java.lang.Override()
    public void dispose() {
    }
    
    @java.lang.Override()
    public boolean isDisposed() {
        return false;
    }
    
    public Interactor() {
        super();
    }
}