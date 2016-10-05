package com.malsr.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ReversingFunTest {

    public String actualValue;
    public String expectedValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"012345", "504132"},
                {"012", "201"},
                {"012345", "504132"},
                {"hello", "ohlel"},
                {"4ppso1vdjc9rjyf5bkmd5nztr8", "84rptpzsno51dvmdkjbc59fryj"}
        });
    }

    public ReversingFunTest(String actualValue, String expectedValue) {
        this.actualValue = actualValue;
        this.expectedValue = expectedValue;
    }

    @Test
    public void reversesStringByLength() {
        ReversingFun reversingFun = new ReversingFun();

        assertEquals(expectedValue, reversingFun.funReverse(actualValue));
    }

    @Test
    public void reversesString_AnotherWay() {
        ReversingFun reversingFun = new ReversingFun();

        assertEquals(expectedValue, reversingFun.funReverse_1(actualValue));
    }

    @Test
    public void reversesString_AnotherWay_2() {
        ReversingFun reversingFun = new ReversingFun();

        assertEquals(expectedValue, reversingFun.funReverse_2(actualValue));
    }
}