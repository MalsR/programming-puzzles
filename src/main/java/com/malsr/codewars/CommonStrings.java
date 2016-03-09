package com.malsr.codewars;

public class CommonStrings {

    public static boolean substringTest(String firstString, String secondString) {
        //can do preconditions if you really want to
        if (firstString != null && firstString.length() > 1 &&
                secondString != null && secondString.length() > 1) {

            String firstStringLowerCased = firstString.toLowerCase();
            String secondStringLowerCased = secondString.toLowerCase();

            for (int i = 1; i < firstStringLowerCased.length(); i++) {
                String stringOneToCompare = firstStringLowerCased.substring(i - 1, i + 1);

                if (secondStringLowerCased.contains(stringOneToCompare)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Another way of achieving example
    public static boolean substringTestExample2(String str1, String str2) {
        //can do preconditions if you really want to
        if (str1 != null && str1.length() > 1 && str2 != null && str2.length() > 1) {

            for (int i = 1; i < str1.length(); i++) {
                String stringOneToCompare = str1.substring(i - 1, i + 1);

                //Another way by using substring on second string to find a matching pair
                for (int y = 1; y < str2.length(); y++) {
                    String stringTwoToCompare = str2.substring(y - 1, y + 1);

                    if (stringOneToCompare.equalsIgnoreCase(stringTwoToCompare)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}