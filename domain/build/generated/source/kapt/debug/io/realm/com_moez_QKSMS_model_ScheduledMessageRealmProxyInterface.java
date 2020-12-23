package io.realm;


public interface com_moez_QKSMS_model_ScheduledMessageRealmProxyInterface {
    public long realmGet$id();
    public void realmSet$id(long value);
    public long realmGet$date();
    public void realmSet$date(long value);
    public int realmGet$subId();
    public void realmSet$subId(int value);
    public RealmList<String> realmGet$recipients();
    public void realmSet$recipients(RealmList<String> value);
    public boolean realmGet$sendAsGroup();
    public void realmSet$sendAsGroup(boolean value);
    public String realmGet$body();
    public void realmSet$body(String value);
    public RealmList<String> realmGet$attachments();
    public void realmSet$attachments(RealmList<String> value);
}
