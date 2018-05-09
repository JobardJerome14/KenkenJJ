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
        blocks.add(new Block( "15x", true, true, false, true));
        blocks.add(new Block( "", true, false, true, false));
        blocks.add(new Block( "10x", true, true, true, false));
        blocks.add(new Block( "24x", true, true, true, false));
        blocks.add(new Block( "11+",true, true, false, true));
        blocks.add(new Block( "",true, false, true, false));
        //2
        blocks.add(new Block( "2/", true, true, true, false));
        blocks.add(new Block( "", false, true,true,true));
        blocks.add(new Block( "", false, true,true,true));
        blocks.add(new Block( "", false, true, false, true));
        blocks.add(new Block( "", true, false, true, true));
        blocks.add(new Block( "", false, true,true,true));
        //3
        blocks.add(new Block( "", false, true,true,true));
        blocks.add(new Block( "5-", true, true, false, true));
        blocks.add(new Block( "", true, false, true, true));
        blocks.add(new Block( "9+", true, true, false, true));
        blocks.add(new Block( "", true, false, true, true));
        blocks.add(new Block( "60x", true, true, true, false));
        //4
        blocks.add(new Block( "2/", true, true, true, false));
        blocks.add(new Block( "3-", true, true, true, false));
        blocks.add(new Block( "2-", true, true, true, false));
        blocks.add(new Block( "3+", true, true, false, true));
        blocks.add(new Block( "", true, false, true, true));
        blocks.add(new Block( "", false, true, true, false));
        //5
        blocks.add(new Block( "", false, true,true,true));
        blocks.add(new Block( "",false, true, true, true));
        blocks.add(new Block( "",false, true, true, true));
        blocks.add(new Block( "3-", true, true, true, false));
        blocks.add(new Block( "", true, true, false, true));
        blocks.add(new Block( "", false, false, true, true));
        //6
        blocks.add(new Block( "12x", true, true, false, true));
        blocks.add(new Block( "", true, false, false, true));
        blocks.add(new Block( "", true, false, true, true));
        blocks.add(new Block( "", false, true,true,true));
        blocks.add(new Block( "3-", true, true, false, true));
        blocks.add(new Block( "", true, false, true, true));

        gridView.setAdapter(new BlockAdapter(this, blocks));

        this.raz_btn = findViewById(R.id.raz_btn);
        this.raz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO raz du gridview
            }
        });
    }
    

}
