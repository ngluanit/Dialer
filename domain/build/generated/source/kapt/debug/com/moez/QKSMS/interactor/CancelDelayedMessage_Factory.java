package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.MessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CancelDelayedMessage_Factory implements Factory<CancelDelayedMessage> {
  private final Provider<MessageRepository> messageRepoProvider;

  public CancelDelayedMessage_Factory(Provider<MessageRepository> messageRepoProvider) {
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public CancelDelayedMessage get() {
    return provideInstance(messageRepoProvider);
  }

  public static CancelDelayedMessage provideInstance(
      Provider<MessageRepository> messageRepoProvider) {
    return new CancelDelayedMessage(messageRepoProvider.get());
  }

  public static CancelDelayedMessage_Factory create(
      Provider<MessageRepository> messageRepoProvider) {
    return new CancelDelayedMessage_Factory(messageRepoProvider);
  }

  public static CancelDelayedMessage newCancelDelayedMessage(MessageRepository messageRepo) {
    return new CancelDelayedMessage(messageRepo);
  }
}
