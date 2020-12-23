package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.MessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkAllSeen_Factory implements Factory<MarkAllSeen> {
  private final Provider<MessageRepository> messageRepoProvider;

  public MarkAllSeen_Factory(Provider<MessageRepository> messageRepoProvider) {
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public MarkAllSeen get() {
    return provideInstance(messageRepoProvider);
  }

  public static MarkAllSeen provideInstance(Provider<MessageRepository> messageRepoProvider) {
    return new MarkAllSeen(messageRepoProvider.get());
  }

  public static MarkAllSeen_Factory create(Provider<MessageRepository> messageRepoProvider) {
    return new MarkAllSeen_Factory(messageRepoProvider);
  }

  public static MarkAllSeen newMarkAllSeen(MessageRepository messageRepo) {
    return new MarkAllSeen(messageRepo);
  }
}
