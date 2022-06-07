package com.artem.lessons.mylists;

public class Entry {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.printList();
        CustomArrayList list1 = new CustomArrayList();
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list1.printList();
    }
}
