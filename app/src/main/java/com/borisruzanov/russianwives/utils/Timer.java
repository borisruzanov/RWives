package com.borisruzanov.russianwives.utils;

import android.content.SharedPreferences;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Timer {

    private static Date currentTime=null;
    private static Timer instance=null;
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    private static int remainMinutes=0;
    private Timer(){

    }

    public static Timer getInstance(){
        if (instance==null)
            instance=new Timer();
        return instance;
    }

    //take date parameter and return remain time value
    public String getRemainTime(Date compareDate){
        try {
            currentTime=simpleDateFormat.parse(simpleDateFormat.format(new Date()));
            long diff=compareDate.getTime()-currentTime.getTime();
            int sec= (int) (diff/1000); //convert into seconds
            remainMinutes=(sec/60); //convert into minutes
            return (remainMinutes!=0)?getHour()+String.valueOf(getMinutes()):"0"; //return string like 845 or 0
        } catch (ParseException e) {
            e.printStackTrace();
            return "0";
        }
    }

    //return remain hours,call after getRemainTime() method
    public int getHour(){
        if (remainMinutes>60){
            return remainMinutes/60;
        }
        else {
            return 0;
        }
    }

    //return remain minutes,call after getRemainTime() method
    public int getMinutes(){
        if (remainMinutes!=0){
            return remainMinutes%60;
        }
        else {
            return 0;
        }
    }

    //this method call when close trigger set and return date
    //it return date with added hours
    //when you close trigger you need only call this method using timer object
    public Date getDateAfterTrigger(SharedPreferences preferences){
        int block_hours=preferences.getInt("block_hours", 0);
        return addHours(block_hours,new Date());
    }

    //this method add hours in given date and return new date
    private Date addHours(int hours,Date currentDate){
        Calendar cal=Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.HOUR_OF_DAY,hours);
        return cal.getTime();
    }

}
