package com.artem.lessons.myhashmap;

public class Entry {
    public static void main(String[] args) throws Exception {
        //CustomHashMap testHashMap = new CustomHashMap();
        //Tests.putTimeTest(testHashMap);
        //Tests.getTimeTest(testHashMap);

        CustomHashMap customHashMap = new CustomHashMap();
        customHashMap.put(1, "First");
        customHashMap.put(1, "Second");
        customHashMap.put(2, "Third");
        customHashMap.put(9, "Third");
        customHashMap.put(8, "Third");
        customHashMap.put(7, "Third");
        //System.out.println(customHashMap.get("1123"));
        //System.out.println(customHashMap.get("3743"));
        //customHashMap.printHashMap();
    }
}
