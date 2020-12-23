package com.moez.QKSMS.manager;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WidgetManagerImpl_Factory implements Factory<WidgetManagerImpl> {
  private final Provider<Context> contextProvider;

  public WidgetManagerImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public WidgetManagerImpl get() {
    return provideInstance(contextProvider);
  }

  public static WidgetManagerImpl provideInstance(Provider<Context> contextProvider) {
    return new WidgetManagerImpl(contextProvider.get());
  }

  public static WidgetManagerImpl_Factory create(Provider<Context> contextProvider) {
    return new WidgetManagerImpl_Factory(contextProvider);
  }

  public static WidgetManagerImpl newWidgetManagerImpl(Context context) {
    return new WidgetManagerImpl(context);
  }
}
