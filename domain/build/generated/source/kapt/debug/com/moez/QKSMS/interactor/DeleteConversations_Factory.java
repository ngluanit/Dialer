package com.moez.QKSMS.interactor;

import com.moez.QKSMS.manager.NotificationManager;
import com.moez.QKSMS.repository.ConversationRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeleteConversations_Factory implements Factory<DeleteConversations> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public DeleteConversations_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public DeleteConversations get() {
    return provideInstance(
        conversationRepoProvider, notificationManagerProvider, updateBadgeProvider);
  }

  public static DeleteConversations provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new DeleteConversations(
        conversationRepoProvider.get(),
        notificationManagerProvider.get(),
        updateBadgeProvider.get());
  }

  public static DeleteConversations_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new DeleteConversations_Factory(
        conversationRepoProvider, notificationManagerProvider, updateBadgeProvider);
  }

  public static DeleteConversations newDeleteConversations(
      ConversationRepository conversationRepo,
      NotificationManager notificationManager,
      UpdateBadge updateBadge) {
    return new DeleteConversations(conversationRepo, notificationManager, updateBadge);
  }
}
