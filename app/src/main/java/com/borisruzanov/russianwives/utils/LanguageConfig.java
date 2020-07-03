package com.borisruzanov.russianwives.utils;

import java.util.Locale;

public class LanguageConfig {

    public static boolean isRussian(){
        return Locale.getDefault().getLanguage().equals("ru");
    }
}
