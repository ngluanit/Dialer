package com.moez.QKSMS.manager;

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
public final class ChangelogManagerImpl_Factory implements Factory<ChangelogManagerImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<Moshi> moshiProvider;

  private final Provider<Preferences> prefsProvider;

  public ChangelogManagerImpl_Factory(
      Provider<Context> contextProvider,
      Provider<Moshi> moshiProvider,
      Provider<Preferences> prefsProvider) {
    this.contextProvider = contextProvider;
    this.moshiProvider = moshiProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public ChangelogManagerImpl get() {
    return provideInstance(contextProvider, moshiProvider, prefsProvider);
  }

  public static ChangelogManagerImpl provideInstance(
      Provider<Context> contextProvider,
      Provider<Moshi> moshiProvider,
      Provider<Preferences> prefsProvider) {
    return new ChangelogManagerImpl(
        contextProvider.get(), moshiProvider.get(), prefsProvider.get());
  }

  public static ChangelogManagerImpl_Factory create(
      Provider<Context> contextProvider,
      Provider<Moshi> moshiProvider,
      Provider<Preferences> prefsProvider) {
    return new ChangelogManagerImpl_Factory(contextProvider, moshiProvider, prefsProvider);
  }

  public static ChangelogManagerImpl newChangelogManagerImpl(
      Context context, Moshi moshi, Preferences prefs) {
    return new ChangelogManagerImpl(context, moshi, prefs);
  }
}
