package com.borisruzanov.russianwives.eventbus;

public class StringEvent {
    String stringParameter;

    String field;

    public StringEvent(String stringParameter) {
        this.stringParameter = stringParameter;
    }

    public String getStringParameter() {
        return stringParameter;
    }

    public void setStringParameter(String stringParameter) {
        this.stringParameter = stringParameter;
    }

    public StringEvent(String field, String stringParameter) {
        this.stringParameter = stringParameter;
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
