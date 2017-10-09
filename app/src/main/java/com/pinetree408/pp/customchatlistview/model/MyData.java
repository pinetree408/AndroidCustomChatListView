package com.pinetree408.pp.customchatlistview.model;

/**
 * Created by leesangyoon on 2017. 10. 9..
 */

public class MyData {
    public static final int LEFT = 0;
    public static final int RIGHT = 0;

    String text;
    int direction;

    public MyData(String text, int direction) {
        this.text = text;
        this.direction = direction;
    }

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
}
