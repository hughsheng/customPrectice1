package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint mPaint;
    private RectF rectf1,rectF2;
    private Path mPath;
    public Practice9DrawPathView(Context context) {
        this(context,null);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        mPath.arcTo(rectf1,-210,210);
        mPath.arcTo(rectF2,-180,210);
        mPath.lineTo(350,380);
        canvas.drawPath(mPath,mPaint);
    }


    private void initPaint(){
        mPaint=new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        rectf1=new RectF(250,200,350,300);
        rectF2=new RectF(350,200,450,300);
        mPath=new Path();
    }
}
