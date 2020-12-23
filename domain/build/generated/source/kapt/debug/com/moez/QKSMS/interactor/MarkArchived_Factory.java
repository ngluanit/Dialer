package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.ConversationRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkArchived_Factory implements Factory<MarkArchived> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MarkRead> markReadProvider;

  public MarkArchived_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkRead> markReadProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.markReadProvider = markReadProvider;
  }

  @Override
  public MarkArchived get() {
    return provideInstance(conversationRepoProvider, markReadProvider);
  }

  public static MarkArchived provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkRead> markReadProvider) {
    return new MarkArchived(conversationRepoProvider.get(), markReadProvider.get());
  }

  public static MarkArchived_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkRead> markReadProvider) {
    return new MarkArchived_Factory(conversationRepoProvider, markReadProvider);
  }

  public static MarkArchived newMarkArchived(
      ConversationRepository conversationRepo, MarkRead markRead) {
    return new MarkArchived(conversationRepo, markRead);
  }
}
