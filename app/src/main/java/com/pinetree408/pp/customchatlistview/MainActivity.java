package com.pinetree408.pp.customchatlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.pinetree408.pp.customchatlistview.model.MyData;
import com.pinetree408.pp.customchatlistview.ui.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int MAX_ITEMS = 30;
    ListView lv;
    MyAdapter ma;
    ArrayList<MyData> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listview);

        list = new ArrayList<>();
        for (int i = 0; i < MAX_ITEMS; i++) {
            MyData md = new MyData();
            md.setText("item " + i);
            md.setDirection(i % 2);
            list.add(md);
        }

        ma = new MyAdapter(this, 0, list);

        lv.setAdapter(ma);
    }
}
