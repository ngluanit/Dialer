package com.moez.QKSMS.mapper;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CursorToContactGroupMemberImpl_Factory
    implements Factory<CursorToContactGroupMemberImpl> {
  private final Provider<Context> contextProvider;

  public CursorToContactGroupMemberImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CursorToContactGroupMemberImpl get() {
    return provideInstance(contextProvider);
  }

  public static CursorToContactGroupMemberImpl provideInstance(Provider<Context> contextProvider) {
    return new CursorToContactGroupMemberImpl(contextProvider.get());
  }

  public static CursorToContactGroupMemberImpl_Factory create(Provider<Context> contextProvider) {
    return new CursorToContactGroupMemberImpl_Factory(contextProvider);
  }

  public static CursorToContactGroupMemberImpl newCursorToContactGroupMemberImpl(Context context) {
    return new CursorToContactGroupMemberImpl(context);
  }
}
