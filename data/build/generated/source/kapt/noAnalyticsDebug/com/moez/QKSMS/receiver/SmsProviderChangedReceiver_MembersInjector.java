package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.SyncMessage;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SmsProviderChangedReceiver_MembersInjector
    implements MembersInjector<SmsProviderChangedReceiver> {
  private final Provider<SyncMessage> syncMessageProvider;

  public SmsProviderChangedReceiver_MembersInjector(Provider<SyncMessage> syncMessageProvider) {
    this.syncMessageProvider = syncMessageProvider;
  }

  public static MembersInjector<SmsProviderChangedReceiver> create(
      Provider<SyncMessage> syncMessageProvider) {
    return new SmsProviderChangedReceiver_MembersInjector(syncMessageProvider);
  }

  @Override
  public void injectMembers(SmsProviderChangedReceiver instance) {
    injectSyncMessage(instance, syncMessageProvider.get());
  }

  public static void injectSyncMessage(
      SmsProviderChangedReceiver instance, SyncMessage syncMessage) {
    instance.syncMessage = syncMessage;
  }
}
