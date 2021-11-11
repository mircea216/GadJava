package com.company.designPatterns.codeChallenges.codeChallenge5;

public class DescBubbleSort extends TemplateMethodBubbleSort {
    @Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 > i2;
    }
}
