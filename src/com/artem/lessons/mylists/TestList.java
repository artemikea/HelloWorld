package com.artem.lessons.mylists;

import com.artem.lessons.mylists.CustomLinkedList;

public class TestList {
    //check if element is incorrect
    public static void addTest(ICustomList testList) throws Exception {
        testList.add(2);
        Object obj = 2;
        if (testList.get(0) != obj) {
            throw new Exception("There is a problem");
        }
    }

    public static void clearTest(ICustomList testList) throws Exception {
        testList.add(1);
        testList.clear();
        if (testList.size() != 0) {
            throw new Exception(("There is a problem"));
        }
    }
}
