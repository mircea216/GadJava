package com.company.project.firstpattern;


public class CountryGovernment {
    private final static CountryGovernment countryGovernment = new CountryGovernment();
    private String governmentName;

    private CountryGovernment() {
    }

    public void setGovernmentName(String governmentName) {
        this.governmentName = governmentName;
    }

    public static CountryGovernment getElectedGovernment() {
        return countryGovernment;
    }

    @Override
    public String toString() {
        return "The elected government is: " + governmentName;
    }
}
