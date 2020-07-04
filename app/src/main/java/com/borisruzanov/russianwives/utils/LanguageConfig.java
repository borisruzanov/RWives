package com.borisruzanov.russianwives.utils;

import java.util.Locale;

/**
 * A class to get current language
 */
public class LanguageConfig {

    /***
     * check Language is Russian Or not
     * @return true if Local Language is russian or false for other Languages
     */
    public static boolean isRussian(){
        return Locale.getDefault().getLanguage().equals(Consts.RussianLang);
    }
}
