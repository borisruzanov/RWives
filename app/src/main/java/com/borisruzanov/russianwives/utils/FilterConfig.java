package com.borisruzanov.russianwives.utils;

/***
 * This class is used to store a online value of filter
 */
public class FilterConfig {

    private static boolean online=false;

    public static boolean isOnline() {
        return online;
    }

    public static void setOnline(boolean online) {
        FilterConfig.online = online;
    }
}
