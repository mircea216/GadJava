package com.company.basics;

public class Main {
    public static void main(String[] args) {
        CodeChallenge3 codeChallenge3 = new CodeChallenge3();
        int[] numbers = {3, 2, -3, -2, 3, 0};
        System.out.println(codeChallenge3.numberOfPairs(numbers));
        int[] numbers1 = {1, 1, 0, -1, -1};
        System.out.println(codeChallenge3.numberOfPairs(numbers1));
        int[] numbers2 = {5, 9, -5, 7, -5};
        System.out.println(codeChallenge3.numberOfPairs(numbers2));
    }
}
