package com.example.jeroj.kenkenjj.helpers;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.example.jeroj.kenkenjj.api.SharedP;
import com.google.firebase.analytics.FirebaseAnalytics;

public class FBevent {

    private FirebaseAnalytics mFirebaseAnalytics;

    private SharedP sharedP;

    public FBevent(Context contexte, String event, String key, String value) {

        this.mFirebaseAnalytics = FirebaseAnalytics.getInstance(contexte);
        this.sharedP = new SharedP(contexte);

        Bundle bundle = new Bundle();
        bundle.putString(key, value);
        bundle.putString("user_id", this.sharedP.getUserId());

        mFirebaseAnalytics.logEvent(event, bundle);

        Log.i("!!!  firebase event !!!", event + ' ' + bundle.toString());
    }

}
