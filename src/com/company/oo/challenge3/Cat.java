package com.company.oo.challenge3;

public class Cat extends Animal implements Pet {
    private static final int LEGS = 4;
    private String name;

    public Cat(String name) {
        super(LEGS);
        this.name = name;
    }

    public Cat() {
        this(" ");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat mice");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cats play a lot");
    }
}
