package com.csuf.cpsc41101.testapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

public class GridLayoutMainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.YELLOW);
        root.setColumnCount(2);
        root.setRowCount(2);

        TextView tv = new TextView(this);
        tv.setText("String 0");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.GREEN);

        GridLayout.Spec row_spec = GridLayout.spec(1, 1f);
        GridLayout.Spec col_spec = GridLayout.spec(1, 1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String 1");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.GREEN);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(0,2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String 3");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.GREEN);

        /*
        row_spec = GridLayout.spec(0, GridLayout.CENTER);
        col_spec = GridLayout.spec(1, GridLayout.CENTER);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        */
        /*
        for(int i = 0; i <= 3; i++){
            TextView tv = new TextView(this);
            tv.setText("String " + i);
            tv.setTextSize(16);

            tv.setBackgroundColor(Color.GREEN);
            root.addView(tv);
        }
        */
        setContentView(root);
    }
}
