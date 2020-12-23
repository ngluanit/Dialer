package com.moez.QKSMS.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneNumberUtils_Factory implements Factory<PhoneNumberUtils> {
  private final Provider<Context> contextProvider;

  public PhoneNumberUtils_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PhoneNumberUtils get() {
    return provideInstance(contextProvider);
  }

  public static PhoneNumberUtils provideInstance(Provider<Context> contextProvider) {
    return new PhoneNumberUtils(contextProvider.get());
  }

  public static PhoneNumberUtils_Factory create(Provider<Context> contextProvider) {
    return new PhoneNumberUtils_Factory(contextProvider);
  }

  public static PhoneNumberUtils newPhoneNumberUtils(Context context) {
    return new PhoneNumberUtils(context);
  }
}
