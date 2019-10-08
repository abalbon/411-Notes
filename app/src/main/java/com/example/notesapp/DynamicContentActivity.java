package com.example.notesapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicContentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setcontentview will inflate into the java resource file
        // establish a relationship between the activity and the object
        // findViewById method can be called within the activity...
        //  Follow through, goes through the relationship objects
        //  and find the view object using the id that was set
        setContentView(R.layout.dynamic1);

        LinearLayout lview = (LinearLayout) findViewById(R.id.llayoutId);
        lview.setBackgroundColor(Color.CYAN);


        // 1. Create TextView object an call lview.addView()
        // 2. Use Layoutinflater class here
        LayoutInflater inflater = LayoutInflater.from(this);
        TextView tview2 = (TextView) inflater.inflate(R.layout.additional_text_view, lview, false);
        lview.addView(tview2);


        TextView tview = (TextView) findViewById(R.id.tvId);
        tview.setText("Updated String");
        tview.setBackgroundColor(Color.MAGENTA);
    }
}
