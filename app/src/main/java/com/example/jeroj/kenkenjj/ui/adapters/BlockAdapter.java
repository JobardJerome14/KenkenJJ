package com.example.jeroj.kenkenjj.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.SharedP;
import com.example.jeroj.kenkenjj.helpers.FBevent;
import com.example.jeroj.kenkenjj.models.Block;
import com.example.jeroj.kenkenjj.models.Grille;

import java.util.ArrayList;

public class BlockAdapter extends BaseAdapter {
    private Context contexte;
    private ArrayList<Block> blocks;
    private Integer id_grille;
    private String percent_victory;

    private SharedP sharedP;

    public BlockAdapter(Context contexte, Grille grille) {
        this.contexte = contexte;
        this.blocks = grille.getBlocks();
        this.id_grille = grille.getId_grille();
        this.percent_victory = grille.getPercent_victory();
        this.sharedP = new SharedP(contexte);
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) contexte.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (inflater != null)
                convertView = inflater.inflate(R.layout.block_item, parent, false);
        }

        if (convertView == null)
            return null;

        final Block cur_block = this.blocks.get(position);


        final RelativeLayout block_RL = convertView.findViewById(R.id.block_id);

        if (cur_block.isSelected()) {
            if (this.sharedP.getModeEdition().equals(R.string.edition_stylo)) {
                block_RL.setBackgroundResource(R.drawable.stylo_selected);
            } else if (this.sharedP.getModeEdition().equals(R.string.edition_crayon)) {
                block_RL.setBackgroundResource(R.drawable.crayon_selected);
            } else {
                new FBevent(this.contexte, "crash", "mode_edition", "ni stylo ni crayon");
            }
        } else {
            block_RL.setBackgroundResource(R.drawable.sweet_borders);
        }

        block_RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sharedP.getModeEdition().equals(R.string.edition_stylo)) {
                    for (Block block : blocks) {
                        if (block.isSelected()) block.setSelected(!block.isSelected());
                    }
                }
                cur_block.setSelected(!cur_block.isSelected());
                save_current_grille();
                notifyDataSetChanged();
            }
        });


        final TextView tv_overtexte = convertView.findViewById(R.id.tv_overtexte);
        tv_overtexte.setText(cur_block.getTw_overtext());

        final TextView stylo = convertView.findViewById(R.id.stylo);
        if (cur_block.getCurrent_value() != 0) {
            stylo.setText(String.valueOf(cur_block.getCurrent_value()));
        }

        final TextView crayon = convertView.findViewById(R.id.crayon);
        //Log.i("get crayon", cur_block.getCrayon());
        if (cur_block.getCrayon() != null && !cur_block.getCrayon().equals("")) {
            crayon.setText(cur_block.getCrayon());
        }


        final View borderTop = convertView.findViewById(R.id.vtop);
        if (!cur_block.getBorderTop()) {
            borderTop.setVisibility(View.INVISIBLE);
        } else {
            borderTop.setVisibility(View.VISIBLE);
        }

        final View borderLeft = convertView.findViewById(R.id.vleft);
        if (!cur_block.getBorderLeft()) {
            borderLeft.setVisibility(View.INVISIBLE);
        } else {
            borderLeft.setVisibility(View.VISIBLE);
        }

        final View borderRight = convertView.findViewById(R.id.vright);
        if (!cur_block.getBorderRight()) {
            borderRight.setVisibility(View.INVISIBLE);
        } else {
            borderRight.setVisibility(View.VISIBLE);
        }

        final View borderBottom = convertView.findViewById(R.id.vbottom);
        if (!cur_block.getBorderBottom()) {
            borderBottom.setVisibility(View.INVISIBLE);
        } else {
            borderBottom.setVisibility(View.VISIBLE);
        }

        convertView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        int height = convertView.getMeasuredHeight();
        borderLeft.setMinimumHeight(height);
        borderRight.setMinimumHeight(height);

        return convertView;
    }


    private void save_current_grille() {
        Grille grille = new Grille(this.id_grille, this.blocks, this.percent_victory);
        this.sharedP.setCurrentGrille(grille);
    }


}
