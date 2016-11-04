package com.malsr.random;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YesterdayStockPriceCheckerTest {

    @Test
    public void returnsMaxProfitOnLowestStockPrice() {
        YesterdayStockPriceChecker stockPriceChecker = new YesterdayStockPriceChecker();

        int[] expectedYesterdaysStockPrices = new int[] {10, 7, 5, 8, 11, 9};

        assertEquals(6, stockPriceChecker.getMaximumProfit(expectedYesterdaysStockPrices));
    }

    @Test
    public void returnsMaxProfitWhenStockPriceDipsAtTheEnd() {
        YesterdayStockPriceChecker stockPriceChecker = new YesterdayStockPriceChecker();

        int[] expectedYesterdaysStockPrices = new int[] {10, 12, 9, 10, 10, 2};

        assertEquals(2, stockPriceChecker.getMaximumProfit(expectedYesterdaysStockPrices));
    }

    @Test
    @Ignore
    public void returnsMaxProfitWhenStockPricesFallsConsistently() {
        YesterdayStockPriceChecker stockPriceChecker = new YesterdayStockPriceChecker();

        int[] expectedYesterdaysStockPrices = new int[] {500, 480, 450, 320, 299, 80, 20};

        assertEquals(-20, stockPriceChecker.getMaximumProfit(expectedYesterdaysStockPrices));
    }

    @Test
    public void returnsMaxProfitWhenStockPricesRiceConsistently() {
        YesterdayStockPriceChecker stockPriceChecker = new YesterdayStockPriceChecker();

        int[] expectedYesterdaysStockPrices = new int[] {20, 22, 35, 50, 52, 65, 77, 78, 100};

        assertEquals(80, stockPriceChecker.getMaximumProfit(expectedYesterdaysStockPrices));
    }
}