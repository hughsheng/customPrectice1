package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    private Paint mPaint;
    private RectF rectf;

    public Practice5DrawOvalView(Context context) {
        this(context,null);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
        canvas.drawOval(rectf,mPaint);
    }

    private void initPaint(){
        mPaint=new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        rectf=new RectF(250,200,530,350);
    }
}
