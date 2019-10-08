package com.example.notesapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class relative extends Activity {

    protected RelativeLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        root = new RelativeLayout(this);

        TextView tv = new TextView(this);
        tv.setText("String 0");
        tv.setTextSize(16);
        tv.setId(R.id.test_obj1);
        tv.setBackgroundColor(Color.YELLOW);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        tv.setLayoutParams(params);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String 1");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        params = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        params.addRule(RelativeLayout.LEFT_OF, R.id.test_obj1);
        // params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        // params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        tv.setLayoutParams(params);
        root.addView(tv);

        setContentView(R.layout.relative);

    }
}
