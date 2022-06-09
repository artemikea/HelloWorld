package com.artem.lessons;

public class HashCode {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode = object.hashCode();
        System.out.println(hCode);

        Object object1 = new Object();
        int xCode = object1.hashCode();
        System.out.println(xCode);

        System.out.println(object.equals(object1));
    }
}
