package com.google.ai.edge.aicore.demo.java;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;
import android.util.Log;

public class WZApplication extends Application {
    private static WZApplication sInstance;
    private static final String TAG = WZApplication.class.getSimpleName();

    public static Context getAppContext() {
        return sInstance;
    }
    public static WZApplication getInstance() {
        return sInstance;
    }

    public void onCreate() {
        super.onCreate();
        sInstance = this;
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();

        Log.e(TAG, "WZApplication: onCreate() ************* " + super.getProcessName());
    }

}
