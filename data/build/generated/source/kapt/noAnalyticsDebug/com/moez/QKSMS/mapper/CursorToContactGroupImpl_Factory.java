package com.moez.QKSMS.mapper;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CursorToContactGroupImpl_Factory implements Factory<CursorToContactGroupImpl> {
  private final Provider<Context> contextProvider;

  public CursorToContactGroupImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CursorToContactGroupImpl get() {
    return provideInstance(contextProvider);
  }

  public static CursorToContactGroupImpl provideInstance(Provider<Context> contextProvider) {
    return new CursorToContactGroupImpl(contextProvider.get());
  }

  public static CursorToContactGroupImpl_Factory create(Provider<Context> contextProvider) {
    return new CursorToContactGroupImpl_Factory(contextProvider);
  }

  public static CursorToContactGroupImpl newCursorToContactGroupImpl(Context context) {
    return new CursorToContactGroupImpl(context);
  }
}
