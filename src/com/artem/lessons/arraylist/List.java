package com.artem.lessons.arraylist;

class List {
    int [] array;
    private int index;
    int size;

    public List() {
        index = 0;
        size = 2;
        array = new int[size];
    }

    //add element in the end and return index
    public int add(int element) {
        if (index == size ) {
            int [] temp = new int[size * 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
            size = size * 2;
        }
        array[index] = element;
        index++;
        return index-1;
    }

    //insert element by index
    public void insert( int element, int i) {
        int [] temp = new int[size + 1];
        System.arraycopy(array, 0, temp, 0, i);
        System.arraycopy(array, i, temp, i + 1, size - i - 1);
        temp[i] = element;
        array = temp;
    }

    //overwrite element
    public void set(int element, int i) {
        array[i] = element;
    }

    //return element by index
    public int getElement(int i) {
        return array[i];
    }

    //return list size;
    public int getSize() {
        return index;
    }

    //clear list
    public void clear() {
        size = 2;
        index = 0;
        array = new int[size];
    }
}