package com.malsr.random;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public boolean areAnagrams(String wordA, String wordB) {

        Map<Character, Integer> wordACharCount = getMapOfCharacterCounts(wordA);
        Map<Character, Integer> wordBCharCount = getMapOfCharacterCounts(wordB);

        //One quick way to check is by creating a map, where the key is a Character and value represents number of times
        //those characters are found in a word. By checking the equality of the two maps we can find if two words are
        //anagrams or not.
        return wordACharCount.equals(wordBCharCount);
    }

    private Map<Character, Integer> getMapOfCharacterCounts(String wordToCheck) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < wordToCheck.length(); i ++) {
            char charAtIndex = wordToCheck.charAt(i);
            if (result.containsKey(charAtIndex)) {
                Integer countOfChar = result.get(charAtIndex);
                result.put(charAtIndex, countOfChar++);
            } else {
                result.put(charAtIndex, 1);
            }
        }

        return result;
    }
}
