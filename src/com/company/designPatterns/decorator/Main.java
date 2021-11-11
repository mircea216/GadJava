package com.company.designPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Topping topping = new Milk(coffee);
        Beverage coffeeWithMilkAndCream = new Cream(topping);
        System.out.println(coffeeWithMilkAndCream.getDescription());
        Tea tea = new Tea();
        Milk teamMilk = new Milk(tea);
        System.out.println(teamMilk.getDescription());
    }
}
