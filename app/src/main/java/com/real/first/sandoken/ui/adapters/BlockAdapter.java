package com.real.first.sandoken.ui.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.real.first.sandoken.R;
import com.real.first.sandoken.api.SharedP;
import com.real.first.sandoken.helpers.FBevent;
import com.real.first.sandoken.helpers.IFBEvent;
import com.real.first.sandoken.models.Block;
import com.real.first.sandoken.models.Grille;
import com.real.first.sandoken.ui.reusable.LogUtils;

import java.util.ArrayList;

public class BlockAdapter extends BaseAdapter {
    private Context contexte;
    private ArrayList<Block> blocks;
    private Integer id_grille;
    private String percent_victory;
    private String nb_victory;

    private SharedP sharedP;

    public BlockAdapter(Context contexte, Grille grille) {
        this.contexte = contexte;
        this.blocks = grille.getBlocks();
        this.id_grille = grille.getId_grille();
        this.percent_victory = grille.getPercent_victory();
        this.nb_victory = grille.getNb_victory();
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
            if (this.sharedP.getModeEdition().equals(contexte.getString(R.string.edition_stylo))) {
                block_RL.setBackgroundResource(R.drawable.stylo_selected);
            } else if (this.sharedP.getModeEdition().equals(contexte.getString(R.string.edition_crayon))) {
                block_RL.setBackgroundResource(R.drawable.crayon_selected);
            } else {
                new FBevent(this.contexte, IFBEvent.CRASH_EVENT, IFBEvent.MODE_EDITION_SELECTION_BLOCK_KEY, IFBEvent.MODE_EDITION_KO_VALUE);
            }
        } else {
            block_RL.setBackgroundResource(R.drawable.sweet_borders);
        }

        block_RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sharedP.getModeEdition().equals(contexte.getString(R.string.edition_stylo))) {
                    for (Block block : blocks) {
                        if (block.isSelected()) block.setSelected(!block.isSelected());
                    }
                } else if (sharedP.getModeEdition().equals(contexte.getString(R.string.edition_crayon))) {
                    //LogUtils.log("LastCrayonSaisieIsNum", sharedP.getLastCrayonSaisieIsNumber());
                    deselection_blocks_if_needed();
                    sharedP.setLastCrayonSaisieIsNumber("0");
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
        //LogUtils.log("get crayon", cur_block.getCrayon());
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
        Grille grille = new Grille(this.id_grille, this.blocks, this.percent_victory, this.nb_victory);
        this.sharedP.setCurrentGrille(grille);
    }

    private void deselection_blocks_if_needed() {
        LogUtils.log("deselection mode" , this.sharedP.getLastCrayonSaisieIsNumber());
        if(this.sharedP.getLastCrayonSaisieIsNumber().equals("1")) {
            for (Block block : this.blocks) {
                block.setSelected(false);
            }
        }
    }


}
