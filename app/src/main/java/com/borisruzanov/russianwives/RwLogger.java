package com.borisruzanov.russianwives;

public class RwLogger {
    private static RwLogger instance = null;

    private RwLogger() {
    }

    public static RwLogger getInstance() {
        if (instance == null)
            instance = new RwLogger();
        return instance;
    }

    public void logEvent(String logLevel, String className, String methodName, String message){

    }
}
