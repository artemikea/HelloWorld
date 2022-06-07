package com.artem.lessons.linkedlist;

public class Entry {
    public static void main(String[] args){
        List list = new List();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.printList();
        list.insert(5,3);
        list.printList();
        list.set(9, 5);
        list.printList();
        list.clear();
        list.printList();
    }
}
