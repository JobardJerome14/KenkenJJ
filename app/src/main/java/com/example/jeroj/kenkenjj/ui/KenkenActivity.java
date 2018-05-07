package com.example.jeroj.kenkenjj.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.ui.adapters.BlockAdapter;
import com.example.jeroj.kenkenjj.ui.models.Block;
import com.example.jeroj.kenkenjj.ui.reusable.ActivityBase;

import java.util.ArrayList;

public class KenkenActivity extends ActivityBase {
    private GridView gridView;


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
        blocks.add(new Block( "15x", "20dp", "20dp", "20dp", "20dp"));
        blocks.add(new Block( ""));
        blocks.add(new Block( "10x"));
        blocks.add(new Block( "24x"));
        blocks.add(new Block( "11+"));
        blocks.add(new Block( ""));
        //2
        blocks.add(new Block( "2/"));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        //3
        blocks.add(new Block( ""));
        blocks.add(new Block( "5-"));
        blocks.add(new Block( ""));
        blocks.add(new Block( "9+"));
        blocks.add(new Block( ""));
        blocks.add(new Block( "60x"));
        //4
        blocks.add(new Block( "2/"));
        blocks.add(new Block( "3-"));
        blocks.add(new Block( "2-"));
        blocks.add(new Block( "3+"));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        //5
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        blocks.add(new Block( "3-"));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        //6
        blocks.add(new Block( "12x"));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        blocks.add(new Block( ""));
        blocks.add(new Block( "3-"));
        blocks.add(new Block( ""));



        gridView.setAdapter(new BlockAdapter(this, blocks));

    }
}
