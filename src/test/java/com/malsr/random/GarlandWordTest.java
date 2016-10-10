package com.malsr.random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GarlandWordTest {

    private int expectedGarlandDegree;
    private String wordToCheck;

    public GarlandWordTest(int expectedGarlandDegree, String wordToCheck) {
        this.expectedGarlandDegree = expectedGarlandDegree;
        this.wordToCheck = wordToCheck;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> setupData() {
        return Arrays.asList(new Object[][] {
                {1, "ceramic"},
                {2, "onion"},
                {4, "alfalfa"},
                {4, "hotshots"},
                {4, "abracadabra"},
                {0, "programmer"},
                {5, "undergrounder"}

        });
    }

    @Test
    public void returnsCorrectWordDegreeForPotentialGarlandWord() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(expectedGarlandDegree, garlandWord.garland(wordToCheck));
    }

    @Test
    public void returnsCorrectWordDegreeForPotentialGarlandWord_2() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(expectedGarlandDegree, garlandWord.garland2(wordToCheck));
    }

    @Test
    public void returnsCorrectWordDegreeForPotentialGarlandWord_3() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(expectedGarlandDegree, garlandWord.garland3(wordToCheck));
    }
}