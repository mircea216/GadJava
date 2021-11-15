package com.company.exceptions_io.exceptions;

public class Main {
    public static void main(String[] args) {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        System.out.println(paymentCalculator.calculate(10));
        System.out.println(paymentCalculator.calculate(50));
        System.out.println(paymentCalculator.calculate(0));
    }
}
