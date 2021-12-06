package com.company.threads.transactions;

import java.util.Scanner;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("1. Deposit money: ");
        System.out.println("2. Withdraw money money: ");
        System.out.println("Choose your option: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        switch (option) {
            case "1":
                transfer(from, to, amount);
                from.deposit(amount);
                break;
            case "2":
                transfer(from, null, amount);
                from.withdraw(amount);
                break;
            default:
        }
    }

    @Override
    public String toString() {
        return "TransactionThread{" +
                "name='" + name + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", amount=" + amount +
                '}';
    }

}
