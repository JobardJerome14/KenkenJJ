package com.real.first.sandoken.api;

import android.content.Context;
import android.content.SharedPreferences;

import com.real.first.sandoken.R;
import com.real.first.sandoken.models.Grille;
import com.google.gson.Gson;

public class SharedP {
    private Context context;

    public SharedP(Context context) {
        this.context = context;
    }

    private SharedPreferences getSharedPref() {
        return this.context.getSharedPreferences(UserPrefHelper.USER_PREF_DICO, Context.MODE_PRIVATE);
    }

    public String getUserId() {
        return getSharedPref().getString(UserPrefHelper.USER_ID, "");
    }

    public void setUserId(String user_id) {
        getSharedPref().edit()
                .putString(UserPrefHelper.USER_ID, user_id)
                .apply();
    }

    public Grille getCurrentGrille() {
        Gson gson = new Gson();
        String json = getSharedPref().getString(UserPrefHelper.USER_CURRENT_GRILLE, "");
        return gson.fromJson(json, Grille.class);
    }

    public void setCurrentGrille(Grille grille) {
        Gson gson = new Gson();
        String json = gson.toJson(grille);

        getSharedPref().edit()
                .putString(UserPrefHelper.USER_CURRENT_GRILLE, json)
                .apply();
    }

    public String getModeApi() {
        return getSharedPref().getString(UserPrefHelper.USER_MODE_API, "0");
    }

    public void setModeApi(String mode_api) {
        getSharedPref().edit()
                .putString(UserPrefHelper.USER_MODE_API, mode_api)
                .apply();
    }

    public String getModeEdition() {
        return getSharedPref().getString(UserPrefHelper.USER_MODE_EDITION, context.getString(R.string.edition_stylo));
    }

    public void setModeEdition(boolean flag) {
        String mode_edition = context.getString(R.string.edition_stylo);
        if (flag) {
            mode_edition = context.getString(R.string.edition_crayon);
        }
        getSharedPref().edit()
                .putString(UserPrefHelper.USER_MODE_EDITION, mode_edition)
                .apply();
    }


    public String getLastCrayonSaisieIsNumber() {
        return getSharedPref().getString(UserPrefHelper.USER_LAST_CRAYON_SAISIE_IS_NUMBER, "1");
    }

    public void setLastCrayonSaisieIsNumber(String s) {
        getSharedPref().edit()
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
