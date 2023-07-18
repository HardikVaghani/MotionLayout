package com.app.hardik.motionapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

@SuppressLint("AppCompatCustomView")
public class PanImageView extends ImageView {
    private Rect sourceRect; // Represents the portion of the image to be displayed

    public PanImageView(Context context) {
        super(context);
        init();
    }

    public PanImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PanImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        sourceRect = new Rect();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            // Calculate the portion of the image to be displayed based on the scroll position
            int scrollX = getScrollX();
            int imageWidth = getDrawable().getIntrinsicWidth();
            int viewWidth = getWidth();
            int left = (int) ((float) scrollX / (imageWidth - viewWidth) * imageWidth);
            int right = left + viewWidth;
            int top = 0;
            int bottom = getHeight();

            // Set the portion of the image to be displayed
            sourceRect.set(left, top, right, bottom);

            // Draw the portion of the image onto the canvas
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            @SuppressLint("DrawAllocation") Rect destRect = new Rect(0, 0, getWidth(), getHeight());
            canvas.drawBitmap(bitmap, sourceRect, destRect, null);
        }
    }

}
