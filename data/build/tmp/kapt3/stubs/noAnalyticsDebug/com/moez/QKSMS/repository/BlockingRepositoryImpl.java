package com.moez.QKSMS.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J!\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/moez/QKSMS/repository/BlockingRepositoryImpl;", "Lcom/moez/QKSMS/repository/BlockingRepository;", "phoneNumberUtils", "Lcom/moez/QKSMS/util/PhoneNumberUtils;", "(Lcom/moez/QKSMS/util/PhoneNumberUtils;)V", "blockNumber", "", "addresses", "", "", "([Ljava/lang/String;)V", "getBlockedNumber", "Lcom/moez/QKSMS/model/BlockedNumber;", "id", "", "getBlockedNumbers", "Lio/realm/RealmResults;", "isBlocked", "", "address", "unblockNumber", "unblockNumbers", "data_noAnalyticsDebug"})
public final class BlockingRepositoryImpl implements com.moez.QKSMS.repository.BlockingRepository {
    private final com.moez.QKSMS.util.PhoneNumberUtils phoneNumberUtils = null;
    
    @java.lang.Override()
    public void blockNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String... addresses) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.realm.RealmResults<com.moez.QKSMS.model.BlockedNumber> getBlockedNumbers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.moez.QKSMS.model.BlockedNumber getBlockedNumber(long id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isBlocked(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return false;
    }
    
    @java.lang.Override()
    public void unblockNumber(long id) {
    }
    
    @java.lang.Override()
    public void unblockNumbers(@org.jetbrains.annotations.NotNull()
    java.lang.String... addresses) {
    }
    
    @javax.inject.Inject()
    public BlockingRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.PhoneNumberUtils phoneNumberUtils) {
        super();
    }
}