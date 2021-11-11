package com.company.designPatterns.codeChallenges.codeChallenge6;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Andrew")
                .setDrivingLicence(true)
                .setJob("Dev")
                .setUniversity("UBB")
                .setDrivingLicence(true)
                .build();
        System.out.println(person);
        Person person1 = new Person.PersonBuilder("Ben").build();
        System.out.println(person1);
    }
}
