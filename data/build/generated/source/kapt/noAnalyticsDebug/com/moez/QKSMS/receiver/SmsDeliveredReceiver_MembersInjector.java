package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.MarkDelivered;
import com.moez.QKSMS.interactor.MarkDeliveryFailed;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SmsDeliveredReceiver_MembersInjector
    implements MembersInjector<SmsDeliveredReceiver> {
  private final Provider<MarkDelivered> markDeliveredProvider;

  private final Provider<MarkDeliveryFailed> markDeliveryFailedProvider;

  public SmsDeliveredReceiver_MembersInjector(
      Provider<MarkDelivered> markDeliveredProvider,
      Provider<MarkDeliveryFailed> markDeliveryFailedProvider) {
    this.markDeliveredProvider = markDeliveredProvider;
    this.markDeliveryFailedProvider = markDeliveryFailedProvider;
  }

  public static MembersInjector<SmsDeliveredReceiver> create(
      Provider<MarkDelivered> markDeliveredProvider,
      Provider<MarkDeliveryFailed> markDeliveryFailedProvider) {
    return new SmsDeliveredReceiver_MembersInjector(
        markDeliveredProvider, markDeliveryFailedProvider);
  }

  @Override
  public void injectMembers(SmsDeliveredReceiver instance) {
    injectMarkDelivered(instance, markDeliveredProvider.get());
    injectMarkDeliveryFailed(instance, markDeliveryFailedProvider.get());
  }

  public static void injectMarkDelivered(
      SmsDeliveredReceiver instance, MarkDelivered markDelivered) {
    instance.markDelivered = markDelivered;
  }

  public static void injectMarkDeliveryFailed(
      SmsDeliveredReceiver instance, MarkDeliveryFailed markDeliveryFailed) {
    instance.markDeliveryFailed = markDeliveryFailed;
  }
}
