package com.company.oo;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("f1", 100, 10);
        Fighter fighter2 = new Fighter("f2", 100, 10);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        System.out.println("The winner is: " + boxingMatch.fight());
    }
}
