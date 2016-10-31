package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class YesterdayStockPriceCheckerTest {

    @Test
    public void returnsStockPrice() {
        YesterdayStockPriceChecker stockPriceChecker = new YesterdayStockPriceChecker();

        int[] expectedYesterdaysStockPrices = new int[] {10, 7, 5, 8, 11, 9};

        assertEquals(6, stockPriceChecker.getMaximumProfit(expectedYesterdaysStockPrices));
    }
}