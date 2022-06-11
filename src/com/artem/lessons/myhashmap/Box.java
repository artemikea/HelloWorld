package com.artem.lessons.myhashmap;

public class Box {
    int hash;
    String key;
    String value;
    Box next = null;
    Box prev = null;

    public Box(String key, String value) {
        this.value = value;
        this.key = key;
    }
}
