package com.artem.lessons.mylists;

public class Container<T> {
    T value;
    Container next;
    Container previous;

    public Container(T value) {
        this.value = value;
    }
}
