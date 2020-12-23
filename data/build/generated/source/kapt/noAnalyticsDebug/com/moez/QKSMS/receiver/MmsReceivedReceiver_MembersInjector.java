package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.ReceiveMms;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MmsReceivedReceiver_MembersInjector
    implements MembersInjector<MmsReceivedReceiver> {
  private final Provider<ReceiveMms> receiveMmsProvider;

  public MmsReceivedReceiver_MembersInjector(Provider<ReceiveMms> receiveMmsProvider) {
    this.receiveMmsProvider = receiveMmsProvider;
  }

  public static MembersInjector<MmsReceivedReceiver> create(
      Provider<ReceiveMms> receiveMmsProvider) {
    return new MmsReceivedReceiver_MembersInjector(receiveMmsProvider);
  }

  @Override
  public void injectMembers(MmsReceivedReceiver instance) {
    injectReceiveMms(instance, receiveMmsProvider.get());
  }

  public static void injectReceiveMms(MmsReceivedReceiver instance, ReceiveMms receiveMms) {
    instance.receiveMms = receiveMms;
  }
}
