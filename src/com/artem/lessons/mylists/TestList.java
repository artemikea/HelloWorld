package com.artem.lessons.mylists;

import com.artem.lessons.mylists.CustomLinkedList;

public class TestList {
    //check if element is incorrect
    public void checkAdd(CustomLinkedList tlist) {
        try {
            tlist.add(2);
            int element = tlist.get(0);
            if (element != 2) throw new Exception("Wrong number");
            tlist.clear();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void chkAdd(CustomLinkedList tlist) {
        tlist.add(1);
        tlist.add(2);
        tlist.add(3);
        tlist.clear();
    }
}
