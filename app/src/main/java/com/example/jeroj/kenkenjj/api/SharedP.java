package com.example.jeroj.kenkenjj.api;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.models.Grille;
import com.google.gson.Gson;

public class SharedP {
    private Context context;

    public SharedP(Context context) {
        this.context = context;
    }

    private SharedPreferences getSharedPref(String dictonnary) {
        return this.context.getSharedPreferences(dictonnary, Context.MODE_PRIVATE);
    }

    public String getUserId() {
        return getSharedPref(UserPrefHelper.USER_PREF_DICO).getString(UserPrefHelper.USER_ID, "");
    }

    public void setUserId(String user_id) {
        getSharedPref(UserPrefHelper.USER_PREF_DICO).edit()
                .putString(UserPrefHelper.USER_ID, user_id)
                .apply();
    }

    public Grille getCurrentGrille() {
        Gson gson = new Gson();
        String json = getSharedPref(UserPrefHelper.USER_PREF_DICO).getString(UserPrefHelper.USER_CURRENT_GRILLE, "");
        return gson.fromJson(json, Grille.class);
    }

    public void setCurrentGrille(Grille grille) {
        Gson gson = new Gson();
        String json = gson.toJson(grille);

        getSharedPref(UserPrefHelper.USER_PREF_DICO).edit()
                .putString(UserPrefHelper.USER_CURRENT_GRILLE, json)
                .apply();
    }

    public String getModeApi() {
        return getSharedPref(UserPrefHelper.USER_PREF_DICO).getString(UserPrefHelper.USER_MODE_API, "0");
    }

    public void setModeApi(String mode_api) {
        getSharedPref(UserPrefHelper.USER_PREF_DICO).edit()
                .putString(UserPrefHelper.USER_MODE_API, mode_api)
                .apply();
    }

    public String getModeEdition() {
        return getSharedPref(UserPrefHelper.USER_PREF_DICO).getString(UserPrefHelper.USER_MODE_EDITION, context.getString(R.string.edition_stylo));
    }

    public void setModeEdition(boolean flag) {
        String mode_edition = context.getString(R.string.edition_stylo);
        if (flag) {
            mode_edition = context.getString(R.string.edition_crayon);
        }
        getSharedPref(UserPrefHelper.USER_PREF_DICO).edit()
                .putString(UserPrefHelper.USER_MODE_EDITION, mode_edition)
                .apply();
    }


    public String getLastCrayonSaisieIsNumber() {
        return getSharedPref(UserPrefHelper.USER_PREF_DICO).getString(UserPrefHelper.USER_LAST_CRAYON_SAISIE_IS_NUMBER, "1");
    }

    public void setLastCrayonSaisieIsNumber(String s) {
        getSharedPref(UserPrefHelper.USER_PREF_DICO).edit()
                .putString(UserPrefHelper.USER_LAST_CRAYON_SAISIE_IS_NUMBER, s)
                .apply();
    }

    private class UserPrefHelper {
        final static String USER_PREF_DICO = "user_pref";
        final static String USER_ID = "user_id";
        final static String USER_CURRENT_GRILLE = "user_grille";
        final static String USER_MODE_API = "mode_api";
        final static String USER_MODE_EDITION = "user_mode_edition";
        final static String USER_LAST_CRAYON_SAISIE_IS_NUMBER = "user_last_crayon_saisie_is_number";
    }
}
