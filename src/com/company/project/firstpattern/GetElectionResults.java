package com.company.project.firstpattern;

public class GetElectionResults {

    public static void main(String[] args) {
        CountryGovernment countryGovernment = CountryGovernment.getElectedGovernment();
        countryGovernment.setGovernmentName("Victory Government");
        System.out.println(countryGovernment);
    }
}
