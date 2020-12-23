package com.moez.QKSMS.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a*\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\n\u001a*\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\r0\n\u00a8\u0006\u000e"}, d2 = {"asFlowable", "Lio/reactivex/Flowable;", "Landroid/database/Cursor;", "dump", "", "forEach", "", "closeOnComplete", "", "method", "Lkotlin/Function1;", "map", "", "T", "data_noAnalyticsDebug"})
public final class CursorExtensionsKt {
    
    public static final void forEach(@org.jetbrains.annotations.NotNull()
    android.database.Cursor $this$forEach, boolean closeOnComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.database.Cursor, kotlin.Unit> method) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.util.List<T> map(@org.jetbrains.annotations.NotNull()
    android.database.Cursor $this$map, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.database.Cursor, ? extends T> map) {
        return null;
    }
    
    /**
     * We're using this simple implementation with .range() because of the
     * complexities of dealing with Backpressure with a Cursor. We can't simply
     * use a loop and call onNext() from a generator because we'll need to close
     * the cursor at the end, and if any items are still in the buffer, then
     * they will be made invalid
     */
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Flowable<android.database.Cursor> asFlowable(@org.jetbrains.annotations.NotNull()
    android.database.Cursor $this$asFlowable) {
        return null;
    }
    
    /**
     * Dumps the contents of the cursor as a CSV string
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String dump(@org.jetbrains.annotations.NotNull()
    android.database.Cursor $this$dump) {
        return null;
    }
}