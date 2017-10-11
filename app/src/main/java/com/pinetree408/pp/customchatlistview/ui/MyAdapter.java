package com.pinetree408.pp.customchatlistview.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.pinetree408.pp.customchatlistview.model.MyData;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<MyData> {
    private ArrayList<MyData> list;

    @NonNull
    @Override
    public View getView(int position, View v, @NonNull ViewGroup parent) {
        MyData md = list.get(position);

        if (v == null) {
            v = new MyView(parent.getContext(), md.getDirection());
        }

        String s = md.getText();

        MyView mv = (MyView) v;
        mv.setText(s);
        mv.setDirection(md.getDirection());
        mv.postInvalidate();

        return v;
    }

    public MyAdapter(Context context, int textViewResourceId, ArrayList<MyData> list) {
        super(context, textViewResourceId, list);
        this.list = list;
    }
}
