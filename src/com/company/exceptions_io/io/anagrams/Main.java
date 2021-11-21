package com.company.exceptions_io.io.anagrams;

import java.io.IOException;

public class Main {

    private static final String STRING = "listen";
    private static final String FILENAME = "src/com/company/exceptions_io/io/anagrams/anagrams.txt";

    public static void main(String[] args) {
        AnagramsGenerator anagramsGenerator = new AnagramsGenerator(FILENAME, STRING);
        try {
            anagramsGenerator.generateAnagrams(0, STRING.length() - 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
