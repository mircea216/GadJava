package com.company.exceptions_io.io.message;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {
    private static final String X = "X";
    private static final String SPACE = " ";

    private final String fileName;

    public SecretMessage(String fileName) {
        this.fileName = fileName;
    }

    private StringBuilder loadData() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String newLine;
            while ((newLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(newLine).append("\n");
            }
        }
        return stringBuilder;
    }

    public String decipherMessage() throws IOException {
        String codedMessage = loadData().toString();
        StringBuilder deciphered = new StringBuilder();
        for (int i = 0; i < codedMessage.length(); i++) {
            boolean equalToX = String.valueOf(codedMessage.charAt(i)).equals(X);
            if (Character.isUpperCase(codedMessage.charAt(i)) && !equalToX) {
                deciphered.append(codedMessage.charAt(i));
            } else if (equalToX) {
                deciphered.append(SPACE);
            }
        }
        return deciphered.toString();
    }
}

