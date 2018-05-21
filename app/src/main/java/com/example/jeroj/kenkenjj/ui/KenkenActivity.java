package com.example.jeroj.kenkenjj.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.API;
import com.example.jeroj.kenkenjj.api.SharedP;
import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;
import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.ui.adapters.BlockAdapter;
import com.example.jeroj.kenkenjj.ui.models.Block;
import com.example.jeroj.kenkenjj.ui.reusable.ActivityBase;

import java.util.ArrayList;
import java.util.UUID;

public class KenkenActivity extends ActivityBase {

    Button raz_btn;
    Button new_game_btn;
    Button help_btn;
    Button rules_btn;
    private GridView gridView;
    private BlockAdapter blockAdapter;

    private Integer id_grille = 0;
    private String user_id = "JJUSER";

    private SharedP sharedP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenken);

        sharedP = new SharedP(this);
        this.user_id = sharedP.getUserId();
        bindView();
    }

    private Grille get_grille(Integer new_grille) {
        Long tsLong = System.currentTimeMillis() / 1000;
        String ts = tsLong.toString(); //current timestamp en string
        this.user_id = UUID.randomUUID().toString() + ts;

        ArrayList<Block> blocks = new ArrayList<>();

        if (new_grille == 1) {
            if (this.id_grille == 0) {
                this.id_grille = 1;
            } else {
                this.id_grille = 0;
            }
        }

        if (this.id_grille == 1) {
            //1
            blocks.add(new Block("15x", true, true, false, true, 5));
            blocks.add(new Block("", true, false, true, false, 1));
            blocks.add(new Block("10x", true, true, true, false, 2));
            blocks.add(new Block("24x", true, true, true, false, 4));
            blocks.add(new Block("11+", true, true, false, true, 3));
            blocks.add(new Block("", true, false, true, false, 6));
            //2
            blocks.add(new Block("2/", true, true, true, false, 4));
            blocks.add(new Block("", false, true, true, true, 3));
            blocks.add(new Block("", false, true, true, true, 5));
            blocks.add(new Block("", false, true, false, true, 1));
            blocks.add(new Block("", true, false, true, true, 6));
            blocks.add(new Block("", false, true, true, true, 2));
            //3
            blocks.add(new Block("", false, true, true, true, 2));
            blocks.add(new Block("5-", true, true, false, true, 6));
            blocks.add(new Block("", true, false, true, true, 1));
            blocks.add(new Block("9+", true, true, false, true, 5));
            blocks.add(new Block("", true, false, true, true, 4));
            blocks.add(new Block("60x", true, true, true, false, 3));
            //4
            blocks.add(new Block("2/", true, true, true, false, 3));
            blocks.add(new Block("3-", true, true, true, false, 5));
            blocks.add(new Block("2-", true, true, true, false, 6));
            blocks.add(new Block("3+", true, true, false, true, 2));
            blocks.add(new Block("", true, false, true, true, 1));
            blocks.add(new Block("", false, true, true, false, 4));
            //5
            blocks.add(new Block("", false, true, true, true, 6));
            blocks.add(new Block("", false, true, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 4));
            blocks.add(new Block("3-", true, true, true, false, 3));
            blocks.add(new Block("", true, true, false, true, 5));
            blocks.add(new Block("", false, false, true, true, 1));
            //6
            blocks.add(new Block("12x", true, true, false, true, 1));
            blocks.add(new Block("", true, false, false, true, 4));
            blocks.add(new Block("", true, false, true, true, 3));
            blocks.add(new Block("", false, true, true, true, 6));
            blocks.add(new Block("3-", true, true, false, true, 2));
            blocks.add(new Block("", true, false, true, true, 5));
        } else {
            //1
            blocks.add(new Block("1-", true, true, true, false, 4));
            blocks.add(new Block("150x", true, true, false, false, 6));
            blocks.add(new Block("", true, false, true, true, 5));
            blocks.add(new Block("2/", true, true, false, true, 2));
            blocks.add(new Block("", true, false, true, true, 1));
            blocks.add(new Block("2-", true, true, true, false, 3));
            //2
            blocks.add(new Block("", false, true, true, true, 3));
            blocks.add(new Block("", false, true, true, true, 5));
            blocks.add(new Block("1-", true, true, true, false, 4));
            blocks.add(new Block("3/", true, true, false, true, 6));
            blocks.add(new Block("", true, false, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 1));
            //3
            blocks.add(new Block("1-", true, true, false, true, 1));
            blocks.add(new Block("", true, false, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 3));
            blocks.add(new Block("4-", true, true, true, false, 5));
            blocks.add(new Block("2-", true, true, false, true, 6));
            blocks.add(new Block("", true, false, true, true, 4));
            //4
            blocks.add(new Block("10+", true, true, false, true, 5));
            blocks.add(new Block("", true, false, false, true, 3));
            blocks.add(new Block("", true, false, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 1));
            blocks.add(new Block("1-", true, true, true, false, 4));
            blocks.add(new Block("6+", true, true, true, true, 6));
            //5
            blocks.add(new Block("3/", true, true, true, false, 6));
            blocks.add(new Block("3-", true, true, true, false, 4));
            blocks.add(new Block("5-", true, true, true, false, 1));
            blocks.add(new Block("36x", true, true, true, false, 3));
            blocks.add(new Block("", false, true, true, true, 5));
            blocks.add(new Block("3-", true, true, true, false, 2));
            //6
            blocks.add(new Block("", false, true, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 1));
            blocks.add(new Block("", false, true, true, true, 6));
            blocks.add(new Block("", false, true, false, true, 4));
            blocks.add(new Block("", true, false, true, true, 3));
            blocks.add(new Block("", false, true, true, true, 5));
        }

        return new Grille(this.id_grille, blocks);
    }

    private void load_grille(Grille grille) {
        this.blockAdapter = new BlockAdapter(this, grille);
        this.gridView.setAdapter(this.blockAdapter);
        this.id_grille = grille.getId_grille();
    }

    private void get_grille_via_api() {

        API api = new API();

        api.getKenkenGrille(this.user_id, new ResultatCallback<Grille>() {
            @Override
            public void onWaitingResultat(Grille grille) {
                load_grille(grille);
            }
        });

    }


    private void bindView() {
        this.gridView = findViewById(R.id.gridview);

        Grille current_grille = this.sharedP.getCurrentGrille();
        if (current_grille != null && current_grille.getId_grille() != 0) {
            //Load current Grille
            load_grille(current_grille);
        } else if (this.sharedP.getModeApi().equals("0")) {
            //Mode without API
            Grille grille = get_grille(0);
            load_grille(grille);
        } else if (this.sharedP.getModeApi().equals("1")) {
            //Mode with API
            get_grille_via_api();
        } else {
            //Problem
            //TODO event firebase
        }

        this.raz_btn = findViewById(R.id.raz_btn);
        this.raz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raz();
            }
        });

        this.new_game_btn = findViewById(R.id.new_game_btn);
        this.new_game_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new_game();
            }
        });

        this.help_btn = findViewById(R.id.help_btn);
        this.help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO

            }
        });


        this.rules_btn = findViewById(R.id.rules_btn);
        this.rules_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                see_rules();
            }
        });
    }

    public void see_rules() {
        navigate(RulesActivity.class, null);
    }

    private void raz() {
        Grille grille = this.sharedP.getCurrentGrille(); //mode virtuel
        for (Block block : grille.getBlocks()) {
            block.setCurrent_value(0);
        }
        this.sharedP.setCurrentGrille(grille);
        this.blockAdapter = new BlockAdapter(this, grille);
        gridView.setAdapter(this.blockAdapter);
        this.blockAdapter.notifyDataSetChanged();
    }

    private void new_game() {
        //get nouvelle grille ET sauvegarde abandon en base via api
        if (this.sharedP.getModeApi().equals("0")) {
            Grille grille = get_grille(1);
            this.blockAdapter = new BlockAdapter(this, grille);
            gridView.setAdapter(this.blockAdapter);
            this.blockAdapter.notifyDataSetChanged();
        } else if (this.sharedP.getModeApi().equals("1")) {
            get_grille_via_api();
        }
    }

}
