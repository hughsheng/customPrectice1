package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint;
    private RectF rectF1, rectF2, rectF3, rectF4, rectF5, rectF6, rectF7;
    private Path mPath;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        float[] points = {70, 50, 70, 350, 70, 350, 610, 350};
        mPaint.setColor(Color.WHITE);
        canvas.drawLines(points, mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawRect(rectF1, mPaint);
        canvas.drawRect(rectF2, mPaint);
        canvas.drawRect(rectF3, mPaint);
        canvas.drawRect(rectF4, mPaint);
        canvas.drawRect(rectF5, mPaint);
        canvas.drawRect(rectF6, mPaint);
        canvas.drawRect(rectF7, mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(18);
        canvas.drawText("Froyo",96,366,mPaint);
        canvas.drawText("GB",166,366,mPaint);
        canvas.drawText("ICS",236,366,mPaint);
        canvas.drawText("JB",306,366,mPaint);
        canvas.drawText("kiTKat",362,366,mPaint);
        canvas.drawText("L",450,366,mPaint);
        canvas.drawText("M",521,366,mPaint);

        mPaint.setTextSize(35);
        canvas.drawText("直方图",270,450,mPaint);
    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        rectF1 = new RectF(80, 349, 140, 350);
        rectF2 = new RectF(150, 340, 210, 350);
        rectF3 = new RectF(220, 340, 280, 350);
        rectF4 = new RectF(290, 230, 350, 350);
        rectF5 = new RectF(360, 120, 420, 350);
        rectF6 = new RectF(430, 60, 490, 350);
        rectF7 = new RectF(500, 260, 560, 350);
        mPath = new Path();
    }
}
