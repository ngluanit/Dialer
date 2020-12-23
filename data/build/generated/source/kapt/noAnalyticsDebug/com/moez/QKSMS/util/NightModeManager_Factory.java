package com.moez.QKSMS.util;

import android.content.Context;
import com.moez.QKSMS.manager.WidgetManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NightModeManager_Factory implements Factory<NightModeManager> {
  private final Provider<Context> contextProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<WidgetManager> widgetManagerProvider;

  public NightModeManager_Factory(
      Provider<Context> contextProvider,
      Provider<Preferences> prefsProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    this.contextProvider = contextProvider;
    this.prefsProvider = prefsProvider;
    this.widgetManagerProvider = widgetManagerProvider;
  }

  @Override
  public NightModeManager get() {
    return provideInstance(contextProvider, prefsProvider, widgetManagerProvider);
  }

  public static NightModeManager provideInstance(
      Provider<Context> contextProvider,
      Provider<Preferences> prefsProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    return new NightModeManager(
        contextProvider.get(), prefsProvider.get(), widgetManagerProvider.get());
  }

  public static NightModeManager_Factory create(
      Provider<Context> contextProvider,
      Provider<Preferences> prefsProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    return new NightModeManager_Factory(contextProvider, prefsProvider, widgetManagerProvider);
  }

  public static NightModeManager newNightModeManager(
      Context context, Preferences prefs, WidgetManager widgetManager) {
    return new NightModeManager(context, prefs, widgetManager);
  }
}
