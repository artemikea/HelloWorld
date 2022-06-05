package com.artem.lessons.arraylist;

public class TestList {
    private List list;

    public TestList(List list) {
        this.list = list;
    }
    //check if number is negative
    public void checkNegative(int i) {
        int element = list.getElement(i);
        if (element < 0) {
            System.out.println("Negative number");
        }
    }
    //check if number is odd
    public void checkIsOdd (int i) {
        int element = list.getElement(i);
        if (element % 2 != 0) {
            System.out.println("Odd number");
        }
    }
    //check if element is incorrect
    public void checkAdd(int i, int j) {
        int element = list.getElement(i);
        if (element != j) {
            System.out.println("Wrong element");
        }
    }
    //check is list empty
    public void checkClear() {
        int i = list.getSize();
        if (i != 0) {
            System.out.println("List is not clear");
        }
    }
}
