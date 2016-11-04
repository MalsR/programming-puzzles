package com.malsr.random;

public class YesterdayStockPriceChecker {

    public int getMaximumProfit(int[] stockPriceYesterday) {
        int overallProfit = 0;

        for (int i = 0; i < stockPriceYesterday.length; i++) {
            int stockPriceInTime = stockPriceYesterday[i];

            for (int y = i+1; y < stockPriceYesterday.length; y++) {
                int stockPriceInNextMinute = stockPriceYesterday[y];
                int profitMarginForStockPrice = stockPriceInNextMinute - stockPriceInTime;

                overallProfit = Math.max(overallProfit, profitMarginForStockPrice);
            }
        }
        return overallProfit;
    }
}
