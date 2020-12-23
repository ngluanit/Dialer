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
public final class CursorToConversationImpl_Factory implements Factory<CursorToConversationImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<PermissionManager> permissionManagerProvider;

  public CursorToConversationImpl_Factory(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    this.contextProvider = contextProvider;
    this.permissionManagerProvider = permissionManagerProvider;
  }

  @Override
  public CursorToConversationImpl get() {
    return provideInstance(contextProvider, permissionManagerProvider);
  }

  public static CursorToConversationImpl provideInstance(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    return new CursorToConversationImpl(contextProvider.get(), permissionManagerProvider.get());
  }

  public static CursorToConversationImpl_Factory create(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionManagerProvider) {
    return new CursorToConversationImpl_Factory(contextProvider, permissionManagerProvider);
  }

  public static CursorToConversationImpl newCursorToConversationImpl(
      Context context, PermissionManager permissionManager) {
    return new CursorToConversationImpl(context, permissionManager);
  }
}
