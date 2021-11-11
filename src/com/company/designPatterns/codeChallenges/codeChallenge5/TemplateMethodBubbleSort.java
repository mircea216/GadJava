package com.company.designPatterns.codeChallenges.codeChallenge5;

import java.util.Arrays;

public abstract class TemplateMethodBubbleSort {
    public void sort(Integer[] list) {
        int length = list.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (!numbersInCorrectOrder(list[j], list[j + 1])) {
                    int intermediate = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = intermediate;
                }
    }

    public void printList(Integer[] list) {
        Arrays.stream(list).forEach(System.out::println);
    }

    public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);

}
