package com.company.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> implements MyArrayListInterface<T> {
    private final List<T> list = new ArrayList<>();

    @Override
    public void add(T e) {
        list.add(e);
    }

    @Override
    public void remove(T e) {
        list.remove(e);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public void set(int index, T e) {
        list.set(index, e);
    }

    @Override
    public int size() {
        return list.size();
    }
}
