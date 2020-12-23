package com.moez.QKSMS.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/moez/QKSMS/mapper/CursorToPart;", "Lcom/moez/QKSMS/mapper/Mapper;", "Landroid/database/Cursor;", "Lcom/moez/QKSMS/model/MmsPart;", "getPartsCursor", "messageId", "", "domain_debug"})
public abstract interface CursorToPart extends com.moez.QKSMS.mapper.Mapper<android.database.Cursor, com.moez.QKSMS.model.MmsPart> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.database.Cursor getPartsCursor(long messageId);
}