package com.company.codeChallenges;

public class CodeChallenge2 {

    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String QIX = "Qix";
    public static final String THREE = "3";
    public static final String FIVE = "5";
    public static final String SEVEN = "7";

    public int numberOfACertainDigit(int number, int digit) {
        int counter = 0;
        while (number != 0) {
            if (number % 10 == digit) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }

    public String compute(int number) {
        StringBuilder stringNumber = new StringBuilder();
        int numberOfDigits = 0;
        if (number % 3 == 0) {
            stringNumber.append(FOO);
        }
        if (String.valueOf(number).contains(THREE)) {
            numberOfDigits = numberOfACertainDigit(number, 3);
            stringNumber.append(FOO.repeat(Math.max(0, numberOfDigits)));
        }
        if (number % 5 == 0) {
            stringNumber.append(BAR);
        }
        if (String.valueOf(number).contains(FIVE)) {
            numberOfDigits = numberOfACertainDigit(number, 5);
            stringNumber.append(BAR.repeat(Math.max(0, numberOfDigits)));
        }
        if (number % 7 == 0) {
            stringNumber.append(QIX);
        }
        if (String.valueOf(number).contains(SEVEN)) {
            numberOfDigits = numberOfACertainDigit(number, 7);
            stringNumber.append(QIX.repeat(Math.max(0, numberOfDigits)));
        }
        if (stringNumber.toString().isEmpty())
            return String.valueOf(number);
        return stringNumber.toString();
    }
}
