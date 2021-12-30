package com.company.threads.transactions;

public class Main {
    public static void main(String[] args) {
        BankAccount from = new BankAccount("Source", 40000);
        BankAccount to = new BankAccount("Destination", 20000);
        System.out.println(from);
        System.out.println(to);
        TransactionThread thread1 = new TransactionThread("Michael", from, to, 1500);
        TransactionThread thread2 = new TransactionThread("Michael", from, to, 1500);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(from);
        System.out.println(to);
    }
}
