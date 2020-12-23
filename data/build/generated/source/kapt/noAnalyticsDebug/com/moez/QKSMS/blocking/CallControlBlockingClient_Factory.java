package com.moez.QKSMS.blocking;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CallControlBlockingClient_Factory implements Factory<CallControlBlockingClient> {
  private final Provider<Context> contextProvider;

  public CallControlBlockingClient_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CallControlBlockingClient get() {
    return provideInstance(contextProvider);
  }

  public static CallControlBlockingClient provideInstance(Provider<Context> contextProvider) {
    return new CallControlBlockingClient(contextProvider.get());
  }

  public static CallControlBlockingClient_Factory create(Provider<Context> contextProvider) {
    return new CallControlBlockingClient_Factory(contextProvider);
  }

  public static CallControlBlockingClient newCallControlBlockingClient(Context context) {
    return new CallControlBlockingClient(context);
  }
}
