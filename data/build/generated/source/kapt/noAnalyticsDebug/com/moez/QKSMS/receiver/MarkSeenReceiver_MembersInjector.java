package com.moez.QKSMS.receiver;

import com.moez.QKSMS.interactor.MarkSeen;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkSeenReceiver_MembersInjector implements MembersInjector<MarkSeenReceiver> {
  private final Provider<MarkSeen> markSeenProvider;

  public MarkSeenReceiver_MembersInjector(Provider<MarkSeen> markSeenProvider) {
    this.markSeenProvider = markSeenProvider;
  }

  public static MembersInjector<MarkSeenReceiver> create(Provider<MarkSeen> markSeenProvider) {
    return new MarkSeenReceiver_MembersInjector(markSeenProvider);
  }

  @Override
  public void injectMembers(MarkSeenReceiver instance) {
    injectMarkSeen(instance, markSeenProvider.get());
  }

  public static void injectMarkSeen(MarkSeenReceiver instance, MarkSeen markSeen) {
    instance.markSeen = markSeen;
  }
}
