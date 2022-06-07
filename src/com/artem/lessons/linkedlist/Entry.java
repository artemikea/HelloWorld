package com.artem.lessons.linkedlist;

import com.artem.lessons.mylists.CustomLinkedList;

public class Entry {
    public static void main(String[] args){
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.printList();
        list.insert(5,3);
        list.printList();
        list.set(9, 5);
        list.add(3);
        list.printList();
        list.clear();
        list.printList();
    }
}
