package com.malsr.coderbyte;

public class FirstReverse {

    public String reverse(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        StringBuilder result = new StringBuilder();

        for (int i = str.length(); i >= 1; i--) {

            String substring = str.substring(i - 1, i);
            result.append(substring);
        }

        return result.toString();
    }
}
