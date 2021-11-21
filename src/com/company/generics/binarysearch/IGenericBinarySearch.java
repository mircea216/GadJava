package com.company.generics.binarysearch;

import com.company.generics.binarysearch.exceptions.ArrayNotSortedException;

public interface IGenericBinarySearch<T> {
    boolean isAscending();

    boolean isDescending();

    int binarySearch(int l, int r, T x);

    int getValue(T element) throws ArrayNotSortedException;

    int descendingBinarySearch(T x);
}
