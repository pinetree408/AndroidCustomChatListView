package com.pinetree408.pp.customchatlistview.model;

public class MyData {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    private String text;
    private int direction;

    public MyData() {
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
