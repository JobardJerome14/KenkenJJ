package com.example.jeroj.kenkenjj.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.SharedP;
import com.example.jeroj.kenkenjj.helpers.FBevent;
import com.example.jeroj.kenkenjj.ui.reusable.ActivityBase;

import java.util.UUID;

public class MainActivity extends ActivityBase {

    TextView tw_main;
    Button welcome_btn;
    Button welcome_rules_btn;
    Button stats_btn;

    SharedP sharedP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sharedP = new SharedP(this);
        if (this.sharedP.getUserId().isEmpty()) {
            this.sharedP.setUserId(UUID.randomUUID().toString());
        }
        this.sharedP.setModeApi("1"); // Mode API:  0=without API, 1=with API
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

        this.welcome_rules_btn = findViewById(R.id.welcome_rules_btn);
        this.welcome_rules_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_rules();
            }
        });

        this.stats_btn = findViewById(R.id.stats_btn);
        this.stats_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_stats();
            }
        });
    }

    public void play_ken() {
        navigate(KenkenActivity.class, null);

        new FBevent(this, "clic", "button", "play_btn");
    }

    public void go_to_rules() {
        navigate(RulesActivity.class, null);

        new FBevent(this, "clic", "button", "welcome_rules_btn");
    }

    public void show_stats() {
        navigate(StatsActivity.class, null);

        new FBevent(this, "clic", "button", "stats_btn");
    }

}
