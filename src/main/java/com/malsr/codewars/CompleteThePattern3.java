package com.malsr.codewars;

public class CompleteThePattern3 {

    public String pattern(int number) {
        final StringBuilder result = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            for (int x = 0; x < i; x++) {
                result.append(number - x);
            }

            if (i != number) {
                result.append(System.lineSeparator());
            }
        }


        return result.toString();
    }
}
