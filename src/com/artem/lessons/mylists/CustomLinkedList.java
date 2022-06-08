package com.artem.lessons.mylists;

public class CustomLinkedList<T> extends AbstractCustomList<T> {
    Container current = null;

    public int add(T value) {
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
        return size - 1;
    }

    public void insert(T value, int index) {
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

    public Object get(int index) {
        Container temp = current;
        int j = size() - index - 1;
        for (int i = 0; i < j; i++) {
            temp = temp.previous;
        }
        return temp.value;
    }

    public void set(T value, int index) {
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
        size = 0;
    }
}
