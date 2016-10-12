package com.malsr.random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ReverseFactorialFinderTest {

    private String expectedReversal;
    private int numberToCheck;

    public ReverseFactorialFinderTest(String expectedReversal, int numberToCheck) {
        this.expectedReversal = expectedReversal;
        this.numberToCheck = numberToCheck;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> setupData() {
        return Arrays.asList(new Object[][]{
                {"5!", 120},
                {"3!", 6},
                {"NONE", 18},
                {"NONE", 150},
                {"12!", 479001600},
                {"10!", 3628800},
                {"2!", 2},
                {"NONE", 3}
        });
    }

    @Test
    public void returnsCorrectReverseFactorial() {
        ReverseFactorialFinder reverseFactorial = new ReverseFactorialFinder();

        assertEquals(expectedReversal, reverseFactorial.getReverseFactorial(numberToCheck));
    }
}