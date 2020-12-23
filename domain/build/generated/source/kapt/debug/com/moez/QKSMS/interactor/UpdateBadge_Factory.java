package com.moez.QKSMS.interactor;

import com.moez.QKSMS.manager.ShortcutManager;
import com.moez.QKSMS.manager.WidgetManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdateBadge_Factory implements Factory<UpdateBadge> {
  private final Provider<ShortcutManager> shortcutManagerProvider;

  private final Provider<WidgetManager> widgetManagerProvider;

  public UpdateBadge_Factory(
      Provider<ShortcutManager> shortcutManagerProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    this.shortcutManagerProvider = shortcutManagerProvider;
    this.widgetManagerProvider = widgetManagerProvider;
  }

  @Override
  public UpdateBadge get() {
    return provideInstance(shortcutManagerProvider, widgetManagerProvider);
  }

  public static UpdateBadge provideInstance(
      Provider<ShortcutManager> shortcutManagerProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    return new UpdateBadge(shortcutManagerProvider.get(), widgetManagerProvider.get());
  }

  public static UpdateBadge_Factory create(
      Provider<ShortcutManager> shortcutManagerProvider,
      Provider<WidgetManager> widgetManagerProvider) {
    return new UpdateBadge_Factory(shortcutManagerProvider, widgetManagerProvider);
  }

  public static UpdateBadge newUpdateBadge(
      ShortcutManager shortcutManager, WidgetManager widgetManager) {
    return new UpdateBadge(shortcutManager, widgetManager);
  }
}
