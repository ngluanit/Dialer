package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.ConversationRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkBlocked_Factory implements Factory<MarkBlocked> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MarkRead> markReadProvider;

  public MarkBlocked_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkRead> markReadProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.markReadProvider = markReadProvider;
  }

  @Override
  public MarkBlocked get() {
    return provideInstance(conversationRepoProvider, markReadProvider);
  }

  public static MarkBlocked provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkRead> markReadProvider) {
    return new MarkBlocked(conversationRepoProvider.get(), markReadProvider.get());
  }

  public static MarkBlocked_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkRead> markReadProvider) {
    return new MarkBlocked_Factory(conversationRepoProvider, markReadProvider);
  }

  public static MarkBlocked newMarkBlocked(
      ConversationRepository conversationRepo, MarkRead markRead) {
    return new MarkBlocked(conversationRepo, markRead);
  }
}
