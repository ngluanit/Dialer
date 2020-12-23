package io.realm;


public interface com_moez_QKSMS_model_ConversationRealmProxyInterface {
    public long realmGet$id();
    public void realmSet$id(long value);
    public boolean realmGet$archived();
    public void realmSet$archived(boolean value);
    public boolean realmGet$blocked();
    public void realmSet$blocked(boolean value);
    public boolean realmGet$pinned();
    public void realmSet$pinned(boolean value);
    public RealmList<com.moez.QKSMS.model.Recipient> realmGet$recipients();
    public void realmSet$recipients(RealmList<com.moez.QKSMS.model.Recipient> value);
    public com.moez.QKSMS.model.Message realmGet$lastMessage();
    public void realmSet$lastMessage(com.moez.QKSMS.model.Message value);
    public String realmGet$draft();
    public void realmSet$draft(String value);
    public Integer realmGet$blockingClient();
    public void realmSet$blockingClient(Integer value);
    public String realmGet$blockReason();
    public void realmSet$blockReason(String value);
    public String realmGet$name();
    public void realmSet$name(String value);
}
