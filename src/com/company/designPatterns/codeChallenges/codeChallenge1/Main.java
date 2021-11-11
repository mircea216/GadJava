package com.company.designPatterns.codeChallenges.codeChallenge1;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3};
        ArrayCustomIterator iterator = new ArrayCustomIterator(array);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
