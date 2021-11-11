package com.company.designPatterns.codeChallenges.codeChallenge5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TemplateMethodBubbleSort methodBubbleSort1 = new AscBubbleSort();
        TemplateMethodBubbleSort methodBubbleSort2 = new DescBubbleSort();
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy1OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy2OfArr = Arrays.copyOf(arr, arr.length);
        methodBubbleSort1.sort(copy1OfArr);
        methodBubbleSort1.printList(copy1OfArr);
        methodBubbleSort2.sort(copy2OfArr);
        methodBubbleSort2.printList(copy2OfArr);
    }
}
