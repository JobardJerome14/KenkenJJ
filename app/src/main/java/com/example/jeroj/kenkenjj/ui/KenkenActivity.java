package com.example.jeroj.kenkenjj.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.API;
import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;
import com.example.jeroj.kenkenjj.ui.adapters.BlockAdapter;
import com.example.jeroj.kenkenjj.ui.models.Block;
import com.example.jeroj.kenkenjj.ui.reusable.ActivityBase;

import java.util.ArrayList;

public class KenkenActivity extends ActivityBase {
    private GridView gridView;
    private Button raz_btn;
    private Button new_game_btn;
    private Button help_btn;
    private Button rules_btn;
    private BlockAdapter blockAdapter;


    private Boolean test_id_grille = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenken);

        bindView();
    }

    private ArrayList<Block> get_blocs(Integer new_grille) {
        ArrayList<Block> blocks = new ArrayList<>();

        if(new_grille == 1 ) {
            this.test_id_grille = !this.test_id_grille;
        }
        if(this.test_id_grille) {
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
        return blocks;
    }

    private void load_grille(ArrayList<Block> blockArrayList) {
        this.blockAdapter = new BlockAdapter(this, blockArrayList);
        this.gridView.setAdapter(this.blockAdapter);
    }

    private void get_blocs_via_api () {
        API api = new API();

        api.getKenkenGrille(new ResultatCallback<Block>() {
            @Override
            public void onWaitingResultat(ArrayList<Block> blockArrayList) {
                load_grille(blockArrayList);
            }
        });

    }


    private void bindView() {
        this.gridView = findViewById(R.id.gridview);

        //premiere ligne pour test sur virtual device , 2e et 3e pour test sur terminal
        //get_blocs_via_api();
        ArrayList<Block> blocks = get_blocs(0);
        load_grille(blocks);

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
                //TODO
            }
        });
    }

    private void raz() {
        ArrayList<Block> blocks = get_blocs(0);
        this.blockAdapter = new BlockAdapter(this, blocks);
        gridView.setAdapter(this.blockAdapter);
        this.blockAdapter.notifyDataSetChanged();
    }

    private void new_game() {
        //TODO sauvegarde partie en cours 'Game Over' --> api

        ArrayList<Block> blocks = get_blocs(1);
        this.blockAdapter = new BlockAdapter(this, blocks);
        gridView.setAdapter(this.blockAdapter);
        this.blockAdapter.notifyDataSetChanged();
    }

}
