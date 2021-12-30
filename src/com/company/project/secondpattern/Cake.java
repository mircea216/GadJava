package com.company.project.secondpattern;

import java.util.Objects;

public abstract class Cake {
    private Integer id;
    protected String topping;
    protected Integer bakingTime;
    protected Integer price;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public Integer getBakingTime() {
        return bakingTime;
    }

    public void setBakingTime(Integer bakingTime) {
        this.bakingTime = bakingTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cake cake = (Cake) o;
        return Objects.equals(id, cake.id) && Objects.equals(topping, cake.topping) && Objects.equals(bakingTime,
                cake.bakingTime) && Objects.equals(price, cake.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topping, bakingTime, price);
    }

    public abstract String getCakeType();
}
