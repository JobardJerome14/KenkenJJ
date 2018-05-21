package com.example.jeroj.kenkenjj.ui.reusable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class ActivityBase extends AppCompatActivity {

    public void navigate(Class activity, Bundle bundle) {
        Intent i = new Intent(getApplicationContext(), activity);
        if(bundle != null) {
            i.putExtras(bundle);
        }
        startActivity(i);
    }
}
