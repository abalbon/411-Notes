package com.csuf.cpsc41101.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView v;

        // 1. Create a TextView widget object
        v = new TextView(this);

        // 2. Configure the attributes of the TextView Object
        v.setText("Test String. ");
        v.setTextSize(36);
        v.setTypeface(null, Typeface.BOLD);
        v.setBackgroundColor(Color.YELLOW);
        v.setGravity(Gravity.CENTER_HORIZONTAL);
        v.setPadding(20,20,20,20);

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        v.setLayoutParams(params);

        // 3. Associate the widget object with the Activity
        //setContentView(v);

        setContentView(R.layout.single_widget_screen);
    }
}
