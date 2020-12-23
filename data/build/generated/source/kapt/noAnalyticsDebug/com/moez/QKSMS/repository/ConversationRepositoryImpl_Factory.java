package com.moez.QKSMS.repository;

import android.content.Context;
import com.moez.QKSMS.filter.ConversationFilter;
import com.moez.QKSMS.mapper.CursorToConversation;
import com.moez.QKSMS.mapper.CursorToRecipient;
import com.moez.QKSMS.util.PhoneNumberUtils;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConversationRepositoryImpl_Factory
    implements Factory<ConversationRepositoryImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<ConversationFilter> conversationFilterProvider;

  private final Provider<CursorToConversation> cursorToConversationProvider;

  private final Provider<CursorToRecipient> cursorToRecipientProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  public ConversationRepositoryImpl_Factory(
      Provider<Context> contextProvider,
      Provider<ConversationFilter> conversationFilterProvider,
      Provider<CursorToConversation> cursorToConversationProvider,
      Provider<CursorToRecipient> cursorToRecipientProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    this.contextProvider = contextProvider;
    this.conversationFilterProvider = conversationFilterProvider;
    this.cursorToConversationProvider = cursorToConversationProvider;
    this.cursorToRecipientProvider = cursorToRecipientProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
  }

  @Override
  public ConversationRepositoryImpl get() {
    return provideInstance(
        contextProvider,
        conversationFilterProvider,
        cursorToConversationProvider,
        cursorToRecipientProvider,
        phoneNumberUtilsProvider);
  }

  public static ConversationRepositoryImpl provideInstance(
      Provider<Context> contextProvider,
      Provider<ConversationFilter> conversationFilterProvider,
      Provider<CursorToConversation> cursorToConversationProvider,
      Provider<CursorToRecipient> cursorToRecipientProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new ConversationRepositoryImpl(
        contextProvider.get(),
        conversationFilterProvider.get(),
        cursorToConversationProvider.get(),
        cursorToRecipientProvider.get(),
        phoneNumberUtilsProvider.get());
  }

  public static ConversationRepositoryImpl_Factory create(
      Provider<Context> contextProvider,
      Provider<ConversationFilter> conversationFilterProvider,
      Provider<CursorToConversation> cursorToConversationProvider,
      Provider<CursorToRecipient> cursorToRecipientProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider) {
    return new ConversationRepositoryImpl_Factory(
        contextProvider,
        conversationFilterProvider,
        cursorToConversationProvider,
        cursorToRecipientProvider,
        phoneNumberUtilsProvider);
  }

  public static ConversationRepositoryImpl newConversationRepositoryImpl(
      Context context,
      ConversationFilter conversationFilter,
      CursorToConversation cursorToConversation,
      CursorToRecipient cursorToRecipient,
      PhoneNumberUtils phoneNumberUtils) {
    return new ConversationRepositoryImpl(
        context, conversationFilter, cursorToConversation, cursorToRecipient, phoneNumberUtils);
  }
}
