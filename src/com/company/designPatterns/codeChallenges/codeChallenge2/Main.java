package com.company.designPatterns.codeChallenges.codeChallenge2;

import java.util.Arrays;

public class Main {
    public static void displaySorted(SortingStrategy sortingStrategy, Integer[] list) {
        sortingStrategy.sort(list);
        Arrays.stream(list).forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy1OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy2OfArr = Arrays.copyOf(arr, arr.length);
        displaySorted(new BubbleSort(), copy1OfArr);
        displaySorted(new MergeSort(), copy2OfArr);
    }
}
