package com.moez.QKSMS.mapper;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CursorToPartImpl_Factory implements Factory<CursorToPartImpl> {
  private final Provider<Context> contextProvider;

  public CursorToPartImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CursorToPartImpl get() {
    return provideInstance(contextProvider);
  }

  public static CursorToPartImpl provideInstance(Provider<Context> contextProvider) {
    return new CursorToPartImpl(contextProvider.get());
  }

  public static CursorToPartImpl_Factory create(Provider<Context> contextProvider) {
    return new CursorToPartImpl_Factory(contextProvider);
  }

  public static CursorToPartImpl newCursorToPartImpl(Context context) {
    return new CursorToPartImpl(context);
  }
}
