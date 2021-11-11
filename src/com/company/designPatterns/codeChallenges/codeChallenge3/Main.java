package com.company.designPatterns.codeChallenges.codeChallenge3;

public class Main {
    public static void main(String[] args) {


        Apartment apartment01 = new Apartment("Crangasi", 500);
        Apartment apartment02 = new Apartment("Crangasi", 600);
        Student student01 = new Student("Ionscu", 600);
        Student student02 = new Student("Popscu", 700);
        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(apartment01);
        proxy.represent(apartment02);
        System.out.println(student01 + " rented " + proxy.rent(student01));
        System.out.println(student02 + " rented " + proxy.rent(student02));
    }
}
