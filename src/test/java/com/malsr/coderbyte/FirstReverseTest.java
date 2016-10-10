package com.malsr.coderbyte;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FirstReverseTest {

    private String stringToReverse;
    private String reversedString;

    public FirstReverseTest(String stringToReverse, String reversedString) {
        this.stringToReverse = stringToReverse;
        this.reversedString = reversedString;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> setUpData() {
        return Arrays.asList(new Object[][]{
                {"Blink 182", "281 knilB"},
                {"Hello", "olleH"}
        });
    }

    @Test
    public void returnsReversedString() {
        FirstReverse firstReverse = new FirstReverse();

        assertEquals(reversedString, firstReverse.reverse(stringToReverse));
    }

    @Test
    public void returnsReversedString_LongerWay() {
        FirstReverse firstReverse = new FirstReverse();

        assertEquals(reversedString, firstReverse.reverse_1(stringToReverse));
    }

    //below two get run twice!
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
}