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
public final class CursorToRecipientImpl_Factory implements Factory<CursorToRecipientImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<PermissionManager> permissionManagerProvider;

  public CursorToRecipientImpl_Factory(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    this.contextProvider = contextProvider;
    this.permissionManagerProvider = permissionManagerProvider;
  }

  @Override
  public CursorToRecipientImpl get() {
    return provideInstance(contextProvider, permissionManagerProvider);
  }

  public static CursorToRecipientImpl provideInstance(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    return new CursorToRecipientImpl(contextProvider.get(), permissionManagerProvider.get());
  }

  public static CursorToRecipientImpl_Factory create(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    return new CursorToRecipientImpl_Factory(contextProvider, permissionManagerProvider);
  }

  public static CursorToRecipientImpl newCursorToRecipientImpl(
      Context context, PermissionManager permissionManager) {
    return new CursorToRecipientImpl(context, permissionManager);
  }
}
