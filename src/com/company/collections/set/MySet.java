package com.company.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MySet<T> implements MySetInterface<T> {
    private final Set<T> set = new HashSet<>();

    @Override
    public void add(T e) {
        set.add(e);
    }

    @Override
    public void remove(T e) {
        set.remove(e);
    }

    @Override
    public T get(int index) {
        if (index < set.size() && index >= 0) {
            return new ArrayList<>(set).get(index);
        }
        return null;
    }

    @Override
    public void set(int index, T e) {
        if (index < set.size() && index >= 0) {
            new ArrayList<>(set).set(index, e);
        }
    }

    @Override
    public int size() {
        return set.size();
    }
}
