package com.example.jeroj.kenkenjj.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.ui.adapters.BlockAdapter;
import com.example.jeroj.kenkenjj.ui.models.Block;
import com.example.jeroj.kenkenjj.ui.reusable.ActivityBase;

import java.util.ArrayList;

public class KenkenActivity extends ActivityBase {
    private GridView gridView;
    private Button raz_btn;
    private BlockAdapter blockAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenken);

        bindView();
    }


    private void bindView() {
        this.gridView = findViewById(R.id.gridview);
        //1
        ArrayList<Block> blocks = new ArrayList<>();
        //blocks.add(new Block( "15x", "20dp", "20dp", "20dp", "20dp"));
        blocks.add(new Block( "15x", true, true, false, true, 5));
        blocks.add(new Block( "", true, false, true, false, 1));
        blocks.add(new Block( "10x", true, true, true, false, 2));
        blocks.add(new Block( "24x", true, true, true, false, 4));
        blocks.add(new Block( "11+",true, true, false, true, 3));
        blocks.add(new Block( "",true, false, true, false, 6));
        //2
        blocks.add(new Block( "2/", true, true, true, false, 4));
        blocks.add(new Block( "", false, true,true,true, 3));
        blocks.add(new Block( "", false, true,true,true, 5));
        blocks.add(new Block( "", false, true, false, true, 1));
        blocks.add(new Block( "", true, false, true, true, 6));
        blocks.add(new Block( "", false, true,true,true, 2));
        //3
        blocks.add(new Block( "", false, true,true,true, 2));
        blocks.add(new Block( "5-", true, true, false, true, 6));
        blocks.add(new Block( "", true, false, true, true, 1));
        blocks.add(new Block( "9+", true, true, false, true, 5));
        blocks.add(new Block( "", true, false, true, true, 4));
        blocks.add(new Block( "60x", true, true, true, false, 3));
        //4
        blocks.add(new Block( "2/", true, true, true, false, 3));
        blocks.add(new Block( "3-", true, true, true, false, 5));
        blocks.add(new Block( "2-", true, true, true, false, 6));
        blocks.add(new Block( "3+", true, true, false, true, 2));
        blocks.add(new Block( "", true, false, true, true, 1));
        blocks.add(new Block( "", false, true, true, false, 4));
        //5
        blocks.add(new Block( "", false, true,true,true, 6));
        blocks.add(new Block( "",false, true, true, true, 2));
        blocks.add(new Block( "",false, true, true, true, 4));
        blocks.add(new Block( "3-", true, true, true, false, 3));
        blocks.add(new Block( "", true, true, false, true, 5));
        blocks.add(new Block( "", false, false, true, true, 1));
        //6
        blocks.add(new Block( "12x", true, true, false, true, 1));
        blocks.add(new Block( "", true, false, false, true, 4));
        blocks.add(new Block( "", true, false, true, true, 3));
        blocks.add(new Block( "", false, true,true,true, 6));
        blocks.add(new Block( "3-", true, true, false, true, 2));
        blocks.add(new Block( "", true, false, true, true, 5));

        this.blockAdapter = new BlockAdapter(this, blocks);
        gridView.setAdapter(this.blockAdapter);


        this.raz_btn = findViewById(R.id.raz_btn);
        this.raz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO raz du gridview
                raz();
            }
        });
    }

    private void raz() {
        this.blockAdapter.raz();
        this.blockAdapter.notifyDataSetChanged();
    }

}
