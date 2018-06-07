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


    private final int ok_label = R.string.ok_label;


    public static AlertFragment newInstance(String title, String message, boolean showCancel, ResultatCallback<String> alertFragmentCB) {
        AlertFragment frag = new AlertFragment();
        frag.alertFragmentCB = alertFragmentCB;

        Bundle args = new Bundle();
        args.putString("title", title);
        args.putString("message", message);
        args.putBoolean("show_cancel", showCancel);
        frag.setArguments(args);

        return frag;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = getArguments().getString("title");
        String message = getArguments().getString("message");

        int ko_label = R.string.ko_label;
        boolean showCancel = getArguments().getBoolean("show_cancel");

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(this.ok_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        do_ok_callback();
                    }
                });

        if(showCancel) {
            dialog.setNegativeButton(ko_label, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }

        return dialog.create();
    }

    public void do_ok_callback() {
        this.alertFragmentCB.onWaitingResultat(getString(this.ok_label));
    }


}
