package com.example.jeroj.kenkenjj.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.API;
import com.example.jeroj.kenkenjj.api.SharedP;
import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;
import com.example.jeroj.kenkenjj.models.Stats;


public class StatsActivity extends AppCompatActivity {

    TextView st2_play;
    TextView st2_resolved;
    TextView st2_pourcentage;

    SharedP sharedP;

    String user_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        sharedP = new SharedP(this);
        this.user_id = sharedP.getUserId();
        bindView();
    }

    public void bindView() {
        this.st2_play = findViewById(R.id.st2_play);

        this.st2_resolved = findViewById(R.id.st2_resolved);
        this.st2_pourcentage = findViewById(R.id.st2_pourcentage);

        API api = new API();

        api.getKenStats(this.user_id, new ResultatCallback<Stats>() {
            @Override
            public void onWaitingResultat(Stats result) {
                load_stats(result);
            }
        });
    }

    public void load_stats(Stats stats) {
        this.st2_play.setText(String.valueOf(stats.getPlayed()));
        this.st2_resolved.setText(String.valueOf(stats.getResolved()));
        this.st2_pourcentage.setText(String.valueOf(stats.getPourcentage()) + " %");
    }
}
