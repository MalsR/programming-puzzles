package com.malsr.random;

public class GarlandWord {

    public int garland(final String wordToCheck) {
        int degreeCount = 0;

        for (int i = 1; i < wordToCheck.length(); i++) {
            String endWord = wordToCheck.substring(wordToCheck.length() - i, wordToCheck.length());
            String remainingWord = wordToCheck.substring(i, wordToCheck.length());
            String combinedWord = endWord + remainingWord;
            if (wordToCheck.equalsIgnoreCase(combinedWord)) {
                degreeCount = i;
            }
        }
        
        return degreeCount;
    }
}
