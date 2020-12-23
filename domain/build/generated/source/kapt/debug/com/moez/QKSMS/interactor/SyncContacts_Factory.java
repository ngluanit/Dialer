package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.SyncRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncContacts_Factory implements Factory<SyncContacts> {
  private final Provider<SyncRepository> syncManagerProvider;

  public SyncContacts_Factory(Provider<SyncRepository> syncManagerProvider) {
    this.syncManagerProvider = syncManagerProvider;
  }

  @Override
  public SyncContacts get() {
    return provideInstance(syncManagerProvider);
  }

  public static SyncContacts provideInstance(Provider<SyncRepository> syncManagerProvider) {
    return new SyncContacts(syncManagerProvider.get());
  }

  public static SyncContacts_Factory create(Provider<SyncRepository> syncManagerProvider) {
    return new SyncContacts_Factory(syncManagerProvider);
  }

  public static SyncContacts newSyncContacts(SyncRepository syncManager) {
    return new SyncContacts(syncManager);
  }
}
