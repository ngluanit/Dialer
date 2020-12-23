package com.moez.QKSMS.filter;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactGroupFilter_Factory implements Factory<ContactGroupFilter> {
  private final Provider<ContactFilter> contactFilterProvider;

  public ContactGroupFilter_Factory(Provider<ContactFilter> contactFilterProvider) {
    this.contactFilterProvider = contactFilterProvider;
  }

  @Override
  public ContactGroupFilter get() {
    return provideInstance(contactFilterProvider);
  }

  public static ContactGroupFilter provideInstance(Provider<ContactFilter> contactFilterProvider) {
    return new ContactGroupFilter(contactFilterProvider.get());
  }

  public static ContactGroupFilter_Factory create(Provider<ContactFilter> contactFilterProvider) {
    return new ContactGroupFilter_Factory(contactFilterProvider);
  }

  public static ContactGroupFilter newContactGroupFilter(ContactFilter contactFilter) {
    return new ContactGroupFilter(contactFilter);
  }
}
