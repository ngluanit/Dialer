package com.moez.QKSMS.util;

import java.lang.System;

/**
 * Allows converting an animated [GifDrawable] to an [OutputStream]
 * Based on Glide's ReEncodingGifResourceEncoder
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/moez/QKSMS/util/GifEncoder;", "", "context", "Landroid/content/Context;", "bitmapPool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "factory", "Lcom/moez/QKSMS/util/GifEncoder$Factory;", "(Landroid/content/Context;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Lcom/moez/QKSMS/util/GifEncoder$Factory;)V", "provider", "Lcom/bumptech/glide/load/resource/gif/GifBitmapProvider;", "decodeHeaders", "Lcom/bumptech/glide/gifdecoder/GifDecoder;", "data", "Ljava/nio/ByteBuffer;", "encodeTransformedToStream", "", "drawable", "Lcom/bumptech/glide/load/resource/gif/GifDrawable;", "os", "Ljava/io/OutputStream;", "getTransformedFrame", "Lcom/bumptech/glide/load/engine/Resource;", "Landroid/graphics/Bitmap;", "currentFrame", "transformation", "Lcom/bumptech/glide/load/Transformation;", "Factory", "data_noAnalyticsDebug"})
public final class GifEncoder {
    private final com.bumptech.glide.load.resource.gif.GifBitmapProvider provider = null;
    private final android.content.Context context = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool = null;
    private final com.moez.QKSMS.util.GifEncoder.Factory factory = null;
    
    public final boolean encodeTransformedToStream(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.resource.gif.GifDrawable drawable, @org.jetbrains.annotations.NotNull()
    java.io.OutputStream os) {
        return false;
    }
    
    private final com.bumptech.glide.gifdecoder.GifDecoder decodeHeaders(java.nio.ByteBuffer data) {
        return null;
    }
    
    private final com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> getTransformedFrame(android.graphics.Bitmap currentFrame, com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation, com.bumptech.glide.load.resource.gif.GifDrawable drawable) {
        return null;
    }
    
    public GifEncoder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, @org.jetbrains.annotations.NotNull()
    com.moez.QKSMS.util.GifEncoder.Factory factory) {
        super();
    }
    
    @androidx.annotation.VisibleForTesting()
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/moez/QKSMS/util/GifEncoder$Factory;", "", "()V", "buildDecoder", "Lcom/bumptech/glide/gifdecoder/StandardGifDecoder;", "bitmapProvider", "Lcom/bumptech/glide/gifdecoder/GifDecoder$BitmapProvider;", "buildEncoder", "Lcom/bumptech/glide/gifencoder/AnimatedGifEncoder;", "buildFrameResource", "Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;", "bitmap", "Landroid/graphics/Bitmap;", "bitmapPool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "buildParser", "Lcom/bumptech/glide/gifdecoder/GifHeaderParser;", "data_noAnalyticsDebug"})
    public static final class Factory {
        
        @org.jetbrains.annotations.NotNull()
        public final com.bumptech.glide.gifdecoder.StandardGifDecoder buildDecoder(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider bitmapProvider) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bumptech.glide.gifdecoder.GifHeaderParser buildParser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bumptech.glide.gifencoder.AnimatedGifEncoder buildEncoder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bumptech.glide.load.resource.bitmap.BitmapResource buildFrameResource(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
}