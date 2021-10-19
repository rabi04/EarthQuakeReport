package com.example.earthquakereport;

public class QuakeData {
    private String mlocation;
    private String mmagnitude;
    private String mdate;


     QuakeData(String magnitude,String location,String date){
        mlocation = location;
        mmagnitude = magnitude;
        mdate = date;
    }
    public String getLocation(){
        return mlocation;
    }
    public  String getMagnitude(){
        return mmagnitude;
    }
    public String getDate(){
        return mdate;
    }
}
