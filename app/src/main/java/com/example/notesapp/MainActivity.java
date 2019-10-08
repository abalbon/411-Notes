package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createPersonObjects();
        setContentView(R.id.person_list);

        root = findViewById(R.id.person_list);

        ArrayList<Person> personList = PersonDB.getInstance().getPersonList();
        for (int i = 0; i < personList.size(); i++) {
            Person p = personList.get(i);

            //

            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.person_row, root, false);
            ((TextView) row_view.findViewById(R.id.first_name)).setText(p.getFirstName());
            ((TextView) row_view.findViewById(R.id.last_name)).setText(p.getLastName());
            root.addView(row_view);
        }
    }


        protected void createPersonObjects() {
            Person person = new Person("Albert,", "Balbon");
            ArrayList<Vehicle> vehicles = new ArrayList<~>();
            vehicles.add(new Vehicle("1234567890", "Abarth", "500"));
            vehicles.add(new Vehicle("0987654321", "Bmw", "325e"));
            person.setVehicles(vehicles);
            ArrayList<Person> persons = new ArrayList<~>();
            persons.add(person);

            PersonDB.getInstance().setPersonList(persons);

        }
}
