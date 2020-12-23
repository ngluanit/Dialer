package com.moez.QKSMS.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&\u00a8\u0006\u0005"}, d2 = {"Lcom/moez/QKSMS/mapper/CursorToContactGroup;", "Lcom/moez/QKSMS/mapper/Mapper;", "Landroid/database/Cursor;", "Lcom/moez/QKSMS/model/ContactGroup;", "getContactGroupsCursor", "domain_debug"})
public abstract interface CursorToContactGroup extends com.moez.QKSMS.mapper.Mapper<android.database.Cursor, com.moez.QKSMS.model.ContactGroup> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.database.Cursor getContactGroupsCursor();
}