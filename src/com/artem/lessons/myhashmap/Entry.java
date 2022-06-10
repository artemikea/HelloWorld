package com.artem.lessons.myhashmap;

public class Entry {
    public static void main(String[] args) throws Exception {
        CustomHashMap testHashMap = new CustomHashMap();
        Tests.putTimeTest(testHashMap);
        Tests.getTimeTest(testHashMap);

        CustomHashMap customHashMap = new CustomHashMap();
        customHashMap.put("1123", "First");
        customHashMap.put("2123", "Second");
        customHashMap.put("3743", "Third");
        customHashMap.put("9763", "Fourth");
        customHashMap.put("2123", "Fifth");
        System.out.println(customHashMap.get("1123"));
        System.out.println(customHashMap.get("3743"));
        customHashMap.printHashMap();

    }
}
