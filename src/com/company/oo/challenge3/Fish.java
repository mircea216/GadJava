package com.company.oo.challenge3;

public class Fish extends Animal {
    public static final int NOLEGS = 0;

    protected Fish() {
        super(NOLEGS);
    }

    @Override
    public void eat() {
        System.out.println("Fish eat marine stuff");
    }

    @Override
    public void walk() {
        System.out.println("Fish don't walk");
    }
}
