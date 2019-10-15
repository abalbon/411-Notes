package com.csuf.cpsc41101.testapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicContent0926Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dynamic1);

        LinearLayout lview = (LinearLayout) findViewById(R.id.llayoutId);
        lview.setBackgroundColor(Color.YELLOW);

        //1. Create TextView object and call lview.addView()

        //2. Use Layoutinflater class here
        LayoutInflater inflater = LayoutInflater.from(this);
        TextView tview_2 = (TextView) inflater.inflate(R.layout.additional_text_view, lview, false);
        tview_2.setBackgroundColor(Color.CYAN);
        lview.addView(tview_2);

        TextView tview = (TextView) findViewById(R.id.tvId);
        tview.setText("Updated String");
        tview.setBackgroundColor(Color.GREEN);
    }
}
