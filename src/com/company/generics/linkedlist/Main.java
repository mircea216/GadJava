package com.company.generics.linkedlist;

import com.company.generics.linkedlist.impl.GenericList;

public class Main {
    public static void main(String[] args) {
        IGenericList<String> genericList1 = new GenericList<>();
        genericList1.insert("a");
        genericList1.insert("b");
        genericList1.insert("c");
        genericList1.println();
        System.out.println();
        IGenericList<Integer> genericList2 = new GenericList<>();
        genericList2.insert(1);
        genericList2.insert(2);
        genericList2.insert(3);
        genericList2.println();
    }
}
