package array;

public class MaxProfitStock {
    public static void main(String[] args) {
        int stockPrices[] = {100, 30, 15, 10, 8, 25, 80};
        calculateProfit(stockPrices);
    }

    private static void calculateProfit(int[] stockPrices) {
        int minStockPrice = stockPrices[0];
        int maxStockPrice = stockPrices[0];
        int profit = 0;
        int difference;

        for (int i = 1; i < stockPrices.length; i++) {
            if (minStockPrice > stockPrices[i]) {
                difference = maxStockPrice - minStockPrice;
                profit = profit + difference;
                minStockPrice = stockPrices[i];
                maxStockPrice = stockPrices[i];
            } else if (maxStockPrice < stockPrices[i]) {
                System.out.println(maxStockPrice);
            }

        }
        difference = maxStockPrice - minStockPrice;
        profit = profit + difference;
        System.out.println("Max Profit when buy and sell multi : " + profit);
    }
}
