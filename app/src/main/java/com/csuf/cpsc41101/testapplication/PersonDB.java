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

    public void getPersonList(ArrayList<Person>personList){
        mPersonList = personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        mPersonList = personList;
    }
}
