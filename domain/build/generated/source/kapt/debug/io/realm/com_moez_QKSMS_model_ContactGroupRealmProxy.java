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
public class com_moez_QKSMS_model_ContactGroupRealmProxy extends com.moez.QKSMS.model.ContactGroup
    implements RealmObjectProxy, com_moez_QKSMS_model_ContactGroupRealmProxyInterface {

    static final class ContactGroupColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long titleIndex;
        long contactsIndex;

        ContactGroupColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ContactGroup");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.contactsIndex = addColumnDetails("contacts", "contacts", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ContactGroupColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ContactGroupColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ContactGroupColumnInfo src = (ContactGroupColumnInfo) rawSrc;
            final ContactGroupColumnInfo dst = (ContactGroupColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.titleIndex = src.titleIndex;
            dst.contactsIndex = src.contactsIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ContactGroupColumnInfo columnInfo;
    private ProxyState<com.moez.QKSMS.model.ContactGroup> proxyState;
    private RealmList<com.moez.QKSMS.model.Contact> contactsRealmList;

    com_moez_QKSMS_model_ContactGroupRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ContactGroupColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.moez.QKSMS.model.ContactGroup>(this);
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
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleIndex);
    }

    @Override
    public void realmSet$title(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
            }
            row.getTable().setString(columnInfo.titleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.titleIndex, value);
    }

    @Override
    public RealmList<com.moez.QKSMS.model.Contact> realmGet$contacts() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (contactsRealmList != null) {
            return contactsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.contactsIndex);
            contactsRealmList = new RealmList<com.moez.QKSMS.model.Contact>(com.moez.QKSMS.model.Contact.class, osList, proxyState.getRealm$realm());
            return contactsRealmList;
        }
    }

    @Override
    public void realmSet$contacts(RealmList<com.moez.QKSMS.model.Contact> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("contacts")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.moez.QKSMS.model.Contact> original = value;
                value = new RealmList<com.moez.QKSMS.model.Contact>();
                for (com.moez.QKSMS.model.Contact item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.contactsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.Contact linkedObject = value.get(i);
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
                com.moez.QKSMS.model.Contact linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ContactGroup", 3, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("contacts", RealmFieldType.LIST, "Contact");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactGroupColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ContactGroupColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ContactGroup";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ContactGroup";
    }

    @SuppressWarnings("cast")
    public static com.moez.QKSMS.model.ContactGroup createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.moez.QKSMS.model.ContactGroup obj = null;
        if (update) {
            Table table = realm.getTable(com.moez.QKSMS.model.ContactGroup.class);
            ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ContactGroup.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ContactGroup.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("contacts")) {
                excludeFields.add("contacts");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.ContactGroup.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.ContactGroup.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_moez_QKSMS_model_ContactGroupRealmProxyInterface objProxy = (com_moez_QKSMS_model_ContactGroupRealmProxyInterface) obj;
        if (json.has("title")) {
            if (json.isNull("title")) {
                objProxy.realmSet$title(null);
            } else {
                objProxy.realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("contacts")) {
            if (json.isNull("contacts")) {
                objProxy.realmSet$contacts(null);
            } else {
                objProxy.realmGet$contacts().clear();
                JSONArray array = json.getJSONArray("contacts");
                for (int i = 0; i < array.length(); i++) {
                    com.moez.QKSMS.model.Contact item = com_moez_QKSMS_model_ContactRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$contacts().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.moez.QKSMS.model.ContactGroup createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.moez.QKSMS.model.ContactGroup obj = new com.moez.QKSMS.model.ContactGroup();
        final com_moez_QKSMS_model_ContactGroupRealmProxyInterface objProxy = (com_moez_QKSMS_model_ContactGroupRealmProxyInterface) obj;
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
            } else if (name.equals("title")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$title((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$title(null);
                }
            } else if (name.equals("contacts")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$contacts(null);
                } else {
                    objProxy.realmSet$contacts(new RealmList<com.moez.QKSMS.model.Contact>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.moez.QKSMS.model.Contact item = com_moez_QKSMS_model_ContactRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$contacts().add(item);
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

    private static com_moez_QKSMS_model_ContactGroupRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ContactGroup.class), false, Collections.<String>emptyList());
        io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy obj = new io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.moez.QKSMS.model.ContactGroup copyOrUpdate(Realm realm, ContactGroupColumnInfo columnInfo, com.moez.QKSMS.model.ContactGroup object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.moez.QKSMS.model.ContactGroup) cachedRealmObject;
        }

        com.moez.QKSMS.model.ContactGroup realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.moez.QKSMS.model.ContactGroup.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.moez.QKSMS.model.ContactGroup copy(Realm realm, ContactGroupColumnInfo columnInfo, com.moez.QKSMS.model.ContactGroup newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.ContactGroup) cachedRealmObject;
        }

        com_moez_QKSMS_model_ContactGroupRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_ContactGroupRealmProxyInterface) newObject;

        Table table = realm.getTable(com.moez.QKSMS.model.ContactGroup.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.titleIndex, realmObjectSource.realmGet$title());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.moez.QKSMS.model.Contact> contactsList = realmObjectSource.realmGet$contacts();
        if (contactsList != null) {
            RealmList<com.moez.QKSMS.model.Contact> contactsRealmList = realmObjectCopy.realmGet$contacts();
            contactsRealmList.clear();
            for (int i = 0; i < contactsList.size(); i++) {
                com.moez.QKSMS.model.Contact contactsItem = contactsList.get(i);
                com.moez.QKSMS.model.Contact cachecontacts = (com.moez.QKSMS.model.Contact) cache.get(contactsItem);
                if (cachecontacts != null) {
                    contactsRealmList.add(cachecontacts);
                } else {
                    contactsRealmList.add(com_moez_QKSMS_model_ContactRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class), contactsItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.moez.QKSMS.model.ContactGroup object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.ContactGroup.class);
        long tableNativePtr = table.getNativePtr();
        ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ContactGroup.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$title = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }

        RealmList<com.moez.QKSMS.model.Contact> contactsList = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$contacts();
        if (contactsList != null) {
            OsList contactsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.contactsIndex);
            for (com.moez.QKSMS.model.Contact contactsItem : contactsList) {
                Long cacheItemIndexcontacts = cache.get(contactsItem);
                if (cacheItemIndexcontacts == null) {
                    cacheItemIndexcontacts = com_moez_QKSMS_model_ContactRealmProxy.insert(realm, contactsItem, cache);
                }
                contactsOsList.addRow(cacheItemIndexcontacts);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.ContactGroup.class);
        long tableNativePtr = table.getNativePtr();
        ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ContactGroup.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.ContactGroup object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.ContactGroup) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$title = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }

            RealmList<com.moez.QKSMS.model.Contact> contactsList = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$contacts();
            if (contactsList != null) {
                OsList contactsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.contactsIndex);
                for (com.moez.QKSMS.model.Contact contactsItem : contactsList) {
                    Long cacheItemIndexcontacts = cache.get(contactsItem);
                    if (cacheItemIndexcontacts == null) {
                        cacheItemIndexcontacts = com_moez_QKSMS_model_ContactRealmProxy.insert(realm, contactsItem, cache);
                    }
                    contactsOsList.addRow(cacheItemIndexcontacts);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.moez.QKSMS.model.ContactGroup object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.ContactGroup.class);
        long tableNativePtr = table.getNativePtr();
        ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ContactGroup.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$title = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }

        OsList contactsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.contactsIndex);
        RealmList<com.moez.QKSMS.model.Contact> contactsList = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$contacts();
        if (contactsList != null && contactsList.size() == contactsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = contactsList.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.Contact contactsItem = contactsList.get(i);
                Long cacheItemIndexcontacts = cache.get(contactsItem);
                if (cacheItemIndexcontacts == null) {
                    cacheItemIndexcontacts = com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, contactsItem, cache);
                }
                contactsOsList.setRow(i, cacheItemIndexcontacts);
            }
        } else {
            contactsOsList.removeAll();
            if (contactsList != null) {
                for (com.moez.QKSMS.model.Contact contactsItem : contactsList) {
                    Long cacheItemIndexcontacts = cache.get(contactsItem);
                    if (cacheItemIndexcontacts == null) {
                        cacheItemIndexcontacts = com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, contactsItem, cache);
                    }
                    contactsOsList.addRow(cacheItemIndexcontacts);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.ContactGroup.class);
        long tableNativePtr = table.getNativePtr();
        ContactGroupColumnInfo columnInfo = (ContactGroupColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ContactGroup.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.ContactGroup object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.ContactGroup) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$title = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }

            OsList contactsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.contactsIndex);
            RealmList<com.moez.QKSMS.model.Contact> contactsList = ((com_moez_QKSMS_model_ContactGroupRealmProxyInterface) object).realmGet$contacts();
            if (contactsList != null && contactsList.size() == contactsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = contactsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.moez.QKSMS.model.Contact contactsItem = contactsList.get(i);
                    Long cacheItemIndexcontacts = cache.get(contactsItem);
                    if (cacheItemIndexcontacts == null) {
                        cacheItemIndexcontacts = com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, contactsItem, cache);
                    }
                    contactsOsList.setRow(i, cacheItemIndexcontacts);
                }
            } else {
                contactsOsList.removeAll();
                if (contactsList != null) {
                    for (com.moez.QKSMS.model.Contact contactsItem : contactsList) {
                        Long cacheItemIndexcontacts = cache.get(contactsItem);
                        if (cacheItemIndexcontacts == null) {
                            cacheItemIndexcontacts = com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, contactsItem, cache);
                        }
                        contactsOsList.addRow(cacheItemIndexcontacts);
                    }
                }
            }

        }
    }

    public static com.moez.QKSMS.model.ContactGroup createDetachedCopy(com.moez.QKSMS.model.ContactGroup realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.moez.QKSMS.model.ContactGroup unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.moez.QKSMS.model.ContactGroup();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.moez.QKSMS.model.ContactGroup) cachedObject.object;
            }
            unmanagedObject = (com.moez.QKSMS.model.ContactGroup) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_moez_QKSMS_model_ContactGroupRealmProxyInterface unmanagedCopy = (com_moez_QKSMS_model_ContactGroupRealmProxyInterface) unmanagedObject;
        com_moez_QKSMS_model_ContactGroupRealmProxyInterface realmSource = (com_moez_QKSMS_model_ContactGroupRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());

        // Deep copy of contacts
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$contacts(null);
        } else {
            RealmList<com.moez.QKSMS.model.Contact> managedcontactsList = realmSource.realmGet$contacts();
            RealmList<com.moez.QKSMS.model.Contact> unmanagedcontactsList = new RealmList<com.moez.QKSMS.model.Contact>();
            unmanagedCopy.realmSet$contacts(unmanagedcontactsList);
            int nextDepth = currentDepth + 1;
            int size = managedcontactsList.size();
            for (int i = 0; i < size; i++) {
                com.moez.QKSMS.model.Contact item = com_moez_QKSMS_model_ContactRealmProxy.createDetachedCopy(managedcontactsList.get(i), nextDepth, maxDepth, cache);
                unmanagedcontactsList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.moez.QKSMS.model.ContactGroup update(Realm realm, ContactGroupColumnInfo columnInfo, com.moez.QKSMS.model.ContactGroup realmObject, com.moez.QKSMS.model.ContactGroup newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_moez_QKSMS_model_ContactGroupRealmProxyInterface realmObjectTarget = (com_moez_QKSMS_model_ContactGroupRealmProxyInterface) realmObject;
        com_moez_QKSMS_model_ContactGroupRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_ContactGroupRealmProxyInterface) newObject;
        Table table = realm.getTable(com.moez.QKSMS.model.ContactGroup.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.titleIndex, realmObjectSource.realmGet$title());

        RealmList<com.moez.QKSMS.model.Contact> contactsList = realmObjectSource.realmGet$contacts();
        if (contactsList != null) {
            RealmList<com.moez.QKSMS.model.Contact> contactsManagedCopy = new RealmList<com.moez.QKSMS.model.Contact>();
            for (int i = 0; i < contactsList.size(); i++) {
                com.moez.QKSMS.model.Contact contactsItem = contactsList.get(i);
                com.moez.QKSMS.model.Contact cachecontacts = (com.moez.QKSMS.model.Contact) cache.get(contactsItem);
                if (cachecontacts != null) {
                    contactsManagedCopy.add(cachecontacts);
                } else {
                    contactsManagedCopy.add(com_moez_QKSMS_model_ContactRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class), contactsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.contactsIndex, contactsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.contactsIndex, new RealmList<com.moez.QKSMS.model.Contact>());
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
        StringBuilder stringBuilder = new StringBuilder("ContactGroup = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contacts:");
        stringBuilder.append("RealmList<Contact>[").append(realmGet$contacts().size()).append("]");
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
        com_moez_QKSMS_model_ContactGroupRealmProxy aContactGroup = (com_moez_QKSMS_model_ContactGroupRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aContactGroup.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aContactGroup.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aContactGroup.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
