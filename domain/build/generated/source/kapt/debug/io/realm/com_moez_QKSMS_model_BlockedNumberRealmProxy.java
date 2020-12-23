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
public class com_moez_QKSMS_model_BlockedNumberRealmProxy extends com.moez.QKSMS.model.BlockedNumber
    implements RealmObjectProxy, com_moez_QKSMS_model_BlockedNumberRealmProxyInterface {

    static final class BlockedNumberColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long addressIndex;

        BlockedNumberColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BlockedNumber");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.addressIndex = addColumnDetails("address", "address", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BlockedNumberColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BlockedNumberColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BlockedNumberColumnInfo src = (BlockedNumberColumnInfo) rawSrc;
            final BlockedNumberColumnInfo dst = (BlockedNumberColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.addressIndex = src.addressIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private BlockedNumberColumnInfo columnInfo;
    private ProxyState<com.moez.QKSMS.model.BlockedNumber> proxyState;

    com_moez_QKSMS_model_BlockedNumberRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BlockedNumberColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.moez.QKSMS.model.BlockedNumber>(this);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("BlockedNumber", 2, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BlockedNumberColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BlockedNumberColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BlockedNumber";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BlockedNumber";
    }

    @SuppressWarnings("cast")
    public static com.moez.QKSMS.model.BlockedNumber createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.moez.QKSMS.model.BlockedNumber obj = null;
        if (update) {
            Table table = realm.getTable(com.moez.QKSMS.model.BlockedNumber.class);
            BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.BlockedNumber.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.moez.QKSMS.model.BlockedNumber.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.BlockedNumber.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.BlockedNumber.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_moez_QKSMS_model_BlockedNumberRealmProxyInterface objProxy = (com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) obj;
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.moez.QKSMS.model.BlockedNumber createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.moez.QKSMS.model.BlockedNumber obj = new com.moez.QKSMS.model.BlockedNumber();
        final com_moez_QKSMS_model_BlockedNumberRealmProxyInterface objProxy = (com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) obj;
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
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
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

    private static com_moez_QKSMS_model_BlockedNumberRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.moez.QKSMS.model.BlockedNumber.class), false, Collections.<String>emptyList());
        io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy obj = new io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.moez.QKSMS.model.BlockedNumber copyOrUpdate(Realm realm, BlockedNumberColumnInfo columnInfo, com.moez.QKSMS.model.BlockedNumber object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.moez.QKSMS.model.BlockedNumber) cachedRealmObject;
        }

        com.moez.QKSMS.model.BlockedNumber realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.moez.QKSMS.model.BlockedNumber.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.moez.QKSMS.model.BlockedNumber copy(Realm realm, BlockedNumberColumnInfo columnInfo, com.moez.QKSMS.model.BlockedNumber newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.BlockedNumber) cachedRealmObject;
        }

        com_moez_QKSMS_model_BlockedNumberRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) newObject;

        Table table = realm.getTable(com.moez.QKSMS.model.BlockedNumber.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.moez.QKSMS.model.BlockedNumber object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.BlockedNumber.class);
        long tableNativePtr = table.getNativePtr();
        BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.BlockedNumber.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$address = ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.BlockedNumber.class);
        long tableNativePtr = table.getNativePtr();
        BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.BlockedNumber.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.BlockedNumber object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.BlockedNumber) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$address = ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.moez.QKSMS.model.BlockedNumber object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.BlockedNumber.class);
        long tableNativePtr = table.getNativePtr();
        BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.BlockedNumber.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$address = ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.BlockedNumber.class);
        long tableNativePtr = table.getNativePtr();
        BlockedNumberColumnInfo columnInfo = (BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.BlockedNumber.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.BlockedNumber object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.BlockedNumber) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$address = ((com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
            }
        }
    }

    public static com.moez.QKSMS.model.BlockedNumber createDetachedCopy(com.moez.QKSMS.model.BlockedNumber realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.moez.QKSMS.model.BlockedNumber unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.moez.QKSMS.model.BlockedNumber();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.moez.QKSMS.model.BlockedNumber) cachedObject.object;
            }
            unmanagedObject = (com.moez.QKSMS.model.BlockedNumber) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_moez_QKSMS_model_BlockedNumberRealmProxyInterface unmanagedCopy = (com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) unmanagedObject;
        com_moez_QKSMS_model_BlockedNumberRealmProxyInterface realmSource = (com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());

        return unmanagedObject;
    }

    static com.moez.QKSMS.model.BlockedNumber update(Realm realm, BlockedNumberColumnInfo columnInfo, com.moez.QKSMS.model.BlockedNumber realmObject, com.moez.QKSMS.model.BlockedNumber newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_moez_QKSMS_model_BlockedNumberRealmProxyInterface realmObjectTarget = (com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) realmObject;
        com_moez_QKSMS_model_BlockedNumberRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_BlockedNumberRealmProxyInterface) newObject;
        Table table = realm.getTable(com.moez.QKSMS.model.BlockedNumber.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("BlockedNumber = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address());
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
        com_moez_QKSMS_model_BlockedNumberRealmProxy aBlockedNumber = (com_moez_QKSMS_model_BlockedNumberRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBlockedNumber.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlockedNumber.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBlockedNumber.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
