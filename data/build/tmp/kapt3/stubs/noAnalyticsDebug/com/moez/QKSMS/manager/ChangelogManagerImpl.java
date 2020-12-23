package com.moez.QKSMS.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManagerImpl;", "Lcom/moez/QKSMS/manager/ChangelogManager;", "context", "Landroid/content/Context;", "moshi", "Lcom/squareup/moshi/Moshi;", "prefs", "Lcom/moez/QKSMS/util/Preferences;", "(Landroid/content/Context;Lcom/squareup/moshi/Moshi;Lcom/moez/QKSMS/util/Preferences;)V", "didUpdate", "", "getChangelog", "Lio/reactivex/Single;", "Lcom/moez/QKSMS/manager/ChangelogManager$Changelog;", "markChangelogSeen", "", "ArrayField", "ArrayValues", "Changelog", "ChangelogResponse", "Document", "IntegerField", "StringField", "data_noAnalyticsDebug"})
public final class ChangelogManagerImpl implements com.moez.QKSMS.manager.ChangelogManager {
    private final android.content.Context context = null;
    private final com.squareup.moshi.Moshi moshi = null;
    private final com.moez.QKSMS.util.Preferences prefs = null;
    
    @java.lang.Override()
    public boolean didUpdate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.moez.QKSMS.manager.ChangelogManager.Changelog> getChangelog() {
        return null;
    }
    
    @java.lang.Override()
    public void markChangelogSeen() {
    }
    
    @javax.inject.Inject()
    public ChangelogManagerImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.Preferences prefs) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ChangelogResponse;", "", "documents", "", "Lcom/moez/QKSMS/manager/ChangelogManagerImpl$Document;", "(Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_noAnalyticsDebug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class ChangelogResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.Document> documents = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.Document> getDocuments() {
            return null;
        }
        
        public ChangelogResponse(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "documents")
        java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.Document> documents) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.Document> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ChangelogResponse copy(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "documents")
        java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.Document> documents) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManagerImpl$Document;", "", "fields", "Lcom/moez/QKSMS/manager/ChangelogManagerImpl$Changelog;", "(Lcom/moez/QKSMS/manager/ChangelogManagerImpl$Changelog;)V", "getFields", "()Lcom/moez/QKSMS/manager/ChangelogManagerImpl$Changelog;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_noAnalyticsDebug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Document {
        @org.jetbrains.annotations.NotNull()
        private final com.moez.QKSMS.manager.ChangelogManagerImpl.Changelog fields = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.Changelog getFields() {
            return null;
        }
        
        public Document(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "fields")
        com.moez.QKSMS.manager.ChangelogManagerImpl.Changelog fields) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.Changelog component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.Document copy(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "fields")
        com.moez.QKSMS.manager.ChangelogManagerImpl.Changelog fields) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003JA\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006 "}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManagerImpl$Changelog;", "", "added", "Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayField;", "improved", "fixed", "versionName", "Lcom/moez/QKSMS/manager/ChangelogManagerImpl$StringField;", "versionCode", "Lcom/moez/QKSMS/manager/ChangelogManagerImpl$IntegerField;", "(Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayField;Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayField;Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayField;Lcom/moez/QKSMS/manager/ChangelogManagerImpl$StringField;Lcom/moez/QKSMS/manager/ChangelogManagerImpl$IntegerField;)V", "getAdded", "()Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayField;", "getFixed", "getImproved", "getVersionCode", "()Lcom/moez/QKSMS/manager/ChangelogManagerImpl$IntegerField;", "getVersionName", "()Lcom/moez/QKSMS/manager/ChangelogManagerImpl$StringField;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_noAnalyticsDebug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Changelog {
        @org.jetbrains.annotations.Nullable()
        private final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField added = null;
        @org.jetbrains.annotations.Nullable()
        private final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField improved = null;
        @org.jetbrains.annotations.Nullable()
        private final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField fixed = null;
        @org.jetbrains.annotations.NotNull()
        private final com.moez.QKSMS.manager.ChangelogManagerImpl.StringField versionName = null;
        @org.jetbrains.annotations.NotNull()
        private final com.moez.QKSMS.manager.ChangelogManagerImpl.IntegerField versionCode = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField getAdded() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField getImproved() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField getFixed() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.StringField getVersionName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.IntegerField getVersionCode() {
            return null;
        }
        
        public Changelog(@org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "added")
        com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField added, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "improved")
        com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField improved, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "fixed")
        com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField fixed, @org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "versionName")
        com.moez.QKSMS.manager.ChangelogManagerImpl.StringField versionName, @org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "versionCode")
        com.moez.QKSMS.manager.ChangelogManagerImpl.IntegerField versionCode) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.StringField component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.IntegerField component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.Changelog copy(@org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "added")
        com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField added, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "improved")
        com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField improved, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "fixed")
        com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField fixed, @org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "versionName")
        com.moez.QKSMS.manager.ChangelogManagerImpl.StringField versionName, @org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "versionCode")
        com.moez.QKSMS.manager.ChangelogManagerImpl.IntegerField versionCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayField;", "", "value", "Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayValues;", "(Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayValues;)V", "getValue", "()Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayValues;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_noAnalyticsDebug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class ArrayField {
        @org.jetbrains.annotations.NotNull()
        private final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayValues value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayValues getValue() {
            return null;
        }
        
        public ArrayField(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "arrayValue")
        com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayValues value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayValues component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayField copy(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "arrayValue")
        com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayValues value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManagerImpl$ArrayValues;", "", "values", "", "Lcom/moez/QKSMS/manager/ChangelogManagerImpl$StringField;", "(Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_noAnalyticsDebug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class ArrayValues {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.StringField> values = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.StringField> getValues() {
            return null;
        }
        
        public ArrayValues(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "values")
        java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.StringField> values) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.StringField> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.ArrayValues copy(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "values")
        java.util.List<com.moez.QKSMS.manager.ChangelogManagerImpl.StringField> values) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManagerImpl$StringField;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_noAnalyticsDebug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class StringField {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        public StringField(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "stringValue")
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.StringField copy(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "stringValue")
        java.lang.String value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/moez/QKSMS/manager/ChangelogManagerImpl$IntegerField;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_noAnalyticsDebug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class IntegerField {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        public IntegerField(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "integerValue")
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.manager.ChangelogManagerImpl.IntegerField copy(@org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "integerValue")
        java.lang.String value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}