package com.malsr.random;

public class Palindrome {

    public boolean isPalindrome(String wordToCheck) {

        if (wordToCheck != null) {
            StringBuilder plainWordBuilder = new StringBuilder();

            //use wordToCheck.replace with regex to only include a-z chars and skip rest
            for (int i = 0; i <= wordToCheck.length() - 1; i++) {
                char charAtIndex = wordToCheck.charAt(i);
                String stringToCompare = Character.toString(charAtIndex);
                if (!" ".equals(stringToCompare) && !".".equals(stringToCompare) && !",".equals(stringToCompare)) {
                    plainWordBuilder.append(stringToCompare);
                }
            }

            //One way to check if a word is a palindrome is to split the plain word in two and check if the first
            //part of the word is equal to the second part of the word (when reversed)
            String plainWord = plainWordBuilder.toString();
            String secondPart;
            if (plainWord.length() % 2 == 0) {
                //Even string length
                secondPart = plainWord.substring(plainWord.length() / 2, plainWord.length());
            } else {
                //odd string length, add 1 to skip centre char start from the next char to the end of the word
                secondPart = plainWord.substring((plainWord.length() / 2) + 1, plainWord.length());
            }

            String firstHalfPart = plainWord.substring(0, plainWord.length() / 2);

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
