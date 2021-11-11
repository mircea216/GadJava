package com.company.designPatterns.codeChallenges.codeChallenge4;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Jack");
        Student student2 = new Student("Marry");
        Student student3 = new Student("Kevin");
        String[] topics = new String[]{"basics", "oo", "design patterns"};
        Teacher teacher = new Teacher();
        for (String topic : topics) {
            //// teacher.register(student1);
            //.register(student2);
            //  teacher.register(student3);
            teacher.teaches(topic);
            student1.listenTo(teacher);
            student2.listenTo(teacher);
            student3.listenTo(teacher);
        }
    }

}
