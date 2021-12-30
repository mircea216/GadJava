package com.company.functional;

import com.company.functional.code.Student;

import java.util.List;
import java.util.Optional;

public class Main {
    public static Optional<Integer> getTopStudent(List<Student> students) {
        return students
                .stream()
                .filter((Student s) -> s.getGraduationYear() == 2019)
                .map((Student::getScore))
                .max(Integer::compareTo);
    }

    public static void main(String[] args) {
        Student student1 = new Student("S1", 2019, 9);
        Student student2 = new Student("S2", 2019, 10);
        Student student3 = new Student("S3", 2017, 7);
        List<Student> list = List.of(student1, student2, student3);
        System.out.println(getTopStudent(list).get());
    }
}
