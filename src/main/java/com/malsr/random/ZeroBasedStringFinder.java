package com.malsr.random;

public class ZeroBasedStringFinder {

    public int getIndexOfLongestRun(String wordToCheck) {

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
                    lastIndexPos = i + 1;
                } else {
                    if (highestNumberOfMatches > previousHighestNumOfMatches) {
                        previousHighestNumOfMatches = highestNumberOfMatches;
                        lastIndexPos = i + 1;
                    }

                }
            }
        }

        return lastIndexPos - previousHighestNumOfMatches;
    }
}
