package com.example.jeroj.kenkenjj.api;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedP {
    private Context context;

    public SharedP(Context context) {
        this.context = context;
    }

    private SharedPreferences getSharedPref(String dictonnary) {
        return this.context.getSharedPreferences(dictonnary, this.context.MODE_PRIVATE);
    }


    public void setUserId(String user_id) {
        getSharedPref(UserPrefHelper.USER_PREF_DICO).edit()
                .putString(UserPrefHelper.USER_ID,user_id)
                .apply();
    }

    public String getUserId() {
        return getSharedPref(UserPrefHelper.USER_PREF_DICO).getString(UserPrefHelper.USER_ID, "");
    }


    private class UserPrefHelper {
        final static String USER_PREF_DICO = "user_pref";
        final static String USER_ID = "user_id";
    }
}
