package com.artem.lessons.arraylist;

import com.artem.lessons.mylists.CustomLinkedList;

public class MyIntArrayList {
    public static void main (String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        CustomLinkedList tlist = new CustomLinkedList();
        TestList testList = new TestList();

        testList.checkAdd(tlist);
        testList.chkAdd(tlist);

        list.printList();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.printList();

        list.insert(9, 3);
        list.printList();

        list.set(3, 2);
        list.printList();
        System.out.println("List size: " + list.size());

        list.clear();
        list.add(2);
        list.printList();
    }
}

//Написать класс MyIntArrayList. Этот класс будет представлять собой список. Этот класс должен иметь методы:
//add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
//get - получает индекс и возвращает соответствующий индексу элемент.
//size - возращает длину списка.
//clear - очищает список