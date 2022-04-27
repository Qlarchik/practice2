package com.mirea.shakhnazaryan.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyProgressDialogFragment {
    Context context;

    public MyProgressDialogFragment(Context context){
        this.context = context;
    }

    public void ShowDialog() {
        ProgressDialog progressDialogFragment = new ProgressDialog(context);
        progressDialogFragment.setTitle("Progress");
        progressDialogFragment.setMessage("Loading...");
        progressDialogFragment.setButton(Dialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int which) { }
        });
        progressDialogFragment.show();
    }
}
