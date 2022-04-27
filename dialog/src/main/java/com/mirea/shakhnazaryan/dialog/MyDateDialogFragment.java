package com.mirea.shakhnazaryan.dialog;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

import java.util.Calendar;

public class MyDateDialogFragment {
    Calendar date = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener()
    {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
        {
            date.set(Calendar.YEAR, year);
            date.set(Calendar.MONTH, monthOfYear);
            date.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        }
    };
}
