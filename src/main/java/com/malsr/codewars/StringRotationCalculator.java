package com.malsr.codewars;

public class StringRotationCalculator {

    public int rotation(String originalString, String rotatedString) {

        if (originalString.equals(rotatedString)) {
            return 0;
        }

        for (int x = originalString.length() - 1; x >= 0; x--) {
            String latterPart = originalString.substring(x, originalString.length());
            String firstPart = originalString.substring(0, x);

            String stringToCompare = latterPart + firstPart;

            if (stringToCompare.equals(rotatedString)) {
                return originalString.length() - x;
            }

        }

        return -1;
    }
}
