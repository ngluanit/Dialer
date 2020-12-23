package com.moez.QKSMS.interactor;

import com.moez.QKSMS.manager.AlarmManager;
import com.moez.QKSMS.repository.ScheduledMessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdateScheduledMessageAlarms_Factory
    implements Factory<UpdateScheduledMessageAlarms> {
  private final Provider<AlarmManager> alarmManagerProvider;

  private final Provider<ScheduledMessageRepository> scheduledMessageRepoProvider;

  private final Provider<SendScheduledMessage> sendScheduledMessageProvider;

  public UpdateScheduledMessageAlarms_Factory(
      Provider<AlarmManager> alarmManagerProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendScheduledMessage> sendScheduledMessageProvider) {
    this.alarmManagerProvider = alarmManagerProvider;
    this.scheduledMessageRepoProvider = scheduledMessageRepoProvider;
    this.sendScheduledMessageProvider = sendScheduledMessageProvider;
  }

  @Override
  public UpdateScheduledMessageAlarms get() {
    return provideInstance(
        alarmManagerProvider, scheduledMessageRepoProvider, sendScheduledMessageProvider);
  }

  public static UpdateScheduledMessageAlarms provideInstance(
      Provider<AlarmManager> alarmManagerProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendScheduledMessage> sendScheduledMessageProvider) {
    return new UpdateScheduledMessageAlarms(
        alarmManagerProvider.get(),
        scheduledMessageRepoProvider.get(),
        sendScheduledMessageProvider.get());
  }

  public static UpdateScheduledMessageAlarms_Factory create(
      Provider<AlarmManager> alarmManagerProvider,
      Provider<ScheduledMessageRepository> scheduledMessageRepoProvider,
      Provider<SendScheduledMessage> sendScheduledMessageProvider) {
    return new UpdateScheduledMessageAlarms_Factory(
        alarmManagerProvider, scheduledMessageRepoProvider, sendScheduledMessageProvider);
  }

  public static UpdateScheduledMessageAlarms newUpdateScheduledMessageAlarms(
      AlarmManager alarmManager,
      ScheduledMessageRepository scheduledMessageRepo,
      SendScheduledMessage sendScheduledMessage) {
    return new UpdateScheduledMessageAlarms(
        alarmManager, scheduledMessageRepo, sendScheduledMessage);
  }
}
