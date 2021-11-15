package com.company.exceptions_io;

import java.io.IOException;

public class Main {
    public static int test(int i) {
        try {
            if (i == 0)
                throw new IOException();
            System.out.println("Here2");
            return 0;
        } catch (Exception e) {
            System.out.println("Here1");
            return 1;
        } finally {
            System.out.println("finally");
           // return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(0));
        System.out.println();
        System.out.println(test(1));
    }
}
