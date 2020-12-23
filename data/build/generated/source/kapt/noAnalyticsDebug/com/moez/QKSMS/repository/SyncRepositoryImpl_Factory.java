package com.moez.QKSMS.repository;

import android.content.ContentResolver;
import com.f2prateek.rx.preferences2.RxSharedPreferences;
import com.moez.QKSMS.manager.KeyManager;
import com.moez.QKSMS.mapper.CursorToContact;
import com.moez.QKSMS.mapper.CursorToContactGroup;
import com.moez.QKSMS.mapper.CursorToContactGroupMember;
import com.moez.QKSMS.mapper.CursorToConversation;
import com.moez.QKSMS.mapper.CursorToMessage;
import com.moez.QKSMS.mapper.CursorToRecipient;
import com.moez.QKSMS.util.PhoneNumberUtils;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncRepositoryImpl_Factory implements Factory<SyncRepositoryImpl> {
  private final Provider<ContentResolver> contentResolverProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<CursorToConversation> cursorToConversationProvider;

  private final Provider<CursorToMessage> cursorToMessageProvider;

  private final Provider<CursorToRecipient> cursorToRecipientProvider;

  private final Provider<CursorToContact> cursorToContactProvider;

  private final Provider<CursorToContactGroup> cursorToContactGroupProvider;

  private final Provider<CursorToContactGroupMember> cursorToContactGroupMemberProvider;

  private final Provider<KeyManager> keysProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<RxSharedPreferences> rxPrefsProvider;

  public SyncRepositoryImpl_Factory(
      Provider<ContentResolver> contentResolverProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<CursorToConversation> cursorToConversationProvider,
      Provider<CursorToMessage> cursorToMessageProvider,
      Provider<CursorToRecipient> cursorToRecipientProvider,
      Provider<CursorToContact> cursorToContactProvider,
      Provider<CursorToContactGroup> cursorToContactGroupProvider,
      Provider<CursorToContactGroupMember> cursorToContactGroupMemberProvider,
      Provider<KeyManager> keysProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<RxSharedPreferences> rxPrefsProvider) {
    this.contentResolverProvider = contentResolverProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.cursorToConversationProvider = cursorToConversationProvider;
    this.cursorToMessageProvider = cursorToMessageProvider;
    this.cursorToRecipientProvider = cursorToRecipientProvider;
    this.cursorToContactProvider = cursorToContactProvider;
    this.cursorToContactGroupProvider = cursorToContactGroupProvider;
    this.cursorToContactGroupMemberProvider = cursorToContactGroupMemberProvider;
    this.keysProvider = keysProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.rxPrefsProvider = rxPrefsProvider;
  }

  @Override
  public SyncRepositoryImpl get() {
    return provideInstance(
        contentResolverProvider,
        conversationRepoProvider,
        cursorToConversationProvider,
        cursorToMessageProvider,
        cursorToRecipientProvider,
        cursorToContactProvider,
        cursorToContactGroupProvider,
        cursorToContactGroupMemberProvider,
        keysProvider,
        phoneNumberUtilsProvider,
        rxPrefsProvider);
  }

  public static SyncRepositoryImpl provideInstance(
      Provider<ContentResolver> contentResolverProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<CursorToConversation> cursorToConversationProvider,
      Provider<CursorToMessage> cursorToMessageProvider,
      Provider<CursorToRecipient> cursorToRecipientProvider,
      Provider<CursorToContact> cursorToContactProvider,
      Provider<CursorToContactGroup> cursorToContactGroupProvider,
      Provider<CursorToContactGroupMember> cursorToContactGroupMemberProvider,
      Provider<KeyManager> keysProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<RxSharedPreferences> rxPrefsProvider) {
    return new SyncRepositoryImpl(
        contentResolverProvider.get(),
        conversationRepoProvider.get(),
        cursorToConversationProvider.get(),
        cursorToMessageProvider.get(),
        cursorToRecipientProvider.get(),
        cursorToContactProvider.get(),
        cursorToContactGroupProvider.get(),
        cursorToContactGroupMemberProvider.get(),
        keysProvider.get(),
        phoneNumberUtilsProvider.get(),
        rxPrefsProvider.get());
  }

  public static SyncRepositoryImpl_Factory create(
      Provider<ContentResolver> contentResolverProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<CursorToConversation> cursorToConversationProvider,
      Provider<CursorToMessage> cursorToMessageProvider,
      Provider<CursorToRecipient> cursorToRecipientProvider,
      Provider<CursorToContact> cursorToContactProvider,
      Provider<CursorToContactGroup> cursorToContactGroupProvider,
      Provider<CursorToContactGroupMember> cursorToContactGroupMemberProvider,
      Provider<KeyManager> keysProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<RxSharedPreferences> rxPrefsProvider) {
    return new SyncRepositoryImpl_Factory(
        contentResolverProvider,
        conversationRepoProvider,
        cursorToConversationProvider,
        cursorToMessageProvider,
        cursorToRecipientProvider,
        cursorToContactProvider,
        cursorToContactGroupProvider,
        cursorToContactGroupMemberProvider,
        keysProvider,
        phoneNumberUtilsProvider,
        rxPrefsProvider);
  }

  public static SyncRepositoryImpl newSyncRepositoryImpl(
      ContentResolver contentResolver,
      ConversationRepository conversationRepo,
      CursorToConversation cursorToConversation,
      CursorToMessage cursorToMessage,
      CursorToRecipient cursorToRecipient,
      CursorToContact cursorToContact,
      CursorToContactGroup cursorToContactGroup,
      CursorToContactGroupMember cursorToContactGroupMember,
      KeyManager keys,
      PhoneNumberUtils phoneNumberUtils,
      RxSharedPreferences rxPrefs) {
    return new SyncRepositoryImpl(
        contentResolver,
        conversationRepo,
        cursorToConversation,
        cursorToMessage,
        cursorToRecipient,
        cursorToContact,
        cursorToContactGroup,
        cursorToContactGroupMember,
        keys,
        phoneNumberUtils,
        rxPrefs);
  }
}
