package com.moez.QKSMS.receiver;

import com.moez.QKSMS.compat.SubscriptionManagerCompat;
import com.moez.QKSMS.interactor.MarkRead;
import com.moez.QKSMS.interactor.SendMessage;
import com.moez.QKSMS.repository.ConversationRepository;
import com.moez.QKSMS.repository.MessageRepository;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RemoteMessagingReceiver_MembersInjector
    implements MembersInjector<RemoteMessagingReceiver> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MarkRead> markReadProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<SendMessage> sendMessageProvider;

  private final Provider<SubscriptionManagerCompat> subscriptionManagerProvider;

  public RemoteMessagingReceiver_MembersInjector(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<SendMessage> sendMessageProvider,
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.markReadProvider = markReadProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.sendMessageProvider = sendMessageProvider;
    this.subscriptionManagerProvider = subscriptionManagerProvider;
  }

  public static MembersInjector<RemoteMessagingReceiver> create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<SendMessage> sendMessageProvider,
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider) {
    return new RemoteMessagingReceiver_MembersInjector(
        conversationRepoProvider,
        markReadProvider,
        messageRepoProvider,
        sendMessageProvider,
        subscriptionManagerProvider);
  }

  @Override
  public void injectMembers(RemoteMessagingReceiver instance) {
    injectConversationRepo(instance, conversationRepoProvider.get());
    injectMarkRead(instance, markReadProvider.get());
    injectMessageRepo(instance, messageRepoProvider.get());
    injectSendMessage(instance, sendMessageProvider.get());
    injectSubscriptionManager(instance, subscriptionManagerProvider.get());
  }

  public static void injectConversationRepo(
      RemoteMessagingReceiver instance, ConversationRepository conversationRepo) {
    instance.conversationRepo = conversationRepo;
  }

  public static void injectMarkRead(RemoteMessagingReceiver instance, MarkRead markRead) {
    instance.markRead = markRead;
  }

  public static void injectMessageRepo(
      RemoteMessagingReceiver instance, MessageRepository messageRepo) {
    instance.messageRepo = messageRepo;
  }

  public static void injectSendMessage(RemoteMessagingReceiver instance, SendMessage sendMessage) {
    instance.sendMessage = sendMessage;
  }

  public static void injectSubscriptionManager(
      RemoteMessagingReceiver instance, SubscriptionManagerCompat subscriptionManager) {
    instance.subscriptionManager = subscriptionManager;
  }
}
