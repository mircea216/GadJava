package com.company.designPatterns.visitor;

public class Audio implements Element {
    private String name;
    private Integer price;
    private Integer time;

    public Audio(String name, Integer price, Integer time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", time=" + time +
                '}';
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getTime() {
        return time;
    }
}
