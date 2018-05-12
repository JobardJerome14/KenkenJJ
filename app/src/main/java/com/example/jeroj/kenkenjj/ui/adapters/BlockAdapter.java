package com.example.jeroj.kenkenjj.ui.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
                            //TODO close keyboard
                            break;
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

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

}
