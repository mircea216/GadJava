package com.company.basics;

public class CodeChallenge2 {

    private static final String EMPTY = "";
    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String QIX = "Qix";
    public static final String STAR = "*";
    public static final String STRING = "0357";

    private static String contains(int number) {
        if (number == 0)
            return EMPTY;
        int x = number % 10;
        if (x == 3)
            return contains(number / 10) + FOO;
        if (x == 5)
            return contains(number / 10) + BAR;
        if (x == 7)
            return contains(number / 10) + QIX;
        return contains(number / 10);
    }

    public String compute(int number) {
        StringBuilder stringNumber = new StringBuilder();
        if (number % 3 == 0) {
            stringNumber.append(FOO);
        }
        if (number % 5 == 0) {
            stringNumber.append(BAR);
        }
        if (number % 7 == 0) {
            stringNumber.append(QIX);
        }
        stringNumber.append(contains(number));
        if (stringNumber.toString().isEmpty())
            return String.valueOf(number);
        return stringNumber.toString();
    }

    private static String contains2(int number) {
        if (number == 0)
            return EMPTY;
        int x = number % 10;
        if (x == 0)
            return contains2(number / 10) + STAR;
        if (x == 3)
            return contains2(number / 10) + FOO;
        if (x == 5)
            return contains2(number / 10) + BAR;
        if (x == 7)
            return contains2(number / 10) + QIX;
        return contains2(number / 10);
    }

    private static String transformNotDivisibleNumber(int number) {
        if (number == 0)
            return EMPTY;
        int x = number % 10;
        if (x == 0)
            return transformNotDivisibleNumber(number / 10) + STAR;
        if (x == 3)
            return transformNotDivisibleNumber(number / 10) + FOO;
        if (x == 5)
            return transformNotDivisibleNumber(number / 10) + BAR;
        if (x == 7)
            return transformNotDivisibleNumber(number / 10) + QIX;
        if (!STRING.contains(String.valueOf(x)))
            return transformNotDivisibleNumber(number / 10) + x;
        return transformNotDivisibleNumber(number / 10);
    }

    public String compute2(int number) {
        StringBuilder stringNumber = new StringBuilder();
        if (number % 3 == 0) {
            stringNumber.append(FOO);
        }
        if (number % 5 == 0) {
            stringNumber.append(BAR);
        }
        if (number % 7 == 0) {
            stringNumber.append(QIX);
        }
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
            stringNumber.append(transformNotDivisibleNumber(number));
        else
            stringNumber.append(contains2(number));
        if (stringNumber.toString().isEmpty())
            return String.valueOf(number);
        return stringNumber.toString();
    }
}
