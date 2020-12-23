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
public class com_moez_QKSMS_model_ScheduledMessageRealmProxy extends com.moez.QKSMS.model.ScheduledMessage
    implements RealmObjectProxy, com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface {

    static final class ScheduledMessageColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long dateIndex;
        long subIdIndex;
        long recipientsIndex;
        long sendAsGroupIndex;
        long bodyIndex;
        long attachmentsIndex;

        ScheduledMessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ScheduledMessage");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.subIdIndex = addColumnDetails("subId", "subId", objectSchemaInfo);
            this.recipientsIndex = addColumnDetails("recipients", "recipients", objectSchemaInfo);
            this.sendAsGroupIndex = addColumnDetails("sendAsGroup", "sendAsGroup", objectSchemaInfo);
            this.bodyIndex = addColumnDetails("body", "body", objectSchemaInfo);
            this.attachmentsIndex = addColumnDetails("attachments", "attachments", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ScheduledMessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ScheduledMessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ScheduledMessageColumnInfo src = (ScheduledMessageColumnInfo) rawSrc;
            final ScheduledMessageColumnInfo dst = (ScheduledMessageColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.dateIndex = src.dateIndex;
            dst.subIdIndex = src.subIdIndex;
            dst.recipientsIndex = src.recipientsIndex;
            dst.sendAsGroupIndex = src.sendAsGroupIndex;
            dst.bodyIndex = src.bodyIndex;
            dst.attachmentsIndex = src.attachmentsIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ScheduledMessageColumnInfo columnInfo;
    private ProxyState<com.moez.QKSMS.model.ScheduledMessage> proxyState;
    private RealmList<String> recipientsRealmList;
    private RealmList<String> attachmentsRealmList;

    com_moez_QKSMS_model_ScheduledMessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ScheduledMessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.moez.QKSMS.model.ScheduledMessage>(this);
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
    public RealmList<String> realmGet$recipients() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (recipientsRealmList != null) {
            return recipientsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.recipientsIndex, RealmFieldType.STRING_LIST);
            recipientsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return recipientsRealmList;
        }
    }

    @Override
    public void realmSet$recipients(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("recipients")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.recipientsIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$sendAsGroup() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.sendAsGroupIndex);
    }

    @Override
    public void realmSet$sendAsGroup(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.sendAsGroupIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.sendAsGroupIndex, value);
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
    public RealmList<String> realmGet$attachments() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (attachmentsRealmList != null) {
            return attachmentsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.attachmentsIndex, RealmFieldType.STRING_LIST);
            attachmentsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return attachmentsRealmList;
        }
    }

    @Override
    public void realmSet$attachments(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("attachments")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.attachmentsIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ScheduledMessage", 7, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("subId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedValueListProperty("recipients", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        builder.addPersistedProperty("sendAsGroup", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("body", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedValueListProperty("attachments", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ScheduledMessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ScheduledMessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ScheduledMessage";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ScheduledMessage";
    }

    @SuppressWarnings("cast")
    public static com.moez.QKSMS.model.ScheduledMessage createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.moez.QKSMS.model.ScheduledMessage obj = null;
        if (update) {
            Table table = realm.getTable(com.moez.QKSMS.model.ScheduledMessage.class);
            ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ScheduledMessage.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ScheduledMessage.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("recipients")) {
                excludeFields.add("recipients");
            }
            if (json.has("attachments")) {
                excludeFields.add("attachments");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.ScheduledMessage.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.ScheduledMessage.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface objProxy = (com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) obj;
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                objProxy.realmSet$date((long) json.getLong("date"));
            }
        }
        if (json.has("subId")) {
            if (json.isNull("subId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subId' to null.");
            } else {
                objProxy.realmSet$subId((int) json.getInt("subId"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$recipients(), json, "recipients");
        if (json.has("sendAsGroup")) {
            if (json.isNull("sendAsGroup")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sendAsGroup' to null.");
            } else {
                objProxy.realmSet$sendAsGroup((boolean) json.getBoolean("sendAsGroup"));
            }
        }
        if (json.has("body")) {
            if (json.isNull("body")) {
                objProxy.realmSet$body(null);
            } else {
                objProxy.realmSet$body((String) json.getString("body"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$attachments(), json, "attachments");
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.moez.QKSMS.model.ScheduledMessage createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.moez.QKSMS.model.ScheduledMessage obj = new com.moez.QKSMS.model.ScheduledMessage();
        final com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface objProxy = (com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) obj;
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
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
            } else if (name.equals("subId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subId' to null.");
                }
            } else if (name.equals("recipients")) {
                objProxy.realmSet$recipients(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else if (name.equals("sendAsGroup")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sendAsGroup((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sendAsGroup' to null.");
                }
            } else if (name.equals("body")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$body((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$body(null);
                }
            } else if (name.equals("attachments")) {
                objProxy.realmSet$attachments(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
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

    private static com_moez_QKSMS_model_ScheduledMessageRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ScheduledMessage.class), false, Collections.<String>emptyList());
        io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy obj = new io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.moez.QKSMS.model.ScheduledMessage copyOrUpdate(Realm realm, ScheduledMessageColumnInfo columnInfo, com.moez.QKSMS.model.ScheduledMessage object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.moez.QKSMS.model.ScheduledMessage) cachedRealmObject;
        }

        com.moez.QKSMS.model.ScheduledMessage realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.moez.QKSMS.model.ScheduledMessage.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.moez.QKSMS.model.ScheduledMessage copy(Realm realm, ScheduledMessageColumnInfo columnInfo, com.moez.QKSMS.model.ScheduledMessage newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.ScheduledMessage) cachedRealmObject;
        }

        com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) newObject;

        Table table = realm.getTable(com.moez.QKSMS.model.ScheduledMessage.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.dateIndex, realmObjectSource.realmGet$date());
        builder.addInteger(columnInfo.subIdIndex, realmObjectSource.realmGet$subId());
        builder.addStringList(columnInfo.recipientsIndex, realmObjectSource.realmGet$recipients());
        builder.addBoolean(columnInfo.sendAsGroupIndex, realmObjectSource.realmGet$sendAsGroup());
        builder.addString(columnInfo.bodyIndex, realmObjectSource.realmGet$body());
        builder.addStringList(columnInfo.attachmentsIndex, realmObjectSource.realmGet$attachments());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.moez.QKSMS.model.ScheduledMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.ScheduledMessage.class);
        long tableNativePtr = table.getNativePtr();
        ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ScheduledMessage.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.subIdIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$subId(), false);

        RealmList<java.lang.String> recipientsList = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$recipients();
        if (recipientsList != null) {
            OsList recipientsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientsIndex);
            for (java.lang.String recipientsItem : recipientsList) {
                if (recipientsItem == null) {
                    recipientsOsList.addNull();
                } else {
                    recipientsOsList.addString(recipientsItem);
                }
            }
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.sendAsGroupIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$sendAsGroup(), false);
        String realmGet$body = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
        }

        RealmList<java.lang.String> attachmentsList = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            OsList attachmentsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.attachmentsIndex);
            for (java.lang.String attachmentsItem : attachmentsList) {
                if (attachmentsItem == null) {
                    attachmentsOsList.addNull();
                } else {
                    attachmentsOsList.addString(attachmentsItem);
                }
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.ScheduledMessage.class);
        long tableNativePtr = table.getNativePtr();
        ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ScheduledMessage.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.ScheduledMessage object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.ScheduledMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.subIdIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$subId(), false);

            RealmList<java.lang.String> recipientsList = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$recipients();
            if (recipientsList != null) {
                OsList recipientsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientsIndex);
                for (java.lang.String recipientsItem : recipientsList) {
                    if (recipientsItem == null) {
                        recipientsOsList.addNull();
                    } else {
                        recipientsOsList.addString(recipientsItem);
                    }
                }
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.sendAsGroupIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$sendAsGroup(), false);
            String realmGet$body = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
            }

            RealmList<java.lang.String> attachmentsList = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null) {
                OsList attachmentsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.attachmentsIndex);
                for (java.lang.String attachmentsItem : attachmentsList) {
                    if (attachmentsItem == null) {
                        attachmentsOsList.addNull();
                    } else {
                        attachmentsOsList.addString(attachmentsItem);
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.moez.QKSMS.model.ScheduledMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.ScheduledMessage.class);
        long tableNativePtr = table.getNativePtr();
        ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ScheduledMessage.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.subIdIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$subId(), false);

        OsList recipientsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientsIndex);
        recipientsOsList.removeAll();
        RealmList<java.lang.String> recipientsList = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$recipients();
        if (recipientsList != null) {
            for (java.lang.String recipientsItem : recipientsList) {
                if (recipientsItem == null) {
                    recipientsOsList.addNull();
                } else {
                    recipientsOsList.addString(recipientsItem);
                }
            }
        }

        Table.nativeSetBoolean(tableNativePtr, columnInfo.sendAsGroupIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$sendAsGroup(), false);
        String realmGet$body = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bodyIndex, rowIndex, false);
        }

        OsList attachmentsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.attachmentsIndex);
        attachmentsOsList.removeAll();
        RealmList<java.lang.String> attachmentsList = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            for (java.lang.String attachmentsItem : attachmentsList) {
                if (attachmentsItem == null) {
                    attachmentsOsList.addNull();
                } else {
                    attachmentsOsList.addString(attachmentsItem);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.ScheduledMessage.class);
        long tableNativePtr = table.getNativePtr();
        ScheduledMessageColumnInfo columnInfo = (ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ScheduledMessage.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.ScheduledMessage object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.ScheduledMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.subIdIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$subId(), false);

            OsList recipientsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientsIndex);
            recipientsOsList.removeAll();
            RealmList<java.lang.String> recipientsList = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$recipients();
            if (recipientsList != null) {
                for (java.lang.String recipientsItem : recipientsList) {
                    if (recipientsItem == null) {
                        recipientsOsList.addNull();
                    } else {
                        recipientsOsList.addString(recipientsItem);
                    }
                }
            }

            Table.nativeSetBoolean(tableNativePtr, columnInfo.sendAsGroupIndex, rowIndex, ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$sendAsGroup(), false);
            String realmGet$body = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bodyIndex, rowIndex, false);
            }

            OsList attachmentsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.attachmentsIndex);
            attachmentsOsList.removeAll();
            RealmList<java.lang.String> attachmentsList = ((com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null) {
                for (java.lang.String attachmentsItem : attachmentsList) {
                    if (attachmentsItem == null) {
                        attachmentsOsList.addNull();
                    } else {
                        attachmentsOsList.addString(attachmentsItem);
                    }
                }
            }

        }
    }

    public static com.moez.QKSMS.model.ScheduledMessage createDetachedCopy(com.moez.QKSMS.model.ScheduledMessage realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.moez.QKSMS.model.ScheduledMessage unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.moez.QKSMS.model.ScheduledMessage();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.moez.QKSMS.model.ScheduledMessage) cachedObject.object;
            }
            unmanagedObject = (com.moez.QKSMS.model.ScheduledMessage) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface unmanagedCopy = (com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) unmanagedObject;
        com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface realmSource = (com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$subId(realmSource.realmGet$subId());

        unmanagedCopy.realmSet$recipients(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$recipients().addAll(realmSource.realmGet$recipients());
        unmanagedCopy.realmSet$sendAsGroup(realmSource.realmGet$sendAsGroup());
        unmanagedCopy.realmSet$body(realmSource.realmGet$body());

        unmanagedCopy.realmSet$attachments(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$attachments().addAll(realmSource.realmGet$attachments());

        return unmanagedObject;
    }

    static com.moez.QKSMS.model.ScheduledMessage update(Realm realm, ScheduledMessageColumnInfo columnInfo, com.moez.QKSMS.model.ScheduledMessage realmObject, com.moez.QKSMS.model.ScheduledMessage newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface realmObjectTarget = (com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) realmObject;
        com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface) newObject;
        Table table = realm.getTable(com.moez.QKSMS.model.ScheduledMessage.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.dateIndex, realmObjectSource.realmGet$date());
        builder.addInteger(columnInfo.subIdIndex, realmObjectSource.realmGet$subId());
        builder.addStringList(columnInfo.recipientsIndex, realmObjectSource.realmGet$recipients());
        builder.addBoolean(columnInfo.sendAsGroupIndex, realmObjectSource.realmGet$sendAsGroup());
        builder.addString(columnInfo.bodyIndex, realmObjectSource.realmGet$body());
        builder.addStringList(columnInfo.attachmentsIndex, realmObjectSource.realmGet$attachments());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ScheduledMessage = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subId:");
        stringBuilder.append(realmGet$subId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipients:");
        stringBuilder.append("RealmList<String>[").append(realmGet$recipients().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sendAsGroup:");
        stringBuilder.append(realmGet$sendAsGroup());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{body:");
        stringBuilder.append(realmGet$body());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachments:");
        stringBuilder.append("RealmList<String>[").append(realmGet$attachments().size()).append("]");
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
        com_moez_QKSMS_model_ScheduledMessageRealmProxy aScheduledMessage = (com_moez_QKSMS_model_ScheduledMessageRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aScheduledMessage.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aScheduledMessage.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aScheduledMessage.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
