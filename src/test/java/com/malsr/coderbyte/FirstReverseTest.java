package com.malsr.coderbyte;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstReverseTest {

    @Test
    public void returnsNullWhenGivenStringIsNull() {
        FirstReverse firstReverse = new FirstReverse();

        assertNull("Expected null to be returned", firstReverse.reverse(null));
    }

    @Test
    public void returnsNullWhenGivenStringIsEmpty() {
        FirstReverse firstReverse = new FirstReverse();

        assertNull("Expected null to be returned", firstReverse.reverse(null));
    }

    @Test
    public void returnsReversedString() {
        FirstReverse firstReverse = new FirstReverse();

        String actualReversedString = firstReverse.reverse("Hello");

        assertEquals("Expected reversed string " + actualReversedString + " to be returned", "olleH", actualReversedString);
    }

    @Test
    public void returnsReveredStringContainingNumbers() {
        FirstReverse firstReverse = new FirstReverse();

        String actualReversedString = firstReverse.reverse("Blink 182");

        assertEquals("Expected reversed string " + actualReversedString + "to be returned", "281 knilB", actualReversedString);
    }
}