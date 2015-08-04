package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class GarlandWordTest {

    @Test
    public void returnsOneWhenGivenWordIsGarlandWordWithDegreeOne() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(1, garlandWord.garland("ceramic"));
        assertEquals(1, garlandWord.garland2("ceramic"));
    }

    @Test
    public void returnsTwoWhenGivenWordIsGarlandWordWithDegreeTwo() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(2, garlandWord.garland("onion"));
        assertEquals(2, garlandWord.garland2("onion"));
    }

    @Test
    public void returnsFourWhenGivenWordIsGarlandWordWithDegreeFour() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(4, garlandWord.garland("alfalfa"));
        assertEquals(4, garlandWord.garland("hotshots"));
        assertEquals(4, garlandWord.garland("abracadabra"));

        assertEquals(4, garlandWord.garland2("alfalfa"));
        assertEquals(4, garlandWord.garland2("hotshots"));
        assertEquals(4, garlandWord.garland2("abracadabra"));
    }

    @Test
    public void returnsZeroWhenGivenWordIsNotGarlandWord() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(0, garlandWord.garland("programmer"));
        assertEquals(0, garlandWord.garland2("programmer"));
    }

    @Test
    public void returnsGiveWhenGiveWordIsGarlandWordWithDegreeFive() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(5, garlandWord.garland("undergrounder"));
        assertEquals(5, garlandWord.garland2("undergrounder"));
    }
}