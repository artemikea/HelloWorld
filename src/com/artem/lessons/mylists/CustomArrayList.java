package com.artem.lessons.mylists;

class CustomArrayList implements ICustomList {
    int [] array;
    private int size;

    public CustomArrayList() {
        size = 0;
        array = new int[2];
    }

    //add element in the end and return index
    public int add(int element) {
        if (size == array.length ) {
            int [] temp = new int[array.length * 2];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[size] = element;
        size++;
        return size -1;
    }

    //insert element by index
    public void insert( int element, int i) {
        if (size == array.length) {
            int [] temp = new int[array.length + 1];
            System.arraycopy(array, 0, temp, 0, i);
            System.arraycopy(array, i, temp, i + 1, array.length - i - 1);
            temp[i] = element;
            array = temp;
            size++;
        }
        else {
            System.arraycopy(array, i, array, i + 1, array.length - i - 1);
            array[i] = element;
            size++;
        }
    }

    //overwrite element
    public void set(int element, int i) {
        array[i] = element;
    }

    //return element by index
    public int get(int i) {
        return array[i-1];
    }

    //return list size;
    public int size() {
        return size;
    }

    //clear list
    public void clear() {
        size = 0;
        array = new int[2];
    }
    //print list
    public void printList() {
        if (size() == 0) {
            System.out.println("Empty");
        } else {
            for(int i = 1; i < size; i++) {
                System.out.print(get(i) + " ");
            }
        }
        System.out.println();
    }
}