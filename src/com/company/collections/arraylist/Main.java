package com.company.collections.arraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayListInterface<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.remove(1);
        System.out.println(list1.size());
        MyArrayListInterface<String> list2 = new MyArrayList<>();
        list2.add("a");
        list2.set(0, "b");
        System.out.println(list2.get(0));
        list2.remove("b");
        System.out.println(list2.size());
    }
}
