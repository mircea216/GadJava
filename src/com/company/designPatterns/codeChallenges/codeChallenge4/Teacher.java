package com.company.designPatterns.codeChallenges.codeChallenge4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {
    private String news;
    private final List<Observer> listOfObservers;

    public Teacher() {
        listOfObservers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        listOfObservers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        listOfObservers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        this.news = message;
        for (Observer observer : listOfObservers)
            observer.update(message);
    }

    public void teaches(String topic) {
        notifyObservers(topic);
    }

    public String getNews() {
        return news;
    }
}
