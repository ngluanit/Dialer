package com.moez.QKSMS.manager;

import java.lang.System;

/**
 * Helper class for generating incrementing ids for messages
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/moez/QKSMS/manager/KeyManager;", "", "newId", "", "reset", "", "domain_debug"})
public abstract interface KeyManager {
    
    /**
     * Should be called when a new sync is being started
     */
    public abstract void reset();
    
    /**
     * Returns a valid ID that can be used to store a new message
     */
    public abstract long newId();
}