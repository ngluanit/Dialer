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
public class com_moez_QKSMS_model_RecipientRealmProxy extends com.moez.QKSMS.model.Recipient
    implements RealmObjectProxy, com_moez_QKSMS_model_RecipientRealmProxyInterface {

    static final class RecipientColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long addressIndex;
        long contactIndex;
        long lastUpdateIndex;

        RecipientColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Recipient");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.addressIndex = addColumnDetails("address", "address", objectSchemaInfo);
            this.contactIndex = addColumnDetails("contact", "contact", objectSchemaInfo);
            this.lastUpdateIndex = addColumnDetails("lastUpdate", "lastUpdate", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RecipientColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RecipientColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RecipientColumnInfo src = (RecipientColumnInfo) rawSrc;
            final RecipientColumnInfo dst = (RecipientColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.addressIndex = src.addressIndex;
            dst.contactIndex = src.contactIndex;
            dst.lastUpdateIndex = src.lastUpdateIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RecipientColumnInfo columnInfo;
    private ProxyState<com.moez.QKSMS.model.Recipient> proxyState;

    com_moez_QKSMS_model_RecipientRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RecipientColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.moez.QKSMS.model.Recipient>(this);
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

    @Override
    public com.moez.QKSMS.model.Contact realmGet$contact() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.contactIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.moez.QKSMS.model.Contact.class, proxyState.getRow$realm().getLink(columnInfo.contactIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$contact(com.moez.QKSMS.model.Contact value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("contact")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.contactIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.contactIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.contactIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.contactIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$lastUpdate() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastUpdateIndex);
    }

    @Override
    public void realmSet$lastUpdate(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastUpdateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastUpdateIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Recipient", 4, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("contact", RealmFieldType.OBJECT, "Contact");
        builder.addPersistedProperty("lastUpdate", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RecipientColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RecipientColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Recipient";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Recipient";
    }

    @SuppressWarnings("cast")
    public static com.moez.QKSMS.model.Recipient createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.moez.QKSMS.model.Recipient obj = null;
        if (update) {
            Table table = realm.getTable(com.moez.QKSMS.model.Recipient.class);
            RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_moez_QKSMS_model_RecipientRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("contact")) {
                excludeFields.add("contact");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_moez_QKSMS_model_RecipientRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.Recipient.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_moez_QKSMS_model_RecipientRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.Recipient.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_moez_QKSMS_model_RecipientRealmProxyInterface objProxy = (com_moez_QKSMS_model_RecipientRealmProxyInterface) obj;
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("contact")) {
            if (json.isNull("contact")) {
                objProxy.realmSet$contact(null);
            } else {
                com.moez.QKSMS.model.Contact contactObj = com_moez_QKSMS_model_ContactRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("contact"), update);
                objProxy.realmSet$contact(contactObj);
            }
        }
        if (json.has("lastUpdate")) {
            if (json.isNull("lastUpdate")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastUpdate' to null.");
            } else {
                objProxy.realmSet$lastUpdate((long) json.getLong("lastUpdate"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.moez.QKSMS.model.Recipient createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.moez.QKSMS.model.Recipient obj = new com.moez.QKSMS.model.Recipient();
        final com_moez_QKSMS_model_RecipientRealmProxyInterface objProxy = (com_moez_QKSMS_model_RecipientRealmProxyInterface) obj;
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
            } else if (name.equals("contact")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$contact(null);
                } else {
                    com.moez.QKSMS.model.Contact contactObj = com_moez_QKSMS_model_ContactRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$contact(contactObj);
                }
            } else if (name.equals("lastUpdate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastUpdate((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastUpdate' to null.");
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

    private static com_moez_QKSMS_model_RecipientRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class), false, Collections.<String>emptyList());
        io.realm.com_moez_QKSMS_model_RecipientRealmProxy obj = new io.realm.com_moez_QKSMS_model_RecipientRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.moez.QKSMS.model.Recipient copyOrUpdate(Realm realm, RecipientColumnInfo columnInfo, com.moez.QKSMS.model.Recipient object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.moez.QKSMS.model.Recipient) cachedRealmObject;
        }

        com.moez.QKSMS.model.Recipient realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.moez.QKSMS.model.Recipient.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_moez_QKSMS_model_RecipientRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.moez.QKSMS.model.Recipient copy(Realm realm, RecipientColumnInfo columnInfo, com.moez.QKSMS.model.Recipient newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.Recipient) cachedRealmObject;
        }

        com_moez_QKSMS_model_RecipientRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_RecipientRealmProxyInterface) newObject;

        Table table = realm.getTable(com.moez.QKSMS.model.Recipient.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());
        builder.addInteger(columnInfo.lastUpdateIndex, realmObjectSource.realmGet$lastUpdate());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_moez_QKSMS_model_RecipientRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.moez.QKSMS.model.Contact contactObj = realmObjectSource.realmGet$contact();
        if (contactObj == null) {
            realmObjectCopy.realmSet$contact(null);
        } else {
            com.moez.QKSMS.model.Contact cachecontact = (com.moez.QKSMS.model.Contact) cache.get(contactObj);
            if (cachecontact != null) {
                realmObjectCopy.realmSet$contact(cachecontact);
            } else {
                realmObjectCopy.realmSet$contact(com_moez_QKSMS_model_ContactRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class), contactObj, update, cache, flags));
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.moez.QKSMS.model.Recipient object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.Recipient.class);
        long tableNativePtr = table.getNativePtr();
        RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$address = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        }

        com.moez.QKSMS.model.Contact contactObj = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$contact();
        if (contactObj != null) {
            Long cachecontact = cache.get(contactObj);
            if (cachecontact == null) {
                cachecontact = com_moez_QKSMS_model_ContactRealmProxy.insert(realm, contactObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.contactIndex, rowIndex, cachecontact, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateIndex, rowIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$lastUpdate(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.Recipient.class);
        long tableNativePtr = table.getNativePtr();
        RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.Recipient object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.Recipient) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$address = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            }

            com.moez.QKSMS.model.Contact contactObj = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$contact();
            if (contactObj != null) {
                Long cachecontact = cache.get(contactObj);
                if (cachecontact == null) {
                    cachecontact = com_moez_QKSMS_model_ContactRealmProxy.insert(realm, contactObj, cache);
                }
                table.setLink(columnInfo.contactIndex, rowIndex, cachecontact, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateIndex, rowIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$lastUpdate(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.moez.QKSMS.model.Recipient object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.Recipient.class);
        long tableNativePtr = table.getNativePtr();
        RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$address = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
        }

        com.moez.QKSMS.model.Contact contactObj = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$contact();
        if (contactObj != null) {
            Long cachecontact = cache.get(contactObj);
            if (cachecontact == null) {
                cachecontact = com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, contactObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.contactIndex, rowIndex, cachecontact, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.contactIndex, rowIndex);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateIndex, rowIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$lastUpdate(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.Recipient.class);
        long tableNativePtr = table.getNativePtr();
        RecipientColumnInfo columnInfo = (RecipientColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.Recipient object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.Recipient) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$address = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
            }

            com.moez.QKSMS.model.Contact contactObj = ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$contact();
            if (contactObj != null) {
                Long cachecontact = cache.get(contactObj);
                if (cachecontact == null) {
                    cachecontact = com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, contactObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.contactIndex, rowIndex, cachecontact, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.contactIndex, rowIndex);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateIndex, rowIndex, ((com_moez_QKSMS_model_RecipientRealmProxyInterface) object).realmGet$lastUpdate(), false);
        }
    }

    public static com.moez.QKSMS.model.Recipient createDetachedCopy(com.moez.QKSMS.model.Recipient realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.moez.QKSMS.model.Recipient unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.moez.QKSMS.model.Recipient();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.moez.QKSMS.model.Recipient) cachedObject.object;
            }
            unmanagedObject = (com.moez.QKSMS.model.Recipient) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_moez_QKSMS_model_RecipientRealmProxyInterface unmanagedCopy = (com_moez_QKSMS_model_RecipientRealmProxyInterface) unmanagedObject;
        com_moez_QKSMS_model_RecipientRealmProxyInterface realmSource = (com_moez_QKSMS_model_RecipientRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());

        // Deep copy of contact
        unmanagedCopy.realmSet$contact(com_moez_QKSMS_model_ContactRealmProxy.createDetachedCopy(realmSource.realmGet$contact(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$lastUpdate(realmSource.realmGet$lastUpdate());

        return unmanagedObject;
    }

    static com.moez.QKSMS.model.Recipient update(Realm realm, RecipientColumnInfo columnInfo, com.moez.QKSMS.model.Recipient realmObject, com.moez.QKSMS.model.Recipient newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_moez_QKSMS_model_RecipientRealmProxyInterface realmObjectTarget = (com_moez_QKSMS_model_RecipientRealmProxyInterface) realmObject;
        com_moez_QKSMS_model_RecipientRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_RecipientRealmProxyInterface) newObject;
        Table table = realm.getTable(com.moez.QKSMS.model.Recipient.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());

        com.moez.QKSMS.model.Contact contactObj = realmObjectSource.realmGet$contact();
        if (contactObj == null) {
            builder.addNull(columnInfo.contactIndex);
        } else {
            com.moez.QKSMS.model.Contact cachecontact = (com.moez.QKSMS.model.Contact) cache.get(contactObj);
            if (cachecontact != null) {
                builder.addObject(columnInfo.contactIndex, cachecontact);
            } else {
                builder.addObject(columnInfo.contactIndex, com_moez_QKSMS_model_ContactRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class), contactObj, true, cache, flags));
            }
        }
        builder.addInteger(columnInfo.lastUpdateIndex, realmObjectSource.realmGet$lastUpdate());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Recipient = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contact:");
        stringBuilder.append(realmGet$contact() != null ? "Contact" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastUpdate:");
        stringBuilder.append(realmGet$lastUpdate());
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
        com_moez_QKSMS_model_RecipientRealmProxy aRecipient = (com_moez_QKSMS_model_RecipientRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aRecipient.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRecipient.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aRecipient.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
