package com.company.threads.transactions;

public class Main {
    public static void main(String[] args) {
        TransactionThread thread = new TransactionThread("Michael", new BankAccount("Michael", 1000),
                new BankAccount("Jennifer", 2000), 1500);
        thread.start();
    }
}
