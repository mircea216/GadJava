package com.company.threads.interference;

public class Main {
    public static int v = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println(v);
        Object object = new Object();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    v++;
                }
                System.out.println(v);
            }
        };
        for (int i = 0; i < 500; i++) {
            new Thread(runnable).start();
        }
        Thread.sleep(1000);
        System.out.println(v);
    }
}

