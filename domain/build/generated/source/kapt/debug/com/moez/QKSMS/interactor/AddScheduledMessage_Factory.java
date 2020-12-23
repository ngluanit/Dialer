package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.ScheduledMessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddScheduledMessage_Factory implements Factory<AddScheduledMessage> {
  private final Provider<ScheduledMessageRepository> scheduledMessageRepoProvider;

  private final Provider<UpdateScheduledMessageAlarms> updateScheduledMessageAlarmsProvider;

  public AddScheduledMessage_Factory(
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<UpdateScheduledMessageAlarms> updateScheduledMessageAlarmsProvider) {
    this.scheduledMessageRepoProvider = scheduledMessageRepoProvider;
    this.updateScheduledMessageAlarmsProvider = updateScheduledMessageAlarmsProvider;
  }

  @Override
  public AddScheduledMessage get() {
    return provideInstance(scheduledMessageRepoProvider, updateScheduledMessageAlarmsProvider);
  }

  public static AddScheduledMessage provideInstance(
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<UpdateScheduledMessageAlarms> updateScheduledMessageAlarmsProvider) {
    return new AddScheduledMessage(
        scheduledMessageRepoProvider.get(), updateScheduledMessageAlarmsProvider.get());
  }

  public static AddScheduledMessage_Factory create(
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<UpdateScheduledMessageAlarms> updateScheduledMessageAlarmsProvider) {
    return new AddScheduledMessage_Factory(
        scheduledMessageRepoProvider, updateScheduledMessageAlarmsProvider);
  }

  public static AddScheduledMessage newAddScheduledMessage(
      ScheduledMessageRepository scheduledMessageRepo,
      UpdateScheduledMessageAlarms updateScheduledMessageAlarms) {
    return new AddScheduledMessage(scheduledMessageRepo, updateScheduledMessageAlarms);
  }
}
