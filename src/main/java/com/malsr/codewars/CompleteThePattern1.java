package com.malsr.codewars;

public class CompleteThePattern1 {

    public String pattern(int number) {
        final StringBuilder result = new StringBuilder();

        for (int x = 1; x <= number; x++) {
            for (int y = 1; y <= x; y++) {
                result.append(x);
            }

            if (x != number) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}
