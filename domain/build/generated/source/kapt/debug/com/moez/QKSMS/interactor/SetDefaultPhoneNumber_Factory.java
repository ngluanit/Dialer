package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.ContactRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SetDefaultPhoneNumber_Factory implements Factory<SetDefaultPhoneNumber> {
  private final Provider<ContactRepository> contactRepoProvider;

  public SetDefaultPhoneNumber_Factory(Provider<ContactRepository> contactRepoProvider) {
    this.contactRepoProvider = contactRepoProvider;
  }

  @Override
  public SetDefaultPhoneNumber get() {
    return provideInstance(contactRepoProvider);
  }

  public static SetDefaultPhoneNumber provideInstance(
      Provider<ContactRepository> contactRepoProvider) {
    return new SetDefaultPhoneNumber(contactRepoProvider.get());
  }

  public static SetDefaultPhoneNumber_Factory create(
      Provider<ContactRepository> contactRepoProvider) {
    return new SetDefaultPhoneNumber_Factory(contactRepoProvider);
  }

  public static SetDefaultPhoneNumber newSetDefaultPhoneNumber(ContactRepository contactRepo) {
    return new SetDefaultPhoneNumber(contactRepo);
  }
}
