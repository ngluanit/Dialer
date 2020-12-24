package com.moez.QKSMS.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/moez/QKSMS/manager/PermissionManagerImpl;", "Lcom/moez/QKSMS/manager/PermissionManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hasCalling", "", "hasContacts", "hasPhone", "hasReadSms", "hasSendSms", "hasStorage", "isDefaultSms", "data_noAnalyticsDebug"})
public final class PermissionManagerImpl implements com.moez.QKSMS.manager.PermissionManager {
    private final android.content.Context context = null;
    
    @java.lang.Override()
    public boolean isDefaultSms() {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasReadSms() {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasSendSms() {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasContacts() {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasPhone() {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasCalling() {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasStorage() {
        return false;
    }
    
    @javax.inject.Inject()
    public PermissionManagerImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}