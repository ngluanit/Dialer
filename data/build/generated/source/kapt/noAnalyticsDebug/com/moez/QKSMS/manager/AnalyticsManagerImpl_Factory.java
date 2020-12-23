package com.moez.QKSMS.manager;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AnalyticsManagerImpl_Factory implements Factory<AnalyticsManagerImpl> {
  private static final AnalyticsManagerImpl_Factory INSTANCE = new AnalyticsManagerImpl_Factory();

  @Override
  public AnalyticsManagerImpl get() {
    return provideInstance();
  }

  public static AnalyticsManagerImpl provideInstance() {
    return new AnalyticsManagerImpl();
  }

  public static AnalyticsManagerImpl_Factory create() {
    return INSTANCE;
  }

  public static AnalyticsManagerImpl newAnalyticsManagerImpl() {
    return new AnalyticsManagerImpl();
  }
}
