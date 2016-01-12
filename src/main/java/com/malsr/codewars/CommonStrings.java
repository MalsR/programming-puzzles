package com.malsr.codewars;

public class CommonStrings {

    public static boolean SubstringTest(String str1, String str2) {
        //can do preconditions
        if (str1 != null && str1.length() > 1 && str2 != null && str2.length() > 1) {

            for (int i = 1; i < str1.length(); i++) {
                String stringOneToCompare = str1.substring(i - 1, i + 1);

                //do contains on str2
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
