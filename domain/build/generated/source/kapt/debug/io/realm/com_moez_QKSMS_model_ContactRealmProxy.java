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
public class com_moez_QKSMS_model_ContactRealmProxy extends com.moez.QKSMS.model.Contact
    implements RealmObjectProxy, com_moez_QKSMS_model_ContactRealmProxyInterface {

    static final class ContactColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long lookupKeyIndex;
        long numbersIndex;
        long nameIndex;
        long photoUriIndex;
        long starredIndex;
        long lastUpdateIndex;

        ContactColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Contact");
            this.lookupKeyIndex = addColumnDetails("lookupKey", "lookupKey", objectSchemaInfo);
            this.numbersIndex = addColumnDetails("numbers", "numbers", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.photoUriIndex = addColumnDetails("photoUri", "photoUri", objectSchemaInfo);
            this.starredIndex = addColumnDetails("starred", "starred", objectSchemaInfo);
            this.lastUpdateIndex = addColumnDetails("lastUpdate", "lastUpdate", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ContactColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ContactColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ContactColumnInfo src = (ContactColumnInfo) rawSrc;
            final ContactColumnInfo dst = (ContactColumnInfo) rawDst;
            dst.lookupKeyIndex = src.lookupKeyIndex;
            dst.numbersIndex = src.numbersIndex;
            dst.nameIndex = src.nameIndex;
            dst.photoUriIndex = src.photoUriIndex;
            dst.starredIndex = src.starredIndex;
            dst.lastUpdateIndex = src.lastUpdateIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ContactColumnInfo columnInfo;
    private ProxyState<com.moez.QKSMS.model.Contact> proxyState;
    private RealmList<com.moez.QKSMS.model.PhoneNumber> numbersRealmList;

    com_moez_QKSMS_model_ContactRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ContactColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.moez.QKSMS.model.Contact>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lookupKey() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lookupKeyIndex);
    }

    @Override
    public void realmSet$lookupKey(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'lookupKey' cannot be changed after object was created.");
    }

    @Override
    public RealmList<com.moez.QKSMS.model.PhoneNumber> realmGet$numbers() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (numbersRealmList != null) {
            return numbersRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.numbersIndex);
            numbersRealmList = new RealmList<com.moez.QKSMS.model.PhoneNumber>(com.moez.QKSMS.model.PhoneNumber.class, osList, proxyState.getRealm$realm());
            return numbersRealmList;
        }
    }

    @Override
    public void realmSet$numbers(RealmList<com.moez.QKSMS.model.PhoneNumber> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("numbers")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.moez.QKSMS.model.PhoneNumber> original = value;
                value = new RealmList<com.moez.QKSMS.model.PhoneNumber>();
                for (com.moez.QKSMS.model.PhoneNumber item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.numbersIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.PhoneNumber linkedObject = value.get(i);
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
                com.moez.QKSMS.model.PhoneNumber linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
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
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photoUri() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoUriIndex);
    }

    @Override
    public void realmSet$photoUri(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoUriIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoUriIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoUriIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoUriIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$starred() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.starredIndex);
    }

    @Override
    public void realmSet$starred(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.starredIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.starredIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Contact", 6, 0);
        builder.addPersistedProperty("lookupKey", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("numbers", RealmFieldType.LIST, "PhoneNumber");
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("photoUri", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("starred", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lastUpdate", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ContactColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Contact";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Contact";
    }

    @SuppressWarnings("cast")
    public static com.moez.QKSMS.model.Contact createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.moez.QKSMS.model.Contact obj = null;
        if (update) {
            Table table = realm.getTable(com.moez.QKSMS.model.Contact.class);
            ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class);
            long pkColumnIndex = columnInfo.lookupKeyIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("lookupKey")) {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("lookupKey"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_moez_QKSMS_model_ContactRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("numbers")) {
                excludeFields.add("numbers");
            }
            if (json.has("lookupKey")) {
                if (json.isNull("lookupKey")) {
                    obj = (io.realm.com_moez_QKSMS_model_ContactRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.Contact.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_moez_QKSMS_model_ContactRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.Contact.class, json.getString("lookupKey"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'lookupKey'.");
            }
        }

        final com_moez_QKSMS_model_ContactRealmProxyInterface objProxy = (com_moez_QKSMS_model_ContactRealmProxyInterface) obj;
        if (json.has("numbers")) {
            if (json.isNull("numbers")) {
                objProxy.realmSet$numbers(null);
            } else {
                objProxy.realmGet$numbers().clear();
                JSONArray array = json.getJSONArray("numbers");
                for (int i = 0; i < array.length(); i++) {
                    com.moez.QKSMS.model.PhoneNumber item = com_moez_QKSMS_model_PhoneNumberRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$numbers().add(item);
                }
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("photoUri")) {
            if (json.isNull("photoUri")) {
                objProxy.realmSet$photoUri(null);
            } else {
                objProxy.realmSet$photoUri((String) json.getString("photoUri"));
            }
        }
        if (json.has("starred")) {
            if (json.isNull("starred")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'starred' to null.");
            } else {
                objProxy.realmSet$starred((boolean) json.getBoolean("starred"));
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
    public static com.moez.QKSMS.model.Contact createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.moez.QKSMS.model.Contact obj = new com.moez.QKSMS.model.Contact();
        final com_moez_QKSMS_model_ContactRealmProxyInterface objProxy = (com_moez_QKSMS_model_ContactRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("lookupKey")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lookupKey((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lookupKey(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("numbers")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$numbers(null);
                } else {
                    objProxy.realmSet$numbers(new RealmList<com.moez.QKSMS.model.PhoneNumber>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.moez.QKSMS.model.PhoneNumber item = com_moez_QKSMS_model_PhoneNumberRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$numbers().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("photoUri")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photoUri((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photoUri(null);
                }
            } else if (name.equals("starred")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$starred((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'starred' to null.");
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
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'lookupKey'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_moez_QKSMS_model_ContactRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class), false, Collections.<String>emptyList());
        io.realm.com_moez_QKSMS_model_ContactRealmProxy obj = new io.realm.com_moez_QKSMS_model_ContactRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.moez.QKSMS.model.Contact copyOrUpdate(Realm realm, ContactColumnInfo columnInfo, com.moez.QKSMS.model.Contact object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.moez.QKSMS.model.Contact) cachedRealmObject;
        }

        com.moez.QKSMS.model.Contact realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.moez.QKSMS.model.Contact.class);
            long pkColumnIndex = columnInfo.lookupKeyIndex;
            long rowIndex = table.findFirstString(pkColumnIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lookupKey());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_moez_QKSMS_model_ContactRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.moez.QKSMS.model.Contact copy(Realm realm, ContactColumnInfo columnInfo, com.moez.QKSMS.model.Contact newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.Contact) cachedRealmObject;
        }

        com_moez_QKSMS_model_ContactRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_ContactRealmProxyInterface) newObject;

        Table table = realm.getTable(com.moez.QKSMS.model.Contact.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.lookupKeyIndex, realmObjectSource.realmGet$lookupKey());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.photoUriIndex, realmObjectSource.realmGet$photoUri());
        builder.addBoolean(columnInfo.starredIndex, realmObjectSource.realmGet$starred());
        builder.addInteger(columnInfo.lastUpdateIndex, realmObjectSource.realmGet$lastUpdate());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_moez_QKSMS_model_ContactRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.moez.QKSMS.model.PhoneNumber> numbersList = realmObjectSource.realmGet$numbers();
        if (numbersList != null) {
            RealmList<com.moez.QKSMS.model.PhoneNumber> numbersRealmList = realmObjectCopy.realmGet$numbers();
            numbersRealmList.clear();
            for (int i = 0; i < numbersList.size(); i++) {
                com.moez.QKSMS.model.PhoneNumber numbersItem = numbersList.get(i);
                com.moez.QKSMS.model.PhoneNumber cachenumbers = (com.moez.QKSMS.model.PhoneNumber) cache.get(numbersItem);
                if (cachenumbers != null) {
                    numbersRealmList.add(cachenumbers);
                } else {
                    numbersRealmList.add(com_moez_QKSMS_model_PhoneNumberRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_PhoneNumberRealmProxy.PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.PhoneNumber.class), numbersItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.moez.QKSMS.model.Contact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class);
        long pkColumnIndex = columnInfo.lookupKeyIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lookupKey();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);

        RealmList<com.moez.QKSMS.model.PhoneNumber> numbersList = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$numbers();
        if (numbersList != null) {
            OsList numbersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.numbersIndex);
            for (com.moez.QKSMS.model.PhoneNumber numbersItem : numbersList) {
                Long cacheItemIndexnumbers = cache.get(numbersItem);
                if (cacheItemIndexnumbers == null) {
                    cacheItemIndexnumbers = com_moez_QKSMS_model_PhoneNumberRealmProxy.insert(realm, numbersItem, cache);
                }
                numbersOsList.addRow(cacheItemIndexnumbers);
            }
        }
        String realmGet$name = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$photoUri = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$photoUri();
        if (realmGet$photoUri != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUriIndex, rowIndex, realmGet$photoUri, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.starredIndex, rowIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$starred(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateIndex, rowIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lastUpdate(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class);
        long pkColumnIndex = columnInfo.lookupKeyIndex;
        com.moez.QKSMS.model.Contact object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.Contact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lookupKey();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);

            RealmList<com.moez.QKSMS.model.PhoneNumber> numbersList = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$numbers();
            if (numbersList != null) {
                OsList numbersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.numbersIndex);
                for (com.moez.QKSMS.model.PhoneNumber numbersItem : numbersList) {
                    Long cacheItemIndexnumbers = cache.get(numbersItem);
                    if (cacheItemIndexnumbers == null) {
                        cacheItemIndexnumbers = com_moez_QKSMS_model_PhoneNumberRealmProxy.insert(realm, numbersItem, cache);
                    }
                    numbersOsList.addRow(cacheItemIndexnumbers);
                }
            }
            String realmGet$name = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$photoUri = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$photoUri();
            if (realmGet$photoUri != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUriIndex, rowIndex, realmGet$photoUri, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.starredIndex, rowIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$starred(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateIndex, rowIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lastUpdate(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.moez.QKSMS.model.Contact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class);
        long pkColumnIndex = columnInfo.lookupKeyIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lookupKey();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);

        OsList numbersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.numbersIndex);
        RealmList<com.moez.QKSMS.model.PhoneNumber> numbersList = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$numbers();
        if (numbersList != null && numbersList.size() == numbersOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = numbersList.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.PhoneNumber numbersItem = numbersList.get(i);
                Long cacheItemIndexnumbers = cache.get(numbersItem);
                if (cacheItemIndexnumbers == null) {
                    cacheItemIndexnumbers = com_moez_QKSMS_model_PhoneNumberRealmProxy.insertOrUpdate(realm, numbersItem, cache);
                }
                numbersOsList.setRow(i, cacheItemIndexnumbers);
            }
        } else {
            numbersOsList.removeAll();
            if (numbersList != null) {
                for (com.moez.QKSMS.model.PhoneNumber numbersItem : numbersList) {
                    Long cacheItemIndexnumbers = cache.get(numbersItem);
                    if (cacheItemIndexnumbers == null) {
                        cacheItemIndexnumbers = com_moez_QKSMS_model_PhoneNumberRealmProxy.insertOrUpdate(realm, numbersItem, cache);
                    }
                    numbersOsList.addRow(cacheItemIndexnumbers);
                }
            }
        }

        String realmGet$name = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$photoUri = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$photoUri();
        if (realmGet$photoUri != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUriIndex, rowIndex, realmGet$photoUri, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoUriIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.starredIndex, rowIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$starred(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateIndex, rowIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lastUpdate(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class);
        long pkColumnIndex = columnInfo.lookupKeyIndex;
        com.moez.QKSMS.model.Contact object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.Contact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lookupKey();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);

            OsList numbersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.numbersIndex);
            RealmList<com.moez.QKSMS.model.PhoneNumber> numbersList = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$numbers();
            if (numbersList != null && numbersList.size() == numbersOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = numbersList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.moez.QKSMS.model.PhoneNumber numbersItem = numbersList.get(i);
                    Long cacheItemIndexnumbers = cache.get(numbersItem);
                    if (cacheItemIndexnumbers == null) {
                        cacheItemIndexnumbers = com_moez_QKSMS_model_PhoneNumberRealmProxy.insertOrUpdate(realm, numbersItem, cache);
                    }
                    numbersOsList.setRow(i, cacheItemIndexnumbers);
                }
            } else {
                numbersOsList.removeAll();
                if (numbersList != null) {
                    for (com.moez.QKSMS.model.PhoneNumber numbersItem : numbersList) {
                        Long cacheItemIndexnumbers = cache.get(numbersItem);
                        if (cacheItemIndexnumbers == null) {
                            cacheItemIndexnumbers = com_moez_QKSMS_model_PhoneNumberRealmProxy.insertOrUpdate(realm, numbersItem, cache);
                        }
                        numbersOsList.addRow(cacheItemIndexnumbers);
                    }
                }
            }

            String realmGet$name = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$photoUri = ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$photoUri();
            if (realmGet$photoUri != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUriIndex, rowIndex, realmGet$photoUri, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoUriIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.starredIndex, rowIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$starred(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUpdateIndex, rowIndex, ((com_moez_QKSMS_model_ContactRealmProxyInterface) object).realmGet$lastUpdate(), false);
        }
    }

    public static com.moez.QKSMS.model.Contact createDetachedCopy(com.moez.QKSMS.model.Contact realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.moez.QKSMS.model.Contact unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.moez.QKSMS.model.Contact();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.moez.QKSMS.model.Contact) cachedObject.object;
            }
            unmanagedObject = (com.moez.QKSMS.model.Contact) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_moez_QKSMS_model_ContactRealmProxyInterface unmanagedCopy = (com_moez_QKSMS_model_ContactRealmProxyInterface) unmanagedObject;
        com_moez_QKSMS_model_ContactRealmProxyInterface realmSource = (com_moez_QKSMS_model_ContactRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$lookupKey(realmSource.realmGet$lookupKey());

        // Deep copy of numbers
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$numbers(null);
        } else {
            RealmList<com.moez.QKSMS.model.PhoneNumber> managednumbersList = realmSource.realmGet$numbers();
            RealmList<com.moez.QKSMS.model.PhoneNumber> unmanagednumbersList = new RealmList<com.moez.QKSMS.model.PhoneNumber>();
            unmanagedCopy.realmSet$numbers(unmanagednumbersList);
            int nextDepth = currentDepth + 1;
            int size = managednumbersList.size();
            for (int i = 0; i < size; i++) {
                com.moez.QKSMS.model.PhoneNumber item = com_moez_QKSMS_model_PhoneNumberRealmProxy.createDetachedCopy(managednumbersList.get(i), nextDepth, maxDepth, cache);
                unmanagednumbersList.add(item);
            }
        }
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$photoUri(realmSource.realmGet$photoUri());
        unmanagedCopy.realmSet$starred(realmSource.realmGet$starred());
        unmanagedCopy.realmSet$lastUpdate(realmSource.realmGet$lastUpdate());

        return unmanagedObject;
    }

    static com.moez.QKSMS.model.Contact update(Realm realm, ContactColumnInfo columnInfo, com.moez.QKSMS.model.Contact realmObject, com.moez.QKSMS.model.Contact newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_moez_QKSMS_model_ContactRealmProxyInterface realmObjectTarget = (com_moez_QKSMS_model_ContactRealmProxyInterface) realmObject;
        com_moez_QKSMS_model_ContactRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_ContactRealmProxyInterface) newObject;
        Table table = realm.getTable(com.moez.QKSMS.model.Contact.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.lookupKeyIndex, realmObjectSource.realmGet$lookupKey());

        RealmList<com.moez.QKSMS.model.PhoneNumber> numbersList = realmObjectSource.realmGet$numbers();
        if (numbersList != null) {
            RealmList<com.moez.QKSMS.model.PhoneNumber> numbersManagedCopy = new RealmList<com.moez.QKSMS.model.PhoneNumber>();
            for (int i = 0; i < numbersList.size(); i++) {
                com.moez.QKSMS.model.PhoneNumber numbersItem = numbersList.get(i);
                com.moez.QKSMS.model.PhoneNumber cachenumbers = (com.moez.QKSMS.model.PhoneNumber) cache.get(numbersItem);
                if (cachenumbers != null) {
                    numbersManagedCopy.add(cachenumbers);
                } else {
                    numbersManagedCopy.add(com_moez_QKSMS_model_PhoneNumberRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_PhoneNumberRealmProxy.PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.PhoneNumber.class), numbersItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.numbersIndex, numbersManagedCopy);
        } else {
            builder.addObjectList(columnInfo.numbersIndex, new RealmList<com.moez.QKSMS.model.PhoneNumber>());
        }
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.photoUriIndex, realmObjectSource.realmGet$photoUri());
        builder.addBoolean(columnInfo.starredIndex, realmObjectSource.realmGet$starred());
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
        StringBuilder stringBuilder = new StringBuilder("Contact = proxy[");
        stringBuilder.append("{lookupKey:");
        stringBuilder.append(realmGet$lookupKey());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numbers:");
        stringBuilder.append("RealmList<PhoneNumber>[").append(realmGet$numbers().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photoUri:");
        stringBuilder.append(realmGet$photoUri() != null ? realmGet$photoUri() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{starred:");
        stringBuilder.append(realmGet$starred());
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
        com_moez_QKSMS_model_ContactRealmProxy aContact = (com_moez_QKSMS_model_ContactRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aContact.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aContact.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aContact.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
