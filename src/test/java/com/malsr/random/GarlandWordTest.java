package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class GarlandWordTest {

    @Test
    public void returnsOneWhenGivenWordIsGarlandWordWithDegreeOne() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(1, garlandWord.garland("ceramic"));
    }

    @Test
    public void returnsTwoWhenGivenWordIsGarlandWordWithDegreeTwo() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(2, garlandWord.garland("onion"));
    }

    @Test
    public void returnsFourWhenGivenWordIsGarlandWordWithDegreeFour() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(4, garlandWord.garland("alfalfa"));
        assertEquals(4, garlandWord.garland("hotshots"));
        assertEquals(4, garlandWord.garland("abracadabra"));
    }

    @Test
    public void returnsZeroWhenGivenWordIsNotGarlandWord() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(0, garlandWord.garland("programmer"));
    }

    @Test
    public void returnsGiveWhenGiveWordIsGarlandWordwithDegreeFive() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(5, garlandWord.garland("undergrounder"));
    }
}