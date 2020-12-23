package com.moez.QKSMS.filter;

import com.moez.QKSMS.util.PhoneNumberUtils;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneNumberFilter_Factory implements Factory<PhoneNumberFilter> {
  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  public PhoneNumberFilter_Factory(Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
  }

  @Override
  public PhoneNumberFilter get() {
    return provideInstance(phoneNumberUtilsProvider);
  }

  public static PhoneNumberFilter provideInstance(
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new PhoneNumberFilter(phoneNumberUtilsProvider.get());
  }

  public static PhoneNumberFilter_Factory create(
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new PhoneNumberFilter_Factory(phoneNumberUtilsProvider);
  }

  public static PhoneNumberFilter newPhoneNumberFilter(PhoneNumberUtils phoneNumberUtils) {
    return new PhoneNumberFilter(phoneNumberUtils);
  }
}
