package com.company.collections.set;

public class Main {
    public static void main(String[] args) {
        MySetInterface<Integer> mySet = new MySet<>();
        mySet.add(1);
        System.out.println(mySet.size());
        System.out.println(mySet.get(0));
        mySet.set(0,2);
        System.out.println(mySet.get(0));

    }

}
