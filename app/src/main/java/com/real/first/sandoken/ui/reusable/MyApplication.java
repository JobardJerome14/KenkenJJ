package com.real.first.sandoken.ui.reusable;

import android.app.Application;
import android.content.Context;

import com.real.first.sandoken.R;

public class MyApplication extends Application {

    private static Application application;
    public static boolean DEBUG;

    public static Context getContext() {
        return application.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        DEBUG = getResources().getBoolean(R.bool.debug);
    }
}
