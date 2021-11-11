package com.company.designPatterns.codeChallenges.codeChallenge4;

public class Student implements Observer {
    private String name;
    private String learntTopic;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.learntTopic = message;
    }

    public String getLearntTopic() {
        return learntTopic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
        System.out.println("Student " + name + " learnt about " + teacher.getNews());
        teacher.unregister(this);
    }

}
