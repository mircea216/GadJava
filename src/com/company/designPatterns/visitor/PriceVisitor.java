package com.company.designPatterns.visitor;

public class PriceVisitor implements Visitor {
    private Integer totalPrice;

    @Override
    public void visit(Book book) {
        if (book.getPrice() != null)
            totalPrice += book.getPrice();
    }

    @Override
    public void visit(Video video) {
        if (video.getPrice() != null)
            totalPrice += video.getPrice();
    }

    @Override
    public void visit(Audio audio) {
        if (audio.getPrice() != null)
            totalPrice += audio.getPrice();
    }

    @Override
    public String toString() {
        return "PriceVisitor{" +
                "totalPrice=" + totalPrice +
                '}';
    }
}
