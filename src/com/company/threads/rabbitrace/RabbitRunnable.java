package com.company.threads.rabbitrace;

public class RabbitRunnable implements Runnable {
    private int number;

    public RabbitRunnable(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Rabbit number:" + number);

    }
}
