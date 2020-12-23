package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.MessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkUnread_Factory implements Factory<MarkUnread> {
  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<UpdateBadge> updateBadgeProvider;

  public MarkUnread_Factory(
      Provider<MessageRepository> messageRepoProvider, Provider<UpdateBadge> updateBadgeProvider) {
    this.messageRepoProvider = messageRepoProvider;
    this.updateBadgeProvider = updateBadgeProvider;
  }

  @Override
  public MarkUnread get() {
    return provideInstance(messageRepoProvider, updateBadgeProvider);
  }

  public static MarkUnread provideInstance(
      Provider<MessageRepository> messageRepoProvider, Provider<UpdateBadge> updateBadgeProvider) {
    return new MarkUnread(messageRepoProvider.get(), updateBadgeProvider.get());
  }

  public static MarkUnread_Factory create(
      Provider<MessageRepository> messageRepoProvider, Provider<UpdateBadge> updateBadgeProvider) {
    return new MarkUnread_Factory(messageRepoProvider, updateBadgeProvider);
  }

  public static MarkUnread newMarkUnread(MessageRepository messageRepo, UpdateBadge updateBadge) {
    return new MarkUnread(messageRepo, updateBadge);
  }
}
