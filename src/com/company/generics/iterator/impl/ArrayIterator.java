package com.company.generics.iterator.impl;

import com.company.generics.iterator.IArrayIterator;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private final T[] array;
    private int currentPosition = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < array.length && array[currentPosition] != null;
    }

    @Override
    public T next() {
        return array[currentPosition++];
    }
}
