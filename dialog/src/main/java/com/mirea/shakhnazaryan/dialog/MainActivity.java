package com.mirea.shakhnazaryan.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowTime(View view) {
        MyTimeDialogFragment timeDialogFragment = new MyTimeDialogFragment();
       TimePickerDialog timeDialog = new TimePickerDialog(MainActivity.this, timeDialogFragment.timeSetListener,
                timeDialogFragment.time.get(Calendar.HOUR_OF_DAY),
                timeDialogFragment.time.get(Calendar.MINUTE), true);
       timeDialog.show();
    }

    public void onClickShowDate(View view)
    {
        MyDateDialogFragment dateDialogFragment = new MyDateDialogFragment();
        DatePickerDialog dateDialog = new DatePickerDialog(MainActivity.this, dateDialogFragment.dateSetListener,
                dateDialogFragment.date.get(Calendar.YEAR),
                dateDialogFragment.date.get(Calendar.MONTH),
                dateDialogFragment.date.get(Calendar.DAY_OF_MONTH));
        dateDialog.show();
    }

    public void onCLickShowProgress(View view)
    {
        ProgressDialog progressDialogFragment = new ProgressDialog(MainActivity.this);
        progressDialogFragment.setTitle("Progress");
        progressDialogFragment.setMessage("Loading...");
        progressDialogFragment.setButton(Dialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int which) { }
        });
        progressDialogFragment.show();
    }
}