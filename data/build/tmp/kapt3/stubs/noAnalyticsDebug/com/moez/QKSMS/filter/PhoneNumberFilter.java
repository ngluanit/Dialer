package com.moez.QKSMS.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/moez/QKSMS/filter/PhoneNumberFilter;", "Lcom/moez/QKSMS/filter/Filter;", "", "phoneNumberUtils", "Lcom/moez/QKSMS/util/PhoneNumberUtils;", "(Lcom/moez/QKSMS/util/PhoneNumberUtils;)V", "filter", "", "item", "query", "", "data_noAnalyticsDebug"})
public final class PhoneNumberFilter extends com.moez.QKSMS.filter.Filter<java.lang.String> {
    private final com.moez.QKSMS.util.PhoneNumberUtils phoneNumberUtils = null;
    
    @java.lang.Override()
    public boolean filter(@org.jetbrains.annotations.NotNull()
    java.lang.String item, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence query) {
        return false;
    }
    
    @javax.inject.Inject()
    public PhoneNumberFilter(@org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.PhoneNumberUtils phoneNumberUtils) {
        super();
    }
}