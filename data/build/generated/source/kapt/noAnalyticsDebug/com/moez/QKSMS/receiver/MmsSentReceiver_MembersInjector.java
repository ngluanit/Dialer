package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.SyncMessage;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MmsSentReceiver_MembersInjector implements MembersInjector<MmsSentReceiver> {
  private final Provider<SyncMessage> syncMessageProvider;

  public MmsSentReceiver_MembersInjector(Provider<SyncMessage> syncMessageProvider) {
    this.syncMessageProvider = syncMessageProvider;
  }

  public static MembersInjector<MmsSentReceiver> create(Provider<SyncMessage> syncMessageProvider) {
    return new MmsSentReceiver_MembersInjector(syncMessageProvider);
  }

  @Override
  public void injectMembers(MmsSentReceiver instance) {
    injectSyncMessage(instance, syncMessageProvider.get());
  }

  public static void injectSyncMessage(MmsSentReceiver instance, SyncMessage syncMessage) {
    instance.syncMessage = syncMessage;
  }
}
