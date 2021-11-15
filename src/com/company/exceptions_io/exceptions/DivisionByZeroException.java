package com.company.exceptions_io.exceptions;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(){
        super("Can't calculate salary for 0 hours");
    }
}
