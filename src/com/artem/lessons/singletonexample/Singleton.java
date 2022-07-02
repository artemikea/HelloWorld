package com.artem.lessons.singletonexample;

public class Singleton {
    public String value;
    private static Singleton INSTANCE = null;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(INSTANCE == null) {
            INSTANCE = new Singleton(value);
        }
        return INSTANCE;
    }
}