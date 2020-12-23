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
public final class MarkRead_Factory implements Factory<MarkRead> {
  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public MarkRead_Factory(
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    this.messageRepoProvider = messageRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public MarkRead get() {
    return provideInstance(messageRepoProvider, notificationManagerProvider, updateBadgeProvider);
  }

  public static MarkRead provideInstance(
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new MarkRead(
        messageRepoProvider.get(), notificationManagerProvider.get(), updateBadgeProvider.get());
  }

  public static MarkRead_Factory create(
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new MarkRead_Factory(
        messageRepoProvider, notificationManagerProvider, updateBadgeProvider);
  }

  public static MarkRead newMarkRead(
      MessageRepository messageRepo,
      NotificationManager notificationManager,
      UpdateBadge updateBadge) {
    return new MarkRead(messageRepo, notificationManager, updateBadge);
  }
}
