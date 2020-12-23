package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.RetrySending;
import com.moez.QKSMS.repository.MessageRepository;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SendSmsReceiver_MembersInjector implements MembersInjector<SendSmsReceiver> {
  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<RetrySending> retrySendingProvider;

  public SendSmsReceiver_MembersInjector(
      Provider<MessageRepository> messageRepoProvider,
      Provider<RetrySending> retrySendingProvider) {
    this.messageRepoProvider = messageRepoProvider;
    this.retrySendingProvider = retrySendingProvider;
  }

  public static MembersInjector<SendSmsReceiver> create(
      Provider<MessageRepository> messageRepoProvider,
      Provider<RetrySending> retrySendingProvider) {
    return new SendSmsReceiver_MembersInjector(messageRepoProvider, retrySendingProvider);
  }

  @Override
  public void injectMembers(SendSmsReceiver instance) {
    injectMessageRepo(instance, messageRepoProvider.get());
    injectRetrySending(instance, retrySendingProvider.get());
  }

  public static void injectMessageRepo(SendSmsReceiver instance, MessageRepository messageRepo) {
    instance.messageRepo = messageRepo;
  }

  public static void injectRetrySending(SendSmsReceiver instance, RetrySending retrySending) {
    instance.retrySending = retrySending;
  }
}
