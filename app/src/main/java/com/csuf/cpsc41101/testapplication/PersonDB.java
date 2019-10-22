package com.csuf.cpsc41101.testapplication;

import java.util.ArrayList;

public class PersonDB {
    private static final PersonDB ourInstance = new PersonDB();

    private ArrayList<Person> mPersonList;

    static public PersonDB getInstance(){return ourInstance;}

    private PersonDB(){

    }

    public ArrayList<Person> getPersonList(){
        return mPersonList;
    }

    protected void createPersonObjects() {
        Person person = new Person("James", "Shen");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("J7483438738", "Honda", "Accord"));
        vehicles.add(new Vehicle("A47575777", "Ford", "Escort"));
        person.setVehicles(vehicles);
        mPersonList = new ArrayList<Person>();
        mPersonList.add(person);

        person = new Person("John", "Chang");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("J37373737", "Toyota", "Camry"));
        person.setVehicles(vehicles);
        mPersonList.add(person);
    }

    public void getPersonList(ArrayList<Person>personList){
        mPersonList = personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        mPersonList = personList;
    }
}
