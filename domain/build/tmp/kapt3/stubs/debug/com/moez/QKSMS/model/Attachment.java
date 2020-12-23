package com.moez.QKSMS.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/moez/QKSMS/model/Attachment;", "", "()V", "Contact", "Image", "Lcom/moez/QKSMS/model/Attachment$Image;", "Lcom/moez/QKSMS/model/Attachment$Contact;", "domain_debug"})
public abstract class Attachment {
    
    private Attachment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/moez/QKSMS/model/Attachment$Image;", "Lcom/moez/QKSMS/model/Attachment;", "uri", "Landroid/net/Uri;", "inputContent", "Landroidx/core/view/inputmethod/InputContentInfoCompat;", "(Landroid/net/Uri;Landroidx/core/view/inputmethod/InputContentInfoCompat;)V", "component1", "component2", "copy", "equals", "", "other", "", "getUri", "hashCode", "", "isGif", "context", "Landroid/content/Context;", "toString", "", "domain_debug"})
    public static final class Image extends com.moez.QKSMS.model.Attachment {
        private final android.net.Uri uri = null;
        private final androidx.core.view.inputmethod.InputContentInfoCompat inputContent = null;
        
        @org.jetbrains.annotations.Nullable()
        public final android.net.Uri getUri() {
            return null;
        }
        
        public final boolean isGif(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        public Image(@org.jetbrains.annotations.Nullable()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        androidx.core.view.inputmethod.InputContentInfoCompat inputContent) {
            super();
        }
        
        public Image() {
            super();
        }
        
        private final android.net.Uri component1() {
            return null;
        }
        
        private final androidx.core.view.inputmethod.InputContentInfoCompat component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.model.Attachment.Image copy(@org.jetbrains.annotations.Nullable()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        androidx.core.view.inputmethod.InputContentInfoCompat inputContent) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/moez/QKSMS/model/Attachment$Contact;", "Lcom/moez/QKSMS/model/Attachment;", "vCard", "", "(Ljava/lang/String;)V", "getVCard", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_debug"})
    public static final class Contact extends com.moez.QKSMS.model.Attachment {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String vCard = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVCard() {
            return null;
        }
        
        public Contact(@org.jetbrains.annotations.NotNull()
        java.lang.String vCard) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moez.QKSMS.model.Attachment.Contact copy(@org.jetbrains.annotations.NotNull()
        java.lang.String vCard) {
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