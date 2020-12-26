package com.borisruzanov.russianwives.utils;

import android.content.Context;

import com.borisruzanov.russianwives.R;

public class CityConfig {
    private Context context;

    public CityConfig(Context context){
        this.context=context;
    }

    public boolean checkCity(String country,String city){
        String[] cities = new String[0];
        if (country!=null && city !=null) {
            if (country.equals("USA")) {
                cities = context.getResources().getStringArray(R.array.us_city);
            } else if (country.equals("Ukraine")) {
                cities = context.getResources().getStringArray(R.array.ukraine_city);
            } else if (country.equals("Kazakhstan")) {
                cities = context.getResources().getStringArray(R.array.kazakhstan_city);
            } else if (country.equals("Russia")) {
                cities = context.getResources().getStringArray(R.array.russia_city);
            } else {
                cities=context.getResources().getStringArray(R.array.default_city);
            }
            for (String s : cities) {
                if (s.equals(city)) {
                    return true;
                }
            }
        }
        return false;
    }
}
