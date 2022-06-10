package com.artem.lessons.mylists;

import java.util.List;

public class Entry {
    public static void main(String[] args) throws Exception {
        List<ICustomList> customLists = List.of(
                new CustomArrayList(),
                new CustomLinkedList()
        );

        for (ICustomList iCustomList : customLists) {
            TestList.addTest(iCustomList);
        }

        for (ICustomList iCustomList : customLists) {
            TestList.clearTest(iCustomList);
        }

        ICustomList list = new CustomLinkedList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.printList();
        System.out.println(list.size());
        ICustomList list1 = new CustomArrayList();
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list1.printList();
        System.out.println(list1.size());
    }
}
