package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroBasedStringFinderTest {

    @Test
    public void returnsIndexOfTheLongestCharRun() {
        ZeroBasedStringFinder zeroBasedStringFinder = new ZeroBasedStringFinder();

        assertEquals(6, zeroBasedStringFinder.getIndexOfLongestRun("abbcccddddcccbba"));
    }
}