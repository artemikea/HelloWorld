package com.artem.lessons.myhashmap;

public interface ICustom {
    default int hashCode(Object key) {
        int hash;
        int i = ((Integer)key);
        if (i < 3) {
            hash = 1;
        }else {
            hash = 2;
        }
        return hash;
    }
}
