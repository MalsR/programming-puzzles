package com.malsr.random;

public class Palindrome {

    public boolean isPalindrome(String wordOrPhraseToCheck) {
        if (wordOrPhraseToCheck != null && wordOrPhraseToCheck.trim().length() > 0) {
            String alphabeticString = getStringWithEnglishAlphabetLetters(wordOrPhraseToCheck.toLowerCase());
            StringBuilder reverseStringBuilder = new StringBuilder(alphabeticString).reverse();

            return alphabeticString.equals(reverseStringBuilder.toString());
        }
        return false;
    }

    //Without using built in StringBuilder().reverse()
    public boolean isPalindrome3(String wordOrPhraseToCheck) {
        if (wordOrPhraseToCheck != null && wordOrPhraseToCheck.trim().length() > 0) {
            String alphabeticString = getStringWithEnglishAlphabetLetters(wordOrPhraseToCheck.toLowerCase());

            StringBuilder reverseStringBuilder = new StringBuilder();
            char[] charArray = alphabeticString.toCharArray();

            for (int i = charArray.length - 1; i >= 0; i--) {
                reverseStringBuilder.append(charArray[i]);
            }

            return alphabeticString.equals(reverseStringBuilder.toString());
        }
        return false;
    }

    //Complicated clunky way of figuring out if any given word, sentence etc is a palindrome, see below.
    public boolean isPalindrome1(String stringToCheck) {
        if (stringToCheck != null && stringToCheck.trim().length() > 0) {
            //One way to check if a word is a palindrome is to split the plain word in two and check if the first
            //part of the word is equal to the second part of the word (when reversed)
            String plainEnglishWordsOnly = getStringWithEnglishAlphabetLetters(stringToCheck);

            String secondPart;
            if (plainEnglishWordsOnly.length() % 2 == 0) {
                //Even string length
                secondPart = plainEnglishWordsOnly.substring(plainEnglishWordsOnly.length() / 2, plainEnglishWordsOnly.length());
            } else {
                //odd string length, add 1 to skip centre char start from the next char to the end of the word
                secondPart = plainEnglishWordsOnly.substring((plainEnglishWordsOnly.length() / 2) + 1, plainEnglishWordsOnly.length());
            }

            String firstHalfPart = plainEnglishWordsOnly.substring(0, plainEnglishWordsOnly.length() / 2);

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

    //Another way (maybe a tad less complicated, only slightly) of checking if any given word, sentence etc is a palindrome, see below.
    public boolean isPalindrome2(String stringToCheck) {
        if (stringToCheck == null || stringToCheck.trim().length() == 0) {
            return false;
        }

        boolean result = true;

        //Now iterate the plainEnglishWordsOnly to match chars at matching indexes
        String plainEnglishWordsOnly = getStringWithEnglishAlphabetLetters(stringToCheck);
        String lowerCasedEnglishWords = plainEnglishWordsOnly.toLowerCase();
        int lengthOfStringToCompare = lowerCasedEnglishWords.length() - 1;

        for (int i = 0; i < lengthOfStringToCompare; i++) {
            int endIndex = lengthOfStringToCompare - i;

            char charAtAscendingIndex = lowerCasedEnglishWords.charAt(i);
            char charAtDescendingIndex = lowerCasedEnglishWords.charAt(endIndex);

            if (charAtAscendingIndex != charAtDescendingIndex) {
                //Then this means that char at ascending index is not matching with the char at descending or
                //mirrored index
                result = false;
                break;
            }
        }

        return result;
    }

    private String getStringWithEnglishAlphabetLetters(String stringToCheck) {
        StringBuilder result = new StringBuilder();

        //Only return alphabetic string
        for (int i = 0; i <= stringToCheck.length() - 1; i++) {
            int codePoint = stringToCheck.codePointAt(i);

            if (Character.isAlphabetic(codePoint)) {
                result.append(stringToCheck.charAt(i));
            }
        }

        return result.toString();
    }
}