package com.malsr.random;

public class ReverseFactorialFinder {

    public String getReverseFactorial(int number) {
        int dividedNumber = 0;

        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (i == 2) {
                if (number % i != 0) {
                    return "NONE";
                }
                dividedNumber = number / i;
            } else {
                if (dividedNumber % i != 0) {
                    return "NONE";
                }
                dividedNumber = dividedNumber / i;
            }

            if (i > dividedNumber) {
                return (i) + "!";
            }
            //120 = 5 4 3 2 1
        }
        return "NONE";
    }
}
