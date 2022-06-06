package com.artem.lessons.arraylist;

class List {
    int [] array;
    private int index;

    public List() {
        index = 0;
        array = new int[2];
    }

    //add element in the end and return index
    public int add(int element) {
        if (index == array.length ) {
            int [] temp = new int[array.length * 2];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[index] = element;
        index++;
        return index-1;
    }

    //insert element by index
    public void insert( int element, int i) {
        if (index == array.length) {
            int [] temp = new int[array.length + 1];
            System.arraycopy(array, 0, temp, 0, i);
            System.arraycopy(array, i, temp, i + 1, array.length - i - 1);
            temp[i] = element;
            array = temp;
        }
        else {
            for (int j = index; j > i; j--) {
                array[j] = array[j-1];
            }
            array[i] = element;
        }
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
        index = 0;
        array = new int[2];
    }

    public void printList() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void remove() {
        array[array.length - 1] = 0;
        index--;
    }
}