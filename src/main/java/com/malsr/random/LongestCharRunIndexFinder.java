package com.malsr.random;

public class LongestCharRunIndexFinder {

    public int getIndexOfLongestCharacterRun(String wordToCheck) {

        int highestNumberOfMatches = 0;
        int previousHighestNumOfMatches = 0;
        int lastIndexPos = 0;

        for (int i = 0; i <= wordToCheck.length() - 1; i++) {

            char charAtIndex = wordToCheck.charAt(i);

            if (i+1 <= wordToCheck.length() - 1) {
                //Then we can check the next char
                char nextCharFromI = wordToCheck.charAt(i + 1);

                if (charAtIndex == nextCharFromI)  {
                    highestNumberOfMatches += 1;
                } else {
                    if (highestNumberOfMatches > previousHighestNumOfMatches) {
                        previousHighestNumOfMatches = highestNumberOfMatches;
                        lastIndexPos = i;
                        highestNumberOfMatches = 0;
                    }

                }
            } else if (previousHighestNumOfMatches == 0 && highestNumberOfMatches > 0) {
                //When the longest run of chars is at the end of string with no other matches
                previousHighestNumOfMatches = highestNumberOfMatches;
                lastIndexPos = i;
            }
        }

        return lastIndexPos - previousHighestNumOfMatches;
    }
}
