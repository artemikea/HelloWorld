package com.artem.lessons.singletonexample;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        singleton.setValue("ha");
        anotherSingleton.setValue("haha");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}