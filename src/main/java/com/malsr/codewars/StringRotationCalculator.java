package com.malsr.codewars;

public class StringRotationCalculator {

    public int rotatedCharacters(String originalString, String rotatedString) {

        if (originalString.equals(rotatedString)) {
            return 0;
        }

        //Working our way backwards to find a match
        for (int x = originalString.length() - 1; x >= 0; x--) {
            String originalSubStringSuffix = originalString.substring(x, originalString.length());
            String originalSubStringPrefix = originalString.substring(0, x);

            String stringToCompare = originalSubStringSuffix + originalSubStringPrefix;

            if (stringToCompare.equals(rotatedString)) {
                return originalString.length() - x;
            }
        }

        return -1;
    }
}
