package com.example.jeroj.kenkenjj.ui.reusable;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class AlertFragment extends DialogFragment {

    private AlertFragmentCB alertFragmentCB;



    public static AlertFragment newInstance(int title, int message, AlertFragmentCB alertFragmentCB) {
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
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        do_callback();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
    }

    public void do_callback() {
        this.alertFragmentCB.onAlertFragmentClick();
    }


    public interface AlertFragmentCB {
        void onAlertFragmentClick();
    }


}
