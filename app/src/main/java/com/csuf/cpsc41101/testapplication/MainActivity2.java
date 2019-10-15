package com.csuf.cpsc41101.testapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    LinearLayout root;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        createPersonObjects();
        setContentView(R.layout.person_list);

        root = findViewById(R.id.person_list);

        for(int i = 0; i < personList.size(); i++){
            Person p = personList.get(i);
            //
            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.person_row, root, false);
            ((TextView) row_view.findViewById(R.id.first_name)).setText(p.getFirstName());
            ((TextView) row_view.findViewById(R.id.last_name)).setText(p.getLastName());
            root.addView(row_view);
        }
    }

    protected void createPersonObjects(){
        Person person = new Person("James", "Shen");
        ArrayList<Vehicle>vehicles=new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("J2837463278", "Honda", "Accord"));
        vehicles.add(new Vehicle("A293857", "Ford", "Escort"));
        person.setVehicles(vehicles);
        ArrayList<Person>persons=new ArrayList<Person>();
        persons.add(person);

        person = new Person("John", "Cheng");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("J373737373", "Toyota", "Camry"));
        person.setVehicles(vehicles);
        persons.add(person);

        PersonDB.getInstance().setPersonList(persons);
    }
}
