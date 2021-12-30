package com.company.project.secondpattern;

public class BlueberryCake extends Cake {
    private final static String topping = "fresh blueberries";
    private final static Integer bakingTime = 90;
    private final static Integer price = 80;

    public BlueberryCake() {
        setTopping(topping);
        setBakingTime(bakingTime);
        setPrice(price);
    }

    @Override
    public String getCakeType() {
        return "BLUEBERRY CAKE with: " + getTopping() + " TIME: " + getBakingTime() + " PRICE: " + getPrice();
    }
}
