package com.real.first.sandoken.ui.reusable;

import android.util.Log;

public class LogUtils {



    public static void log(String key, String value) {
        if(MyApplication.DEBUG) {
            Log.i(key, value);
        }
    }
}
