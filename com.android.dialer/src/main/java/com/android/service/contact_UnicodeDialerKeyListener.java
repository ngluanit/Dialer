package com.android.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.telephony.PhoneNumberUtils;
import android.text.Spanned;
import android.text.method.DialerKeyListener;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class contact_UnicodeDialerKeyListener extends DialerKeyListener {
    public static final contact_UnicodeDialerKeyListener INSTANCE = new contact_UnicodeDialerKeyListener();

    @Override
    public CharSequence filter(CharSequence source, int start, int end,
                               Spanned dest, int dstart, int dend) {
        final String converted = PhoneNumberUtils.convertKeypadLettersToDigits(
                PhoneNumberUtils.replaceUnicodeDigits(source.toString()));
        // PhoneNumberUtils.replaceUnicodeDigits performs a character for character replacement,
        // so we can assume that start and end positions should remain unchanged.
        CharSequence result = super.filter(converted, start, end, dest, dstart, dend);
        if (result == null) {
            if (source.equals(converted)) {
                return null;
            } else {
                return converted.subSequence(start, end);
            }
        }
        return result;
    }

    public static final float DEG = (float)(Math.PI / 180f);

    private static final int BYTES_PER_FLOAT = 4;
    public static Bitmap makeBitmapFromResourceId(Context $context, int $id)
    {
        InputStream is = $context.getResources().openRawResource($id);

        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(is);
        } finally {
            try {
                is.close();
            } catch(IOException e) {
                // Ignore.
            }
        }

        return bitmap;
    }


    public static FloatBuffer makeFloatBuffer3(float $a, float $b, float $c)
    {
        ByteBuffer b = ByteBuffer.allocateDirect(3 * BYTES_PER_FLOAT);
        b.order(ByteOrder.nativeOrder());
        FloatBuffer buffer = b.asFloatBuffer();
        buffer.put($a);
        buffer.put($b);
        buffer.put($c);
        buffer.position(0);
        return buffer;
    }
}
