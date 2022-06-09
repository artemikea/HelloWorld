package com.artem.lessons.myhashmap;

public class CustomHashMap {
    int size;
    Object[][] array;

    public CustomHashMap() {
        size = 0;
        array = new Object[2][2];
    }

    public void put(int key, String value) {
        if (size == array.length) {
            Object[][] temp = new Object[array.length * 2][2];
            for (int i = 0; i < array.length; i++) {
                System.arraycopy(array[i], 0, temp[i], 0, array[i].length);
            }
            array = temp;
        }
        array[size][0] = key;
        array[size][1] = value;
        size++;
    }

    public Object get(int key) {
        Object obj = key;
        int i;
        for (i = 0; i < size; i++) {
            if (array[i][0].equals(obj)) {
                break;
            }
        }
        return array[i][1];
    }

    public void printHashMap() {
        if (size == 0) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j < 1) {
                        System.out.print(array[i][j] + "=");
                    }else{
                        System.out.print(array[i][j]);
                    }
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
