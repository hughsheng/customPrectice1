package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint;
    private RectF rectF;

    public Practice8DrawArcView(Context context) {
        this(context,null);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        mPaint.setStyle(Paint.Style.STROKE);

        canvas.drawArc(rectF,-120,-60,false,mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(rectF,-10,-100,true,mPaint);

        canvas.drawArc(rectF,20,140,false,mPaint);
    }

    private void initPaint(){
        mPaint=new Paint();
        mPaint.setAntiAlias(true);
        rectF=new RectF(250,200,470,350);
    }
}
