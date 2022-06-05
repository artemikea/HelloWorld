package com.artem.lessons.arraylist;

import javax.swing.*;

public class MyIntArrayList {
    public static void main (String[] args) {
        List list = new List();
        TestList testList = new TestList(list);
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.array[i] + " ");
        }

        System.out.println();

        list.add(2);
        testList.checkAdd(0, 2);
        testList.checkNegative(0);
        testList.checkIsOdd(0);

        list.add(7);
        testList.checkAdd(1, 7);
        list.add(4);
        testList.checkAdd(2, 4);
        list.add(1);
        testList.checkAdd(3, 1);
        list.add(3);
        testList.checkAdd(4, 3);

        for (int i = 0; i < list.size; i++) {
            System.out.print(list.array[i] + " ");
        }

        System.out.println();

        list.insert(9, 3);

        for (int i = 0; i < list.size; i++) {
            System.out.print(list.array[i] + " ");
        }

        System.out.println();

        list.set(3, 1);

        for (int i = 0; i < list.size; i++) {
            System.out.print(list.array[i] + " ");
        }

        System.out.println();

        System.out.println("List size: " + list.getSize());

        list.clear();
        list.add(2);
        testList.checkClear();

        for (int i = 0; i < list.size; i++) {
            System.out.print(list.array[i] + " ");
        }
    }
}

//Написать класс MyIntArrayList. Этот класс будет представлять собой список. Этот класс должен иметь методы:
//add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
//get - получает индекс и возвращает соответствующий индексу элемент.
//size - возращает длину списка.
//clear - очищает список