package com.company.designPatterns.visitor;

public class Main {
    public static void main(String[] args) {
        Element[] elements = new Element[10];
        Book book1 = new Book("book1", 100, 20);
        Book book2 = new Book("book2", 200, 200);
        elements[0] = book1;
        elements[1] = book2;
        Video video1 = new Video("video1", 100, 10);
        Video video2 = new Video("video2", 10, 15);
        elements[2] = video1;
        elements[3] = video2;
        Audio audio1 = new Audio("audio1", 250, 10);
        Audio audio2 = new Audio("audio2", 25, 100);
        elements[4] = audio1;
        elements[5] = audio2;

        for (int i = 0; i < elements.length && elements[i] != null; i++) {
            System.out.println(elements[i]);
        }
        PriceVisitor priceVisitor = new PriceVisitor();
        for (Element element : elements) {
            if (element != null)
                element.accept(priceVisitor);
        }
        DurationVisitor durationVisitor = new DurationVisitor();
        for (Element element : elements) {
            if (element != null)
                element.accept(durationVisitor);
        }
    }
}
