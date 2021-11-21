package com.company.generics.binarysearch;

import com.company.generics.binarysearch.exceptions.ArrayNotSortedException;
import com.company.generics.binarysearch.impl.GenericBinarySearch;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[]{3, 2, 1};
        String[] array2 = new String[]{"aa", "bb", "cc", "ddd"};
        IGenericBinarySearch<Integer> genericBinarySearch1 = new GenericBinarySearch<>(array1);
        IGenericBinarySearch<String> genericBinarySearch2 = new GenericBinarySearch<>(array2);
        try {
            System.out.println("The position is: " + genericBinarySearch1.getValue(3));
            System.out.println("The position is: " + genericBinarySearch2.getValue("bb"));
        } catch (ArrayNotSortedException e) {
            System.out.println(e.getMessage());
        }
    }
}
