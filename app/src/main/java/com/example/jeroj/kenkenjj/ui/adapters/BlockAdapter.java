package com.example.jeroj.kenkenjj.ui.adapters;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.RelativeLayout;
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

        final View borderTop = convertView.findViewById(R.id.vtop);
        if(cur_block.getBorderTop() == false) {
            borderTop.setVisibility(View.INVISIBLE);
        }

        final View borderLeft = convertView.findViewById(R.id.vleft);
        if(cur_block.getBorderLeft() == false) {
            borderLeft.setVisibility(View.INVISIBLE);
        }

        final View borderRight = convertView.findViewById(R.id.vright);
        if(cur_block.getBorderRight() == false) {
            borderRight.setVisibility(View.INVISIBLE);
        }

        final View borderBottom = convertView.findViewById(R.id.vbottom);
        if(cur_block.getBorderBottom() == false) {
            borderBottom.setVisibility(View.INVISIBLE);
        }

       // final RelativeLayout relativeLayout = convertView.findViewById(R.id.block_id);
       // relativeLayout.setBackgroundResource(R.drawable.block_style);




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
