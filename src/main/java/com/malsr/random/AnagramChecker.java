package com.malsr.random;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public boolean areAnagrams(String wordA, String wordB) {

        Map<Character, Integer> wordACharCount = getMapOfCharacterCounts(wordA);
        Map<Character, Integer> wordBCharCount = getMapOfCharacterCounts(wordB);

        //One quick way to check, by creating a map of one word's chars and the number of times its used in word
        //and compare that against the other word
        return wordACharCount.equals(wordBCharCount);
    }

    private Map<Character, Integer> getMapOfCharacterCounts(String wordToCheck) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < wordToCheck.length(); i ++) {
            char charAtIndex = wordToCheck.charAt(i);
            if (result.containsKey(charAtIndex)) {
                Integer countOfChar = result.get(charAtIndex);
                result.put(charAtIndex, countOfChar + 1);
            } else {
                result.put(charAtIndex, 1);
            }
        }

        return result;
    }
}
