package com.artem.lessons.arraylist;

public class TestList {
    /*private List list;

    public TestList(List list) {
        this.list = list;
    }*/
    //check if element is incorrect
    public void checkAdd(List list) {
        list.add(2);
        int element = list.getElement(0);
        if (element != 3) {
            System.out.println("Wrong element");
        }
        list.remove();

    }
    //check is list empty
    public void checkClear(List list) {
        int i = list.getSize();
        if (i != 0) {
            System.out.println("List is not clear");
        }
    }
}
