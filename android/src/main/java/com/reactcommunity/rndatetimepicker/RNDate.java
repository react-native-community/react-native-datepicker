package com.reactcommunity.rndatetimepicker;

import java.util.Calendar;

import android.os.Bundle;

public class RNDate {
    private Calendar now;

    public RNDate(Bundle args) {
        now = Calendar.getInstance();

        if (args != null && args.containsKey(RNConstants.ARG_VALUE)) {
            set(args.getLong(RNConstants.ARG_VALUE));
        }
    }

    public Calendar get() {
        return now;
    }

    public void set(long value) {
        now.setTimeInMillis(value);
    }

    public int year() {
        return now.get(Calendar.YEAR);
    }

    public int month() {
        return now.get(Calendar.MONTH);
    }

    public int day() {
        return now.get(Calendar.DAY_OF_MONTH);
    }

    public int hour() {
        return now.get(Calendar.HOUR_OF_DAY);
    }

    public int minute() {
        return now.get(Calendar.MINUTE);
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof RNDate)) {
            return false;
        }
        RNDate otherDate = (RNDate) o;

        return now.equals(otherDate.get());
    }
}
