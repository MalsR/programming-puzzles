package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseFactorialFinderTest {

    @Test
    public void returnsCorrectReverseFactorial() {
        ReverseFactorialFinder reverseFactorial = new ReverseFactorialFinder();

        assertEquals("5!", reverseFactorial.getReverseFactorial(120));
        assertEquals("3!", reverseFactorial.getReverseFactorial(6));
        assertEquals("NONE", reverseFactorial.getReverseFactorial(18));
        assertEquals("NONE", reverseFactorial.getReverseFactorial(150));
        assertEquals("12!", reverseFactorial.getReverseFactorial(479001600));
        assertEquals("10!", reverseFactorial.getReverseFactorial(3628800));
        assertEquals("2!", reverseFactorial.getReverseFactorial(2));
        assertEquals("NONE", reverseFactorial.getReverseFactorial(3));
    }
}