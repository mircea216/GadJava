package com.company.basics;

public class CodeChallenge3 {
    public int numberOfPairs(int[] numbers) {
        int pairs = 0;
        StringBuilder pairedPositions = new StringBuilder();
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean paired = false;
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] + numbers[j] == 0 && !paired && !pairedPositions.toString().
                        contains(String.valueOf(i))) {
                    pairedPositions.append(j);
                    paired = true;
                    pairs++;
                }
        }
        return pairs;
    }
}
