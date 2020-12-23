package com.moez.QKSMS.repository;

import android.content.Context;
import com.moez.QKSMS.util.Preferences;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BackupRepositoryImpl_Factory implements Factory<BackupRepositoryImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<Moshi> moshiProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<SyncRepository> syncRepoProvider;

  public BackupRepositoryImpl_Factory(
      Provider<Context> contextProvider,
      Provider<Moshi> moshiProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncRepoProvider) {
    this.contextProvider = contextProvider;
    this.moshiProvider = moshiProvider;
    this.prefsProvider = prefsProvider;
    this.syncRepoProvider = syncRepoProvider;
  }

  @Override
  public BackupRepositoryImpl get() {
    return provideInstance(contextProvider, moshiProvider, prefsProvider, syncRepoProvider);
  }

  public static BackupRepositoryImpl provideInstance(
      Provider<Context> contextProvider,
      Provider<Moshi> moshiProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncRepoProvider) {
    return new BackupRepositoryImpl(
        contextProvider.get(), moshiProvider.get(), prefsProvider.get(), syncRepoProvider.get());
  }

  public static BackupRepositoryImpl_Factory create(
      Provider<Context> contextProvider,
      Provider<Moshi> moshiProvider,
      Provider<Preferences> prefsProvider,
      Provider<SyncRepository> syncRepoProvider) {
    return new BackupRepositoryImpl_Factory(
        contextProvider, moshiProvider, prefsProvider, syncRepoProvider);
  }

  public static BackupRepositoryImpl newBackupRepositoryImpl(
      Context context, Moshi moshi, Preferences prefs, SyncRepository syncRepo) {
    return new BackupRepositoryImpl(context, moshi, prefs, syncRepo);
  }
}
