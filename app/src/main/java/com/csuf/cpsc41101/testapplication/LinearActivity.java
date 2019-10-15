package com.csuf.cpsc41101.testapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        //
        HorizontalScrollView hsv = new HorizontalScrollView(this);
        //
        LinearLayout lv = new LinearLayout(this);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        lv.setBackgroundColor(Color.YELLOW);
        lv.setOrientation(LinearLayout.HORIZONTAL);
        lv.setLayoutParams(lp);

        TextView tv = new TextView(this);
        LinearLayout.LayoutParams vParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        vParams.setMargins(10,10,10,10);
        vParams.weight = 0;
        tv.setText("String 1");
        lv.addView(tv, vParams);
        tv.setBackgroundColor(Color.GREEN);

        //vParams.weight = 2;
        tv = new TextView(this);
        tv.setText("String 2");
        lv.addView(tv, vParams);
        tv.setBackgroundColor(Color.GREEN);

        tv = new TextView(this);
        tv.setText("String 3");
        lv.addView(tv, vParams);
        tv.setBackgroundColor(Color.GREEN);

        for(int i = 4; i <= 20; i++){
            tv = new TextView(this);
            tv.setText("String " + i);
            lv.addView(tv, vParams);
            tv.setBackgroundColor(Color.GREEN);
        }
        //
        hsv.addView(lv);

        setContentView(hsv);
*/
/*
    setContentView(R.layout.dynamic_content_ll_rf);

    LinearLayout lv = findViewById(R.id.llvObjid);

    for(int i = 4; i <= 5; i++){
        TextView tv = new TextView(this);
        tv.setText("String " + i);
        lv.addView();
        tv.setBackgroundColor(Color.GREEN);
    }
*/
    }

}
