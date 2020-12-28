package com.android.dialer.util;

import com.moez.QKSMS.model.Conversation;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public final class Constant {
    public static List<Conversation> conversationList = new ArrayList<>();
    public static List<Conversation> getModelList(RealmResults<Conversation> conversations) {
        List<Conversation> list = new ArrayList<>();
        Realm realm = null;
        try {
            realm = Realm.getDefaultInstance();
            conversations = realm
                    .where(Conversation.class)
                    .findAll();
            list.addAll(realm.copyFromRealm(conversations));
        } finally {
            if (realm != null) {
                realm.close();
            }
        }
        if (conversationList.size() > 0) {
            conversationList.clear();
        }
        conversationList.addAll(list);
        return list;
    }
    public static final String ACTION_DECLINE = "com.android.dialer.ACTION_DECLINE";
    public static final String ACTION_ANSWER = "com.android.dialer.ACTION_ANSWER";

    public static String asString(int data) {
        String value;
        switch (data) {
            case 0:
                value = "New";
                break;
            case 1:
                value = "Dialing";
                break;
            case 2:
                value = "Ringing";
                break;
            case 3:
                value = "Holding";
                break;
            case 4:
                value = "Active";
                break;
            case 7:
                value = "Disconnected";
                break;
            case 8:
                value = "SELECT_PHONE_ACCOUNT";
                break;
            case 9:
                value = "Connecting";
                break;
            case 10:
                value = "Disconnecting";
                break;
            default:
                value = "Unknown";
                break;
        }
        return value;
    }
}
