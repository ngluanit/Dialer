package com.moez.QKSMS.filter;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConversationFilter_Factory implements Factory<ConversationFilter> {
  private final Provider<RecipientFilter> recipientFilterProvider;

  public ConversationFilter_Factory(Provider<RecipientFilter> recipientFilterProvider) {
    this.recipientFilterProvider = recipientFilterProvider;
  }

  @Override
  public ConversationFilter get() {
    return provideInstance(recipientFilterProvider);
  }

  public static ConversationFilter provideInstance(
      Provider<RecipientFilter> recipientFilterProvider) {
    return new ConversationFilter(recipientFilterProvider.get());
  }

  public static ConversationFilter_Factory create(
      Provider<RecipientFilter> recipientFilterProvider) {
    return new ConversationFilter_Factory(recipientFilterProvider);
  }

  public static ConversationFilter newConversationFilter(RecipientFilter recipientFilter) {
    return new ConversationFilter(recipientFilter);
  }
}
