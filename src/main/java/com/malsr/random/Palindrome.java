package com.malsr.random;

public class Palindrome {

    public boolean isPalindrome(String wordToCheck) {

        if (wordToCheck != null && !wordToCheck.isEmpty()) {
            StringBuilder plainWordBuilder = new StringBuilder();

            for (int i = 0; i <= wordToCheck.length() - 1; i++) {
                char charAtIndex = wordToCheck.charAt(i);
                String stringToCompare = Character.toString(charAtIndex);
                if (!" ".equals(stringToCompare) && !".".equals(stringToCompare)) {
                    plainWordBuilder.append(stringToCompare);
                }
            }

            String plainWord = plainWordBuilder.toString();

            String firstHalfPart = plainWord.substring(0, plainWord.length() / 2);
            String secondPart = plainWord.substring(plainWord.length() / 2, plainWord.length());

            //Now reverse the secondPart String so we can match that to first
            StringBuilder reversedSecondPartBuilder = new StringBuilder();
            for (int i = secondPart.length() - 1; i >= 0; i--) {
                char charAtIndex = secondPart.charAt(i);
                reversedSecondPartBuilder.append(charAtIndex);
            }
            String reversedSecondPart = reversedSecondPartBuilder.toString();

            return firstHalfPart.equalsIgnoreCase(reversedSecondPart);
        }

        return false;
    }
}
