package com.real.first.sandoken.helpers;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.real.first.sandoken.api.SharedP;
import com.google.firebase.analytics.FirebaseAnalytics;

public class FBevent {

    public FBevent(Context contexte, String event, String key, String value) {

        FirebaseAnalytics mFirebaseAnalytics;

        SharedP sharedP;

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(contexte);
        sharedP = new SharedP(contexte);

        Bundle bundle = new Bundle();
        bundle.putString(key, value);
        bundle.putString("user_id", sharedP.getUserId());

        mFirebaseAnalytics.logEvent(event, bundle);

        Log.i("!!!  firebase event !!!", event + ' ' + bundle.toString());
    }

}
