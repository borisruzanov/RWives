package com.borisruzanov.russianwives.utils;

import java.util.Locale;

/**
 * A class to get current language
 */
public class LanguageConfig {

    public static boolean isRussian(){
        return Locale.getDefault().getLanguage().equals("ru");
    }
}
