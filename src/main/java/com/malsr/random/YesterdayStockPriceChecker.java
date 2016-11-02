package com.malsr.random;

public class YesterdayStockPriceChecker {

    public int getMaximumProfit(int[] stockPriceYesterday) {
        int overallProfit = Integer.MIN_VALUE;

        for (int i = 0; i < stockPriceYesterday.length; i++) {
            int stockPriceInTime = stockPriceYesterday[i];
            int profitMarginForStockPrice = Integer.MIN_VALUE;

            for (int y = i+1; y < stockPriceYesterday.length; y++) {
                int stockPriceInNextMinute = stockPriceYesterday[y];
                if (profitMarginForStockPrice < stockPriceInNextMinute - stockPriceInTime) {
                    profitMarginForStockPrice = stockPriceInNextMinute - stockPriceInTime;
                }
            }

            if (profitMarginForStockPrice > overallProfit) {
                overallProfit = profitMarginForStockPrice;
            }
        }
        return overallProfit;
    }
}
