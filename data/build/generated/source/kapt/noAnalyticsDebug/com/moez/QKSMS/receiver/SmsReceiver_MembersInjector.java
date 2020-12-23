package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.ReceiveSms;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SmsReceiver_MembersInjector implements MembersInjector<SmsReceiver> {
  private final Provider<ReceiveSms> receiveMessageProvider;

  public SmsReceiver_MembersInjector(Provider<ReceiveSms> receiveMessageProvider) {
    this.receiveMessageProvider = receiveMessageProvider;
  }

  public static MembersInjector<SmsReceiver> create(Provider<ReceiveSms> receiveMessageProvider) {
    return new SmsReceiver_MembersInjector(receiveMessageProvider);
  }

  @Override
  public void injectMembers(SmsReceiver instance) {
    injectReceiveMessage(instance, receiveMessageProvider.get());
  }

  public static void injectReceiveMessage(SmsReceiver instance, ReceiveSms receiveMessage) {
    instance.receiveMessage = receiveMessage;
  }
}
