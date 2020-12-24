package com.moez.QKSMS.manager;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PermissionManagerImpl_Factory implements Factory<PermissionManagerImpl> {
  private final Provider<Context> contextProvider;

  public PermissionManagerImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PermissionManagerImpl get() {
    return provideInstance(contextProvider);
  }

  public static PermissionManagerImpl provideInstance(Provider<Context> contextProvider) {
    return new PermissionManagerImpl(contextProvider.get());
  }

  public static PermissionManagerImpl_Factory create(Provider<Context> contextProvider) {
    return new PermissionManagerImpl_Factory(contextProvider);
  }

  public static PermissionManagerImpl newPermissionManagerImpl(Context context) {
    return new PermissionManagerImpl(context);
  }
}
