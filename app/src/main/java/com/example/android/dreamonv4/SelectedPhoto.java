package com.example.android.dreamonv4;

import android.app.Application;

/**
 * Created by learner on 3/10/2017.
 */

public class SelectedPhoto extends Application{

    private int selectedPhoto;

    public int getSelectedPhoto(){
        return this.selectedPhoto;
    }
    public void setSelectedPhoto(int selectedPhoto) {
        this.selectedPhoto = selectedPhoto;
    }
}
