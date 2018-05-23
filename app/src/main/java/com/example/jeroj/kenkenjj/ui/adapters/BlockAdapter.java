package com.example.jeroj.kenkenjj.ui.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.API;
import com.example.jeroj.kenkenjj.api.SharedP;
import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;
import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.models.RetourUpdate;
import com.example.jeroj.kenkenjj.ui.models.Block;

import java.util.ArrayList;

public class BlockAdapter extends BaseAdapter {
    private Context contexte;
    private ArrayList<Block> blocks;
    private Integer id_grille;

    private boolean win = false;

    private SharedP sharedP;

    public BlockAdapter(Context contexte, Grille grille) {
        this.contexte = contexte;
        this.blocks = grille.getBlocks();
        this.id_grille = grille.getId_grille();
        this.win = false;
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

        if(cur_block.isSelected()) {
            if(this.sharedP.getModeEdition().equals("STYLO")) {
                block_RL.setBackgroundResource(R.drawable.stylo_selected);
            } else if(this.sharedP.getModeEdition().equals("CRAYON")) {
                block_RL.setBackgroundResource(R.drawable.crayon_selected);
            } else {
                //TODO event firebase
            }
        } else {
            block_RL.setBackgroundResource(R.drawable.sweet_borders);
        }

        block_RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sharedP.getModeEdition().equals("STYLO")) {
                    for (Block block : blocks) {
                        if (block.isSelected()) block.setSelected(!block.isSelected());
                    }
                }
                cur_block.setSelected(!cur_block.isSelected());
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
        Grille grille = new Grille(this.id_grille, this.blocks);
        this.sharedP.setCurrentGrille(grille);
    }


    private void check_grille() {
        if (!this.win) {
            //Integer i = 0;
            Integer good = 0;
            for (Block block : this.blocks) {
                //i++;
                //Log.i("block_current_value", i+" : "+block.getCurrent_value());
                //Log.i("block_good_value", i+" : "+block.getGood_value());
                if (block.getCurrent_value() == block.getGood_value()) {
                    good++;
                }
            }
            if (good == 36) {
                this.win = true;
                //Log.i("victory", "C'est la victoire !");
                notify_victory();
                save_victory_via_api();
            }
        }
    }



    private void notify_victory() {
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this.contexte).create();
        alertDialog.setTitle(R.string.win_message_title);
        alertDialog.setMessage(contexte.getString(R.string.win_message_desc));
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    private void save_victory_via_api() {
        //TODO get user et sauvegarde ou?
        //sauvegarde victoire en base via api
        API api = new API();
        api.updKenGame(this.sharedP.getUserId(), this.id_grille, 1, new ResultatCallback<RetourUpdate>() {
            @Override
            public void onWaitingResultat(RetourUpdate result) {
                if (result.getStatus().equals("OK")) {
                    //TODO
                } else {
                    //TODO
                }
            }
        });
    }

}
