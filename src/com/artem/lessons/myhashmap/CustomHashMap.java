package com.artem.lessons.myhashmap;


public class CustomHashMap implements ICustom {
    int size;
    Box[] array;

    public CustomHashMap() {
        size = 0;
        array = new Box[2];
    }

    public void put(Object key, Object value) {
        if (size == array.length) {
            Box[] temp = new Box[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                System.arraycopy(array, 0, temp, 0, array.length);
            }
            array = temp;
        }
        int hash = hashCode(key);
        int check = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].hash == hash) {
                Box temp = array[i];
                while (temp != null) {
                    if (!temp.key.equals(key)) {
                        temp = temp.next;
                    } else {
                        if (temp.prev != null) {
                            temp.prev.next = temp;
                        }
                        if (temp.next != null) {
                            temp.next.prev = temp;
                        }
                        array[i] = temp;
                        temp.key = key;
                        temp.value = value;
                        check++;
                        break;
                    }
                }
                if (check < 1) {
                    Box box = new Box(key, value);
                    box.hash = hash;
                    box.next = array[i];
                    box.next.prev = box;
                    array[i] = box;
                    check++;
                }
                break;
            }
        }

        if (check < 1) {
            Box box = new Box(key, value);
            box.hash = hash;
            array[size] = box;
            size++;
        }
    }

    public Object get(Object key) {
        Object value = new Object();
        int hash = key.hashCode();
        for (int i = 0; i < size; i++) {
            if (array[i].hash == hash) {
                Box temp = array[i];
                while (temp != null) {
                    if (!temp.key.equals(key)) {
                        temp = temp.next;
                    } else {
                        value = temp.value;
                        break;
                    }
                }
            }
        }
        return value;
    }
}
