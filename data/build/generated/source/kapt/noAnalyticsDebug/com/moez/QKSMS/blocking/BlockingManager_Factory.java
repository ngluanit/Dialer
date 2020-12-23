package com.moez.QKSMS.blocking;

import com.moez.QKSMS.util.Preferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockingManager_Factory implements Factory<BlockingManager> {
  private final Provider<Preferences> prefsProvider;

  private final Provider<CallControlBlockingClient> callControlBlockingClientProvider;

  private final Provider<QksmsBlockingClient> qksmsBlockingClientProvider;

  private final Provider<ShouldIAnswerBlockingClient> shouldIAnswerBlockingClientProvider;

  public BlockingManager_Factory(
      Provider<Preferences> prefsProvider,
      Provider<CallControlBlockingClient> callControlBlockingClientProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerBlockingClientProvider) {
    this.prefsProvider = prefsProvider;
    this.callControlBlockingClientProvider = callControlBlockingClientProvider;
    this.qksmsBlockingClientProvider = qksmsBlockingClientProvider;
    this.shouldIAnswerBlockingClientProvider = shouldIAnswerBlockingClientProvider;
  }

  @Override
  public BlockingManager get() {
    return provideInstance(
        prefsProvider,
        callControlBlockingClientProvider,
        qksmsBlockingClientProvider,
        shouldIAnswerBlockingClientProvider);
  }

  public static BlockingManager provideInstance(
      Provider<Preferences> prefsProvider,
      Provider<CallControlBlockingClient> callControlBlockingClientProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerBlockingClientProvider) {
    return new BlockingManager(
        prefsProvider.get(),
        callControlBlockingClientProvider.get(),
        qksmsBlockingClientProvider.get(),
        shouldIAnswerBlockingClientProvider.get());
  }

  public static BlockingManager_Factory create(
      Provider<Preferences> prefsProvider,
      Provider<CallControlBlockingClient> callControlBlockingClientProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerBlockingClientProvider) {
    return new BlockingManager_Factory(
        prefsProvider,
        callControlBlockingClientProvider,
        qksmsBlockingClientProvider,
        shouldIAnswerBlockingClientProvider);
  }

  public static BlockingManager newBlockingManager(
      Preferences prefs,
      CallControlBlockingClient callControlBlockingClient,
      QksmsBlockingClient qksmsBlockingClient,
      ShouldIAnswerBlockingClient shouldIAnswerBlockingClient) {
    return new BlockingManager(
        prefs, callControlBlockingClient, qksmsBlockingClient, shouldIAnswerBlockingClient);
  }
}
