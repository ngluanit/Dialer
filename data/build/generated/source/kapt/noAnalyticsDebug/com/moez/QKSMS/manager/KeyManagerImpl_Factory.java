package com.moez.QKSMS.manager;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KeyManagerImpl_Factory implements Factory<KeyManagerImpl> {
  private static final KeyManagerImpl_Factory INSTANCE = new KeyManagerImpl_Factory();

  @Override
  public KeyManagerImpl get() {
    return provideInstance();
  }

  public static KeyManagerImpl provideInstance() {
    return new KeyManagerImpl();
  }

  public static KeyManagerImpl_Factory create() {
    return INSTANCE;
  }

  public static KeyManagerImpl newKeyManagerImpl() {
    return new KeyManagerImpl();
  }
}
