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
        for (int i = 0; i < 30000; i++) {
            String key = UUID.randomUUID().toString();
            String value = key;
            key = key + key;
            testHashMap.put(key, value);
        }
        System.out.println("Put 30.000 times: " + (System.currentTimeMillis() - startTime));
    }

    public static void getTimeTest(CustomHashMap testHashMap) {
        String[] array = new String[30000];
        for (int i = 0; i < 30000; i++) {
            String key = UUID.randomUUID().toString();
            String value = key;
            key = key + key;
            testHashMap.put(key, value);
            array[i] = key;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            testHashMap.get(array[i]);
        }
        System.out.println("Get 30.000 times " + (System.currentTimeMillis() - startTime));
    }
}

