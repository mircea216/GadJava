package com.company.threads.transactions;

public class BankAccount {
    private final String name;
    private final int debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    public void withdraw(double amount) {
        longDatabaseCall();
        System.out.println("You extracted " + amount + " money");
    }

    public void deposit(double amount) {
        longDatabaseCall();
        System.out.println("You deposited " + amount + " money");
    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
