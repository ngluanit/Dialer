package com.moez.QKSMS.filter;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecipientFilter_Factory implements Factory<RecipientFilter> {
  private final Provider<ContactFilter> contactFilterProvider;

  private final Provider<PhoneNumberFilter> phoneNumberFilterProvider;

  public RecipientFilter_Factory(
      Provider<ContactFilter> contactFilterProvider,
      Provider<PhoneNumberFilter> phoneNumberFilterProvider) {
    this.contactFilterProvider = contactFilterProvider;
    this.phoneNumberFilterProvider = phoneNumberFilterProvider;
  }

  @Override
  public RecipientFilter get() {
    return provideInstance(contactFilterProvider, phoneNumberFilterProvider);
  }

  public static RecipientFilter provideInstance(
      Provider<ContactFilter> contactFilterProvider,
      Provider<PhoneNumberFilter> phoneNumberFilterProvider) {
    return new RecipientFilter(contactFilterProvider.get(), phoneNumberFilterProvider.get());
  }

  public static RecipientFilter_Factory create(
      Provider<ContactFilter> contactFilterProvider,
      Provider<PhoneNumberFilter> phoneNumberFilterProvider) {
    return new RecipientFilter_Factory(contactFilterProvider, phoneNumberFilterProvider);
  }

  public static RecipientFilter newRecipientFilter(
      ContactFilter contactFilter, PhoneNumberFilter phoneNumberFilter) {
    return new RecipientFilter(contactFilter, phoneNumberFilter);
  }
}
