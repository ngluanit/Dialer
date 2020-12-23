package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.ConversationRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkUnblocked_Factory implements Factory<MarkUnblocked> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  public MarkUnblocked_Factory(Provider<ConversationRepository> conversationRepoProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
  }

  @Override
  public MarkUnblocked get() {
    return provideInstance(conversationRepoProvider);
  }

  public static MarkUnblocked provideInstance(
      Provider<ConversationRepository> conversationRepoProvider) {
    return new MarkUnblocked(conversationRepoProvider.get());
  }

  public static MarkUnblocked_Factory create(
      Provider<ConversationRepository> conversationRepoProvider) {
    return new MarkUnblocked_Factory(conversationRepoProvider);
  }

  public static MarkUnblocked newMarkUnblocked(ConversationRepository conversationRepo) {
    return new MarkUnblocked(conversationRepo);
  }
}
