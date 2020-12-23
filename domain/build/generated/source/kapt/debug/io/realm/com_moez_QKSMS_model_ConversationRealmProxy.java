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
public class com_moez_QKSMS_model_ConversationRealmProxy extends com.moez.QKSMS.model.Conversation
    implements RealmObjectProxy, com_moez_QKSMS_model_ConversationRealmProxyInterface {

    static final class ConversationColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long archivedIndex;
        long blockedIndex;
        long pinnedIndex;
        long recipientsIndex;
        long lastMessageIndex;
        long draftIndex;
        long blockingClientIndex;
        long blockReasonIndex;
        long nameIndex;

        ConversationColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Conversation");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.archivedIndex = addColumnDetails("archived", "archived", objectSchemaInfo);
            this.blockedIndex = addColumnDetails("blocked", "blocked", objectSchemaInfo);
            this.pinnedIndex = addColumnDetails("pinned", "pinned", objectSchemaInfo);
            this.recipientsIndex = addColumnDetails("recipients", "recipients", objectSchemaInfo);
            this.lastMessageIndex = addColumnDetails("lastMessage", "lastMessage", objectSchemaInfo);
            this.draftIndex = addColumnDetails("draft", "draft", objectSchemaInfo);
            this.blockingClientIndex = addColumnDetails("blockingClient", "blockingClient", objectSchemaInfo);
            this.blockReasonIndex = addColumnDetails("blockReason", "blockReason", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ConversationColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ConversationColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ConversationColumnInfo src = (ConversationColumnInfo) rawSrc;
            final ConversationColumnInfo dst = (ConversationColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.archivedIndex = src.archivedIndex;
            dst.blockedIndex = src.blockedIndex;
            dst.pinnedIndex = src.pinnedIndex;
            dst.recipientsIndex = src.recipientsIndex;
            dst.lastMessageIndex = src.lastMessageIndex;
            dst.draftIndex = src.draftIndex;
            dst.blockingClientIndex = src.blockingClientIndex;
            dst.blockReasonIndex = src.blockReasonIndex;
            dst.nameIndex = src.nameIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ConversationColumnInfo columnInfo;
    private ProxyState<com.moez.QKSMS.model.Conversation> proxyState;
    private RealmList<com.moez.QKSMS.model.Recipient> recipientsRealmList;

    com_moez_QKSMS_model_ConversationRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ConversationColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.moez.QKSMS.model.Conversation>(this);
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
    public boolean realmGet$archived() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.archivedIndex);
    }

    @Override
    public void realmSet$archived(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.archivedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.archivedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$blocked() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.blockedIndex);
    }

    @Override
    public void realmSet$blocked(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.blockedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.blockedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$pinned() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.pinnedIndex);
    }

    @Override
    public void realmSet$pinned(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.pinnedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.pinnedIndex, value);
    }

    @Override
    public RealmList<com.moez.QKSMS.model.Recipient> realmGet$recipients() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (recipientsRealmList != null) {
            return recipientsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.recipientsIndex);
            recipientsRealmList = new RealmList<com.moez.QKSMS.model.Recipient>(com.moez.QKSMS.model.Recipient.class, osList, proxyState.getRealm$realm());
            return recipientsRealmList;
        }
    }

    @Override
    public void realmSet$recipients(RealmList<com.moez.QKSMS.model.Recipient> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("recipients")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.moez.QKSMS.model.Recipient> original = value;
                value = new RealmList<com.moez.QKSMS.model.Recipient>();
                for (com.moez.QKSMS.model.Recipient item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.recipientsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.Recipient linkedObject = value.get(i);
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
                com.moez.QKSMS.model.Recipient linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    public com.moez.QKSMS.model.Message realmGet$lastMessage() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.lastMessageIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.moez.QKSMS.model.Message.class, proxyState.getRow$realm().getLink(columnInfo.lastMessageIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$lastMessage(com.moez.QKSMS.model.Message value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("lastMessage")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.lastMessageIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.lastMessageIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.lastMessageIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.lastMessageIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$draft() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.draftIndex);
    }

    @Override
    public void realmSet$draft(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'draft' to null.");
            }
            row.getTable().setString(columnInfo.draftIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'draft' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.draftIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$blockingClient() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.blockingClientIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.blockingClientIndex);
    }

    @Override
    public void realmSet$blockingClient(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.blockingClientIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.blockingClientIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.blockingClientIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.blockingClientIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$blockReason() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.blockReasonIndex);
    }

    @Override
    public void realmSet$blockReason(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.blockReasonIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.blockReasonIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.blockReasonIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.blockReasonIndex, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Conversation", 10, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("archived", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("blocked", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("pinned", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("recipients", RealmFieldType.LIST, "Recipient");
        builder.addPersistedLinkProperty("lastMessage", RealmFieldType.OBJECT, "Message");
        builder.addPersistedProperty("draft", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("blockingClient", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("blockReason", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ConversationColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ConversationColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Conversation";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Conversation";
    }

    @SuppressWarnings("cast")
    public static com.moez.QKSMS.model.Conversation createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.moez.QKSMS.model.Conversation obj = null;
        if (update) {
            Table table = realm.getTable(com.moez.QKSMS.model.Conversation.class);
            ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Conversation.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Conversation.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_moez_QKSMS_model_ConversationRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("recipients")) {
                excludeFields.add("recipients");
            }
            if (json.has("lastMessage")) {
                excludeFields.add("lastMessage");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_moez_QKSMS_model_ConversationRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.Conversation.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_moez_QKSMS_model_ConversationRealmProxy) realm.createObjectInternal(com.moez.QKSMS.model.Conversation.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_moez_QKSMS_model_ConversationRealmProxyInterface objProxy = (com_moez_QKSMS_model_ConversationRealmProxyInterface) obj;
        if (json.has("archived")) {
            if (json.isNull("archived")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'archived' to null.");
            } else {
                objProxy.realmSet$archived((boolean) json.getBoolean("archived"));
            }
        }
        if (json.has("blocked")) {
            if (json.isNull("blocked")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'blocked' to null.");
            } else {
                objProxy.realmSet$blocked((boolean) json.getBoolean("blocked"));
            }
        }
        if (json.has("pinned")) {
            if (json.isNull("pinned")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'pinned' to null.");
            } else {
                objProxy.realmSet$pinned((boolean) json.getBoolean("pinned"));
            }
        }
        if (json.has("recipients")) {
            if (json.isNull("recipients")) {
                objProxy.realmSet$recipients(null);
            } else {
                objProxy.realmGet$recipients().clear();
                JSONArray array = json.getJSONArray("recipients");
                for (int i = 0; i < array.length(); i++) {
                    com.moez.QKSMS.model.Recipient item = com_moez_QKSMS_model_RecipientRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$recipients().add(item);
                }
            }
        }
        if (json.has("lastMessage")) {
            if (json.isNull("lastMessage")) {
                objProxy.realmSet$lastMessage(null);
            } else {
                com.moez.QKSMS.model.Message lastMessageObj = com_moez_QKSMS_model_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("lastMessage"), update);
                objProxy.realmSet$lastMessage(lastMessageObj);
            }
        }
        if (json.has("draft")) {
            if (json.isNull("draft")) {
                objProxy.realmSet$draft(null);
            } else {
                objProxy.realmSet$draft((String) json.getString("draft"));
            }
        }
        if (json.has("blockingClient")) {
            if (json.isNull("blockingClient")) {
                objProxy.realmSet$blockingClient(null);
            } else {
                objProxy.realmSet$blockingClient((int) json.getInt("blockingClient"));
            }
        }
        if (json.has("blockReason")) {
            if (json.isNull("blockReason")) {
                objProxy.realmSet$blockReason(null);
            } else {
                objProxy.realmSet$blockReason((String) json.getString("blockReason"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.moez.QKSMS.model.Conversation createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.moez.QKSMS.model.Conversation obj = new com.moez.QKSMS.model.Conversation();
        final com_moez_QKSMS_model_ConversationRealmProxyInterface objProxy = (com_moez_QKSMS_model_ConversationRealmProxyInterface) obj;
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
            } else if (name.equals("archived")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$archived((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'archived' to null.");
                }
            } else if (name.equals("blocked")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blocked((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'blocked' to null.");
                }
            } else if (name.equals("pinned")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pinned((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'pinned' to null.");
                }
            } else if (name.equals("recipients")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$recipients(null);
                } else {
                    objProxy.realmSet$recipients(new RealmList<com.moez.QKSMS.model.Recipient>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.moez.QKSMS.model.Recipient item = com_moez_QKSMS_model_RecipientRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$recipients().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("lastMessage")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$lastMessage(null);
                } else {
                    com.moez.QKSMS.model.Message lastMessageObj = com_moez_QKSMS_model_MessageRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$lastMessage(lastMessageObj);
                }
            } else if (name.equals("draft")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$draft((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$draft(null);
                }
            } else if (name.equals("blockingClient")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blockingClient((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$blockingClient(null);
                }
            } else if (name.equals("blockReason")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blockReason((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$blockReason(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
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

    private static com_moez_QKSMS_model_ConversationRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Conversation.class), false, Collections.<String>emptyList());
        io.realm.com_moez_QKSMS_model_ConversationRealmProxy obj = new io.realm.com_moez_QKSMS_model_ConversationRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.moez.QKSMS.model.Conversation copyOrUpdate(Realm realm, ConversationColumnInfo columnInfo, com.moez.QKSMS.model.Conversation object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.moez.QKSMS.model.Conversation) cachedRealmObject;
        }

        com.moez.QKSMS.model.Conversation realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.moez.QKSMS.model.Conversation.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_moez_QKSMS_model_ConversationRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.moez.QKSMS.model.Conversation copy(Realm realm, ConversationColumnInfo columnInfo, com.moez.QKSMS.model.Conversation newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.moez.QKSMS.model.Conversation) cachedRealmObject;
        }

        com_moez_QKSMS_model_ConversationRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_ConversationRealmProxyInterface) newObject;

        Table table = realm.getTable(com.moez.QKSMS.model.Conversation.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addBoolean(columnInfo.archivedIndex, realmObjectSource.realmGet$archived());
        builder.addBoolean(columnInfo.blockedIndex, realmObjectSource.realmGet$blocked());
        builder.addBoolean(columnInfo.pinnedIndex, realmObjectSource.realmGet$pinned());
        builder.addString(columnInfo.draftIndex, realmObjectSource.realmGet$draft());
        builder.addInteger(columnInfo.blockingClientIndex, realmObjectSource.realmGet$blockingClient());
        builder.addString(columnInfo.blockReasonIndex, realmObjectSource.realmGet$blockReason());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_moez_QKSMS_model_ConversationRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.moez.QKSMS.model.Recipient> recipientsList = realmObjectSource.realmGet$recipients();
        if (recipientsList != null) {
            RealmList<com.moez.QKSMS.model.Recipient> recipientsRealmList = realmObjectCopy.realmGet$recipients();
            recipientsRealmList.clear();
            for (int i = 0; i < recipientsList.size(); i++) {
                com.moez.QKSMS.model.Recipient recipientsItem = recipientsList.get(i);
                com.moez.QKSMS.model.Recipient cacherecipients = (com.moez.QKSMS.model.Recipient) cache.get(recipientsItem);
                if (cacherecipients != null) {
                    recipientsRealmList.add(cacherecipients);
                } else {
                    recipientsRealmList.add(com_moez_QKSMS_model_RecipientRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_RecipientRealmProxy.RecipientColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class), recipientsItem, update, cache, flags));
                }
            }
        }

        com.moez.QKSMS.model.Message lastMessageObj = realmObjectSource.realmGet$lastMessage();
        if (lastMessageObj == null) {
            realmObjectCopy.realmSet$lastMessage(null);
        } else {
            com.moez.QKSMS.model.Message cachelastMessage = (com.moez.QKSMS.model.Message) cache.get(lastMessageObj);
            if (cachelastMessage != null) {
                realmObjectCopy.realmSet$lastMessage(cachelastMessage);
            } else {
                realmObjectCopy.realmSet$lastMessage(com_moez_QKSMS_model_MessageRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class), lastMessageObj, update, cache, flags));
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.moez.QKSMS.model.Conversation object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.Conversation.class);
        long tableNativePtr = table.getNativePtr();
        ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Conversation.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.archivedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$archived(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.blockedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blocked(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.pinnedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$pinned(), false);

        RealmList<com.moez.QKSMS.model.Recipient> recipientsList = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$recipients();
        if (recipientsList != null) {
            OsList recipientsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientsIndex);
            for (com.moez.QKSMS.model.Recipient recipientsItem : recipientsList) {
                Long cacheItemIndexrecipients = cache.get(recipientsItem);
                if (cacheItemIndexrecipients == null) {
                    cacheItemIndexrecipients = com_moez_QKSMS_model_RecipientRealmProxy.insert(realm, recipientsItem, cache);
                }
                recipientsOsList.addRow(cacheItemIndexrecipients);
            }
        }

        com.moez.QKSMS.model.Message lastMessageObj = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$lastMessage();
        if (lastMessageObj != null) {
            Long cachelastMessage = cache.get(lastMessageObj);
            if (cachelastMessage == null) {
                cachelastMessage = com_moez_QKSMS_model_MessageRealmProxy.insert(realm, lastMessageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, cachelastMessage, false);
        }
        String realmGet$draft = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$draft();
        if (realmGet$draft != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.draftIndex, rowIndex, realmGet$draft, false);
        }
        Number realmGet$blockingClient = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blockingClient();
        if (realmGet$blockingClient != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.blockingClientIndex, rowIndex, realmGet$blockingClient.longValue(), false);
        }
        String realmGet$blockReason = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blockReason();
        if (realmGet$blockReason != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.blockReasonIndex, rowIndex, realmGet$blockReason, false);
        }
        String realmGet$name = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.Conversation.class);
        long tableNativePtr = table.getNativePtr();
        ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Conversation.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.Conversation object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.Conversation) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.archivedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$archived(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.blockedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blocked(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.pinnedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$pinned(), false);

            RealmList<com.moez.QKSMS.model.Recipient> recipientsList = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$recipients();
            if (recipientsList != null) {
                OsList recipientsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientsIndex);
                for (com.moez.QKSMS.model.Recipient recipientsItem : recipientsList) {
                    Long cacheItemIndexrecipients = cache.get(recipientsItem);
                    if (cacheItemIndexrecipients == null) {
                        cacheItemIndexrecipients = com_moez_QKSMS_model_RecipientRealmProxy.insert(realm, recipientsItem, cache);
                    }
                    recipientsOsList.addRow(cacheItemIndexrecipients);
                }
            }

            com.moez.QKSMS.model.Message lastMessageObj = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$lastMessage();
            if (lastMessageObj != null) {
                Long cachelastMessage = cache.get(lastMessageObj);
                if (cachelastMessage == null) {
                    cachelastMessage = com_moez_QKSMS_model_MessageRealmProxy.insert(realm, lastMessageObj, cache);
                }
                table.setLink(columnInfo.lastMessageIndex, rowIndex, cachelastMessage, false);
            }
            String realmGet$draft = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$draft();
            if (realmGet$draft != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.draftIndex, rowIndex, realmGet$draft, false);
            }
            Number realmGet$blockingClient = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blockingClient();
            if (realmGet$blockingClient != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.blockingClientIndex, rowIndex, realmGet$blockingClient.longValue(), false);
            }
            String realmGet$blockReason = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blockReason();
            if (realmGet$blockReason != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.blockReasonIndex, rowIndex, realmGet$blockReason, false);
            }
            String realmGet$name = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.moez.QKSMS.model.Conversation object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.moez.QKSMS.model.Conversation.class);
        long tableNativePtr = table.getNativePtr();
        ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Conversation.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.archivedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$archived(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.blockedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blocked(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.pinnedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$pinned(), false);

        OsList recipientsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientsIndex);
        RealmList<com.moez.QKSMS.model.Recipient> recipientsList = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$recipients();
        if (recipientsList != null && recipientsList.size() == recipientsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = recipientsList.size();
            for (int i = 0; i < objects; i++) {
                com.moez.QKSMS.model.Recipient recipientsItem = recipientsList.get(i);
                Long cacheItemIndexrecipients = cache.get(recipientsItem);
                if (cacheItemIndexrecipients == null) {
                    cacheItemIndexrecipients = com_moez_QKSMS_model_RecipientRealmProxy.insertOrUpdate(realm, recipientsItem, cache);
                }
                recipientsOsList.setRow(i, cacheItemIndexrecipients);
            }
        } else {
            recipientsOsList.removeAll();
            if (recipientsList != null) {
                for (com.moez.QKSMS.model.Recipient recipientsItem : recipientsList) {
                    Long cacheItemIndexrecipients = cache.get(recipientsItem);
                    if (cacheItemIndexrecipients == null) {
                        cacheItemIndexrecipients = com_moez_QKSMS_model_RecipientRealmProxy.insertOrUpdate(realm, recipientsItem, cache);
                    }
                    recipientsOsList.addRow(cacheItemIndexrecipients);
                }
            }
        }


        com.moez.QKSMS.model.Message lastMessageObj = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$lastMessage();
        if (lastMessageObj != null) {
            Long cachelastMessage = cache.get(lastMessageObj);
            if (cachelastMessage == null) {
                cachelastMessage = com_moez_QKSMS_model_MessageRealmProxy.insertOrUpdate(realm, lastMessageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, cachelastMessage, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.lastMessageIndex, rowIndex);
        }
        String realmGet$draft = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$draft();
        if (realmGet$draft != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.draftIndex, rowIndex, realmGet$draft, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.draftIndex, rowIndex, false);
        }
        Number realmGet$blockingClient = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blockingClient();
        if (realmGet$blockingClient != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.blockingClientIndex, rowIndex, realmGet$blockingClient.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.blockingClientIndex, rowIndex, false);
        }
        String realmGet$blockReason = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blockReason();
        if (realmGet$blockReason != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.blockReasonIndex, rowIndex, realmGet$blockReason, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.blockReasonIndex, rowIndex, false);
        }
        String realmGet$name = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.moez.QKSMS.model.Conversation.class);
        long tableNativePtr = table.getNativePtr();
        ConversationColumnInfo columnInfo = (ConversationColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Conversation.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.moez.QKSMS.model.Conversation object = null;
        while (objects.hasNext()) {
            object = (com.moez.QKSMS.model.Conversation) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.archivedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$archived(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.blockedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blocked(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.pinnedIndex, rowIndex, ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$pinned(), false);

            OsList recipientsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientsIndex);
            RealmList<com.moez.QKSMS.model.Recipient> recipientsList = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$recipients();
            if (recipientsList != null && recipientsList.size() == recipientsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = recipientsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.moez.QKSMS.model.Recipient recipientsItem = recipientsList.get(i);
                    Long cacheItemIndexrecipients = cache.get(recipientsItem);
                    if (cacheItemIndexrecipients == null) {
                        cacheItemIndexrecipients = com_moez_QKSMS_model_RecipientRealmProxy.insertOrUpdate(realm, recipientsItem, cache);
                    }
                    recipientsOsList.setRow(i, cacheItemIndexrecipients);
                }
            } else {
                recipientsOsList.removeAll();
                if (recipientsList != null) {
                    for (com.moez.QKSMS.model.Recipient recipientsItem : recipientsList) {
                        Long cacheItemIndexrecipients = cache.get(recipientsItem);
                        if (cacheItemIndexrecipients == null) {
                            cacheItemIndexrecipients = com_moez_QKSMS_model_RecipientRealmProxy.insertOrUpdate(realm, recipientsItem, cache);
                        }
                        recipientsOsList.addRow(cacheItemIndexrecipients);
                    }
                }
            }


            com.moez.QKSMS.model.Message lastMessageObj = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$lastMessage();
            if (lastMessageObj != null) {
                Long cachelastMessage = cache.get(lastMessageObj);
                if (cachelastMessage == null) {
                    cachelastMessage = com_moez_QKSMS_model_MessageRealmProxy.insertOrUpdate(realm, lastMessageObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, cachelastMessage, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.lastMessageIndex, rowIndex);
            }
            String realmGet$draft = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$draft();
            if (realmGet$draft != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.draftIndex, rowIndex, realmGet$draft, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.draftIndex, rowIndex, false);
            }
            Number realmGet$blockingClient = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blockingClient();
            if (realmGet$blockingClient != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.blockingClientIndex, rowIndex, realmGet$blockingClient.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.blockingClientIndex, rowIndex, false);
            }
            String realmGet$blockReason = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$blockReason();
            if (realmGet$blockReason != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.blockReasonIndex, rowIndex, realmGet$blockReason, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.blockReasonIndex, rowIndex, false);
            }
            String realmGet$name = ((com_moez_QKSMS_model_ConversationRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
        }
    }

    public static com.moez.QKSMS.model.Conversation createDetachedCopy(com.moez.QKSMS.model.Conversation realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.moez.QKSMS.model.Conversation unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.moez.QKSMS.model.Conversation();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.moez.QKSMS.model.Conversation) cachedObject.object;
            }
            unmanagedObject = (com.moez.QKSMS.model.Conversation) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_moez_QKSMS_model_ConversationRealmProxyInterface unmanagedCopy = (com_moez_QKSMS_model_ConversationRealmProxyInterface) unmanagedObject;
        com_moez_QKSMS_model_ConversationRealmProxyInterface realmSource = (com_moez_QKSMS_model_ConversationRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$archived(realmSource.realmGet$archived());
        unmanagedCopy.realmSet$blocked(realmSource.realmGet$blocked());
        unmanagedCopy.realmSet$pinned(realmSource.realmGet$pinned());

        // Deep copy of recipients
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$recipients(null);
        } else {
            RealmList<com.moez.QKSMS.model.Recipient> managedrecipientsList = realmSource.realmGet$recipients();
            RealmList<com.moez.QKSMS.model.Recipient> unmanagedrecipientsList = new RealmList<com.moez.QKSMS.model.Recipient>();
            unmanagedCopy.realmSet$recipients(unmanagedrecipientsList);
            int nextDepth = currentDepth + 1;
            int size = managedrecipientsList.size();
            for (int i = 0; i < size; i++) {
                com.moez.QKSMS.model.Recipient item = com_moez_QKSMS_model_RecipientRealmProxy.createDetachedCopy(managedrecipientsList.get(i), nextDepth, maxDepth, cache);
                unmanagedrecipientsList.add(item);
            }
        }

        // Deep copy of lastMessage
        unmanagedCopy.realmSet$lastMessage(com_moez_QKSMS_model_MessageRealmProxy.createDetachedCopy(realmSource.realmGet$lastMessage(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$draft(realmSource.realmGet$draft());
        unmanagedCopy.realmSet$blockingClient(realmSource.realmGet$blockingClient());
        unmanagedCopy.realmSet$blockReason(realmSource.realmGet$blockReason());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        return unmanagedObject;
    }

    static com.moez.QKSMS.model.Conversation update(Realm realm, ConversationColumnInfo columnInfo, com.moez.QKSMS.model.Conversation realmObject, com.moez.QKSMS.model.Conversation newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_moez_QKSMS_model_ConversationRealmProxyInterface realmObjectTarget = (com_moez_QKSMS_model_ConversationRealmProxyInterface) realmObject;
        com_moez_QKSMS_model_ConversationRealmProxyInterface realmObjectSource = (com_moez_QKSMS_model_ConversationRealmProxyInterface) newObject;
        Table table = realm.getTable(com.moez.QKSMS.model.Conversation.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addBoolean(columnInfo.archivedIndex, realmObjectSource.realmGet$archived());
        builder.addBoolean(columnInfo.blockedIndex, realmObjectSource.realmGet$blocked());
        builder.addBoolean(columnInfo.pinnedIndex, realmObjectSource.realmGet$pinned());

        RealmList<com.moez.QKSMS.model.Recipient> recipientsList = realmObjectSource.realmGet$recipients();
        if (recipientsList != null) {
            RealmList<com.moez.QKSMS.model.Recipient> recipientsManagedCopy = new RealmList<com.moez.QKSMS.model.Recipient>();
            for (int i = 0; i < recipientsList.size(); i++) {
                com.moez.QKSMS.model.Recipient recipientsItem = recipientsList.get(i);
                com.moez.QKSMS.model.Recipient cacherecipients = (com.moez.QKSMS.model.Recipient) cache.get(recipientsItem);
                if (cacherecipients != null) {
                    recipientsManagedCopy.add(cacherecipients);
                } else {
                    recipientsManagedCopy.add(com_moez_QKSMS_model_RecipientRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_RecipientRealmProxy.RecipientColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class), recipientsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.recipientsIndex, recipientsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.recipientsIndex, new RealmList<com.moez.QKSMS.model.Recipient>());
        }

        com.moez.QKSMS.model.Message lastMessageObj = realmObjectSource.realmGet$lastMessage();
        if (lastMessageObj == null) {
            builder.addNull(columnInfo.lastMessageIndex);
        } else {
            com.moez.QKSMS.model.Message cachelastMessage = (com.moez.QKSMS.model.Message) cache.get(lastMessageObj);
            if (cachelastMessage != null) {
                builder.addObject(columnInfo.lastMessageIndex, cachelastMessage);
            } else {
                builder.addObject(columnInfo.lastMessageIndex, com_moez_QKSMS_model_MessageRealmProxy.copyOrUpdate(realm, (com_moez_QKSMS_model_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class), lastMessageObj, true, cache, flags));
            }
        }
        builder.addString(columnInfo.draftIndex, realmObjectSource.realmGet$draft());
        builder.addInteger(columnInfo.blockingClientIndex, realmObjectSource.realmGet$blockingClient());
        builder.addString(columnInfo.blockReasonIndex, realmObjectSource.realmGet$blockReason());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Conversation = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{archived:");
        stringBuilder.append(realmGet$archived());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blocked:");
        stringBuilder.append(realmGet$blocked());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pinned:");
        stringBuilder.append(realmGet$pinned());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipients:");
        stringBuilder.append("RealmList<Recipient>[").append(realmGet$recipients().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastMessage:");
        stringBuilder.append(realmGet$lastMessage() != null ? "Message" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{draft:");
        stringBuilder.append(realmGet$draft());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blockingClient:");
        stringBuilder.append(realmGet$blockingClient() != null ? realmGet$blockingClient() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blockReason:");
        stringBuilder.append(realmGet$blockReason() != null ? realmGet$blockReason() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
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
        com_moez_QKSMS_model_ConversationRealmProxy aConversation = (com_moez_QKSMS_model_ConversationRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aConversation.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aConversation.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aConversation.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
