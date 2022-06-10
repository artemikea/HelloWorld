package com.artem.lessons.myhashmap;

import java.util.UUID;

public class Tests {

    public static void putTest(CustomHashMap testHashMap) throws Exception {
        testHashMap.put("1323", "A");
        testHashMap.put("1323", "B");
        if (!testHashMap.get("1323").equals("B")) {
            throw new Exception("There is a problem");
        }
    }

    public static void putTimeTest(CustomHashMap testHashMap) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String key = UUID.randomUUID().toString();
            String value = UUID.randomUUID().toString().replace("-", "");
            testHashMap.put(key, value);
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void getTimeTest(CustomHashMap testHashMap) {
        String[] array = new String[10000];
        for (int i = 0; i < 10000; i++) {
            String key = UUID.randomUUID().toString();
            String value = UUID.randomUUID().toString().replace("-", "");
            array[i] = key;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            testHashMap.get(array[i]);
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}

