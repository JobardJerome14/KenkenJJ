package com.real.first.sandoken.ui.reusable;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.real.first.sandoken.R;
import com.real.first.sandoken.api.helpers.ResultatCallback;

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

    @Nullable
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = "", message = "";
        int ko_label = R.string.ko_label;
        boolean showCancel = true;
        if(getArguments() != null) {
            title = getArguments().getString("title");
            message = getArguments().getString("message");
            showCancel = getArguments().getBoolean("show_cancel");
        }

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
