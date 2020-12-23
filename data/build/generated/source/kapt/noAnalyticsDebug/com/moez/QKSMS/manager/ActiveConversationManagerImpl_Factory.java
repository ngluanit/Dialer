package com.moez.QKSMS.manager;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActiveConversationManagerImpl_Factory
    implements Factory<ActiveConversationManagerImpl> {
  private static final ActiveConversationManagerImpl_Factory INSTANCE =
      new ActiveConversationManagerImpl_Factory();

  @Override
  public ActiveConversationManagerImpl get() {
    return provideInstance();
  }

  public static ActiveConversationManagerImpl provideInstance() {
    return new ActiveConversationManagerImpl();
  }

  public static ActiveConversationManagerImpl_Factory create() {
    return INSTANCE;
  }

  public static ActiveConversationManagerImpl newActiveConversationManagerImpl() {
    return new ActiveConversationManagerImpl();
  }
}
