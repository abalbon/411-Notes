package com.csuf.cpsc41101.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static androidx.constraintlayout.widget.Constraints.TAG;

import java.util.ArrayList;

public class SummaryLVActivity extends Activity {

    protected ListView mSummaryView;
    protected final String TAG = "Summary Screen";
    protected SummaryListAdapter ad;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called");
        super.onCreate(savedInstanceState);
        //
        setContentView(R.layout.person_list_lv);

        createPersonObjects();
        // Get and set view
        mSummaryView = findViewById(R.id.summary_list_id);
        SummaryListAdapter ad = new SummaryListAdapter();
        mSummaryView.setAdapter(ad);

    }

    protected void createPersonObjects() {
        Person person = new Person("James", "Shen");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("J7483438738", "Honda", "Accord"));
        vehicles.add(new Vehicle("A47575777", "Ford", "Escort"));
        person.setVehicles(vehicles);
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person);

        person = new Person("John", "Chang");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("J37373737", "Toyota", "Camry"));
        person.setVehicles(vehicles);
        persons.add(person);

        PersonDB.getInstance().setPersonList(persons);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        ad.notifyDataSetChanged();
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
}
