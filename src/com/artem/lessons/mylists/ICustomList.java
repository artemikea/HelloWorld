package com.artem.lessons.mylists;

public interface ICustomList<T> {
    int add(T element);

    void insert(T value, int index);

    void set(T value, int index);

    Object get(int i);

    int size();

    void clear();

    void printList();
}
