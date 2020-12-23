package com.moez.QKSMS.receiver;

import com.moez.QKSMS.util.NightModeManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NightModeReceiver_MembersInjector implements MembersInjector<NightModeReceiver> {
  private final Provider<NightModeManager> nightModeManagerProvider;

  public NightModeReceiver_MembersInjector(Provider<NightModeManager> nightModeManagerProvider) {
    this.nightModeManagerProvider = nightModeManagerProvider;
  }

  public static MembersInjector<NightModeReceiver> create(
      Provider<NightModeManager> nightModeManagerProvider) {
    return new NightModeReceiver_MembersInjector(nightModeManagerProvider);
  }

  @Override
  public void injectMembers(NightModeReceiver instance) {
    injectNightModeManager(instance, nightModeManagerProvider.get());
  }

  public static void injectNightModeManager(
      NightModeReceiver instance, NightModeManager nightModeManager) {
    instance.nightModeManager = nightModeManager;
  }
}
