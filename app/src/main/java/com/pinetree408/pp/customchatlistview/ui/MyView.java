package com.pinetree408.pp.customchatlistview.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

import com.pinetree408.pp.customchatlistview.model.MyData;

/**
 * Created by leesangyoon on 2017. 10. 9..
 */

public class MyView extends View {
    static final int DX = 5;
    static final int DY = 5;
    static final float RX = 5;
    static final float RY = 5;

    String text;
    int direction;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLACK);

        Paint p = new Paint();
        if (MyData.LEFT == direction) {
            p.setColor(Color.rgb(50, 255, 255));
        } else {
            p.setColor(Color.rgb(255, 255, 0));
        }
        RectF rf = new RectF(DX, DY, getWidth() - DX, getHeight() - DY * 2);
        canvas.drawRoundRect(rf, RX, RY, p);

        Path path = new Path();
        if (MyData.LEFT == direction) {
            path.moveTo(DX + 20, getHeight() - DY * 2);
            path.lineTo(DX + 20, getHeight());
            path.lineTo(DX + 30, getHeight() - DY * 2);
        } else {
            path.moveTo(getWidth() - DX - 20, getHeight() - DY * 2);
            path.lineTo(getWidth() - DX - 20, getHeight());
            path.lineTo(getWidth() - DX - 30, getHeight() - DY * 2);
        }
        canvas.drawPath(path, p);

        p.setTextSize(12);
        p.setColor(Color.BLACK);
        canvas.drawText(text, 20, 20, p);
        super.onDraw(canvas);
    }

    public MyView(Context context, int direction) {
        super(context);
        text = "";
        this.direction = direction;
        setMinimumHeight(50);
    }
}
