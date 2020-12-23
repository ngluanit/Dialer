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
import io.realm.internal.UncheckedRow;
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
public class com_moez_QKSMS_model_MmsPartRealmProxy extends com.moez.QKSMS.model.MmsPart
    implements RealmObjectProxy, com_moez_QKSMS_model_MmsPartRealmProxyInterface {

    static final class MmsPartColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long typeIndex;
        long seqIndex;
        long nameIndex;
        long textIndex;

        MmsPartColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MmsPart");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.seqIndex = addColumnDetails("seq", "seq", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            addBacklinkDetails(schemaInfo, "messages", "Message", "parts");
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MmsPartColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MmsPartColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MmsPartColumnInfo src = (MmsPartColumnInfo) rawSrc;
            final MmsPartColumnInfo dst = (MmsPartColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.typeIndex = src.typeIndex;
            dst.seqIndex = src.seqIndex;
            dst.nameIndex = src.nameIndex;
            dst.textIndex = src.textIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MmsPartColumnInfo columnInfo;
    private ProxyState<com.moez.QKSMS.model.MmsPart> proxyState;
    private RealmResults<com.moez.QKSMS.model.Message> messagesBacklinks;

    com_moez_QKSMS_model_MmsPartRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MmsPartColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.moez.QKSMS.model.MmsPart>(this);
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
    public int realmGet$seq() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.seqIndex);
    }

    @Override
    public void realmSet$seq(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.seqIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.seqIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$text() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.textIndex);
    }

    @Override
    public void realmSet$text(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.textIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.textIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.textIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.textIndex, value);
    }

    @Override
    public RealmResults<com.moez.QKSMS.model.Message> realmGet$messages() {
        BaseRealm realm = proxyState.getRealm$realm();
        realm.checkIfValid();
        proxyState.getRow$realm().checkIfAttached();
        if (messagesBacklinks == null) {
            messagesBacklinks = RealmResults.createBacklinkResults(realm, proxyState.getRow$realm(), com.moez.QKSMS.model.Message.class, "parts");
        }
        return messagesBacklinks;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MmsPart", 5, 1);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("seq", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("text", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addComputedLinkProperty("messages", "Message", "parts");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MmsPartColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MmsPartColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MmsPart";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MmsPart";
    }

    @SuppressWarnings("cast")
    public static com.moez.QKSMS.model.MmsPart createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.moez.QKSMS.model.MmsPart obj = null;
        if (update) {
            Table table = realm.getTable(com.moez.QKSMS.model.MmsPart.class);
            MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_moez_QKSMS_model_MmsPartRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_moez_QKSMS_model_MmsPartRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.MmsPart.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_moez_QKSMS_model_MmsPartRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.MmsPart.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_moez_QKSMS_model_MmsPartRealmProxyInterface objProxy = (com_moez_QKSMS_model_MmsPartRealmProxyInterface) obj;
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("seq")) {
            if (json.isNull("seq")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seq' to null.");
            } else {
                objProxy.realmSet$seq((int) json.getInt("seq"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("text")) {
            if (json.isNull("text")) {
                objProxy.realmSet$text(null);
            } else {
                objProxy.realmSet$text((String) json.getString("text"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.moez.QKSMS.model.MmsPart createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.moez.QKSMS.model.MmsPart obj = new com.moez.QKSMS.model.MmsPart();
        final com_moez_QKSMS_model_MmsPartRealmProxyInterface objProxy = (com_moez_QKSMS_model_MmsPartRealmProxyInterface) obj;
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
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("seq")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seq((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seq' to null.");
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("text")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$text((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$text(null);
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

    private static com_moez_QKSMS_model_MmsPartRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class), false, Collections.<String>emptyList());
        io.realm.com_moez_QKSMS_model_MmsPartRealmProxy obj = new io.realm.com_moez_QKSMS_model_MmsPartRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.moez.QKSMS.model.MmsPart copyOrUpdate(Realm realm, MmsPartColumnInfo columnInfo, com.moez.QKSMS.model.MmsPart object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.moez.QKSMS.model.MmsPart) cachedRealmObject;
        }

        com.moez.QKSMS.model.MmsPart realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.moez.QKSMS.model.MmsPart.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_moez_QKSMS_model_MmsPartRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.moez.QKSMS.model.MmsPart copy(Realm realm, MmsPartColumnInfo columnInfo, com.moez.QKSMS.model.MmsPart newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.MmsPart) cachedRealmObject;
        }

        com_moez_QKSMS_model_MmsPartRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_MmsPartRealmProxyInterface) newObject;

        Table table = realm.getTable(com.moez.QKSMS.model.MmsPart.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.typeIndex, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.seqIndex, realmObjectSource.realmGet$seq());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.textIndex, realmObjectSource.realmGet$text());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_moez_QKSMS_model_MmsPartRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.moez.QKSMS.model.MmsPart object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.MmsPart.class);
        long tableNativePtr = table.getNativePtr();
        MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$type = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.seqIndex, rowIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$seq(), false);
        String realmGet$name = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$text = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.MmsPart.class);
        long tableNativePtr = table.getNativePtr();
        MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.MmsPart object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.MmsPart) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$type = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.seqIndex, rowIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$seq(), false);
            String realmGet$name = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$text = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.moez.QKSMS.model.MmsPart object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.MmsPart.class);
        long tableNativePtr = table.getNativePtr();
        MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$type = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.seqIndex, rowIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$seq(), false);
        String realmGet$name = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$text = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.MmsPart.class);
        long tableNativePtr = table.getNativePtr();
        MmsPartColumnInfo columnInfo = (MmsPartColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.MmsPart object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.MmsPart) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$type = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.seqIndex, rowIndex, ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$seq(), false);
            String realmGet$name = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$text = ((com_moez_QKSMS_model_MmsPartRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
            }
        }
    }

    public static com.moez.QKSMS.model.MmsPart createDetachedCopy(com.moez.QKSMS.model.MmsPart realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.moez.QKSMS.model.MmsPart unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.moez.QKSMS.model.MmsPart();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.moez.QKSMS.model.MmsPart) cachedObject.object;
            }
            unmanagedObject = (com.moez.QKSMS.model.MmsPart) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_moez_QKSMS_model_MmsPartRealmProxyInterface unmanagedCopy = (com_moez_QKSMS_model_MmsPartRealmProxyInterface) unmanagedObject;
        com_moez_QKSMS_model_MmsPartRealmProxyInterface realmSource = (com_moez_QKSMS_model_MmsPartRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$seq(realmSource.realmGet$seq());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$text(realmSource.realmGet$text());

        return unmanagedObject;
    }

    static com.moez.QKSMS.model.MmsPart update(Realm realm, MmsPartColumnInfo columnInfo, com.moez.QKSMS.model.MmsPart realmObject, com.moez.QKSMS.model.MmsPart newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_moez_QKSMS_model_MmsPartRealmProxyInterface realmObjectTarget = (com_moez_QKSMS_model_MmsPartRealmProxyInterface) realmObject;
        com_moez_QKSMS_model_MmsPartRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_MmsPartRealmProxyInterface) newObject;
        Table table = realm.getTable(com.moez.QKSMS.model.MmsPart.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.typeIndex, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.seqIndex, realmObjectSource.realmGet$seq());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.textIndex, realmObjectSource.realmGet$text());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MmsPart = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{seq:");
        stringBuilder.append(realmGet$seq());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{text:");
        stringBuilder.append(realmGet$text() != null ? realmGet$text() : "null");
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
        com_moez_QKSMS_model_MmsPartRealmProxy aMmsPart = (com_moez_QKSMS_model_MmsPartRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMmsPart.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMmsPart.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMmsPart.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
