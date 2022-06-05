package com.artem.lessons;

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
class TestArray {
    int [] array;
    int index;
    int size;

    public TestArray() {
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
    public int get(int i) {
        return array[i];
    }

    //return list size;
    public int size() {
        return index;
    }

    //clear list
    void clear() {
        size = 2;
        array = new int[size];
    }
}
//Написать класс MyIntArrayList. Этот класс будет представлять собой список. Этот класс должен иметь методы:
//add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
//get - получает индекс и возвращает соответствующий индексу элемент.
//size - возращает длину списка.
//clear - очищает список