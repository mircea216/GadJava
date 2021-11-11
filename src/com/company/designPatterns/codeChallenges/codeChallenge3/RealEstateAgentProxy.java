package com.company.designPatterns.codeChallenges.codeChallenge3;

public class RealEstateAgentProxy {
    private Apartment apartment;

    public void represent(Apartment apartment) {
        this.apartment = apartment;
    }

    public Apartment rent(Student student) {
        if (student.getName().startsWith("P"))
            return null;
        return apartment;
    }
}
