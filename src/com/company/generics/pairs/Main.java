package com.company.generics.pairs;

public class Main {
    public static void main(String[] args) {
        Boot boot1 = new Boot(20, "red");
        Boot boot2 = new Boot(20, "red");
        Shoe running1 = new Running(20, "red");
        Running running2 = new Running(22, "red");
        try {
            Pair<Boot> pair1 = new Pair<>(boot1, boot2);
            Pair<Shoe> pair2 = new Pair<>(running1, running2);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
