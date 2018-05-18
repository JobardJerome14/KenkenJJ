package com.example.jeroj.kenkenjj.ui.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
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


        final Block cur_block = this.blocks.get(position);
        final TextView tv_overtexte = convertView.findViewById(R.id.tv_overtexte);
        tv_overtexte.setText(cur_block.getTw_overtext());

        final EditText et_texte = convertView.findViewById(R.id.et_texte);
        et_texte.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!et_texte.getText().toString().equals("")) {
                    Integer text = Integer.parseInt(et_texte.getText().toString());
                    switch (text) {
                        case 0:
                        case 7:
                        case 8:
                        case 9:
                            et_texte.setText("");
                            notify_number_unauthorized();
                            break;
                        default:
                            //TODO auto close keyboard si possible
                            break;
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (/*!s.toString().equals("") &&*/ !et_texte.getText().toString().equals("")) {
                    Integer text = Integer.parseInt(et_texte.getText().toString());
                    cur_block.setCurrent_value(text);
                    InputMethodManager imm = (InputMethodManager)contexte.getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(et_texte.getWindowToken(), 0);
                    check_grille();
                }
            }
        });

        final View borderTop = convertView.findViewById(R.id.vtop);
        if(!cur_block.getBorderTop()) {
            borderTop.setVisibility(View.INVISIBLE);
        }else{
            borderTop.setVisibility(View.VISIBLE);
        }

        final View borderLeft = convertView.findViewById(R.id.vleft);
        if(!cur_block.getBorderLeft()) {
            borderLeft.setVisibility(View.INVISIBLE);
        }else{
            borderLeft.setVisibility(View.VISIBLE);
        }

        final View borderRight = convertView.findViewById(R.id.vright);
        if(!cur_block.getBorderRight()) {
            borderRight.setVisibility(View.INVISIBLE);
        }else{
            borderRight.setVisibility(View.VISIBLE);
        }

        final View borderBottom = convertView.findViewById(R.id.vbottom);
        if(!cur_block.getBorderBottom()) {
            borderBottom.setVisibility(View.INVISIBLE);
        }else{
            borderBottom.setVisibility(View.VISIBLE);
        }

        convertView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        int height = convertView.getMeasuredHeight();
        borderLeft.setMinimumHeight(height);
        borderRight.setMinimumHeight(height);

        return convertView;
    }

/*    private void hideKeyboard(EditText editText) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }*/

    public void raz() {
        for (Block block: this.blocks) {
            block.setEt_text("");
            block.setCurrent_value(0);
        }
    }


    private void check_grille() {
        Integer i = 0;
        Integer good = 0;
        for (Block block: this.blocks ) {
            i++;
            //Log.i("block_current_value", i+" : "+block.getCurrent_value());
            //Log.i("block_good_value", i+" : "+block.getGood_value());
            if(block.getCurrent_value() == block.getGood_value()) {
                good++;
            }
        }
        if(good==36) {
            //Log.i("victory", "C'est la victoire !");
            notify_victory();
        }
    }

    private void notify_number_unauthorized() {
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this.contexte).create();
        alertDialog.setTitle(R.string.num_non_autorise_title);
        alertDialog.setMessage(contexte.getString(R.string.num_non_autorise_desc));
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
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

}
