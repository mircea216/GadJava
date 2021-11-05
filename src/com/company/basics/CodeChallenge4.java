package com.company.basics;

public class CodeChallenge4 {
    public int numberOfPairs(int[] numbers) {
        int pairs = 0;
        StringBuilder pairedPositions = new StringBuilder();
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++)
                for (int k = j + 1; k < numbers.length; k++)
                    if (numbers[i] + numbers[j] + numbers[k] == 0 && !pairedPositions.toString().
                            contains(String.valueOf(j)) && !pairedPositions.toString().contains(String.valueOf(k))) {
                        pairedPositions.append(j).append(" ");
                        pairedPositions.append(k).append(" ");
                        pairs++;
                        break;
                    }
        }
        return pairs;
    }
}
