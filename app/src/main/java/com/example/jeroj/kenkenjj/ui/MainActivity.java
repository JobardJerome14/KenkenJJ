package com.example.jeroj.kenkenjj.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.SharedP;
import com.example.jeroj.kenkenjj.ui.reusable.ActivityBase;

import java.util.UUID;

public class MainActivity extends ActivityBase {
    public static final String MAINACT_MESSAGE_TO_ACT2 = "play_kenken";

    private TextView tw_main;
    private Button welcome_btn;

    private SharedP sharedP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sharedP = new SharedP(this);
        if(this.sharedP.getUserId().isEmpty()) {
            this.sharedP.setUserId(UUID.randomUUID().toString());
        }
        bindView();
    }

    private void bindView() {
        this.tw_main = findViewById(R.id.tw_main);
        this.welcome_btn = findViewById(R.id.welcome_btn);


        this.welcome_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play_ken();
            }
        });
    }

    public void play_ken() {
        Bundle bundle = new Bundle();
        navigate(KenkenActivity.class, bundle);
    }
}
