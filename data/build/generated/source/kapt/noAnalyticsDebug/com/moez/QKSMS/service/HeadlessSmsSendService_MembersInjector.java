package com.moez.QKSMS.service;

import com.moez.QKSMS.interactor.SendMessage;
import com.moez.QKSMS.repository.ConversationRepository;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeadlessSmsSendService_MembersInjector
    implements MembersInjector<HeadlessSmsSendService> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<SendMessage> sendMessageProvider;

  public HeadlessSmsSendService_MembersInjector(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<SendMessage> sendMessageProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.sendMessageProvider = sendMessageProvider;
  }

  public static MembersInjector<HeadlessSmsSendService> create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<SendMessage> sendMessageProvider) {
    return new HeadlessSmsSendService_MembersInjector(
        conversationRepoProvider, sendMessageProvider);
  }

  @Override
  public void injectMembers(HeadlessSmsSendService instance) {
    injectConversationRepo(instance, conversationRepoProvider.get());
    injectSendMessage(instance, sendMessageProvider.get());
  }

  public static void injectConversationRepo(
      HeadlessSmsSendService instance, ConversationRepository conversationRepo) {
    instance.conversationRepo = conversationRepo;
  }

  public static void injectSendMessage(HeadlessSmsSendService instance, SendMessage sendMessage) {
    instance.sendMessage = sendMessage;
  }
}
