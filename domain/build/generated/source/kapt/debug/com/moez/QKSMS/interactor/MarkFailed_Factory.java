package com.moez.QKSMS.interactor;

import com.moez.QKSMS.manager.NotificationManager;
import com.moez.QKSMS.repository.MessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkFailed_Factory implements Factory<MarkFailed> {
  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  public MarkFailed_Factory(
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider) {
    this.messageRepoProvider = messageRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
  }

  @Override
  public MarkFailed get() {
    return provideInstance(messageRepoProvider, notificationManagerProvider);
  }

  public static MarkFailed provideInstance(
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider) {
    return new MarkFailed(messageRepoProvider.get(), notificationManagerProvider.get());
  }

  public static MarkFailed_Factory create(
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider) {
    return new MarkFailed_Factory(messageRepoProvider, notificationManagerProvider);
  }

  public static MarkFailed newMarkFailed(
      MessageRepository messageRepo, NotificationManager notificationManager) {
    return new MarkFailed(messageRepo, notificationManager);
  }
}
