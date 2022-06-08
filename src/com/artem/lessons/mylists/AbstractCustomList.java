package com.artem.lessons.mylists;

public abstract class AbstractCustomList<T> implements ICustomList<T> {
    int size;

    public int size() {
        return size;
    }

    public void printList() {
        if (size() == 0) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < size(); i++) {
                System.out.print(get(i) + " ");
            }
        }
        System.out.println();
    }
}
