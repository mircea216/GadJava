package com.company.collections.comparators;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (name.compareTo(o.name) != 0) {
            return name.compareTo(o.name);
        }
        return age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
