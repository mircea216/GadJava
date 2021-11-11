package com.company.designPatterns.codeChallenges.codeChallenge1;

public class ArrayCustomIterator {
    private final Integer[] array;
    private int currentPosition = 0;

    public ArrayCustomIterator(Integer[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return currentPosition < array.length && array[currentPosition] != null;
    }

    public Integer next() {
        return array[currentPosition++];
    }
}
