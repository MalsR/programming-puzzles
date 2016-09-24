package com.malsr.codewars;

public class CompleteThePattern2 {

    public String pattern(int number) {

        final StringBuilder result = new StringBuilder();

        for (int y = number; y > 0; y--) {
            for (int x = 0; x < y; x++) {
                result.append(number - x);
            }

            if (y != 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}
