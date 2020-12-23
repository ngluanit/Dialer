package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.UpdateScheduledMessageAlarms;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BootReceiver_MembersInjector implements MembersInjector<BootReceiver> {
  private final Provider<UpdateScheduledMessageAlarms> updateScheduledMessageAlarmsProvider;

  public BootReceiver_MembersInjector(
      Provider<UpdateScheduledMessageAlarms> updateScheduledMessageAlarmsProvider) {
    this.updateScheduledMessageAlarmsProvider = updateScheduledMessageAlarmsProvider;
  }

  public static MembersInjector<BootReceiver> create(
      Provider<UpdateScheduledMessageAlarms> updateScheduledMessageAlarmsProvider) {
    return new BootReceiver_MembersInjector(updateScheduledMessageAlarmsProvider);
  }

  @Override
  public void injectMembers(BootReceiver instance) {
    injectUpdateScheduledMessageAlarms(instance, updateScheduledMessageAlarmsProvider.get());
  }

  public static void injectUpdateScheduledMessageAlarms(
      BootReceiver instance, UpdateScheduledMessageAlarms updateScheduledMessageAlarms) {
    instance.updateScheduledMessageAlarms = updateScheduledMessageAlarms;
  }
}
