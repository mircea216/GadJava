package com.company.exceptions_io.io.anagrams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AnagramsGenerator {
    private final String filename;
    private String string;

    public AnagramsGenerator(String filename, String string) {
        this.filename = filename;
        this.string = string;
    }

    public void generateAnagrams(int start, int end) throws IOException {
        FileWriter fileWriter = null;
        if (start == end) {
            fileWriter = new FileWriter(filename);
            fileWriter.write(string);
        } else {
            for (int i = start; i <= end; i++) {
                string = swap(start, i);
                generateAnagrams(start + 1, end);
                string = swap(start, i);
            }
        }
        if (fileWriter != null)
            fileWriter.close();
    }

    private String swap(int i, int j) {
        char intermediate;
        char[] array = string.toCharArray();
        intermediate = array[i];
        array[i] = array[j];
        array[j] = intermediate;
        return String.valueOf(array);
    }
}
