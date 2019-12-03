package com.lcardoso.chatfirebase;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class CustomApplication extends Application {

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
