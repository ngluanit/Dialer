package com.moez.QKSMS.repository;

import com.moez.QKSMS.util.PhoneNumberUtils;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockingRepositoryImpl_Factory implements Factory<BlockingRepositoryImpl> {
  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  public BlockingRepositoryImpl_Factory(Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
  }

  @Override
  public BlockingRepositoryImpl get() {
    return provideInstance(phoneNumberUtilsProvider);
  }

  public static BlockingRepositoryImpl provideInstance(
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new BlockingRepositoryImpl(phoneNumberUtilsProvider.get());
  }

  public static BlockingRepositoryImpl_Factory create(
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new BlockingRepositoryImpl_Factory(phoneNumberUtilsProvider);
  }

  public static BlockingRepositoryImpl newBlockingRepositoryImpl(
      PhoneNumberUtils phoneNumberUtils) {
    return new BlockingRepositoryImpl(phoneNumberUtils);
  }
}
