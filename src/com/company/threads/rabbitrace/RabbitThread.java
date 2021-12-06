package com.company.threads.rabbitrace;

public class RabbitThread extends Thread {
    private int number;

    public RabbitThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Rabbit number:" + number);
    }
}
