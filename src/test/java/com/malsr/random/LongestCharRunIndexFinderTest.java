package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCharRunIndexFinderTest {

    @Test
    public void returnsIndexOfTheLongestCharRun() {
        LongestCharRunIndexFinder longestCharRunIndexFinder = new LongestCharRunIndexFinder();

        assertEquals(6, longestCharRunIndexFinder.getIndexOfLongestCharacterRun("abbcccddddcccbba"));
    }

    @Test
    public void alwaysReturnsIndexOfFirstLongestCharRun() {
        //Example where you have more than instance of chars of same length in string but always returns first
        //better name?
        LongestCharRunIndexFinder longestCharRunIndexFinder = new LongestCharRunIndexFinder();

        assertEquals(2, longestCharRunIndexFinder.getIndexOfLongestCharacterRun("abcccxpppa"));
    }

    @Test
    public void returnsIndexOfLongestCharRunWhenInEndOfString() {
        LongestCharRunIndexFinder longestCharRunIndexFinder = new LongestCharRunIndexFinder();

        assertEquals(3, longestCharRunIndexFinder.getIndexOfLongestCharacterRun("xcvmmm"));
    }

    @Test
    public void returnsIndexOfLongestCharRunInStartOfString() {
        LongestCharRunIndexFinder longestCharRunIndexFinder = new LongestCharRunIndexFinder();

        assertEquals(0, longestCharRunIndexFinder.getIndexOfLongestCharacterRun("ssssaccb"));
    }
}