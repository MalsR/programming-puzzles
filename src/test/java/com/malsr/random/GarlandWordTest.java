package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class GarlandWordTest {

    @Test
    public void returnsOneWhenGivenWordIsGarlandWordWithDegreeOne() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(1, garlandWord.garland("ceramic"));
        assertEquals(1, garlandWord.garland2("ceramic"));
        assertEquals(1, garlandWord.garland3("ceramic"));
    }

    @Test
    public void returnsTwoWhenGivenWordIsGarlandWordWithDegreeTwo() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(2, garlandWord.garland("onion"));
        assertEquals(2, garlandWord.garland2("onion"));
        assertEquals(2, garlandWord.garland3("onion"));
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

        assertEquals(4, garlandWord.garland3("alfalfa"));
        assertEquals(4, garlandWord.garland3("hotshots"));
        assertEquals(4, garlandWord.garland3("abracadabra"));
    }

    @Test
    public void returnsZeroWhenGivenWordIsNotGarlandWord() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(0, garlandWord.garland("programmer"));
        assertEquals(0, garlandWord.garland2("programmer"));
        assertEquals(0, garlandWord.garland3("programmer"));
    }

    @Test
    public void returnsFiveWhenGiveWordIsGarlandWordWithDegreeFive() {
        GarlandWord garlandWord = new GarlandWord();

        assertEquals(5, garlandWord.garland("undergrounder"));
        assertEquals(5, garlandWord.garland2("undergrounder"));
        assertEquals(5, garlandWord.garland3("undergrounder"));
    }
}