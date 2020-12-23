package com.moez.QKSMS.repository;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScheduledMessageRepositoryImpl_Factory
    implements Factory<ScheduledMessageRepositoryImpl> {
  private static final ScheduledMessageRepositoryImpl_Factory INSTANCE =
      new ScheduledMessageRepositoryImpl_Factory();

  @Override
  public ScheduledMessageRepositoryImpl get() {
    return provideInstance();
  }

  public static ScheduledMessageRepositoryImpl provideInstance() {
    return new ScheduledMessageRepositoryImpl();
  }

  public static ScheduledMessageRepositoryImpl_Factory create() {
    return INSTANCE;
  }

  public static ScheduledMessageRepositoryImpl newScheduledMessageRepositoryImpl() {
    return new ScheduledMessageRepositoryImpl();
  }
}
