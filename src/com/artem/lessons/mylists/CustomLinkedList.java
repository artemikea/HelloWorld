package com.artem.lessons.mylists;

public class CustomLinkedList implements ICustomList {
    Container current = null;
    int size = 0;

    public int add(int value) {
        Container container = new Container(value);

        if (current == null) {
            current = container;
            current.previous = null;
        } else {
            current.next = container;
            container.previous = current;
            current = container;

        }
        current.next = null;
        size++;
        return size-1;
    }

    public void insert(int value, int index) {
        Container container = new Container(value);
        Container temp = current;
        int j = size() - index;
        for (int i = 0; i < j; i++) {
            temp = temp.previous;
        }
        container.next = temp;
        container.previous = temp.previous;
        temp = temp.previous;
        temp.next = container;
        temp = temp.next;
        temp = temp.next;
        temp.previous = container;
        size++;
    }

    public int get(int index) {
        Container temp = current;
        int j = size() - index;
        for (int i = 0; i < j; i++) {
            temp = temp.previous;
        }
        return temp.value;
    }

    public int size() {
        return size;
    }

    public void set(int value, int index) {
        Container temp = current;
        int j = size() - index;
        for (int i = 0; i < j; i++) {
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
        int n = size();
        if (n == 0) {
            System.out.println("Empty");
        }
        else {
            int i = 1;
            while(i <= size) {
                System.out.print(get(i) + " ");
                i++;
            }
        }
        System.out.println();
    }
}
