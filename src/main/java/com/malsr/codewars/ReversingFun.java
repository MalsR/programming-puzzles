package com.malsr.codewars;

public class ReversingFun {

    public String funReverse(final String stringToReverse) {

        StringBuilder result = new StringBuilder();

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            char charAtIndex = stringToReverse.charAt(i);
            result.append(charAtIndex);
        }

        return result.toString();
    }
}
