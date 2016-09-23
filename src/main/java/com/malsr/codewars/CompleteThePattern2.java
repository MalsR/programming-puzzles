package com.malsr.codewars;

public class CompleteThePattern2 {

    public String pattern(int number) {

        StringBuilder result = new StringBuilder();

        for (int y = number; y > 0; y--) {
            result.append(number);

            for (int x = 1; x <= y - 1; x++) {
                result.append(number - x);
            }

            if (y != 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}
