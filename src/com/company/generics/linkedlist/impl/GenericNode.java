package com.company.generics.linkedlist.impl;

import com.company.generics.linkedlist.IGenericNode;

public class GenericNode<T> implements IGenericNode<T> {
    private T data;
    private GenericNode<T> next;

    public GenericNode(T data) {
        this.data = data;
        next = null;
    }

    @Override
    public T getValue() {
        return data;
    }

    @Override
    public void setValue(T value) {
        data = value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = (GenericNode<T>) next;
    }
}
