package com.company.project.secondpattern;

public class CheeseCake extends Cake {
    private final static String topping = "lime and cream";
    private final static Integer bakingTime = 90;
    private final static Integer price = 80;

    public CheeseCake() {
        this.setTopping(topping);
        this.setBakingTime(bakingTime);
        this.setPrice(price);
    }

    @Override
    public String getCakeType() {
        return "CHEESECAKE with: " + getTopping() + " TIME: " + getBakingTime() + " PRICE: " + getPrice();
    }
}
