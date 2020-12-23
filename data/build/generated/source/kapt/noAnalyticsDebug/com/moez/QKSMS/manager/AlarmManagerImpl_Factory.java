package com.moez.QKSMS.manager;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlarmManagerImpl_Factory implements Factory<AlarmManagerImpl> {
  private final Provider<Context> contextProvider;

  public AlarmManagerImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AlarmManagerImpl get() {
    return provideInstance(contextProvider);
  }

  public static AlarmManagerImpl provideInstance(Provider<Context> contextProvider) {
    return new AlarmManagerImpl(contextProvider.get());
  }

  public static AlarmManagerImpl_Factory create(Provider<Context> contextProvider) {
    return new AlarmManagerImpl_Factory(contextProvider);
  }

  public static AlarmManagerImpl newAlarmManagerImpl(Context context) {
    return new AlarmManagerImpl(context);
  }
}
