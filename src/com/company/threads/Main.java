package com.company.threads;

import com.company.threads.rabbitrace.RabbitRunnable;
import com.company.threads.rabbitrace.RabbitThread;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {
                new RabbitThread(i).start();
            } else {
                new Thread(new RabbitRunnable(i)).start();
            }
        }
    }
}
