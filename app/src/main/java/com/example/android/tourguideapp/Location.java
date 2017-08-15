package com.example.android.tourguideapp;

/**
 * Created by anu on 8/6/17.
 */

public class Location {

    //
    private String mLocName;
    //
    private String mLocAddress;
    //
    private String mLocDescription;
    //
    private int mLocImageResourceID;
    //
    private String mLocCoordinate;

    public Location(String locName, String locAddress, String locDescription, int locResourceId, String locCoordinate) {
        mLocName = locName;
        mLocAddress = locAddress;
        mLocDescription = locDescription;
        mLocImageResourceID = locResourceId;
        mLocCoordinate = locCoordinate;
    }



    public String getmLocName() {
        return mLocName;
    }

    public String getmLocAddress() {
        return mLocAddress;
    }

    public String getmLocDescription() {
        return mLocDescription;
    }

    public int getmLocImageResourceID() {
        return mLocImageResourceID;
    }

    public String getmLocCoordinate() {
        return mLocCoordinate;
    }


}
