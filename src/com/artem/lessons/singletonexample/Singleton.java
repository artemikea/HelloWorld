package com.artem.lessons.singletonexample;

public class Singleton {
    public String value;
    private static Singleton INSTANCE = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void setValue(String value) {
        this.value = value;
    }
}