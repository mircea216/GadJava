package com.company.designPatterns.decorator;

public class Milk extends Topping {
    public Milk(Beverage mainBeverage) {
        super("Milk", 2, mainBeverage);
    }
}
