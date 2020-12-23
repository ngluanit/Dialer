package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_moez_QKSMS_model_MessageRealmProxy extends com.moez.QKSMS.model.Message
    implements RealmObjectProxy, com_moez_QKSMS_model_MessageRealmProxyInterface {

    static final class MessageColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long threadIdIndex;
        long contentIdIndex;
        long addressIndex;
        long boxIdIndex;
        long typeIndex;
        long dateIndex;
        long dateSentIndex;
        long seenIndex;
        long readIndex;
        long lockedIndex;
        long subIdIndex;
        long bodyIndex;
        long errorCodeIndex;
        long deliveryStatusIndex;
        long attachmentTypeStringIndex;
        long mmsDeliveryStatusStringIndex;
        long readReportStringIndex;
        long errorTypeIndex;
        long messageSizeIndex;
        long messageTypeIndex;
        long mmsStatusIndex;
        long subjectIndex;
        long textContentTypeIndex;
        long partsIndex;

        MessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(25);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Message");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.threadIdIndex = addColumnDetails("threadId", "threadId", objectSchemaInfo);
            this.contentIdIndex = addColumnDetails("contentId", "contentId", objectSchemaInfo);
            this.addressIndex = addColumnDetails("address", "address", objectSchemaInfo);
            this.boxIdIndex = addColumnDetails("boxId", "boxId", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.dateSentIndex = addColumnDetails("dateSent", "dateSent", objectSchemaInfo);
            this.seenIndex = addColumnDetails("seen", "seen", objectSchemaInfo);
            this.readIndex = addColumnDetails("read", "read", objectSchemaInfo);
            this.lockedIndex = addColumnDetails("locked", "locked", objectSchemaInfo);
            this.subIdIndex = addColumnDetails("subId", "subId", objectSchemaInfo);
            this.bodyIndex = addColumnDetails("body", "body", objectSchemaInfo);
            this.errorCodeIndex = addColumnDetails("errorCode", "errorCode", objectSchemaInfo);
            this.deliveryStatusIndex = addColumnDetails("deliveryStatus", "deliveryStatus", objectSchemaInfo);
            this.attachmentTypeStringIndex = addColumnDetails("attachmentTypeString", "attachmentTypeString", objectSchemaInfo);
            this.mmsDeliveryStatusStringIndex = addColumnDetails("mmsDeliveryStatusString", "mmsDeliveryStatusString", objectSchemaInfo);
            this.readReportStringIndex = addColumnDetails("readReportString", "readReportString", objectSchemaInfo);
            this.errorTypeIndex = addColumnDetails("errorType", "errorType", objectSchemaInfo);
            this.messageSizeIndex = addColumnDetails("messageSize", "messageSize", objectSchemaInfo);
            this.messageTypeIndex = addColumnDetails("messageType", "messageType", objectSchemaInfo);
            this.mmsStatusIndex = addColumnDetails("mmsStatus", "mmsStatus", objectSchemaInfo);
            this.subjectIndex = addColumnDetails("subject", "subject", objectSchemaInfo);
            this.textContentTypeIndex = addColumnDetails("textContentType", "textContentType", objectSchemaInfo);
            this.partsIndex = addColumnDetails("parts", "parts", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MessageColumnInfo src = (MessageColumnInfo) rawSrc;
            final MessageColumnInfo dst = (MessageColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.threadIdIndex = src.threadIdIndex;
            dst.contentIdIndex = src.contentIdIndex;
            dst.addressIndex = src.addressIndex;
            dst.boxIdIndex = src.boxIdIndex;
            dst.typeIndex = src.typeIndex;
            dst.dateIndex = src.dateIndex;
            dst.dateSentIndex = src.dateSentIndex;
            dst.seenIndex = src.seenIndex;
            dst.readIndex = src.readIndex;
            dst.lockedIndex = src.lockedIndex;
            dst.subIdIndex = src.subIdIndex;
            dst.bodyIndex = src.bodyIndex;
            dst.errorCodeIndex = src.errorCodeIndex;
            dst.deliveryStatusIndex = src.deliveryStatusIndex;
            dst.attachmentTypeStringIndex = src.attachmentTypeStringIndex;
            dst.mmsDeliveryStatusStringIndex = src.mmsDeliveryStatusStringIndex;
            dst.readReportStringIndex = src.readReportStringIndex;
            dst.errorTypeIndex = src.errorTypeIndex;
            dst.messageSizeIndex = src.messageSizeIndex;
            dst.messageTypeIndex = src.messageTypeIndex;
            dst.mmsStatusIndex = src.mmsStatusIndex;
            dst.subjectIndex = src.subjectIndex;
            dst.textContentTypeIndex = src.textContentTypeIndex;
            dst.partsIndex = src.partsIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MessageColumnInfo columnInfo;
    private ProxyState<com.moez.QKSMS.model.Message> proxyState;
    private RealmList<com.moez.QKSMS.model.MmsPart> partsRealmList;

    com_moez_QKSMS_model_MessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.moez.QKSMS.model.Message>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$threadId() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.threadIdIndex);
    }

    @Override
    public void realmSet$threadId(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.threadIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.threadIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$contentId() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.contentIdIndex);
    }

    @Override
    public void realmSet$contentId(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.contentIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.contentIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.addressIndex);
    }

    @Override
    public void realmSet$address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'address' to null.");
            }
            row.getTable().setString(columnInfo.addressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'address' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.addressIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$boxId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.boxIdIndex);
    }

    @Override
    public void realmSet$boxId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.boxIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.boxIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeIndex);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            }
            row.getTable().setString(columnInfo.typeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.typeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$dateSent() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateSentIndex);
    }

    @Override
    public void realmSet$dateSent(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateSentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateSentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$seen() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.seenIndex);
    }

    @Override
    public void realmSet$seen(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.seenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.seenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$read() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.readIndex);
    }

    @Override
    public void realmSet$read(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.readIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.readIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$locked() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.lockedIndex);
    }

    @Override
    public void realmSet$locked(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.lockedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.lockedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$subId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.subIdIndex);
    }

    @Override
    public void realmSet$subId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.subIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.subIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$body() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bodyIndex);
    }

    @Override
    public void realmSet$body(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'body' to null.");
            }
            row.getTable().setString(columnInfo.bodyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'body' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.bodyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$errorCode() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.errorCodeIndex);
    }

    @Override
    public void realmSet$errorCode(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.errorCodeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.errorCodeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$deliveryStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.deliveryStatusIndex);
    }

    @Override
    public void realmSet$deliveryStatus(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.deliveryStatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.deliveryStatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$attachmentTypeString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.attachmentTypeStringIndex);
    }

    @Override
    public void realmSet$attachmentTypeString(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'attachmentTypeString' to null.");
            }
            row.getTable().setString(columnInfo.attachmentTypeStringIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'attachmentTypeString' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.attachmentTypeStringIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mmsDeliveryStatusString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mmsDeliveryStatusStringIndex);
    }

    @Override
    public void realmSet$mmsDeliveryStatusString(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'mmsDeliveryStatusString' to null.");
            }
            row.getTable().setString(columnInfo.mmsDeliveryStatusStringIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'mmsDeliveryStatusString' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.mmsDeliveryStatusStringIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$readReportString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.readReportStringIndex);
    }

    @Override
    public void realmSet$readReportString(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'readReportString' to null.");
            }
            row.getTable().setString(columnInfo.readReportStringIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'readReportString' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.readReportStringIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$errorType() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.errorTypeIndex);
    }

    @Override
    public void realmSet$errorType(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.errorTypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.errorTypeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$messageSize() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.messageSizeIndex);
    }

    @Override
    public void realmSet$messageSize(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.messageSizeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.messageSizeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$messageType() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.messageTypeIndex);
    }

    @Override
    public void realmSet$messageType(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.messageTypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.messageTypeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$mmsStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.mmsStatusIndex);
    }

    @Override
    public void realmSet$mmsStatus(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.mmsStatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.mmsStatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$subject() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.subjectIndex);
    }

    @Override
    public void realmSet$subject(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
            }
            row.getTable().setString(columnInfo.subjectIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.subjectIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$textContentType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.textContentTypeIndex);
    }

    @Override
    public void realmSet$textContentType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textContentType' to null.");
            }
            row.getTable().setString(columnInfo.textContentTypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'textContentType' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.textContentTypeIndex, value);
    }

    @Override
    public RealmList<com.moez.QKSMS.model.MmsPart> realmGet$parts() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (partsRealmList != null) {
            return partsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.partsIndex);
            partsRealmList = new RealmList<com.moez.QKSMS.model.MmsPart>(com.moez.QKSMS.model.MmsPart.class, osList, proxyState.getRealm$realm());
            return partsRealmList;
        }
    }

    @Override
    public void realmSet$parts(RealmList<com.moez.QKSMS.model.MmsPart> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("parts")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.moez.QKSMS.model.MmsPart> original = value;
                value = new RealmList<com.moez.QKSMS.model.MmsPart>();
                for (com.moez.QKSMS.model.MmsPart item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.partsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.MmsPart linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.MmsPart linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Message", 25, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("threadId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("contentId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("boxId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("dateSent", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("seen", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("read", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("locked", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("subId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("body", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("errorCode", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("deliveryStatus", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("attachmentTypeString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("mmsDeliveryStatusString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("readReportString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("errorType", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("messageSize", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("messageType", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("mmsStatus", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("subject", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("textContentType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("parts", RealmFieldType.LIST, "MmsPart");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Message";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Message";
    }

    @SuppressWarnings("cast")
    public static com.moez.QKSMS.model.Message createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.moez.QKSMS.model.Message obj = null;
        if (update) {
            Table table = realm.getTable(com.moez.QKSMS.model.Message.class);
            MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_moez_QKSMS_model_MessageRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("parts")) {
                excludeFields.add("parts");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_moez_QKSMS_model_MessageRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.Message.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_moez_QKSMS_model_MessageRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.Message.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_moez_QKSMS_model_MessageRealmProxyInterface objProxy = (com_moez_QKSMS_model_MessageRealmProxyInterface) obj;
        if (json.has("threadId")) {
            if (json.isNull("threadId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'threadId' to null.");
            } else {
                objProxy.realmSet$threadId((long) json.getLong("threadId"));
            }
        }
        if (json.has("contentId")) {
            if (json.isNull("contentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'contentId' to null.");
            } else {
                objProxy.realmSet$contentId((long) json.getLong("contentId"));
            }
        }
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("boxId")) {
            if (json.isNull("boxId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'boxId' to null.");
            } else {
                objProxy.realmSet$boxId((int) json.getInt("boxId"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                objProxy.realmSet$date((long) json.getLong("date"));
            }
        }
        if (json.has("dateSent")) {
            if (json.isNull("dateSent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dateSent' to null.");
            } else {
                objProxy.realmSet$dateSent((long) json.getLong("dateSent"));
            }
        }
        if (json.has("seen")) {
            if (json.isNull("seen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seen' to null.");
            } else {
                objProxy.realmSet$seen((boolean) json.getBoolean("seen"));
            }
        }
        if (json.has("read")) {
            if (json.isNull("read")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
            } else {
                objProxy.realmSet$read((boolean) json.getBoolean("read"));
            }
        }
        if (json.has("locked")) {
            if (json.isNull("locked")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'locked' to null.");
            } else {
                objProxy.realmSet$locked((boolean) json.getBoolean("locked"));
            }
        }
        if (json.has("subId")) {
            if (json.isNull("subId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subId' to null.");
            } else {
                objProxy.realmSet$subId((int) json.getInt("subId"));
            }
        }
        if (json.has("body")) {
            if (json.isNull("body")) {
                objProxy.realmSet$body(null);
            } else {
                objProxy.realmSet$body((String) json.getString("body"));
            }
        }
        if (json.has("errorCode")) {
            if (json.isNull("errorCode")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'errorCode' to null.");
            } else {
                objProxy.realmSet$errorCode((int) json.getInt("errorCode"));
            }
        }
        if (json.has("deliveryStatus")) {
            if (json.isNull("deliveryStatus")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'deliveryStatus' to null.");
            } else {
                objProxy.realmSet$deliveryStatus((int) json.getInt("deliveryStatus"));
            }
        }
        if (json.has("attachmentTypeString")) {
            if (json.isNull("attachmentTypeString")) {
                objProxy.realmSet$attachmentTypeString(null);
            } else {
                objProxy.realmSet$attachmentTypeString((String) json.getString("attachmentTypeString"));
            }
        }
        if (json.has("mmsDeliveryStatusString")) {
            if (json.isNull("mmsDeliveryStatusString")) {
                objProxy.realmSet$mmsDeliveryStatusString(null);
            } else {
                objProxy.realmSet$mmsDeliveryStatusString((String) json.getString("mmsDeliveryStatusString"));
            }
        }
        if (json.has("readReportString")) {
            if (json.isNull("readReportString")) {
                objProxy.realmSet$readReportString(null);
            } else {
                objProxy.realmSet$readReportString((String) json.getString("readReportString"));
            }
        }
        if (json.has("errorType")) {
            if (json.isNull("errorType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'errorType' to null.");
            } else {
                objProxy.realmSet$errorType((int) json.getInt("errorType"));
            }
        }
        if (json.has("messageSize")) {
            if (json.isNull("messageSize")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'messageSize' to null.");
            } else {
                objProxy.realmSet$messageSize((int) json.getInt("messageSize"));
            }
        }
        if (json.has("messageType")) {
            if (json.isNull("messageType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'messageType' to null.");
            } else {
                objProxy.realmSet$messageType((int) json.getInt("messageType"));
            }
        }
        if (json.has("mmsStatus")) {
            if (json.isNull("mmsStatus")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'mmsStatus' to null.");
            } else {
                objProxy.realmSet$mmsStatus((int) json.getInt("mmsStatus"));
            }
        }
        if (json.has("subject")) {
            if (json.isNull("subject")) {
                objProxy.realmSet$subject(null);
            } else {
                objProxy.realmSet$subject((String) json.getString("subject"));
            }
        }
        if (json.has("textContentType")) {
            if (json.isNull("textContentType")) {
                objProxy.realmSet$textContentType(null);
            } else {
                objProxy.realmSet$textContentType((String) json.getString("textContentType"));
            }
        }
        if (json.has("parts")) {
            if (json.isNull("parts")) {
                objProxy.realmSet$parts(null);
            } else {
                objProxy.realmGet$parts().clear();
                JSONArray array = json.getJSONArray("parts");
                for (int i = 0; i < array.length(); i++) {
                    com.moez.QKSMS.model.MmsPart item = com_moez_QKSMS_model_MmsPartRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$parts().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.moez.QKSMS.model.Message createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.moez.QKSMS.model.Message obj = new com.moez.QKSMS.model.Message();
        final com_moez_QKSMS_model_MessageRealmProxyInterface objProxy = (com_moez_QKSMS_model_MessageRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("threadId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$threadId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'threadId' to null.");
                }
            } else if (name.equals("contentId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$contentId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'contentId' to null.");
                }
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
                }
            } else if (name.equals("boxId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$boxId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'boxId' to null.");
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
            } else if (name.equals("dateSent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dateSent((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateSent' to null.");
                }
            } else if (name.equals("seen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seen((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seen' to null.");
                }
            } else if (name.equals("read")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$read((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
                }
            } else if (name.equals("locked")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$locked((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'locked' to null.");
                }
            } else if (name.equals("subId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subId' to null.");
                }
            } else if (name.equals("body")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$body((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$body(null);
                }
            } else if (name.equals("errorCode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$errorCode((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'errorCode' to null.");
                }
            } else if (name.equals("deliveryStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deliveryStatus((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'deliveryStatus' to null.");
                }
            } else if (name.equals("attachmentTypeString")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$attachmentTypeString((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$attachmentTypeString(null);
                }
            } else if (name.equals("mmsDeliveryStatusString")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mmsDeliveryStatusString((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mmsDeliveryStatusString(null);
                }
            } else if (name.equals("readReportString")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$readReportString((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$readReportString(null);
                }
            } else if (name.equals("errorType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$errorType((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'errorType' to null.");
                }
            } else if (name.equals("messageSize")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$messageSize((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'messageSize' to null.");
                }
            } else if (name.equals("messageType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$messageType((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'messageType' to null.");
                }
            } else if (name.equals("mmsStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mmsStatus((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'mmsStatus' to null.");
                }
            } else if (name.equals("subject")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subject((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$subject(null);
                }
            } else if (name.equals("textContentType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$textContentType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$textContentType(null);
                }
            } else if (name.equals("parts")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$parts(null);
                } else {
                    objProxy.realmSet$parts(new RealmList<com.moez.QKSMS.model.MmsPart>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.moez.QKSMS.model.MmsPart item = com_moez_QKSMS_model_MmsPartRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$parts().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_moez_QKSMS_model_MessageRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class), false, Collections.<String>emptyList());
        io.realm.com_moez_QKSMS_model_MessageRealmProxy obj = new io.realm.com_moez_QKSMS_model_MessageRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.moez.QKSMS.model.Message copyOrUpdate(Realm realm, MessageColumnInfo columnInfo, com.moez.QKSMS.model.Message object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.Message) cachedRealmObject;
        }

        com.moez.QKSMS.model.Message realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.moez.QKSMS.model.Message.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_moez_QKSMS_model_MessageRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.moez.QKSMS.model.Message copy(Realm realm, MessageColumnInfo columnInfo, com.moez.QKSMS.model.Message newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.Message) cachedRealmObject;
        }

        com_moez_QKSMS_model_MessageRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_MessageRealmProxyInterface) newObject;

        Table table = realm.getTable(com.moez.QKSMS.model.Message.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.threadIdIndex, realmObjectSource.realmGet$threadId());
        builder.addInteger(columnInfo.contentIdIndex, realmObjectSource.realmGet$contentId());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());
        builder.addInteger(columnInfo.boxIdIndex, realmObjectSource.realmGet$boxId());
        builder.addString(columnInfo.typeIndex, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.dateIndex, realmObjectSource.realmGet$date());
        builder.addInteger(columnInfo.dateSentIndex, realmObjectSource.realmGet$dateSent());
        builder.addBoolean(columnInfo.seenIndex, realmObjectSource.realmGet$seen());
        builder.addBoolean(columnInfo.readIndex, realmObjectSource.realmGet$read());
        builder.addBoolean(columnInfo.lockedIndex, realmObjectSource.realmGet$locked());
        builder.addInteger(columnInfo.subIdIndex, realmObjectSource.realmGet$subId());
        builder.addString(columnInfo.bodyIndex, realmObjectSource.realmGet$body());
        builder.addInteger(columnInfo.errorCodeIndex, realmObjectSource.realmGet$errorCode());
        builder.addInteger(columnInfo.deliveryStatusIndex, realmObjectSource.realmGet$deliveryStatus());
        builder.addString(columnInfo.attachmentTypeStringIndex, realmObjectSource.realmGet$attachmentTypeString());
        builder.addString(columnInfo.mmsDeliveryStatusStringIndex, realmObjectSource.realmGet$mmsDeliveryStatusString());
        builder.addString(columnInfo.readReportStringIndex, realmObjectSource.realmGet$readReportString());
        builder.addInteger(columnInfo.errorTypeIndex, realmObjectSource.realmGet$errorType());
        builder.addInteger(columnInfo.messageSizeIndex, realmObjectSource.realmGet$messageSize());
        builder.addInteger(columnInfo.messageTypeIndex, realmObjectSource.realmGet$messageType());
        builder.addInteger(columnInfo.mmsStatusIndex, realmObjectSource.realmGet$mmsStatus());
        builder.addString(columnInfo.subjectIndex, realmObjectSource.realmGet$subject());
        builder.addString(columnInfo.textContentTypeIndex, realmObjectSource.realmGet$textContentType());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_moez_QKSMS_model_MessageRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.moez.QKSMS.model.MmsPart> partsList = realmObjectSource.realmGet$parts();
        if (partsList != null) {
            RealmList<com.moez.QKSMS.model.MmsPart> partsRealmList = realmObjectCopy.realmGet$parts();
            partsRealmList.clear();
            for (int i = 0; i < partsList.size(); i++) {
                com.moez.QKSMS.model.MmsPart partsItem = partsList.get(i);
                com.moez.QKSMS.model.MmsPart cacheparts = (com.moez.QKSMS.model.MmsPart) cache.get(partsItem);
                if (cacheparts != null) {
                    partsRealmList.add(cacheparts);
                } else {
                    partsRealmList.add(com_moez_QKSMS_model_MmsPartRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_MmsPartRealmProxy.MmsPartColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class), partsItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.moez.QKSMS.model.Message object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.threadIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$threadId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.contentIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$contentId(), false);
        String realmGet$address = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.boxIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$boxId(), false);
        String realmGet$type = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateSentIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$dateSent(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.seenIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$seen(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$read(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.lockedIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$locked(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.subIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$subId(), false);
        String realmGet$body = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.errorCodeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$errorCode(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.deliveryStatusIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$deliveryStatus(), false);
        String realmGet$attachmentTypeString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$attachmentTypeString();
        if (realmGet$attachmentTypeString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attachmentTypeStringIndex, rowIndex, realmGet$attachmentTypeString, false);
        }
        String realmGet$mmsDeliveryStatusString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$mmsDeliveryStatusString();
        if (realmGet$mmsDeliveryStatusString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mmsDeliveryStatusStringIndex, rowIndex, realmGet$mmsDeliveryStatusString, false);
        }
        String realmGet$readReportString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$readReportString();
        if (realmGet$readReportString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.readReportStringIndex, rowIndex, realmGet$readReportString, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.errorTypeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$errorType(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageSizeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$messageSize(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageTypeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$messageType(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.mmsStatusIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$mmsStatus(), false);
        String realmGet$subject = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$subject();
        if (realmGet$subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjectIndex, rowIndex, realmGet$subject, false);
        }
        String realmGet$textContentType = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$textContentType();
        if (realmGet$textContentType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textContentTypeIndex, rowIndex, realmGet$textContentType, false);
        }

        RealmList<com.moez.QKSMS.model.MmsPart> partsList = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$parts();
        if (partsList != null) {
            OsList partsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.partsIndex);
            for (com.moez.QKSMS.model.MmsPart partsItem : partsList) {
                Long cacheItemIndexparts = cache.get(partsItem);
                if (cacheItemIndexparts == null) {
                    cacheItemIndexparts = com_moez_QKSMS_model_MmsPartRealmProxy.insert(realm, partsItem, cache);
                }
                partsOsList.addRow(cacheItemIndexparts);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.Message object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.Message) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.threadIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$threadId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.contentIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$contentId(), false);
            String realmGet$address = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.boxIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$boxId(), false);
            String realmGet$type = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateSentIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$dateSent(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.seenIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$seen(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$read(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.lockedIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$locked(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.subIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$subId(), false);
            String realmGet$body = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.errorCodeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$errorCode(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.deliveryStatusIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$deliveryStatus(), false);
            String realmGet$attachmentTypeString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$attachmentTypeString();
            if (realmGet$attachmentTypeString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attachmentTypeStringIndex, rowIndex, realmGet$attachmentTypeString, false);
            }
            String realmGet$mmsDeliveryStatusString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$mmsDeliveryStatusString();
            if (realmGet$mmsDeliveryStatusString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mmsDeliveryStatusStringIndex, rowIndex, realmGet$mmsDeliveryStatusString, false);
            }
            String realmGet$readReportString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$readReportString();
            if (realmGet$readReportString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.readReportStringIndex, rowIndex, realmGet$readReportString, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.errorTypeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$errorType(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageSizeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$messageSize(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageTypeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$messageType(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.mmsStatusIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$mmsStatus(), false);
            String realmGet$subject = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$subject();
            if (realmGet$subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjectIndex, rowIndex, realmGet$subject, false);
            }
            String realmGet$textContentType = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$textContentType();
            if (realmGet$textContentType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textContentTypeIndex, rowIndex, realmGet$textContentType, false);
            }

            RealmList<com.moez.QKSMS.model.MmsPart> partsList = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$parts();
            if (partsList != null) {
                OsList partsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.partsIndex);
                for (com.moez.QKSMS.model.MmsPart partsItem : partsList) {
                    Long cacheItemIndexparts = cache.get(partsItem);
                    if (cacheItemIndexparts == null) {
                        cacheItemIndexparts = com_moez_QKSMS_model_MmsPartRealmProxy.insert(realm, partsItem, cache);
                    }
                    partsOsList.addRow(cacheItemIndexparts);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.moez.QKSMS.model.Message object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.threadIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$threadId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.contentIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$contentId(), false);
        String realmGet$address = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.boxIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$boxId(), false);
        String realmGet$type = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateSentIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$dateSent(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.seenIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$seen(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$read(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.lockedIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$locked(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.subIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$subId(), false);
        String realmGet$body = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bodyIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.errorCodeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$errorCode(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.deliveryStatusIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$deliveryStatus(), false);
        String realmGet$attachmentTypeString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$attachmentTypeString();
        if (realmGet$attachmentTypeString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attachmentTypeStringIndex, rowIndex, realmGet$attachmentTypeString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.attachmentTypeStringIndex, rowIndex, false);
        }
        String realmGet$mmsDeliveryStatusString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$mmsDeliveryStatusString();
        if (realmGet$mmsDeliveryStatusString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mmsDeliveryStatusStringIndex, rowIndex, realmGet$mmsDeliveryStatusString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mmsDeliveryStatusStringIndex, rowIndex, false);
        }
        String realmGet$readReportString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$readReportString();
        if (realmGet$readReportString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.readReportStringIndex, rowIndex, realmGet$readReportString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.readReportStringIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.errorTypeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$errorType(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageSizeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$messageSize(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.messageTypeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$messageType(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.mmsStatusIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$mmsStatus(), false);
        String realmGet$subject = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$subject();
        if (realmGet$subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjectIndex, rowIndex, realmGet$subject, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.subjectIndex, rowIndex, false);
        }
        String realmGet$textContentType = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$textContentType();
        if (realmGet$textContentType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textContentTypeIndex, rowIndex, realmGet$textContentType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.textContentTypeIndex, rowIndex, false);
        }

        OsList partsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.partsIndex);
        RealmList<com.moez.QKSMS.model.MmsPart> partsList = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$parts();
        if (partsList != null && partsList.size() == partsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = partsList.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.MmsPart partsItem = partsList.get(i);
                Long cacheItemIndexparts = cache.get(partsItem);
                if (cacheItemIndexparts == null) {
                    cacheItemIndexparts = com_moez_QKSMS_model_MmsPartRealmProxy.insertOrUpdate(realm, partsItem, cache);
                }
                partsOsList.setRow(i, cacheItemIndexparts);
            }
        } else {
            partsOsList.removeAll();
            if (partsList != null) {
                for (com.moez.QKSMS.model.MmsPart partsItem : partsList) {
                    Long cacheItemIndexparts = cache.get(partsItem);
                    if (cacheItemIndexparts == null) {
                        cacheItemIndexparts = com_moez_QKSMS_model_MmsPartRealmProxy.insertOrUpdate(realm, partsItem, cache);
                    }
                    partsOsList.addRow(cacheItemIndexparts);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.Message object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.Message) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.threadIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$threadId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.contentIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$contentId(), false);
            String realmGet$address = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.boxIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$boxId(), false);
            String realmGet$type = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateSentIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$dateSent(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.seenIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$seen(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$read(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.lockedIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$locked(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.subIdIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$subId(), false);
            String realmGet$body = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bodyIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.errorCodeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$errorCode(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.deliveryStatusIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$deliveryStatus(), false);
            String realmGet$attachmentTypeString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$attachmentTypeString();
            if (realmGet$attachmentTypeString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attachmentTypeStringIndex, rowIndex, realmGet$attachmentTypeString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.attachmentTypeStringIndex, rowIndex, false);
            }
            String realmGet$mmsDeliveryStatusString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$mmsDeliveryStatusString();
            if (realmGet$mmsDeliveryStatusString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mmsDeliveryStatusStringIndex, rowIndex, realmGet$mmsDeliveryStatusString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mmsDeliveryStatusStringIndex, rowIndex, false);
            }
            String realmGet$readReportString = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$readReportString();
            if (realmGet$readReportString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.readReportStringIndex, rowIndex, realmGet$readReportString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.readReportStringIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.errorTypeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$errorType(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageSizeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$messageSize(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.messageTypeIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$messageType(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.mmsStatusIndex, rowIndex, ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$mmsStatus(), false);
            String realmGet$subject = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$subject();
            if (realmGet$subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjectIndex, rowIndex, realmGet$subject, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.subjectIndex, rowIndex, false);
            }
            String realmGet$textContentType = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$textContentType();
            if (realmGet$textContentType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textContentTypeIndex, rowIndex, realmGet$textContentType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.textContentTypeIndex, rowIndex, false);
            }

            OsList partsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.partsIndex);
            RealmList<com.moez.QKSMS.model.MmsPart> partsList = ((com_moez_QKSMS_model_MessageRealmProxyInterface) object).realmGet$parts();
            if (partsList != null && partsList.size() == partsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = partsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.moez.QKSMS.model.MmsPart partsItem = partsList.get(i);
                    Long cacheItemIndexparts = cache.get(partsItem);
                    if (cacheItemIndexparts == null) {
                        cacheItemIndexparts = com_moez_QKSMS_model_MmsPartRealmProxy.insertOrUpdate(realm, partsItem, cache);
                    }
                    partsOsList.setRow(i, cacheItemIndexparts);
                }
            } else {
                partsOsList.removeAll();
                if (partsList != null) {
                    for (com.moez.QKSMS.model.MmsPart partsItem : partsList) {
                        Long cacheItemIndexparts = cache.get(partsItem);
                        if (cacheItemIndexparts == null) {
                            cacheItemIndexparts = com_moez_QKSMS_model_MmsPartRealmProxy.insertOrUpdate(realm, partsItem, cache);
                        }
                        partsOsList.addRow(cacheItemIndexparts);
                    }
                }
            }

        }
    }

    public static com.moez.QKSMS.model.Message createDetachedCopy(com.moez.QKSMS.model.Message realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.moez.QKSMS.model.Message unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.moez.QKSMS.model.Message();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.moez.QKSMS.model.Message) cachedObject.object;
            }
            unmanagedObject = (com.moez.QKSMS.model.Message) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_moez_QKSMS_model_MessageRealmProxyInterface unmanagedCopy = (com_moez_QKSMS_model_MessageRealmProxyInterface) unmanagedObject;
        com_moez_QKSMS_model_MessageRealmProxyInterface realmSource = (com_moez_QKSMS_model_MessageRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$threadId(realmSource.realmGet$threadId());
        unmanagedCopy.realmSet$contentId(realmSource.realmGet$contentId());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$boxId(realmSource.realmGet$boxId());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$dateSent(realmSource.realmGet$dateSent());
        unmanagedCopy.realmSet$seen(realmSource.realmGet$seen());
        unmanagedCopy.realmSet$read(realmSource.realmGet$read());
        unmanagedCopy.realmSet$locked(realmSource.realmGet$locked());
        unmanagedCopy.realmSet$subId(realmSource.realmGet$subId());
        unmanagedCopy.realmSet$body(realmSource.realmGet$body());
        unmanagedCopy.realmSet$errorCode(realmSource.realmGet$errorCode());
        unmanagedCopy.realmSet$deliveryStatus(realmSource.realmGet$deliveryStatus());
        unmanagedCopy.realmSet$attachmentTypeString(realmSource.realmGet$attachmentTypeString());
        unmanagedCopy.realmSet$mmsDeliveryStatusString(realmSource.realmGet$mmsDeliveryStatusString());
        unmanagedCopy.realmSet$readReportString(realmSource.realmGet$readReportString());
        unmanagedCopy.realmSet$errorType(realmSource.realmGet$errorType());
        unmanagedCopy.realmSet$messageSize(realmSource.realmGet$messageSize());
        unmanagedCopy.realmSet$messageType(realmSource.realmGet$messageType());
        unmanagedCopy.realmSet$mmsStatus(realmSource.realmGet$mmsStatus());
        unmanagedCopy.realmSet$subject(realmSource.realmGet$subject());
        unmanagedCopy.realmSet$textContentType(realmSource.realmGet$textContentType());

        // Deep copy of parts
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$parts(null);
        } else {
            RealmList<com.moez.QKSMS.model.MmsPart> managedpartsList = realmSource.realmGet$parts();
            RealmList<com.moez.QKSMS.model.MmsPart> unmanagedpartsList = new RealmList<com.moez.QKSMS.model.MmsPart>();
            unmanagedCopy.realmSet$parts(unmanagedpartsList);
            int nextDepth = currentDepth + 1;
            int size = managedpartsList.size();
            for (int i = 0; i < size; i++) {
                com.moez.QKSMS.model.MmsPart item = com_moez_QKSMS_model_MmsPartRealmProxy.createDetachedCopy(managedpartsList.get(i), nextDepth, maxDepth, cache);
                unmanagedpartsList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.moez.QKSMS.model.Message update(Realm realm, MessageColumnInfo columnInfo, com.moez.QKSMS.model.Message realmObject, com.moez.QKSMS.model.Message newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_moez_QKSMS_model_MessageRealmProxyInterface realmObjectTarget = (com_moez_QKSMS_model_MessageRealmProxyInterface) realmObject;
        com_moez_QKSMS_model_MessageRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_MessageRealmProxyInterface) newObject;
        Table table = realm.getTable(com.moez.QKSMS.model.Message.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.threadIdIndex, realmObjectSource.realmGet$threadId());
        builder.addInteger(columnInfo.contentIdIndex, realmObjectSource.realmGet$contentId());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());
        builder.addInteger(columnInfo.boxIdIndex, realmObjectSource.realmGet$boxId());
        builder.addString(columnInfo.typeIndex, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.dateIndex, realmObjectSource.realmGet$date());
        builder.addInteger(columnInfo.dateSentIndex, realmObjectSource.realmGet$dateSent());
        builder.addBoolean(columnInfo.seenIndex, realmObjectSource.realmGet$seen());
        builder.addBoolean(columnInfo.readIndex, realmObjectSource.realmGet$read());
        builder.addBoolean(columnInfo.lockedIndex, realmObjectSource.realmGet$locked());
        builder.addInteger(columnInfo.subIdIndex, realmObjectSource.realmGet$subId());
        builder.addString(columnInfo.bodyIndex, realmObjectSource.realmGet$body());
        builder.addInteger(columnInfo.errorCodeIndex, realmObjectSource.realmGet$errorCode());
        builder.addInteger(columnInfo.deliveryStatusIndex, realmObjectSource.realmGet$deliveryStatus());
        builder.addString(columnInfo.attachmentTypeStringIndex, realmObjectSource.realmGet$attachmentTypeString());
        builder.addString(columnInfo.mmsDeliveryStatusStringIndex, realmObjectSource.realmGet$mmsDeliveryStatusString());
        builder.addString(columnInfo.readReportStringIndex, realmObjectSource.realmGet$readReportString());
        builder.addInteger(columnInfo.errorTypeIndex, realmObjectSource.realmGet$errorType());
        builder.addInteger(columnInfo.messageSizeIndex, realmObjectSource.realmGet$messageSize());
        builder.addInteger(columnInfo.messageTypeIndex, realmObjectSource.realmGet$messageType());
        builder.addInteger(columnInfo.mmsStatusIndex, realmObjectSource.realmGet$mmsStatus());
        builder.addString(columnInfo.subjectIndex, realmObjectSource.realmGet$subject());
        builder.addString(columnInfo.textContentTypeIndex, realmObjectSource.realmGet$textContentType());

        RealmList<com.moez.QKSMS.model.MmsPart> partsList = realmObjectSource.realmGet$parts();
        if (partsList != null) {
            RealmList<com.moez.QKSMS.model.MmsPart> partsManagedCopy = new RealmList<com.moez.QKSMS.model.MmsPart>();
            for (int i = 0; i < partsList.size(); i++) {
                com.moez.QKSMS.model.MmsPart partsItem = partsList.get(i);
                com.moez.QKSMS.model.MmsPart cacheparts = (com.moez.QKSMS.model.MmsPart) cache.get(partsItem);
                if (cacheparts != null) {
                    partsManagedCopy.add(cacheparts);
                } else {
                    partsManagedCopy.add(com_moez_QKSMS_model_MmsPartRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_MmsPartRealmProxy.MmsPartColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class), partsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.partsIndex, partsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.partsIndex, new RealmList<com.moez.QKSMS.model.MmsPart>());
        }

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Message = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{threadId:");
        stringBuilder.append(realmGet$threadId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contentId:");
        stringBuilder.append(realmGet$contentId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{boxId:");
        stringBuilder.append(realmGet$boxId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dateSent:");
        stringBuilder.append(realmGet$dateSent());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{seen:");
        stringBuilder.append(realmGet$seen());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{read:");
        stringBuilder.append(realmGet$read());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{locked:");
        stringBuilder.append(realmGet$locked());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subId:");
        stringBuilder.append(realmGet$subId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{body:");
        stringBuilder.append(realmGet$body());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{errorCode:");
        stringBuilder.append(realmGet$errorCode());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deliveryStatus:");
        stringBuilder.append(realmGet$deliveryStatus());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachmentTypeString:");
        stringBuilder.append(realmGet$attachmentTypeString());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mmsDeliveryStatusString:");
        stringBuilder.append(realmGet$mmsDeliveryStatusString());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{readReportString:");
        stringBuilder.append(realmGet$readReportString());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{errorType:");
        stringBuilder.append(realmGet$errorType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{messageSize:");
        stringBuilder.append(realmGet$messageSize());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{messageType:");
        stringBuilder.append(realmGet$messageType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mmsStatus:");
        stringBuilder.append(realmGet$mmsStatus());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subject:");
        stringBuilder.append(realmGet$subject());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{textContentType:");
        stringBuilder.append(realmGet$textContentType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{parts:");
        stringBuilder.append("RealmList<MmsPart>[").append(realmGet$parts().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_moez_QKSMS_model_MessageRealmProxy aMessage = (com_moez_QKSMS_model_MessageRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMessage.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMessage.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMessage.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
