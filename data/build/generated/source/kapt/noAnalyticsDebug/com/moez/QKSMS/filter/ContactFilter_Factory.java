package com.moez.QKSMS.filter;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactFilter_Factory implements Factory<ContactFilter> {
  private final Provider<PhoneNumberFilter> phoneNumberFilterProvider;

  public ContactFilter_Factory(Provider<PhoneNumberFilter> phoneNumberFilterProvider) {
    this.phoneNumberFilterProvider = phoneNumberFilterProvider;
  }

  @Override
  public ContactFilter get() {
    return provideInstance(phoneNumberFilterProvider);
  }

  public static ContactFilter provideInstance(
      Provider<PhoneNumberFilter> phoneNumberFilterProvider) {
    return new ContactFilter(phoneNumberFilterProvider.get());
  }

  public static ContactFilter_Factory create(
      Provider<PhoneNumberFilter> phoneNumberFilterProvider) {
    return new ContactFilter_Factory(phoneNumberFilterProvider);
  }

  public static ContactFilter newContactFilter(PhoneNumberFilter phoneNumberFilter) {
    return new ContactFilter(phoneNumberFilter);
  }
}
