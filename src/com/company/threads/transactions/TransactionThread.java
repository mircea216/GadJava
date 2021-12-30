package com.company.threads.transactions;

public class TransactionThread extends Thread {
    private final String name;
    private final BankAccount from;
    private final BankAccount to;
    private final int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        try {
            this.from.withdraw(amount);
            this.to.deposit(amount);
            System.out.println("Transfer " + name + " was execute");
            System.out.println("From " + from);
            System.out.println("To " + to);
        } catch (InsufficientlyMoneyException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {
        transfer(from, to, amount);
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
