package dsa.Day10;

public class BuyAndSellStock1 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        //int[] prices = {7,6,4,3,1};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        int buyingCost = prices[0];
        for(int i=1;i< prices.length;i++) {
            if(prices[i] - buyingCost > profit) {
                profit = prices[i] - buyingCost;
            }
            buyingCost = Math.min(prices[i] , buyingCost);
        }
        return profit;
    }
}
