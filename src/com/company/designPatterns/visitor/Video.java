package com.company.designPatterns.visitor;

public class Video implements Element {
    private String name;
    private String type;
    private Integer price;
    private Integer duration;

    public Video(String name, Integer price, Integer duration) {
        this.name = name;
        this.price = price;
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void accept(Visitor video) {
        video.visit(this);
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getDuration() {
        return duration;
    }
}


