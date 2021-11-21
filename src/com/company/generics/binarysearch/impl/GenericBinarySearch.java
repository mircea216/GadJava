package com.company.generics.binarysearch.impl;

import com.company.generics.binarysearch.exceptions.ArrayNotSortedException;
import com.company.generics.binarysearch.IGenericBinarySearch;

import java.util.Arrays;

public class GenericBinarySearch<T extends Comparable<T>> implements IGenericBinarySearch<T> {
    private final T[] array;

    public GenericBinarySearch(T[] array) {
        this.array = array;
    }

    @Override
    public boolean isAscending() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isDescending() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) <= 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int binarySearch(int left, int right, T x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == x)
                return mid;
            if (array[mid].compareTo(x) > 0)
                return binarySearch(left, mid - 1, x);
            return binarySearch(mid + 1, right, x);
        }
        return -1;
    }

    @Override
    public int descendingBinarySearch(T x) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start
                    + (end - start) / 2;
            if (x == array[mid]) {
                return mid;
            } else if (x.compareTo(array[mid]) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    @Override
    public int getValue(T element) throws ArrayNotSortedException {
        if (!isAscending() && !isDescending())
            throw new ArrayNotSortedException("The array is not sorted");
        if (isDescending()) {
            if (descendingBinarySearch(element) != -1) {
                return descendingBinarySearch(element);
            }
            return -1;
        }
        if (binarySearch(0, array.length - 1, element) != -1)
            return binarySearch(0, array.length - 1, element);
        return -1;
    }
}
