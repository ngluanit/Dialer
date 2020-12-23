package com.moez.QKSMS.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.f2prateek.rx.preferences2.RxSharedPreferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Preferences_Factory implements Factory<Preferences> {
  private final Provider<Context> contextProvider;

  private final Provider<RxSharedPreferences> rxPrefsProvider;

  private final Provider<SharedPreferences> sharedPrefsProvider;

  public Preferences_Factory(
      Provider<Context> contextProvider,
      Provider<RxSharedPreferences> rxPrefsProvider,
      Provider<SharedPreferences> sharedPrefsProvider) {
    this.contextProvider = contextProvider;
    this.rxPrefsProvider = rxPrefsProvider;
    this.sharedPrefsProvider = sharedPrefsProvider;
  }

  @Override
  public Preferences get() {
    return provideInstance(contextProvider, rxPrefsProvider, sharedPrefsProvider);
  }

  public static Preferences provideInstance(
      Provider<Context> contextProvider,
      Provider<RxSharedPreferences> rxPrefsProvider,
      Provider<SharedPreferences> sharedPrefsProvider) {
    return new Preferences(contextProvider.get(), rxPrefsProvider.get(), sharedPrefsProvider.get());
  }

  public static Preferences_Factory create(
      Provider<Context> contextProvider,
      Provider<RxSharedPreferences> rxPrefsProvider,
      Provider<SharedPreferences> sharedPrefsProvider) {
    return new Preferences_Factory(contextProvider, rxPrefsProvider, sharedPrefsProvider);
  }

  public static Preferences newPreferences(
      Context context, RxSharedPreferences rxPrefs, SharedPreferences sharedPrefs) {
    return new Preferences(context, rxPrefs, sharedPrefs);
  }
}
