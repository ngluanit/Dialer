package com.moez.QKSMS.manager;

import android.content.Context;
import com.moez.QKSMS.util.Preferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReferralManagerImpl_Factory implements Factory<ReferralManagerImpl> {
  private final Provider<AnalyticsManager> analyticsProvider;

  private final Provider<Context> contextProvider;

  private final Provider<Preferences> prefsProvider;

  public ReferralManagerImpl_Factory(
      Provider<AnalyticsManager> analyticsProvider,
      Provider<Context> contextProvider,
      Provider<Preferences> prefsProvider) {
    this.analyticsProvider = analyticsProvider;
    this.contextProvider = contextProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public ReferralManagerImpl get() {
    return provideInstance(analyticsProvider, contextProvider, prefsProvider);
  }

  public static ReferralManagerImpl provideInstance(
      Provider<AnalyticsManager> analyticsProvider,
      Provider<Context> contextProvider,
      Provider<Preferences> prefsProvider) {
    return new ReferralManagerImpl(
        analyticsProvider.get(), contextProvider.get(), prefsProvider.get());
  }

  public static ReferralManagerImpl_Factory create(
      Provider<AnalyticsManager> analyticsProvider,
      Provider<Context> contextProvider,
      Provider<Preferences> prefsProvider) {
    return new ReferralManagerImpl_Factory(analyticsProvider, contextProvider, prefsProvider);
  }

  public static ReferralManagerImpl newReferralManagerImpl(
      AnalyticsManager analytics, Context context, Preferences prefs) {
    return new ReferralManagerImpl(analytics, context, prefs);
  }
}
