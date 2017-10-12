package com.pinetree408.pp.customchatlistview.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

import com.pinetree408.pp.customchatlistview.model.MyData;

public class MyView extends View {
    static final int DX = 5;
    static final int DY = 5;
    static final float RX = 5;
    static final float RY = 5;
    static final int MINHEIGHT = 50;

    String text;
    int direction;

    Paint bp;
    Paint tp;
    Path path;
    RectF rf;

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

        rf.set(DX, DY, getWidth() - DX, getHeight() - DY * 2);

        switch (getDirection()) {
            case MyData.LEFT:
                bp.setColor(Color.rgb(50, 255, 255));
                path.moveTo(DX + 20, getHeight() - DY * 2);
                path.lineTo(DX + 20, getHeight());
                path.lineTo(DX + 30, getHeight() - DY * 2);
                break;
            case MyData.RIGHT:
                bp.setColor(Color.rgb(255, 255, 0));
                path.moveTo(getWidth() - DX - 20, getHeight() - DY * 2);
                path.lineTo(getWidth() - DX - 20, getHeight());
                path.lineTo(getWidth() - DX - 30, getHeight() - DY * 2);
                break;
        }

        canvas.drawColor(Color.BLACK);
        canvas.drawRoundRect(rf, RX, RY, bp);
        canvas.drawPath(path, bp);
        canvas.drawText(getText(), 20, 20, tp);

        super.onDraw(canvas);
    }

    public MyView(Context context) {
        super(context);

        bp = new Paint();

        tp = new Paint();
        tp.setTextSize(12);
        tp.setColor(Color.BLACK);

        path = new Path();
        rf = new RectF();

        setMinimumHeight(MINHEIGHT);
    }
}
