package com.artem.lessons.myhashmap;

public class Box {
    int hash;
    Object key;
    Object value;
    Box next = null;
    Box prev = null;

    public Box(Object key, Object value) {
        this.value = value;
        this.key = key;
    }
}
