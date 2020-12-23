package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.SyncMessages;
import com.moez.QKSMS.util.Preferences;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DefaultSmsChangedReceiver_MembersInjector
    implements MembersInjector<DefaultSmsChangedReceiver> {
  private final Provider<Preferences> prefsProvider;

  private final Provider<SyncMessages> syncMessagesProvider;

  public DefaultSmsChangedReceiver_MembersInjector(
      Provider<Preferences> prefsProvider, Provider<SyncMessages> syncMessagesProvider) {
    this.prefsProvider = prefsProvider;
    this.syncMessagesProvider = syncMessagesProvider;
  }

  public static MembersInjector<DefaultSmsChangedReceiver> create(
      Provider<Preferences> prefsProvider, Provider<SyncMessages> syncMessagesProvider) {
    return new DefaultSmsChangedReceiver_MembersInjector(prefsProvider, syncMessagesProvider);
  }

  @Override
  public void injectMembers(DefaultSmsChangedReceiver instance) {
    injectPrefs(instance, prefsProvider.get());
    injectSyncMessages(instance, syncMessagesProvider.get());
  }

  public static void injectPrefs(DefaultSmsChangedReceiver instance, Preferences prefs) {
    instance.prefs = prefs;
  }

  public static void injectSyncMessages(
      DefaultSmsChangedReceiver instance, SyncMessages syncMessages) {
    instance.syncMessages = syncMessages;
  }
}
