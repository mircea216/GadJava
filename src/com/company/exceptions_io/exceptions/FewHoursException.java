package com.company.exceptions_io.exceptions;

public class FewHoursException extends Exception {
    public FewHoursException(){
        super("Not enough hours");
    }
}
