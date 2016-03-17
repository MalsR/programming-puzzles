package com.malsr.codewars;

public class ReversingFun {

    public String funReverse(final String stringToReverse) {

        String initialReversedString = reverse(stringToReverse);

        StringBuilder updatedResult = new StringBuilder();
        int length = stringToReverse.length();

        String firstPart;
        String toBeReversed;

        for (int i = 0; i < length - 2; i++) {
            firstPart = initialReversedString.substring(0, i+1);

            String secondPart = initialReversedString.substring(i + 1, initialReversedString.length());
            toBeReversed = reverse(secondPart);

            initialReversedString = firstPart + toBeReversed;
        }

        updatedResult.append(initialReversedString);

        return updatedResult.toString();
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
