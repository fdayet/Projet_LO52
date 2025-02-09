package com.dayetfracso.codep25.utils;

import android.graphics.Canvas;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;


public class SegmentedProgressDrawable extends Drawable {
    //private static final int NUM_SEGMENTS = 10;
    private int NUM_SEGMENTS;
    private final int mForeground;
    private final int mBackground;
    private final Paint mPaint = new Paint();
    private final RectF mSegment = new RectF();

    public SegmentedProgressDrawable(int fgColor, int bgColor) {
        mForeground = fgColor;
        mBackground = bgColor;
        NUM_SEGMENTS = 5;
    }

    public SegmentedProgressDrawable(int fgColor, int bgColor, int nbSegments) {
        mForeground = fgColor;
        mBackground = bgColor;
        NUM_SEGMENTS=nbSegments;
    }

    @Override
    protected boolean onLevelChange(int level) {
        invalidateSelf();
        return true;
    }

    @Override
    public void draw(Canvas canvas) {
        float level = getLevel() / 10000f;
        Rect b = getBounds();
        //float gapWidth = b.height() / 2f;
        float gapWidth = b.height() / 8f;
        float segmentWidth = (b.width() - (NUM_SEGMENTS - 1) * gapWidth) / NUM_SEGMENTS;
        mSegment.set(0, 0, segmentWidth, b.height());
        mPaint.setColor(mForeground);

        for (int i = 0; i < NUM_SEGMENTS; i++) {
            float loLevel = i / (float) NUM_SEGMENTS;
            float hiLevel = (i + 1) / (float) NUM_SEGMENTS;
            if (loLevel <= level && level <= hiLevel) {
                float middle = mSegment.left + NUM_SEGMENTS * segmentWidth * (level - loLevel);
                canvas.drawRect(mSegment.left, mSegment.top, middle, mSegment.bottom, mPaint);
                mPaint.setColor(mBackground);
                canvas.drawRect(middle, mSegment.top, mSegment.right, mSegment.bottom, mPaint);
            } else {
                canvas.drawRect(mSegment, mPaint);
            }
            mSegment.offset(mSegment.width() + gapWidth, 0);
        }
    }

    @Override
    public void setAlpha(int alpha) {
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
