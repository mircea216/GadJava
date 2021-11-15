package com.company.designPatterns.visitor;

public class Book implements Element {
    private String name;
    private Integer numberOfPages;
    private String author;
    private Integer price;

    public Book(String name, Integer numberOfPages, Integer price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
