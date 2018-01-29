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

import com.hencoder.hencoderpracticedraw1.R;

public class Practice11PieChartView extends View {

    private Paint mPaint;
    private RectF rectF;
    public Practice11PieChartView(Context context) {
        this(context,null);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        mPaint.setColor(Color.YELLOW);
        Path mPath1=new Path();
        mPath1.addArc(rectF,-1,-45);
        mPath1.lineTo(301,229);
        mPath1.close();
        canvas.drawPath(mPath1,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(18);
        canvas.drawText("Marshmallow",565,130,mPaint);
        float[] points1={560,130,500,130,500,130,480,150};
        canvas.drawLines(points1,mPaint);

        mPaint.setColor(Color.RED);
        Path mPath2=new Path();
        mPath2.addArc(rectF,-52,-125);
        mPath2.lineTo(290,215);
        mPath2.close();
        canvas.drawPath(mPath2,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(18);
        canvas.drawText("Lollipop",20,60,mPaint);
        float[] points2={90,60,170,60,170,60,180,70};
        canvas.drawLines(points2,mPaint);


        mPaint.setColor(getResources().getColor(R.color.purple));
        Path mPath3=new Path();
        mPath3.addArc(rectF,1,10);
        mPath3.lineTo(301,230);
        mPath3.close();
        canvas.drawPath(mPath3,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(18);
        canvas.drawText("Froyo",565,230,mPaint);
        canvas.drawLine(560,230,500,230,mPaint);
        canvas.drawText("Gingerbread",565,270,mPaint);
        float[] points3={560,270,530,270,530,270,510,250,510,250,500,250};
        canvas.drawLines(points3,mPaint);


        mPaint.setColor(Color.GRAY);
        Path mPath4=new Path();
        mPath4.addArc(rectF,13,10);
        mPath4.lineTo(300,230);
        mPath4.close();
        canvas.drawPath(mPath4,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(18);
        canvas.drawText("Ice Cream Sandwich",565,310,mPaint);
        float[] points4={560,310,510,310,510,310,500,290,500,290,490,290};
        canvas.drawLines(points4,mPaint);

        mPaint.setColor(Color.GREEN);
        Path mPath5=new Path();
        mPath5.addArc(rectF,25,50);
        mPath5.lineTo(301,231);
        mPath5.close();
        canvas.drawPath(mPath5,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(18);
        canvas.drawText("Jelly Bean",565,400,mPaint);
        float[] points5={560,400,470,400,470,400,450,370};
        canvas.drawLines(points5,mPaint);

        mPaint.setColor(Color.BLUE);
        Path mPath6=new Path();
        mPath6.addArc(rectF,78,100);
        mPath6.lineTo(299,231);
        mPath6.close();
        canvas.drawPath(mPath6,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(18);
        canvas.drawText("KitKat",30,400,mPaint);
        float[] points6={90,400,170,400,170,400,180,385};
        canvas.drawLines(points6,mPaint);

        mPaint.setTextSize(30);
        canvas.drawText("饼图",290,480,mPaint);

    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        //中心点300,230
        rectF = new RectF(100, 30, 500, 430);
    }
}
