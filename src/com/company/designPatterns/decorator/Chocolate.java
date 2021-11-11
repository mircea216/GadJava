package com.company.designPatterns.decorator;

public class Chocolate extends Topping {
    public Chocolate(Beverage mainBeverage) {
        super("chocolate", 5, mainBeverage);
    }
}
