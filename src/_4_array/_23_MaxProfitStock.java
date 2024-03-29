package _4_array;

public class _23_MaxProfitStock {

    public static void main(String[] args) {
        int[] stockPrices = {5, 2, 6, 1, 4};
        //System.out.println(maxProfit(stockPrices));
         System.out.println(maxProfitNTransaction(stockPrices));
    }

    //if only one transaction (1 buy and 1 sell)
    public static int maxProfit(int[] prices) {
        int minBuyPrice = prices[0];
        int profitIfSoldToday = 0;
        int overAllProfit = 0;
        for (int i = 0; i < prices.length; i++) {
           /* if (minBuyPrice > prices[i]) {
                minBuyPrice = prices[i];
            }*/
            minBuyPrice = Math.min(minBuyPrice, prices[i]);
            profitIfSoldToday = prices[i] - minBuyPrice;
            /*if (profitIfSoldToday > overAllProfit) {
                overAllProfit = profitIfSoldToday;
            }*/
            overAllProfit = Math.max(profitIfSoldToday, overAllProfit);
        }
        return overAllProfit;
    }

    //if transactions are N
    public static int maxProfitNTransaction(int[] stockPrices) {
        int totalProfit = 0;
        for (int i = 1; i < stockPrices.length; i++) {
            if (stockPrices[i] > stockPrices[i - 1]) {
                totalProfit += stockPrices[i] - stockPrices[i - 1];
            }
        }
        return totalProfit;
    }

}
