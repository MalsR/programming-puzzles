package com.malsr.random;

import java.util.Arrays;

public class YesterdayStockPriceChecker {

    public int getMaximumProfit(int[] stockPriceYesterday) {
        int lowestStockPrice = 0;
        int lowestStockPriceIndexPos = -1;

        for (int i = 0; i < stockPriceYesterday.length; i++) {
            int stockPrice = stockPriceYesterday[i];

            if (i == 0) {
                lowestStockPrice = stockPrice;
            }

            if (lowestStockPrice > stockPrice) {
                lowestStockPrice = stockPrice;
                lowestStockPriceIndexPos = i;
            }
        }

        //Now calculate the highest stock price after the time of the lowest stock price
        Arrays.sort(stockPriceYesterday, lowestStockPriceIndexPos + 1, stockPriceYesterday.length);

        int highestStockPrice = stockPriceYesterday[stockPriceYesterday.length-1];

        return highestStockPrice - lowestStockPrice;
    }
}
