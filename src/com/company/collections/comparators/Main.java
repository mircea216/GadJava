package com.company.collections.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ann", 17);
        Person person2 = new Person("Benny", 17);
        Person person3 = new Person("Ann", 19);
        Person person4 = new Person("Anne", 18);
        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3, person4));
        Collections.sort(people);
        people.forEach(System.out::println);
    }
}
