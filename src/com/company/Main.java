package com.company;

import com.company.codeChallenges.CodeChallenge1;
import com.company.codeChallenges.CodeChallenge2;

public class Main {

    public static void main(String[] args) {
        Exercises ex = new Exercises();
        ex.arrays();
        CodeChallenge1 codeChallenge1 = new CodeChallenge1();
        codeChallenge1.printNumbers();
        System.out.println();
        CodeChallenge2 codeChallenge2 = new CodeChallenge2();
        System.out.println(codeChallenge2.compute(33357));
    }
}
