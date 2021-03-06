package com.malsr.codewars;

public class ReversingFun {

    public String funReverse(final String stringToReverse) {
        if (stringToReverse.length() == 1) {
            return stringToReverse;
        } else {
            String reversedString = new StringBuilder(stringToReverse).reverse().toString();
            String secondPartToReverse = reversedString.substring(1, reversedString.length());

            return reversedString.substring(0, 1) + funReverse(secondPartToReverse);
        }
    }

    //Slightly reduced way of achieving the reverse
    public String funReverse_2(final String stringToReverse) {
        String initialReversedString = new StringBuilder(stringToReverse).reverse().toString();

        StringBuilder result = new StringBuilder();
        int length = stringToReverse.length();

        for (int i = 0; i < length - 2; i++) {
            String firstPart = initialReversedString.substring(0, i+1);

            String secondPart = initialReversedString.substring(i + 1, initialReversedString.length());
            String toBeReversed = new StringBuilder(secondPart).reverse().toString();

            initialReversedString = firstPart + toBeReversed;
        }

        result.append(initialReversedString);

        return result.toString();
    }

    //Another way of achieving the same thing
    public String funReverse_1(final String stringToReverse) {
        String initialReversedString = reverse(stringToReverse);

        StringBuilder result = new StringBuilder();
        int length = stringToReverse.length();

        for (int i = 0; i < length - 2; i++) {
            String firstPart = initialReversedString.substring(0, i+1);

            String secondPart = initialReversedString.substring(i + 1, initialReversedString.length());
            String toBeReversed = reverse(secondPart);

            initialReversedString = firstPart + toBeReversed;
        }

        result.append(initialReversedString);

        return result.toString();
    }

    private String reverse(String stringToReverse) {
        StringBuilder result = new StringBuilder();

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            char charAtIndex = stringToReverse.charAt(i);
            result.append(charAtIndex);
        }

        return result.toString();
    }
}
