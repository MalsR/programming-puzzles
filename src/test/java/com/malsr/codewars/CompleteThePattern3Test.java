package com.malsr.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CompleteThePattern3Test {

    private String expectedPattern;
    private int patternNumber;

    public CompleteThePattern3Test(String expectedPattern, int patternNumber, String testCondition) {
        this.expectedPattern = expectedPattern;
        this.patternNumber = patternNumber;
    }

    @Parameterized.Parameters(name = "{2}")
    public static Collection<Object> setupData() {
        return Arrays.asList(new Object[][]{
                {"4\n" +
                        "43\n" +
                        "432\n" +
                        "4321", 4, "returnsPatternWhenNumberIsFour"},
                {"6\n" +
                        "65\n" +
                        "654\n" +
                        "6543\n" +
                        "65432\n" +
                        "654321", 6, "returnsPatternWhenNumberIsSix"},
                {"1", 1, "returnsPatternWhenNumberIsOne"},
                {"", 0, "returnsEmptyWhenNumberIsZero"},
                {"", -11,"returnsEmptyWhenNumberIsNegative"}
        });
    }

    @Test
    public void returnsPattern() {
        CompleteThePattern3 pattern3 = new CompleteThePattern3();

        assertEquals(expectedPattern, pattern3.pattern(patternNumber));
    }
}