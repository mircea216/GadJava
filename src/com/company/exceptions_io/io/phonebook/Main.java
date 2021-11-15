package com.company.exceptions_io.io.phonebook;

import java.io.IOException;

public class Main {

    private static final String FILENAME = "src/com/company/exceptions_io/io/phonebook/phonebook.txt";

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook(FILENAME);
        try {
            System.out.println(phonebook.getTheContactOfAGivenPerson("Abdul"));
            System.out.println(phonebook.getTheContactOfAGivenPerson("Abbey"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
