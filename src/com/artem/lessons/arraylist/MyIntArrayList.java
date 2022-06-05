package com.artem.lessons.arraylist;

public class MyIntArrayList {
    public static void main (String[] args) {
        TestArray testArray = new TestArray();

        for (int i = 0; i < testArray.size; i++) {
            System.out.print(testArray.array[i] + " ");
        }

        System.out.println();

        testArray.add(2);
        testArray.add(7);
        testArray.add(4);
        testArray.add(1);
        testArray.add(3);

        for (int i = 0; i < testArray.size; i++) {
            System.out.print(testArray.array[i] + " ");
        }

        System.out.println();

        testArray.insert(9, 3);

        for (int i = 0; i < testArray.size; i++) {
            System.out.print(testArray.array[i] + " ");
        }

        System.out.println();

        testArray.set(3, 1);

        for (int i = 0; i < testArray.size; i++) {
            System.out.print(testArray.array[i] + " ");
        }

        System.out.println();

        System.out.println("List size: " + testArray.size());

        testArray.clear();

        for (int i = 0; i < testArray.size; i++) {
            System.out.print(testArray.array[i] + " ");
        }
    }
}

//Написать класс MyIntArrayList. Этот класс будет представлять собой список. Этот класс должен иметь методы:
//add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
//get - получает индекс и возвращает соответствующий индексу элемент.
//size - возращает длину списка.
//clear - очищает список