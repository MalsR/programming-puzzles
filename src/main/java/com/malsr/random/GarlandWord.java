package com.malsr.random;

public class GarlandWord {

    public int garland(final String wordToCheck) {
        int degreeCount = 0;
        int lengthOfWord = wordToCheck.length();

        for (int i = 1; i < lengthOfWord; i++) {
            String endWord = wordToCheck.substring(lengthOfWord - i, lengthOfWord);
            String remainingWord = wordToCheck.substring(i, lengthOfWord);
            String combinedWord = endWord + remainingWord;

            if (wordToCheck.equalsIgnoreCase(combinedWord)) {
                //Do not want to break here as we want to calculate max degree of garland words
                degreeCount = i;
            }
        }
        
        return degreeCount;
    }

    public int garland2(final String wordToCheck) {
        int degreeCount = 0;

        for (int i = 1; i < wordToCheck.length(); i++) {
            //Find end word combinations to see they match the start of the word to check
            String endWord = wordToCheck.substring(wordToCheck.length() - i, wordToCheck.length());

            //Check if each end word combination can be used to start the word
            if (wordToCheck.startsWith(endWord)) {
                degreeCount = i;
            }
        }

        return degreeCount;
    }

    public int garland3(final String wordToCheck) {
        int degreeCount = 0;

        for (int i = 1; i < wordToCheck.length(); i++) {
            //beginIndex of substring is 0 because we want to check word combinations starting with first char of wordToCheck
            String startWord = wordToCheck.substring(0, i);

            if (wordToCheck.endsWith(startWord)) {
                degreeCount = i;
            }
        }

        return  degreeCount;
    }
}
