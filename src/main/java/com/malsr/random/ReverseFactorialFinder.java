package com.malsr.random;

public class ReverseFactorialFinder {

    private static final String NONE = "NONE";

    public String getReverseFactorial(int number) {
        int dividedNumber = number;

        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (number % i != 0) {
                return NONE;
            }
            dividedNumber = dividedNumber / i;

            if (i > dividedNumber) {
                return String.format("%s!", i);
            }
        }
        return NONE;
    }
}
