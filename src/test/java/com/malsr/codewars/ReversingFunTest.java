package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversingFunTest {

    @Test
    public void reversesString() {
        //To start off with
        ReversingFun reversingFun = new ReversingFun();

        assertEquals("543210", reversingFun.funReverse("012345"));
    }
}