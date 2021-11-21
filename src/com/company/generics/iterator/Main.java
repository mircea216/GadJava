package com.company.generics.iterator;

import com.company.generics.iterator.impl.ArrayIterator;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3};
        IArrayIterator<Integer> iterator = new ArrayIterator<>(array);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
