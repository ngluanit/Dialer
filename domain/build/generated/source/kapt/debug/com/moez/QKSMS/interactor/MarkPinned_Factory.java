package com.moez.QKSMS.interactor;

import com.moez.QKSMS.manager.ShortcutManager;
import com.moez.QKSMS.repository.ConversationRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkPinned_Factory implements Factory<MarkPinned> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  private final Provider<ShortcutManager> shortcutManagerProvider;

  public MarkPinned_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.updateBadgeProvider = updateBadgeProvider;
    this.shortcutManagerProvider = shortcutManagerProvider;
  }

  @Override
  public MarkPinned get() {
    return provideInstance(conversationRepoProvider, updateBadgeProvider, shortcutManagerProvider);
  }

  public static MarkPinned provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    return new MarkPinned(
        conversationRepoProvider.get(), updateBadgeProvider.get(), shortcutManagerProvider.get());
  }

  public static MarkPinned_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider,
      Provider<ShortcutManager> shortcutManagerProvider) {
    return new MarkPinned_Factory(
        conversationRepoProvider, updateBadgeProvider, shortcutManagerProvider);
  }

  public static MarkPinned newMarkPinned(
      ConversationRepository conversationRepo,
      UpdateBadge updateBadge,
      ShortcutManager shortcutManager) {
    return new MarkPinned(conversationRepo, updateBadge, shortcutManager);
  }
}
