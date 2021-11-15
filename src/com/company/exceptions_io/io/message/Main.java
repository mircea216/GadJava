package com.company.exceptions_io.io.message;

import java.io.IOException;

public class Main {
    private static final String FILENAME = "src/com/company/exceptions_io/io/message/message.txt";

    public static void main(String[] args) {
        SecretMessage secretMessage = new SecretMessage(FILENAME);
        try {
            System.out.println(secretMessage.decipherMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
