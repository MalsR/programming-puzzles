package com.malsr.coderbyte;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstReverseTest {

    @Test
    public void returnsNullWhenGivenStringIsNull() {
        FirstReverse firstReverse = new FirstReverse();

        assertNull(firstReverse.reverse(null));
    }

    @Test
    public void returnsNullWhenGivenStringIsEmpty() {
        FirstReverse firstReverse = new FirstReverse();

        assertNull(firstReverse.reverse(null));
    }

    @Test
    public void returnsReversedString() {
        FirstReverse firstReverse = new FirstReverse();

        assertEquals("olleH", firstReverse.reverse("Hello"));
    }
}