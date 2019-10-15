package com.csuf.cpsc41101.testapplication;

import java.util.ArrayList;

public class Person {
    protected String mFirstName;
    protected String mLastName;

    protected ArrayList<Vehicle> mVehicles;

    public Person(String fName, String lName) {
        mFirstName = fName;
        mLastName = lName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public ArrayList<Vehicle> getVehicles() {
        return mVehicles;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        mVehicles = vehicles;
    }
}
