package com.malsr.coderbyte;

public class FirstReverse {

//    Using the Java language, have the function FirstReverse(str) take the str parameter being passed and
//    return the string in reversed order.
//
//    Examples
//    Input = "coderbyte"Output = "etybredoc"
//    Input = "I Love Code"Output = "edoC evoL I"

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
