package com.moez.QKSMS.interactor;

import com.moez.QKSMS.manager.NotificationManager;
import com.moez.QKSMS.repository.ConversationRepository;
import com.moez.QKSMS.repository.MessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeleteMessages_Factory implements Factory<DeleteMessages> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public DeleteMessages_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public DeleteMessages get() {
    return provideInstance(
        conversationRepoProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider);
  }

  public static DeleteMessages provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new DeleteMessages(
        conversationRepoProvider.get(),
        messageRepoProvider.get(),
        notificationManagerProvider.get(),
        updateBadgeProvider.get());
  }

  public static DeleteMessages_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new DeleteMessages_Factory(
        conversationRepoProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider);
  }

  public static DeleteMessages newDeleteMessages(
      ConversationRepository conversationRepo,
      MessageRepository messageRepo,
      NotificationManager notificationManager,
      UpdateBadge updateBadge) {
    return new DeleteMessages(conversationRepo, messageRepo, notificationManager, updateBadge);
  }
}
