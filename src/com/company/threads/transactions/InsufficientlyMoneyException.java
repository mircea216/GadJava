package com.company.threads.transactions;

public class InsufficientlyMoneyException extends Exception {

    public InsufficientlyMoneyException(String message) {
        super(message);
    }
}
