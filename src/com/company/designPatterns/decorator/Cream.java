package com.company.designPatterns.decorator;

public class Cream extends Topping {
    public Cream(Beverage mainBeverage) {
        super("cream", 5, mainBeverage);
    }
}
