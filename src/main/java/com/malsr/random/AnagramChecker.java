package com.malsr.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class AnagramChecker {

    public boolean areAnagrams(String wordA, String wordB) {
        int[] wordASortedArray = wordA.toLowerCase().chars()
                                                .filter(Character::isAlphabetic)
                                                .sorted()
                                                .toArray();
        int[] wordBSortedArray = wordB.toLowerCase().chars()
                                                .filter(Character::isAlphabetic)
                                                .sorted()
                                                .toArray();

        return Arrays.equals(wordASortedArray, wordBSortedArray);
    }

    /*
    Another way of checking for anagrams using maps
     */
    public boolean areAnagrams_1(String wordA, String wordB) {
        Map<Character, Integer> wordACharCount = getMapOfCharacterCounts(wordA.toLowerCase());
        Map<Character, Integer> wordBCharCount = getMapOfCharacterCounts(wordB.toLowerCase());

        //One quick way to check is by creating a map, where the key is a Character and value represents number of times
        //those characters are found in a word. By checking the equality of the two maps we can find if two words are
        //anagrams or not.
        return wordACharCount.equals(wordBCharCount);
    }

    private Map<Character, Integer> getMapOfCharacterCounts(String wordToCheck) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < wordToCheck.length(); i ++) {
            char charAtIndex = wordToCheck.charAt(i);
            if (charAtIndex != ' ') {
                if (result.containsKey(charAtIndex)) {
                    Integer countOfChar = result.get(charAtIndex) + 1;
                    result.put(charAtIndex, countOfChar);
                } else {
                    result.put(charAtIndex, 1);
                }
            }
        }

        return result;
    }
}
