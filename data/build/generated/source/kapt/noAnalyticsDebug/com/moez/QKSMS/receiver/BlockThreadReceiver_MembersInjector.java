package com.moez.QKSMS.receiver;

import com.moez.QKSMS.blocking.BlockingClient;
import com.moez.QKSMS.interactor.MarkBlocked;
import com.moez.QKSMS.repository.ConversationRepository;
import com.moez.QKSMS.util.Preferences;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockThreadReceiver_MembersInjector
    implements MembersInjector<BlockThreadReceiver> {
  private final Provider<BlockingClient> blockingClientProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<MarkBlocked> markBlockedProvider;

  private final Provider<Preferences> prefsProvider;

  public BlockThreadReceiver_MembersInjector(
      Provider<BlockingClient> blockingClientProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkBlocked> markBlockedProvider,
      Provider<Preferences> prefsProvider) {
    this.blockingClientProvider = blockingClientProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.markBlockedProvider = markBlockedProvider;
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<BlockThreadReceiver> create(
      Provider<BlockingClient> blockingClientProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<MarkBlocked> markBlockedProvider,
      Provider<Preferences> prefsProvider) {
    return new BlockThreadReceiver_MembersInjector(
        blockingClientProvider, conversationRepoProvider, markBlockedProvider, prefsProvider);
  }

  @Override
  public void injectMembers(BlockThreadReceiver instance) {
    injectBlockingClient(instance, blockingClientProvider.get());
    injectConversationRepo(instance, conversationRepoProvider.get());
    injectMarkBlocked(instance, markBlockedProvider.get());
    injectPrefs(instance, prefsProvider.get());
  }

  public static void injectBlockingClient(
      BlockThreadReceiver instance, BlockingClient blockingClient) {
    instance.blockingClient = blockingClient;
  }

  public static void injectConversationRepo(
      BlockThreadReceiver instance, ConversationRepository conversationRepo) {
    instance.conversationRepo = conversationRepo;
  }

  public static void injectMarkBlocked(BlockThreadReceiver instance, MarkBlocked markBlocked) {
    instance.markBlocked = markBlocked;
  }

  public static void injectPrefs(BlockThreadReceiver instance, Preferences prefs) {
    instance.prefs = prefs;
  }
}
