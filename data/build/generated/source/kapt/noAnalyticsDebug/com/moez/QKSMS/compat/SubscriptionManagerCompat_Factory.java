package com.moez.QKSMS.compat;

import android.content.Context;
import com.moez.QKSMS.manager.PermissionManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubscriptionManagerCompat_Factory implements Factory<SubscriptionManagerCompat> {
  private final Provider<Context> contextProvider;

  private final Provider<PermissionManager> permissionsProvider;

  public SubscriptionManagerCompat_Factory(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionsProvider) {
    this.contextProvider = contextProvider;
    this.permissionsProvider = permissionsProvider;
  }

  @Override
  public SubscriptionManagerCompat get() {
    return provideInstance(contextProvider, permissionsProvider);
  }

  public static SubscriptionManagerCompat provideInstance(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionsProvider) {
    return new SubscriptionManagerCompat(contextProvider.get(), permissionsProvider.get());
  }

  public static SubscriptionManagerCompat_Factory create(
      Provider<Context> contextProvider, Provider<PermissionManager> permissionsProvider) {
    return new SubscriptionManagerCompat_Factory(contextProvider, permissionsProvider);
  }

  public static SubscriptionManagerCompat newSubscriptionManagerCompat(
      Context context, PermissionManager permissions) {
    return new SubscriptionManagerCompat(context, permissions);
  }
}
