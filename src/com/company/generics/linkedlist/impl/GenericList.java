package com.company.generics.linkedlist.impl;

import com.company.generics.linkedlist.IGenericList;

public class GenericList<T> implements IGenericList<T> {
    private GenericNode<T> head = null;
    private GenericNode<T> tail = null;

    @Override
    public void insert(T element) {
        GenericNode<T> newNode = new GenericNode<>(element);
        if (head == null) {
            head = newNode;

        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    @Override
    public void println() {
        GenericNode<T> current = head;

        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = (GenericNode<T>) current.getNext();
        }
    }
}
