package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.MarkRead;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkReadReceiver_MembersInjector implements MembersInjector<MarkReadReceiver> {
  private final Provider<MarkRead> markReadProvider;

  public MarkReadReceiver_MembersInjector(Provider<MarkRead> markReadProvider) {
    this.markReadProvider = markReadProvider;
  }

  public static MembersInjector<MarkReadReceiver> create(Provider<MarkRead> markReadProvider) {
    return new MarkReadReceiver_MembersInjector(markReadProvider);
  }

  @Override
  public void injectMembers(MarkReadReceiver instance) {
    injectMarkRead(instance, markReadProvider.get());
  }

  public static void injectMarkRead(MarkReadReceiver instance, MarkRead markRead) {
    instance.markRead = markRead;
  }
}
