package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(10);
        modelClasses.add(com.moez.QKSMS.model.BlockedNumber.class);
        modelClasses.add(com.moez.QKSMS.model.Contact.class);
        modelClasses.add(com.moez.QKSMS.model.ContactGroup.class);
        modelClasses.add(com.moez.QKSMS.model.Conversation.class);
        modelClasses.add(com.moez.QKSMS.model.Message.class);
        modelClasses.add(com.moez.QKSMS.model.MmsPart.class);
        modelClasses.add(com.moez.QKSMS.model.PhoneNumber.class);
        modelClasses.add(com.moez.QKSMS.model.Recipient.class);
        modelClasses.add(com.moez.QKSMS.model.ScheduledMessage.class);
        modelClasses.add(com.moez.QKSMS.model.SyncLog.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(10);
        infoMap.put(com.moez.QKSMS.model.BlockedNumber.class, io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.Contact.class, io.realm.com_moez_QKSMS_model_ContactRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.ContactGroup.class, io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.Conversation.class, io.realm.com_moez_QKSMS_model_ConversationRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.Message.class, io.realm.com_moez_QKSMS_model_MessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.MmsPart.class, io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.PhoneNumber.class, io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.Recipient.class, io.realm.com_moez_QKSMS_model_RecipientRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.ScheduledMessage.class, io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.moez.QKSMS.model.SyncLog.class, io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
            return io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
            return io.realm.com_moez_QKSMS_model_ContactRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
            return io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
            return io.realm.com_moez_QKSMS_model_ConversationRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
            return io.realm.com_moez_QKSMS_model_MessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
            return io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
            return io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
            return io.realm.com_moez_QKSMS_model_RecipientRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
            return io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
            return io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
            return "BlockedNumber";
        }
        if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
            return "Contact";
        }
        if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
            return "ContactGroup";
        }
        if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
            return "Conversation";
        }
        if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
            return "Message";
        }
        if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
            return "MmsPart";
        }
        if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
            return "PhoneNumber";
        }
        if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
            return "Recipient";
        }
        if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
            return "ScheduledMessage";
        }
        if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
            return "SyncLog";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_ContactRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_ConversationRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_MessageRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_MmsPartRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_RecipientRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy());
            }
            if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
                return clazz.cast(new io.realm.com_moez_QKSMS_model_SyncLogRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
            com_moez_QKSMS_model_BlockedNumberRealmProxy.BlockedNumberColumnInfo columnInfo = (com_moez_QKSMS_model_BlockedNumberRealmProxy.BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.BlockedNumber.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.BlockedNumber) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
            com_moez_QKSMS_model_ContactRealmProxy.ContactColumnInfo columnInfo = (com_moez_QKSMS_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Contact.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_ContactRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.Contact) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
            com_moez_QKSMS_model_ContactGroupRealmProxy.ContactGroupColumnInfo columnInfo = (com_moez_QKSMS_model_ContactGroupRealmProxy.ContactGroupColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ContactGroup.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.ContactGroup) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
            com_moez_QKSMS_model_ConversationRealmProxy.ConversationColumnInfo columnInfo = (com_moez_QKSMS_model_ConversationRealmProxy.ConversationColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Conversation.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_ConversationRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.Conversation) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
            com_moez_QKSMS_model_MessageRealmProxy.MessageColumnInfo columnInfo = (com_moez_QKSMS_model_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Message.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_MessageRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.Message) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
            com_moez_QKSMS_model_MmsPartRealmProxy.MmsPartColumnInfo columnInfo = (com_moez_QKSMS_model_MmsPartRealmProxy.MmsPartColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.MmsPart.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.MmsPart) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
            com_moez_QKSMS_model_PhoneNumberRealmProxy.PhoneNumberColumnInfo columnInfo = (com_moez_QKSMS_model_PhoneNumberRealmProxy.PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.PhoneNumber.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.PhoneNumber) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
            com_moez_QKSMS_model_RecipientRealmProxy.RecipientColumnInfo columnInfo = (com_moez_QKSMS_model_RecipientRealmProxy.RecipientColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.Recipient.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_RecipientRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.Recipient) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
            com_moez_QKSMS_model_ScheduledMessageRealmProxy.ScheduledMessageColumnInfo columnInfo = (com_moez_QKSMS_model_ScheduledMessageRealmProxy.ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.ScheduledMessage.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.ScheduledMessage) obj, update, cache, flags));
        }
        if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
            com_moez_QKSMS_model_SyncLogRealmProxy.SyncLogColumnInfo columnInfo = (com_moez_QKSMS_model_SyncLogRealmProxy.SyncLogColumnInfo) realm.getSchema().getColumnInfo(com.moez.QKSMS.model.SyncLog.class);
            return clazz.cast(io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.copyOrUpdate(realm, columnInfo, (com.moez.QKSMS.model.SyncLog) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
            io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.insert(realm, (com.moez.QKSMS.model.BlockedNumber) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
            io.realm.com_moez_QKSMS_model_ContactRealmProxy.insert(realm, (com.moez.QKSMS.model.Contact) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
            io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.insert(realm, (com.moez.QKSMS.model.ContactGroup) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
            io.realm.com_moez_QKSMS_model_ConversationRealmProxy.insert(realm, (com.moez.QKSMS.model.Conversation) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
            io.realm.com_moez_QKSMS_model_MessageRealmProxy.insert(realm, (com.moez.QKSMS.model.Message) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
            io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.insert(realm, (com.moez.QKSMS.model.MmsPart) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
            io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.insert(realm, (com.moez.QKSMS.model.PhoneNumber) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
            io.realm.com_moez_QKSMS_model_RecipientRealmProxy.insert(realm, (com.moez.QKSMS.model.Recipient) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
            io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.insert(realm, (com.moez.QKSMS.model.ScheduledMessage) object, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
            io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.insert(realm, (com.moez.QKSMS.model.SyncLog) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
                io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.insert(realm, (com.moez.QKSMS.model.BlockedNumber) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
                io.realm.com_moez_QKSMS_model_ContactRealmProxy.insert(realm, (com.moez.QKSMS.model.Contact) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
                io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.insert(realm, (com.moez.QKSMS.model.ContactGroup) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
                io.realm.com_moez_QKSMS_model_ConversationRealmProxy.insert(realm, (com.moez.QKSMS.model.Conversation) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
                io.realm.com_moez_QKSMS_model_MessageRealmProxy.insert(realm, (com.moez.QKSMS.model.Message) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
                io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.insert(realm, (com.moez.QKSMS.model.MmsPart) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
                io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.insert(realm, (com.moez.QKSMS.model.PhoneNumber) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
                io.realm.com_moez_QKSMS_model_RecipientRealmProxy.insert(realm, (com.moez.QKSMS.model.Recipient) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
                io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.insert(realm, (com.moez.QKSMS.model.ScheduledMessage) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
                io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.insert(realm, (com.moez.QKSMS.model.SyncLog) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
                    io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
                    io.realm.com_moez_QKSMS_model_ContactRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
                    io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
                    io.realm.com_moez_QKSMS_model_ConversationRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
                    io.realm.com_moez_QKSMS_model_MessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
                    io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
                    io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
                    io.realm.com_moez_QKSMS_model_RecipientRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
                    io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
                    io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
            io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.BlockedNumber) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
            io.realm.com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.Contact) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
            io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.ContactGroup) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
            io.realm.com_moez_QKSMS_model_ConversationRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.Conversation) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
            io.realm.com_moez_QKSMS_model_MessageRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.Message) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
            io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.MmsPart) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
            io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.PhoneNumber) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
            io.realm.com_moez_QKSMS_model_RecipientRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.Recipient) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
            io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.ScheduledMessage) obj, cache);
        } else if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
            io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.SyncLog) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
                io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.BlockedNumber) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
                io.realm.com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.Contact) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
                io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.ContactGroup) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
                io.realm.com_moez_QKSMS_model_ConversationRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.Conversation) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
                io.realm.com_moez_QKSMS_model_MessageRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.Message) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
                io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.MmsPart) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
                io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.PhoneNumber) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
                io.realm.com_moez_QKSMS_model_RecipientRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.Recipient) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
                io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.ScheduledMessage) object, cache);
            } else if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
                io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.insertOrUpdate(realm, (com.moez.QKSMS.model.SyncLog) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
                    io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
                    io.realm.com_moez_QKSMS_model_ContactRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
                    io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
                    io.realm.com_moez_QKSMS_model_ConversationRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
                    io.realm.com_moez_QKSMS_model_MessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
                    io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
                    io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
                    io.realm.com_moez_QKSMS_model_RecipientRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
                    io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
                    io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ContactRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ConversationRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_RecipientRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ContactRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ConversationRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_MessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_RecipientRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.moez.QKSMS.model.BlockedNumber.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_BlockedNumberRealmProxy.createDetachedCopy((com.moez.QKSMS.model.BlockedNumber) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.Contact.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ContactRealmProxy.createDetachedCopy((com.moez.QKSMS.model.Contact) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.ContactGroup.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ContactGroupRealmProxy.createDetachedCopy((com.moez.QKSMS.model.ContactGroup) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.Conversation.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ConversationRealmProxy.createDetachedCopy((com.moez.QKSMS.model.Conversation) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.Message.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_MessageRealmProxy.createDetachedCopy((com.moez.QKSMS.model.Message) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.MmsPart.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_MmsPartRealmProxy.createDetachedCopy((com.moez.QKSMS.model.MmsPart) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.PhoneNumber.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_PhoneNumberRealmProxy.createDetachedCopy((com.moez.QKSMS.model.PhoneNumber) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.Recipient.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_RecipientRealmProxy.createDetachedCopy((com.moez.QKSMS.model.Recipient) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.ScheduledMessage.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_ScheduledMessageRealmProxy.createDetachedCopy((com.moez.QKSMS.model.ScheduledMessage) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.moez.QKSMS.model.SyncLog.class)) {
            return clazz.cast(io.realm.com_moez_QKSMS_model_SyncLogRealmProxy.createDetachedCopy((com.moez.QKSMS.model.SyncLog) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
