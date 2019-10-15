package com.csuf.cpsc41101.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PersonDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_detail);

        int personIndx = getIntent().getIntExtra("PersonIndex", 0);
        TextView tv = findViewById(R.id.display_string_id);
        // Display the Person Index
        String origStr = (String) tv.getText();
        tv.setText(origStr + personIndx);
        tv.setTextSize(24);
        //
        Person pObj = PersonDB.getInstance().getPersonList().get(personIndx);

        // How to display the information - detailed view of each person obj
        /*
        Linear Layout:
            First Name
            Last Name
        Linear Layout:
            Label: 'Vehicles'
            Each Row:
                Make, Model, Year
            Button to add Vehicles    xmlns:app="http://schemas.android.com/apk/res-auto"
         */
    }
}
