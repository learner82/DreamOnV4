package com.example.android.dreamonv4;

/**
 * Created by learner on 1/10/2017.
 */

public class Photograph {
    private final int mCoupleName;
    private final int mDate;
    private final int mLocation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    Photograph(int coupleName, int date, int location, int imageResourceId){

        mCoupleName = coupleName;
        mDate = date;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public int getCoupleName(){
        return mCoupleName;
    }

    public int getDate(){
        return mDate;
    }

    public int getLocation(){
        return mLocation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }


}
