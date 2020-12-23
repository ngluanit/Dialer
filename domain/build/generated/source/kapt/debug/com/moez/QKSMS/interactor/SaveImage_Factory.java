package com.moez.QKSMS.interactor;

import com.moez.QKSMS.repository.MessageRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SaveImage_Factory implements Factory<SaveImage> {
  private final Provider<MessageRepository> messageRepoProvider;

  public SaveImage_Factory(Provider<MessageRepository> messageRepoProvider) {
    this.messageRepoProvider = messageRepoProvider;
  }

  @Override
  public SaveImage get() {
    return provideInstance(messageRepoProvider);
  }

  public static SaveImage provideInstance(Provider<MessageRepository> messageRepoProvider) {
    return new SaveImage(messageRepoProvider.get());
  }

  public static SaveImage_Factory create(Provider<MessageRepository> messageRepoProvider) {
    return new SaveImage_Factory(messageRepoProvider);
  }

  public static SaveImage newSaveImage(MessageRepository messageRepo) {
    return new SaveImage(messageRepo);
  }
}
