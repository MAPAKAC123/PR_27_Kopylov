package com.example.pr_27_kopylov;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {
    private Paint mPaint = new Paint();
    public Draw2D(Context context) {
        super(context);
    }
    private Rect mRect = new Rect();
    int x = 700;
    int y = 350;


    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);//холст

        mPaint.setStyle(Paint.Style.FILL);// стиль Заливка
        mPaint.setColor(Color.GRAY);// закрашиваем холст белым цветом
        canvas.drawPaint(mPaint);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(950, 100, 100, mPaint);//Рисуем круг

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(500, 750, 600, 500,mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawRect(0, 750, 1100, 680, mPaint);//Рисуем прямоугольник

        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(42);
        canvas.drawText("Это Моя Лужайка", 30, 648, mPaint);

        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(36);
        String str2rotate = "Лучик солнца!";
        canvas.save();

        mPaint.setColor(Color.RED);
        canvas.drawRect(500, 750, 600, 500, mPaint);// Рисуем основание дома

// Рисуем крышу
        Path path = new Path();
        path.moveTo(500, 500);
        path.lineTo(550, 450);
        path.lineTo(600, 500);
        path.close();

        mPaint.setColor(Color.RED);
        canvas.drawPath(path, mPaint);

// Рисуем дверь
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(530, 750, 570, 600, mPaint);

// Рисуем окно
        mPaint.setColor(Color.CYAN);
        canvas.drawRect(540, 690, 560, 670, mPaint);

        mPaint.setColor(Color.BLUE);
        canvas.drawRect(530, 750, 570, 600, mPaint);

        mPaint.setColor(Color.CYAN);
        canvas.drawRect(540, 690, 560, 670, mPaint);

        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str2rotate, x, y, mPaint);
        canvas.restore();

    }
}
