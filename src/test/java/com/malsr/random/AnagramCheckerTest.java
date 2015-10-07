package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Test
    public void returnsTrueIfGivenWordsAreAnagrams() {
        AnagramChecker anagramChecker = new AnagramChecker();

        assertTrue(anagramChecker.areAnagrams("orchestra", "carthorse"));
        assertTrue(anagramChecker.areAnagrams("momdad", "dadmom"));
    }

    @Test
    public void returnsFalseIfGivenWordsAreNotAnagrams() {
        AnagramChecker anagramChecker = new AnagramChecker();

        assertFalse(anagramChecker.areAnagrams("tab", "bate"));
    }
}