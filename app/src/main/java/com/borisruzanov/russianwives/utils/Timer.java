package com.borisruzanov.russianwives.utils;

import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Timer {

    private static Timer instance = null;

    private static Date currentTime = null;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    private static int remainMinutes = 0;

    private Timer() {}

    public static Timer getInstance() {
        if (instance == null)
            instance = new Timer();
        return instance;
    }

    /**
     * Take date parameter and return remain time value
     */
    public int getRemainTime(Date compareDate) {
        try {
            currentTime = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
            long diff = compareDate.getTime() - currentTime.getTime();
            int sec = (int) (diff / 1000); //convert into seconds
            remainMinutes = (sec / 60); //convert into minutes
            return (remainMinutes > 0) ? remainMinutes : 0;
            //return int with remain minutes 245 or 0
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Return remain hours,call after getRemainTime() method
     */
    public int getHour(Date date) {
        if (getRemainTime(date) > 60) {
            return remainMinutes / 60;
        } else {
            return 0;
        }
    }

    /**
     * Return remain minutes,call after getRemainTime() method
     */
    public int getMinutes(Date date) {
        int minute = getRemainTime(date);
        if (minute != 0) {
            return minute % 60;
        } else {
            return 0;
        }
    }

    /**
     * This method call when close trigger set and return date
     * it return date with added hours
     * when you close trigger you need only call this method using timer object
     */
    public String getDateAfterTrigger(Prefs preferences) {
        int block_hours= Integer.parseInt(preferences.getValue(Consts.FREE_TRIGGER_ADDED_HOURS));
        return addHours(block_hours, new Date());
    }

    /**
     * Add hours in given date and return new date
     */
    private String addHours(int hours, Date currentDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.HOUR_OF_DAY, hours);
        simpleDateFormat.format(cal.getTime());
        return String.valueOf(simpleDateFormat.format(cal.getTime()));
    }
}
