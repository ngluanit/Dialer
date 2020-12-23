package com.moez.QKSMS.listener;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactAddedListenerImpl_Factory implements Factory<ContactAddedListenerImpl> {
  private final Provider<Context> contextProvider;

  public ContactAddedListenerImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ContactAddedListenerImpl get() {
    return provideInstance(contextProvider);
  }

  public static ContactAddedListenerImpl provideInstance(Provider<Context> contextProvider) {
    return new ContactAddedListenerImpl(contextProvider.get());
  }

  public static ContactAddedListenerImpl_Factory create(Provider<Context> contextProvider) {
    return new ContactAddedListenerImpl_Factory(contextProvider);
  }

  public static ContactAddedListenerImpl newContactAddedListenerImpl(Context context) {
    return new ContactAddedListenerImpl(context);
  }
}
