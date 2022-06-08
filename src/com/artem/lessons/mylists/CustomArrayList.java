package com.artem.lessons.mylists;

class CustomArrayList<T> extends AbstractCustomList<T> {
    Object[] array;

    public CustomArrayList() {
        size = 0;
        array = new Object[2];
    }

    //add element in the end and return index
    public int add(T element) {
        if (size == array.length) {
            Object[] temp = new Object[array.length * 2];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[size] = element;
        size++;
        return size - 1;
    }

    //insert element by index
    public void insert(T element, int i) {
        if (size == array.length) {
            Object[] temp = new Object[array.length + 1];

            System.arraycopy(array, 0, temp, 0, i);
            System.arraycopy(array, i, temp, i + 1, array.length - i - 1);
            temp[i] = element;
            array = temp;
        } else {
            System.arraycopy(array, i, array, i + 1, array.length - i - 1);
            array[i] = element;
        }
        size++;
    }


    //overwrite element
    public void set(T element, int i) {
        array[i] = element;
    }

    //return element by index
    public T get (int i) {
        return (T) array[i];
    }

    //clear list
    public void clear() {
        size = 0;
        array = new Object[2];
    }
}