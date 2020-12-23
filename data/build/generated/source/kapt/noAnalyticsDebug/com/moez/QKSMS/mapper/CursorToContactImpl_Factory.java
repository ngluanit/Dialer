package com.moez.QKSMS.mapper;

import android.content.Context;
import com.moez.QKSMS.manager.PermissionManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CursorToContactImpl_Factory implements Factory<CursorToContactImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<PermissionManager> permissionManagerProvider;

  public CursorToContactImpl_Factory(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    this.contextProvider = contextProvider;
    this.permissionManagerProvider = permissionManagerProvider;
  }

  @Override
  public CursorToContactImpl get() {
    return provideInstance(contextProvider, permissionManagerProvider);
  }

  public static CursorToContactImpl provideInstance(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    return new CursorToContactImpl(contextProvider.get(), permissionManagerProvider.get());
  }

  public static CursorToContactImpl_Factory create(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    return new CursorToContactImpl_Factory(contextProvider, permissionManagerProvider);
  }

  public static CursorToContactImpl newCursorToContactImpl(
      Context context, PermissionManager permissionManager) {
    return new CursorToContactImpl(context, permissionManager);
  }
}
