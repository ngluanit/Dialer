package com.moez.QKSMS.interactor;

import android.content.Context;
import com.moez.QKSMS.repository.ConversationRepository;
import com.moez.QKSMS.repository.MessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SendMessage_Factory implements Factory<SendMessage> {
  private final Provider<Context> contextProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public SendMessage_Factory(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    this.contextProvider = contextProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public SendMessage get() {
    return provideInstance(
        contextProvider, conversationRepoProvider, messageRepoProvider, updateBadgeProvider);
  }

  public static SendMessage provideInstance(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new SendMessage(
        contextProvider.get(),
        conversationRepoProvider.get(),
        messageRepoProvider.get(),
        updateBadgeProvider.get());
  }

  public static SendMessage_Factory create(
      Provider<Context> contextProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<UpdateBadge> updateBadgeProvider) {
    return new SendMessage_Factory(
        contextProvider, conversationRepoProvider, messageRepoProvider, updateBadgeProvider);
  }

  public static SendMessage newSendMessage(
      Context context,
      ConversationRepository conversationRepo,
      MessageRepository messageRepo,
      UpdateBadge updateBadge) {
    return new SendMessage(context, conversationRepo, messageRepo, updateBadge);
  }
}
