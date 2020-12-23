package com.moez.QKSMS.blocking;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ShouldIAnswerBlockingClient_Factory
    implements Factory<ShouldIAnswerBlockingClient> {
  private final Provider<Context> contextProvider;

  public ShouldIAnswerBlockingClient_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ShouldIAnswerBlockingClient get() {
    return provideInstance(contextProvider);
  }

  public static ShouldIAnswerBlockingClient provideInstance(Provider<Context> contextProvider) {
    return new ShouldIAnswerBlockingClient(contextProvider.get());
  }

  public static ShouldIAnswerBlockingClient_Factory create(Provider<Context> contextProvider) {
    return new ShouldIAnswerBlockingClient_Factory(contextProvider);
  }

  public static ShouldIAnswerBlockingClient newShouldIAnswerBlockingClient(Context context) {
    return new ShouldIAnswerBlockingClient(context);
  }
}
