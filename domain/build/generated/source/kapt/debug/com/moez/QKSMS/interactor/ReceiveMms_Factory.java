package com.moez.QKSMS.interactor;

import com.moez.QKSMS.blocking.BlockingClient;
import com.moez.QKSMS.manager.ActiveConversationManager;
import com.moez.QKSMS.manager.NotificationManager;
import com.moez.QKSMS.repository.ConversationRepository;
import com.moez.QKSMS.repository.MessageRepository;
import com.moez.QKSMS.repository.SyncRepository;
import com.moez.QKSMS.util.Preferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveMms_Factory implements Factory<ReceiveMms> {
  private final Provider<ActiveConversationManager> activeConversationManagerProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<BlockingClient> blockingClientProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<SyncRepository> syncManagerProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public ReceiveMms_Factory(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    this.activeConversationManagerProvider = activeConversationManagerProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.blockingClientProvider = blockingClientProvider;
    this.prefsProvider = prefsProvider;
    this.syncManagerProvider = syncManagerProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public ReceiveMms get() {
    return provideInstance(
        activeConversationManagerProvider,
        conversationRepoProvider,
        blockingClientProvider,
        prefsProvider,
        syncManagerProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider);
  }

  public static ReceiveMms provideInstance(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new ReceiveMms(
        activeConversationManagerProvider.get(),
        conversationRepoProvider.get(),
        blockingClientProvider.get(),
        prefsProvider.get(),
        syncManagerProvider.get(),
        messageRepoProvider.get(),
        notificationManagerProvider.get(),
        updateBadgeProvider.get());
  }

  public static ReceiveMms_Factory create(
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new ReceiveMms_Factory(
        activeConversationManagerProvider,
        conversationRepoProvider,
        blockingClientProvider,
        prefsProvider,
        syncManagerProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider);
  }

  public static ReceiveMms newReceiveMms(
      ActiveConversationManager activeConversationManager,
      ConversationRepository conversationRepo,
      BlockingClient blockingClient,
      Preferences prefs,
      SyncRepository syncManager,
      MessageRepository messageRepo,
      NotificationManager notificationManager,
      UpdateBadge updateBadge) {
    return new ReceiveMms(
        activeConversationManager,
        conversationRepo,
        blockingClient,
        prefs,
        syncManager,
        messageRepo,
        notificationManager,
        updateBadge);
  }
}
