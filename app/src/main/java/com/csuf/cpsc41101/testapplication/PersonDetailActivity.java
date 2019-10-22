package com.csuf.cpsc41101.testapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class PersonDetailActivity extends AppCompatActivity {

    protected Menu detailMenu;
    protected int personIndx;
    protected Person pObj;
    protected final String TAG = "Detail Screen";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called");

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

        // Make the edit text as read only
        EditText editView = findViewById(R.id.p_first_name_id);
        editView.setText(pObj.getFirstName());
        editView.setEnabled(false);
        editView = findViewById(R.id.p_last_name_id);
        editView.setText(pObj.getLastName());
        editView.setEnabled(false);


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, "onCreateOptionsMenu() called");

        // Custom Menu inflation
        getMenuInflater().inflate(R.menu.detail_screen_menu, menu);
        menu.findItem(R.id.action_edit).setVisible(true);
        menu.findItem(R.id.action_done).setVisible(false);
        detailMenu = menu;

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume() called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
    }

    // On Edit press, it will let the first and last name editable
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d(TAG, "onOptionsItemSelected() called");

        if (item.getItemId() == R.id.action_edit) {
            EditText editView = findViewById(R.id.p_first_name_id);
            editView.setEnabled(true);
            editView = findViewById(R.id.p_last_name_id);
            editView.setEnabled(true);
            // Make menu items visible/invisible based on which button is pressed
            item.setVisible(false);
            detailMenu.findItem(R.id.action_done).setVisible(true);
        } else if(item.getItemId() == R.id.action_done) {
            EditText editView = findViewById(R.id.p_first_name_id);
            pObj.setFirstName(editView.getText().toString());
            editView.setEnabled(false);
            editView = findViewById(R.id.p_last_name_id);
            pObj.setLastName(editView.getText().toString());
            editView.setEnabled(false);
            item.setVisible(false);
            detailMenu.findItem(R.id.action_edit).setVisible(true);
        }


        return super.onOptionsItemSelected(item);
    }
}
