package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroBasedStringFinderTest {

    @Test
    public void returnsIndexOfTheLongestCharRun() {
        ZeroBasedStringFinder zeroBasedStringFinder = new ZeroBasedStringFinder();

        assertEquals(6, zeroBasedStringFinder.getIndexOfLongestCharacterRun("abbcccddddcccbba"));
    }

    @Test
    public void alwaysReturnsIndexOfFirstLongestCharRun() {
        //Example where you have more than instance of chars of same length in string but always returns first
        //better name?
        ZeroBasedStringFinder zeroBasedStringFinder = new ZeroBasedStringFinder();

        assertEquals(2, zeroBasedStringFinder.getIndexOfLongestCharacterRun("abcccxpppa"));
    }

    @Test
    public void returnsIndexOfLongestCharRunWhenInEndOfString() {
        ZeroBasedStringFinder zeroBasedStringFinder = new ZeroBasedStringFinder();

        assertEquals(3, zeroBasedStringFinder.getIndexOfLongestCharacterRun("xcvmmm"));
    }
}