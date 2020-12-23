package com.moez.QKSMS.interactor;

import android.content.Context;
import com.moez.QKSMS.repository.ScheduledMessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SendScheduledMessage_Factory implements Factory<SendScheduledMessage> {
  private final Provider<Context> contextProvider;

  private final Provider<ScheduledMessageRepository> scheduledMessageRepoProvider;

  private final Provider<SendMessage> sendMessageProvider;

  public SendScheduledMessage_Factory(
      Provider<Context> contextProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendMessage> sendMessageProvider) {
    this.contextProvider = contextProvider;
    this.scheduledMessageRepoProvider = scheduledMessageRepoProvider;
    this.sendMessageProvider = sendMessageProvider;
  }

  @Override
  public SendScheduledMessage get() {
    return provideInstance(contextProvider, scheduledMessageRepoProvider, sendMessageProvider);
  }

  public static SendScheduledMessage provideInstance(
      Provider<Context> contextProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendMessage> sendMessageProvider) {
    return new SendScheduledMessage(
        contextProvider.get(), scheduledMessageRepoProvider.get(), sendMessageProvider.get());
  }

  public static SendScheduledMessage_Factory create(
      Provider<Context> contextProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendMessage> sendMessageProvider) {
    return new SendScheduledMessage_Factory(
        contextProvider, scheduledMessageRepoProvider, sendMessageProvider);
  }

  public static SendScheduledMessage newSendScheduledMessage(
      Context context, ScheduledMessageRepository scheduledMessageRepo, SendMessage sendMessage) {
    return new SendScheduledMessage(context, scheduledMessageRepo, sendMessage);
  }
}
