package com.artem.lessons.myhashmap;

import com.artem.lessons.mylists.ICustomList;

public class Tests {

    public static void putTest(CustomHashMap testHashMap) throws Exception {
        testHashMap.put(1323, "A");
        testHashMap.put(1323, "B");
        if (!testHashMap.get(1323).equals("B")) {
            throw new Exception("There is a problem");
        }
    }
}
