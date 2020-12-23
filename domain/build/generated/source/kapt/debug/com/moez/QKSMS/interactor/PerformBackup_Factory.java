package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.BackupRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PerformBackup_Factory implements Factory<PerformBackup> {
  private final Provider<BackupRepository> backupRepoProvider;

  public PerformBackup_Factory(Provider<BackupRepository> backupRepoProvider) {
    this.backupRepoProvider = backupRepoProvider;
  }

  @Override
  public PerformBackup get() {
    return provideInstance(backupRepoProvider);
  }

  public static PerformBackup provideInstance(Provider<BackupRepository> backupRepoProvider) {
    return new PerformBackup(backupRepoProvider.get());
  }

  public static PerformBackup_Factory create(Provider<BackupRepository> backupRepoProvider) {
    return new PerformBackup_Factory(backupRepoProvider);
  }

  public static PerformBackup newPerformBackup(BackupRepository backupRepo) {
    return new PerformBackup(backupRepo);
  }
}
