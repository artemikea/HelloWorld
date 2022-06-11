package com.artem.lessons.myhashmap;

import java.util.ArrayList;

public class List {
    int size;
    Object[][] array;
    ArrayList<String> keys = new ArrayList<>();
    int index = 0;

    public List() {
        size = 0;
        array = new Object[2][2];
    }

    public void put(String key, String value) {
        int hash = key.hashCode();
        int check = 0;
        for (int i = 0; i < size; i++) {
            if (array[i][0].equals(hash)) {


                if (array[i][0] == key) {
                    array[i][1] = value;
                    check++;
                    break;
                }else {

                }
            }
        }
        if (size == array.length) {
            Object[][] temp = new Object[array.length * 2][2];
            for (int i = 0; i < array.length; i++) {
                System.arraycopy(array[i], 0, temp[i], 0, array[i].length);
            }
            array = temp;
        }
        if (check < 1) {
            array[size][0] = hash;
            array[size][1] = value;
            size++;
        }
    }

    public Object get(String key) {
        int newKey = key.hashCode();
        int i;
        for (i = 0; i < size; i++) {
            if (array[i][0].equals(newKey)) {
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
                    } else {
                        System.out.print(array[i][j]);
                    }
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
