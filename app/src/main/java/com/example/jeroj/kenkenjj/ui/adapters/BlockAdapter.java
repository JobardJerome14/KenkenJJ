package com.example.jeroj.kenkenjj.ui.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.ui.models.Block;

import java.util.ArrayList;

public class BlockAdapter extends BaseAdapter {
    private Context contexte;
    private ArrayList<Block> blocks;


    public BlockAdapter(Context contexte, ArrayList<Block> blocks) {
        this.contexte = contexte;
        this.blocks = blocks;

    }


    @Override
    public int getCount() {
        return blocks.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) contexte.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.block_item, parent, false);
        }

        Block cur_block = this.blocks.get(position);
        final TextView tv_overtexte = convertView.findViewById(R.id.tv_overtexte);
        tv_overtexte.setText(cur_block.getTw_overtext());
/*        ShapeDrawable sd = new ShapeDrawable();

        // Specify the shape of ShapeDrawable
        sd.setShape(new RectShape());

        // Specify the border color of shape
        sd.getPaint().setColor(Color.RED);

        // Set the border width
        sd.getPaint().setStrokeWidth(10f);

        // Specify the style is a Stroke
        sd.getPaint().setStyle(Paint.Style.STROKE);
        tv_overtexte.setBackground(sd);*/


        final EditText et_texte = convertView.findViewById(R.id.et_texte);
        et_texte.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




/*        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_meteo.setBackgroundColor(contexte.getResources().getColor(R.color.flashy2));
            }
        });*/


        return convertView;
        //return null;
    }
}
