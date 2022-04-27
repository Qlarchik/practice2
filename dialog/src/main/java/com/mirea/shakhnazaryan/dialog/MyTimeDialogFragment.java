package com.mirea.shakhnazaryan.dialog;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

import java.util.Calendar;

public class MyTimeDialogFragment {
    Calendar time= Calendar.getInstance();
    TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener()
    {
        public void onTimeSet(TimePicker view, int hourOfDay, int minute)
        {
            time.set(Calendar.HOUR_OF_DAY, hourOfDay);
            time.set(Calendar.MINUTE, minute);
        }
    };
}
