package com.company.project.secondpattern;

public class CarrotCake extends Cake {
    private final static String topping = "sweet carrot";
    private final static Integer bakingTime = 100;
    private final static Integer price = 70;

    public CarrotCake() {
        setTopping(topping);
        setBakingTime(bakingTime);
        setPrice(price);
    }

    @Override
    public String getCakeType() {
        return "CARROT CAKE with: " + getTopping() + " TIME: " + getBakingTime() + " PRICE: " + getPrice();
    }
}
