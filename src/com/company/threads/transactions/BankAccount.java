package com.company.threads.transactions;

public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    synchronized void withdraw(double amount) throws InsufficientlyMoneyException {
        if (amount > debit) {
            throw new InsufficientlyMoneyException("Not enough money");
        }
        longDatabaseCall();
        this.debit -= amount;
    }

    synchronized void deposit(double amount) {
        longDatabaseCall();
        this.debit += amount;
    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                '}';
    }
}
