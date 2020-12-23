package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.SyncRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncMessages_Factory implements Factory<SyncMessages> {
  private final Provider<SyncRepository> syncManagerProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public SyncMessages_Factory(
      Provider<SyncRepository> syncManagerProvider, Provider<UpdateBadge> updateBadgeProvider) {
    this.syncManagerProvider = syncManagerProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public SyncMessages get() {
    return provideInstance(syncManagerProvider, updateBadgeProvider);
  }

  public static SyncMessages provideInstance(
      Provider<SyncRepository> syncManagerProvider, Provider<UpdateBadge> updateBadgeProvider) {
    return new SyncMessages(syncManagerProvider.get(), updateBadgeProvider.get());
  }

  public static SyncMessages_Factory create(
      Provider<SyncRepository> syncManagerProvider, Provider<UpdateBadge> updateBadgeProvider) {
    return new SyncMessages_Factory(syncManagerProvider, updateBadgeProvider);
  }

  public static SyncMessages newSyncMessages(SyncRepository syncManager, UpdateBadge updateBadge) {
    return new SyncMessages(syncManager, updateBadge);
  }
}
