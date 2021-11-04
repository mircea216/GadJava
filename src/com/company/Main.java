package com.company;

import com.company.basics.CodeChallenge1;
import com.company.basics.CodeChallenge2;
import com.company.lab2.BoxingMatch;
import com.company.lab2.Fighter;

public class Main {

    public static void main(String[] args) {
        Exercises ex = new Exercises();
        ex.arrays();
        CodeChallenge1 codeChallenge1 = new CodeChallenge1();
        codeChallenge1.printNumbers();
        System.out.println();
        CodeChallenge2 codeChallenge2 = new CodeChallenge2();
        System.out.println(codeChallenge2.compute(33357));
        System.out.println();
        Fighter fighter1 = new Fighter("f1", 100, 10);
        Fighter fighter2 = new Fighter("f2", 100, 10);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        System.out.println("The winner is: " + boxingMatch.fight());
    }
}
