package com.company.exceptions_io.exceptions;

public class PaymentCalculator {
    public int calculate(int numberOfHours) {
        int result;
        try {
            checkHours(numberOfHours);
        } catch (FewHoursException e) {
            numberOfHours = 31;
            System.out.println("Not enough hours exception");
        }
        result = process(numberOfHours);
        return result;
    }

    private void checkHours(int numberOfHours) throws FewHoursException {
        if (numberOfHours < 30 && numberOfHours > 0) {
            throw new FewHoursException();
        }
    }

    public int process(int numberOfHours) {
        if (numberOfHours == 0)
            throw new DivisionByZeroException();
        return 5000 / numberOfHours + 300;
    }
}
