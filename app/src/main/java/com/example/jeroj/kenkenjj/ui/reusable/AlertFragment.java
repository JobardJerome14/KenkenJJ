package com.example.jeroj.kenkenjj.ui.reusable;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;

public class AlertFragment extends DialogFragment {

    private ResultatCallback<String> alertFragmentCB;


    private int ok_label = R.string.ok_label;
    private int ko_label = R.string.ko_label;

    public static AlertFragment newInstance(int title, int message, ResultatCallback<String> alertFragmentCB) {
        AlertFragment frag = new AlertFragment();
        frag.alertFragmentCB = alertFragmentCB;

        Bundle args = new Bundle();
        args.putInt("title", title);
        args.putInt("message", message);
        frag.setArguments(args);

        return frag;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int title = getArguments().getInt("title");
        int message = getArguments().getInt("message");

        return new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(this.ok_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        do_ok_callback();
                    }
                })
                .setNegativeButton(this.ko_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
    }

    public void do_ok_callback() {
        this.alertFragmentCB.onWaitingResultat(getString(this.ok_label));
    }


}
