package com.moez.QKSMS.mapper;

import android.content.Context;
import com.moez.QKSMS.manager.KeyManager;
import com.moez.QKSMS.manager.PermissionManager;
import com.moez.QKSMS.util.Preferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CursorToMessageImpl_Factory implements Factory<CursorToMessageImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<CursorToPart> cursorToPartProvider;

  private final Provider<KeyManager> keysProvider;

  private final Provider<PermissionManager> permissionManagerProvider;

  private final Provider<Preferences> preferencesProvider;

  public CursorToMessageImpl_Factory(
      Provider<Context> contextProvider,
      Provider<CursorToPart> cursorToPartProvider,
      Provider<KeyManager> keysProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<Preferences> preferencesProvider) {
    this.contextProvider = contextProvider;
    this.cursorToPartProvider = cursorToPartProvider;
    this.keysProvider = keysProvider;
    this.permissionManagerProvider = permissionManagerProvider;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public CursorToMessageImpl get() {
    return provideInstance(
        contextProvider,
        cursorToPartProvider,
        keysProvider,
        permissionManagerProvider,
        preferencesProvider);
  }

  public static CursorToMessageImpl provideInstance(
      Provider<Context> contextProvider,
      Provider<CursorToPart> cursorToPartProvider,
      Provider<KeyManager> keysProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<Preferences> preferencesProvider) {
    return new CursorToMessageImpl(
        contextProvider.get(),
        cursorToPartProvider.get(),
        keysProvider.get(),
        permissionManagerProvider.get(),
        preferencesProvider.get());
  }

  public static CursorToMessageImpl_Factory create(
      Provider<Context> contextProvider,
      Provider<CursorToPart> cursorToPartProvider,
      Provider<KeyManager> keysProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<Preferences> preferencesProvider) {
    return new CursorToMessageImpl_Factory(
        contextProvider,
        cursorToPartProvider,
        keysProvider,
        permissionManagerProvider,
        preferencesProvider);
  }

  public static CursorToMessageImpl newCursorToMessageImpl(
      Context context,
      CursorToPart cursorToPart,
      KeyManager keys,
      PermissionManager permissionManager,
      Preferences preferences) {
    return new CursorToMessageImpl(context, cursorToPart, keys, permissionManager, preferences);
  }
}
