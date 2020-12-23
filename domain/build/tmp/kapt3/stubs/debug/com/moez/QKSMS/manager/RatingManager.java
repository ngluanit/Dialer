package com.moez.QKSMS.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/moez/QKSMS/manager/RatingManager;", "", "shouldShowRating", "Lio/reactivex/Observable;", "", "getShouldShowRating", "()Lio/reactivex/Observable;", "addSession", "", "dismiss", "rate", "domain_debug"})
public abstract interface RatingManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getShouldShowRating();
    
    /**
     * Whether or not we should show the rating UI should depend on the number of sessions
     */
    public abstract void addSession();
    
    public abstract void rate();
    
    public abstract void dismiss();
}