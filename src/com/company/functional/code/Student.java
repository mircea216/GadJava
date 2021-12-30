package com.company.functional.code;

public class Student {
    private String name;
    private Integer graduationYear;
    private Integer score;

    public Student(String name, Integer graduationYear, Integer score) {
        this.name = name;
        this.graduationYear = graduationYear;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", graduationYear=" + graduationYear +
                ", score=" + score +
                '}';
    }
}
