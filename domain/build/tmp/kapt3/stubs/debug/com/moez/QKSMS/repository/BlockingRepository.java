package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J!\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/moez/QKSMS/repository/BlockingRepository;", "", "blockNumber", "", "addresses", "", "", "([Ljava/lang/String;)V", "getBlockedNumber", "Lcom/moez/QKSMS/model/BlockedNumber;", "id", "", "getBlockedNumbers", "Lio/realm/RealmResults;", "isBlocked", "", "address", "unblockNumber", "unblockNumbers", "domain_debug"})
public abstract interface BlockingRepository {
    
    public abstract void blockNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String... addresses);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<com.moez.QKSMS.model.BlockedNumber> getBlockedNumbers();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.moez.QKSMS.model.BlockedNumber getBlockedNumber(long id);
    
    public abstract boolean isBlocked(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    public abstract void unblockNumber(long id);
    
    public abstract void unblockNumbers(@org.jetbrains.annotations.NotNull()
    java.lang.String... addresses);
}