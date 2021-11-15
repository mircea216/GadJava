package com.company.exceptions_io.io.phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private static final String SPACE = " ";

    private final String fileName;

    public Phonebook(String fileName) {
        this.fileName = fileName;
    }

    private List<String> loadData() throws IOException {
        List<String> contacts = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String newLine;
            while ((newLine = bufferedReader.readLine()) != null) {
                contacts.add(newLine);
            }
        }
        return contacts;
    }

    public String getTheContactOfAGivenPerson(String personName) throws IOException {
        for (String contact : loadData()) {
            if (contact.split(SPACE)[0].equals(personName))
                return contact;
        }
        return null;
    }
}
