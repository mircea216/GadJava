package com.company.designPatterns.codeChallenges.codeChallenge2;

public class MergeSort implements SortingStrategy {
    void merge(Integer[] list, int first, int last, int value) {
        int n1 = last - first + 1;
        int n2 = value - last;
        int[] list1 = new int[n1];
        int[] list2 = new int[n2];
        for (int i = 0; i < n1; ++i)
            list1[i] = list[first + i];
        for (int j = 0; j < n2; ++j)
            list2[j] = list[last + 1 + j];
        int i = 0, j = 0;
        int k = first;
        while (i < n1 && j < n2) {
            if (list1[i] <= list2[j]) {
                list[k] = list1[i];
                i++;
            } else {
                list[k] = list2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            list[k] = list1[i];
            i++;
            k++;
        }
        while (j < n2) {
            list[k] = list2[j];
            j++;
            k++;
        }
    }

    void doSort(Integer[] list, int first, int last) {
        if (first < last) {
            int m = first + (last - first) / 2;
            doSort(list, first, m);
            doSort(list, m + 1, last);
            merge(list, first, m, last);
        }
    }

    @Override
    public void sort(Integer[] list) {
        doSort(list, 0, list.length - 1);
    }
}
