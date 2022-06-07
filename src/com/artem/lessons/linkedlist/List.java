package com.artem.lessons.linkedlist;

public class List {
    Container current = null;

    public void add(int value) {
        Container container = new Container(value);

        if (current == null) {
            current = container;
            current.previous = null;
        }
        else {
            current.next = container;
            container.previous = current;
            current = container;

        }
        current.next = null;
    }

    public void insert(int value, int index) {
        Container container = new Container(value);
        Container temp = current;
        int j = size() - index;
        for(int i = 0; i < j; i++) {
            temp = temp.previous;
        }
        container.next = temp;
        container.previous = temp.previous;
        temp = temp.previous;
        temp.next = container;
        temp = temp.next;
        temp = temp.next;
        temp.previous = container;
    }

    public int get(int index) {
        Container temp = current;
        int j = size() - index;
        for(int i = 0; i < j; i++) {
            temp = temp.previous;
        }
        return temp.value;
    }

    public int size() {
        int i = 0;
        Container temp = current;
        while (temp != null) {
            temp = temp.previous;
            i++;
        }
        return i;
    }

    public void set(int value, int index) {
        Container temp = current;
        int j = size() - index;
        for(int i = 0; i < j; i++) {
            temp = temp.previous;
        }
        temp.value = value;
        current.previous.value = temp.value;
    }

    public void clear() {
        while (current.previous != null) {
            current = current.previous;
        }
        current = null;
    }

    public void printList() {
        Container temp = current;
        if (temp == null) {
            System.out.println("Empty");
        }
        else {
            while (temp != null && temp.previous != null) {
                temp = temp.previous;
            }
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
