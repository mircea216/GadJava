package com.company.codeStudy.basics;

public class SummingNonFloating {
    public static void main(String[] args) {
        sumShorts();
        sumBytes();
        sumInts();
    }

    public static void sumShorts() {
        short x = 5;
        short y = 10;
        short sum = (short) (x + y);
        System.out.println(sum);
    }

    public static void sumBytes() {
        byte x = 5;
        byte y = 10;
        byte sum = (byte) (x + y);
        System.out.println(sum);
    }

    public static void sumInts() {
        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println(sum);
    }
}
