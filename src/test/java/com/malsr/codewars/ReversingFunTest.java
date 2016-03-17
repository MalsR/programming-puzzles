package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversingFunTest {

    @Test
    public void reversesStringUpToSecondIndex() {
        ReversingFun reversingFun = new ReversingFun();

        assertEquals("504132", reversingFun.funReverse("012345"));
    }
}