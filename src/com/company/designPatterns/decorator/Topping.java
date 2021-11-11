package com.company.designPatterns.decorator;

public abstract class Topping extends Beverage {
    private Beverage mainBeverage;

    public Topping(String description, int price, Beverage mainBeverage) {
        super(description, price);
        this.mainBeverage = mainBeverage;
    }

    @Override
    public String getDescription() {
        return mainBeverage.getDescription() + super.getDescription();
    }

    @Override
    public int getPrice() {
        return mainBeverage.getPrice() + super.getPrice();
    }
}

