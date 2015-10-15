package com.malsr.random;

public class ZeroBasedStringFinder {


    public int getIndexOfLongestRun(String wordToCheck) {

        int longestRun = 0;
        int previousLongestRun = 0;
        int longestRunLastIndex = 0;

        for (int i = 0; i < wordToCheck.length() - 1; i++) {

            char charAtIndex = wordToCheck.charAt(i);

            //Check if we reached end of length
            if (i + 1 <= wordToCheck.length() -1) {
                char nextCharFromIndex = wordToCheck.charAt(i + 1);

                if (charAtIndex == nextCharFromIndex) {
                    //Finding the streak
                    longestRun += 1;
                } else {
                    //
                    if (longestRun > previousLongestRun) {
                        previousLongestRun = longestRun;
                        longestRunLastIndex = i;
                    }
                }
            }
        }

        return wordToCheck.charAt(longestRunLastIndex - (previousLongestRun - (previousLongestRun-1)));
    }
}
