package com.pinetree408.pp.customchatlistview.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.pinetree408.pp.customchatlistview.model.MyData;

import java.util.ArrayList;

/**
 * Created by leesangyoon on 2017. 10. 9..
 */

public class MyAdapter extends ArrayAdapter<MyData> {
    ArrayList<MyData> list;

    @Override
    public View getView(int position, View v, ViewGroup parent) {
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
