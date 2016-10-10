package com.malsr.coderbyte;

public class FirstReverse {

    public String reverse(String stringToReverse) {
        if (stringToReverse == null || stringToReverse.length() == 0) {
            return null;
        }

        return new StringBuilder(stringToReverse).reverse().toString();
    }

    public String reverse_1(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        StringBuilder result = new StringBuilder();

        int stringLength = str.length();

        for (int i = stringLength; i >= 1; i--) {
            String substring = str.substring(i - 1, i);
            result.append(substring);
        }

        return result.toString();
    }
}
