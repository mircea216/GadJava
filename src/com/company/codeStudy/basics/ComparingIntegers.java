package com.company.codeStudy.basics;

public class ComparingIntegers {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);
        Integer i11 = Integer.valueOf(127);
        Integer i22 = Integer.valueOf(127);
        System.out.println(i11.equals(i22));
        System.out.println(i11 == i22);
        Integer i111 = 128;
        Integer i222 = 128;
        System.out.println(i111.equals(i222));
        System.out.println(i111 == i222);
    }
}
