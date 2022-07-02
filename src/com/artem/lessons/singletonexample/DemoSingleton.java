package com.artem.lessons.singletonexample;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("ha");
        Singleton anotherSingleton = Singleton.getInstance("haha");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}