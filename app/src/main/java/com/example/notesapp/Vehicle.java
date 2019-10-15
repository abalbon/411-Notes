package com.example.notesapp;

public class Vehicle {
    protected String mVIN;
    protected String mMake;
    protected String mModel;

    public Vehicle(String v, String mk, String mdl){
        mVIN = v;
        mMake = mk;
        mModel = mdl;
    }

    public String getVIN() {
        return mVIN;
    }

    public String getMake() {
        return mMake;
    }

    public String getModel() {
        return mModel;
    }

    public void setVIN(String VIN) {
        mVIN = VIN;
    }

    public void setMake(String make) {
        mMake = make;
    }

    public void setModel(String model) {
        mModel = model;
    }
}
