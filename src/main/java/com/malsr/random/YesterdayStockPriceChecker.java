package com.malsr.random;

public class YesterdayStockPriceChecker {

    public int getMaximumProfit(int[] stockPriceYesterday) {
        int overallProfit = Integer.MIN_VALUE;

        for (int i = 0; i <= stockPriceYesterday.length - 1; i++) {
            int stockPriceInTime = stockPriceYesterday[i];

            int profitMarginForStockPrice = Integer.MIN_VALUE;
            if (i+1 <= stockPriceYesterday.length-1) {
                for (int y = i+1; y <= stockPriceYesterday.length - 1; y++) {
                    int stockPriceInNextMinute = stockPriceYesterday[y];
                    if (profitMarginForStockPrice < stockPriceInNextMinute - stockPriceInTime) {
                        profitMarginForStockPrice = stockPriceInNextMinute - stockPriceInTime;
                    }
                }
            }

            if (profitMarginForStockPrice > overallProfit) {
                overallProfit = profitMarginForStockPrice;
            }
        }
        return overallProfit;
    }
}
