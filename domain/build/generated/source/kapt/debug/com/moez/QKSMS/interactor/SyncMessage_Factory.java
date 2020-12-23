package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.ConversationRepository;
import com.moez.QKSMS.repository.SyncRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncMessage_Factory implements Factory<SyncMessage> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<SyncRepository> syncManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public SyncMessage_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.syncManagerProvider = syncManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public SyncMessage get() {
    return provideInstance(conversationRepoProvider, syncManagerProvider, updateBadgeProvider);
  }

  public static SyncMessage provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new SyncMessage(
        conversationRepoProvider.get(), syncManagerProvider.get(), updateBadgeProvider.get());
  }

  public static SyncMessage_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<SyncRepository> syncManagerProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new SyncMessage_Factory(
        conversationRepoProvider, syncManagerProvider, updateBadgeProvider);
  }

  public static SyncMessage newSyncMessage(
      ConversationRepository conversationRepo,
      SyncRepository syncManager,
      UpdateBadge updateBadge) {
    return new SyncMessage(conversationRepo, syncManager, updateBadge);
  }
}
