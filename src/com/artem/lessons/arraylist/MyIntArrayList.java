package com.artem.lessons.arraylist;

import javax.swing.*;

public class MyIntArrayList {
    public static void main (String[] args) {
        List list = new List();
        TestList testList = new TestList();
        list.printList();

        System.out.println();

        list.add(1);
        testList.checkAdd(list);

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.printList();

        System.out.println();

        list.insert(9, 3);

        list.printList();

        System.out.println();

        list.set(3, 2);

        list.printList();

        System.out.println();

        System.out.println("List size: " + list.getSize());

        list.clear();
        list.add(2);
        testList.checkClear(list);

        list.printList();
    }
}

//Написать класс MyIntArrayList. Этот класс будет представлять собой список. Этот класс должен иметь методы:
//add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
//get - получает индекс и возвращает соответствующий индексу элемент.
//size - возращает длину списка.
//clear - очищает список