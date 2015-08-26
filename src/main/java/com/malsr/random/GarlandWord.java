package com.malsr.random;

public class GarlandWord {

    //Using String.substring to break the word and compare if word starts and ends with same n order
    public int garland(final String wordToCheck) {
        int degreeCount = 0;
        int lengthOfWord = wordToCheck.length();

        for (int i = 1; i < lengthOfWord; i++) {
            /* Take word ceramic for example,
             * e.g. when i = 1 then end word is 'c'
             * e.g. when i = 2 then end word is 'ic'
             */
            String endWord = wordToCheck.substring(lengthOfWord - i, lengthOfWord);

            /* Remaining word is start of the word from 'i' until the beginning of the 'endWord'
             * e.g. when i = 1 then remainingWord is 'eramic'
             * e.g. when i = 2 then remainingWord is 'ramic'
             */
            String remainingWord = wordToCheck.substring(i, lengthOfWord);

            // Then by combining the endWord with remaining if its equal to wordToCheck then its a garland word!
            String combinedWord = endWord + remainingWord;

            if (wordToCheck.equalsIgnoreCase(combinedWord)) {
                //Do not want to break here as we want to calculate max degree of garland words
                degreeCount = i;
            }
        }
        
        return degreeCount;
    }

    //Using String.startsWith by finding the end word(s)
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

    //Using String.endsWith by finding the start word(s)
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
