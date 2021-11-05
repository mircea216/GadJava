package com.company.basics;

public class Main {
    public static void main(String[] args) {
        CodeChallenge1 codeChallenge1 = new CodeChallenge1();
        codeChallenge1.printNumbers();
        CodeChallenge2 codeChallenge2 = new CodeChallenge2();
        System.out.println(codeChallenge2.compute(33357));
        System.out.println(codeChallenge2.compute(53));
        System.out.println(codeChallenge2.compute2(105));
        System.out.println(codeChallenge2.compute2(101));
        System.out.println(codeChallenge2.compute2(303));
        CodeChallenge3 codeChallenge3 = new CodeChallenge3();
        int[] numbers = {3, 2, -3, -2, 3, 0};
        System.out.println(codeChallenge3.numberOfPairs(numbers));
        int[] numbers1 = {1, 1, 0, -1, -1};
        System.out.println(codeChallenge3.numberOfPairs(numbers1));
        int[] numbers2 = {5, 9, -5, 7, -5};
        System.out.println(codeChallenge3.numberOfPairs(numbers2));
        CodeChallenge4 codeChallenge4 = new CodeChallenge4();
        int[] numbers3 = {-1, -1, -1, 2};
        System.out.println(codeChallenge4.numberOfPairs(numbers3));
    }
}
