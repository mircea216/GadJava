package com.company.generics.pairs;

public abstract class AbstractShoe implements Shoe {
    private final int size;
    private final String color;

    public AbstractShoe(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }
}
