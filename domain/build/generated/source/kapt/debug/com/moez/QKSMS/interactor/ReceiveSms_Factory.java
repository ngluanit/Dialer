package com.moez.QKSMS.interactor;

import com.moez.QKSMS.blocking.BlockingClient;
import com.moez.QKSMS.manager.NotificationManager;
import com.moez.QKSMS.manager.ShortcutManager;
import com.moez.QKSMS.repository.ConversationRepository;
import com.moez.QKSMS.repository.MessageRepository;
import com.moez.QKSMS.util.Preferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveSms_Factory implements Factory<ReceiveSms> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<BlockingClient> blockingClientProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<NotificationManager> notificationManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  private final Provider<ShortcutManager> shortcutManagerProvider;

  public ReceiveSms_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.blockingClientProvider = blockingClientProvider;
    this.prefsProvider = prefsProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
    this.shortcutManagerProvider = shortcutManagerProvider;
  }

  @Override
  public ReceiveSms get() {
    return provideInstance(
        conversationRepoProvider,
        blockingClientProvider,
        prefsProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider,
        shortcutManagerProvider);
  }

  public static ReceiveSms provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    return new ReceiveSms(
        conversationRepoProvider.get(),
        blockingClientProvider.get(),
        prefsProvider.get(),
        messageRepoProvider.get(),
        notificationManagerProvider.get(),
        updateBadgeProvider.get(),
        shortcutManagerProvider.get());
  }

  public static ReceiveSms_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<NotificationManager> notificationManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    return new ReceiveSms_Factory(
        conversationRepoProvider,
        blockingClientProvider,
        prefsProvider,
        messageRepoProvider,
        notificationManagerProvider,
        updateBadgeProvider,
        shortcutManagerProvider);
  }

  public static ReceiveSms newReceiveSms(
      ConversationRepository conversationRepo,
      BlockingClient blockingClient,
      Preferences prefs,
      MessageRepository messageRepo,
      NotificationManager notificationManager,
      UpdateBadge updateBadge,
      ShortcutManager shortcutManager) {
    return new ReceiveSms(
        conversationRepo,
        blockingClient,
        prefs,
        messageRepo,
        notificationManager,
        updateBadge,
        shortcutManager);
  }
}
