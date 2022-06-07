package com.artem.lessons.mylists;

interface ICustomList {
    int add(int element);
    void insert(int value, int index);
    void set(int value, int index);
    int get(int i);
    int size();
    void clear();
    void printList();

}
