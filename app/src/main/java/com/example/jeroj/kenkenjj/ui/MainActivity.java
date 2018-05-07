package com.example.jeroj.kenkenjj.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.ui.reusable.ActivityBase;

public class MainActivity extends ActivityBase {
    public static final String MAINACT_MESSAGE_TO_ACT2 = "play_kenken";

    private TextView tw_main;
    private Button welcome_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
    }

    private void bindView() {
        this.tw_main = findViewById(R.id.tw_main);
        this.welcome_btn = findViewById(R.id.welcome_btn);


        this.welcome_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate();
            }
        });
    }

    public void navigate() {
        Bundle bundle = new Bundle();
        navigate(KenkenActivity.class, bundle);
    }
}
