package com.example.earthquakereport;

public class QuakeData {
    private String mlocation;
    private String mmagnitude;
    private String mdate;
    private String mtime;


     QuakeData(String magnitude,String location,String date,String time){
        mlocation = location;
        mmagnitude = magnitude;
        mdate = date;
        mtime = time;
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
    public String getTime(){ return mtime; }
}
