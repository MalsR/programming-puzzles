package com.malsr.random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnagramCheckerTest {

    @Parameterized.Parameters
    public static Collection<Object[]> setupData() {
        return Arrays.asList(new Object[][] {
                {"orchestra", "carthorse", true},
                {"momdad", "dadmom", true},
                {"tab", "bate", false},
                {"hello man", "nam hell o", true},
                {"Clint Eastwood", "Old West Action", true}
        });
    }

    private String stringAToCompare;
    private String stringBToCompare;
    private boolean expectedResult;

    public AnagramCheckerTest(String stringAToCompare, String stringBToCompare, boolean expectedResult) {
        this.stringAToCompare = stringAToCompare;
        this.stringBToCompare = stringBToCompare;
        this.expectedResult = expectedResult;
    }

    @Test
    public void returnsTrueIfBothWordsAreAnagrams() {
        AnagramChecker anagramChecker = new AnagramChecker();

        assertEquals(expectedResult, anagramChecker.areAnagrams_1(stringAToCompare, stringBToCompare));
    }

    @Test
    public void returnsIfBothWordsAreAnagrams_AnotherWay() {
        AnagramChecker anagramChecker = new AnagramChecker();

        assertEquals(expectedResult, anagramChecker.areAnagrams(stringAToCompare, stringBToCompare));
    }
}