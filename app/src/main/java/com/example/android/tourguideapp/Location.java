package com.example.android.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by anu on 8/6/17.
 */

public class Location implements Parcelable {

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mLocName);
        dest.writeString(mLocAddress);
        dest.writeString(mLocDescription);
        dest.writeInt(mLocImageResourceID);
        dest.writeString(mLocCoordinate);
    }

    private Location(Parcel in) {
        mLocName = in.readString();
        mLocAddress = in.readString();
        mLocDescription = in.readString();
        mLocImageResourceID = in.readInt();
        mLocCoordinate = in.readString();
    }

    public static final Parcelable.Creator<Location> CREATOR
            = new Parcelable.Creator<Location>() {

        // This simply calls our new constructor (typically private) and
        // passes along the unmarshalled `Parcel`, and then returns the new object!
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

}
