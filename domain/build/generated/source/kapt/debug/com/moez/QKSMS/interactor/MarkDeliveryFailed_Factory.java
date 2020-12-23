package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.MessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkDeliveryFailed_Factory implements Factory<MarkDeliveryFailed> {
  private final Provider<MessageRepository> messageRepoProvider;

  public MarkDeliveryFailed_Factory(Provider<MessageRepository> messageRepoProvider) {
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public MarkDeliveryFailed get() {
    return provideInstance(messageRepoProvider);
  }

  public static MarkDeliveryFailed provideInstance(
      Provider<MessageRepository> messageRepoProvider) {
    return new MarkDeliveryFailed(messageRepoProvider.get());
  }

  public static MarkDeliveryFailed_Factory create(Provider<MessageRepository> messageRepoProvider) {
    return new MarkDeliveryFailed_Factory(messageRepoProvider);
  }

  public static MarkDeliveryFailed newMarkDeliveryFailed(MessageRepository messageRepo) {
    return new MarkDeliveryFailed(messageRepo);
  }
}
