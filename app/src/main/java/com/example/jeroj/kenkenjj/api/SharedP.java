package com.example.jeroj.kenkenjj.api;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.ui.models.Block;
import com.google.gson.Gson;

import java.util.ArrayList;

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

    public void setCurrentGrille(Grille grille) {
        Gson gson = new Gson();
        String json = gson.toJson(grille);

        getSharedPref(UserPrefHelper.USER_PREF_DICO).edit()
                .putString(UserPrefHelper.USER_CURRENT_GRILLE, json)
                .apply();
    }

    public Grille getCurrentGrille() {
        Gson gson = new Gson();
        String json = getSharedPref(UserPrefHelper.USER_PREF_DICO).getString(UserPrefHelper.USER_CURRENT_GRILLE, "");
        Grille grille = gson.fromJson(json, Grille.class);

        return grille;
    }
/*
    public void setCurrentIdGrille(Integer id_grille) {
        getSharedPref(UserPrefHelper.USER_PREF_DICO).edit()
                .putString(UserPrefHelper.USER_CURRENT_ID_GRILLE, Integer.toString(id_grille))
                .apply();
    }

    public Integer getCurrentIdGrille() {
        return Integer.parseInt(getSharedPref(UserPrefHelper.USER_PREF_DICO).getString(UserPrefHelper.USER_CURRENT_ID_GRILLE, ""));
    }*/

    private class UserPrefHelper {
        final static String USER_PREF_DICO = "user_pref";
        final static String USER_ID = "user_id";
        final static String USER_CURRENT_GRILLE = "user_grille";
        final static String USER_CURRENT_ID_GRILLE = "user_current_id_grille";
    }
}
