package com.example.alfhanrf.inputdatafirebase;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Alfhanrf on 5/19/2018.
 */

public class FireApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
