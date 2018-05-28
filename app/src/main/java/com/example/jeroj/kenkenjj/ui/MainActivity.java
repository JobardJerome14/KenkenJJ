package com.example.jeroj.kenkenjj.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.SharedP;
import com.example.jeroj.kenkenjj.ui.reusable.ActivityBase;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.UUID;

public class MainActivity extends ActivityBase {

    TextView tw_main;
    Button welcome_btn;

    SharedP sharedP;

    private FirebaseAnalytics mFirebaseAnalytics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sharedP = new SharedP(this);
        if (this.sharedP.getUserId().isEmpty()) {
            this.sharedP.setUserId(UUID.randomUUID().toString());
        }
        this.sharedP.setModeApi("0"); // Mode API:  0=without API, 1=with API
        bindView();
    }

    private void bindView() {
        this.tw_main = findViewById(R.id.tw_main);

        this.mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        this.welcome_btn = findViewById(R.id.welcome_btn);
        this.welcome_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play_ken();

            }
        });
    }

    public void play_ken() {
        navigate(KenkenActivity.class, null);
        Bundle bundle = new Bundle();
        bundle.putString("user_id", this.sharedP.getUserId());
        mFirebaseAnalytics.logEvent("play_btn", bundle);
    }
}
