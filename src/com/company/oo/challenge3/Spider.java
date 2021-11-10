package com.company.oo.challenge3;

public class Spider extends Animal {
    private static final int LEGS = 8;

    protected Spider() {
        super(LEGS);
    }

    @Override
    public void eat() {
        System.out.println("Spiders eat other insects");
    }
}
