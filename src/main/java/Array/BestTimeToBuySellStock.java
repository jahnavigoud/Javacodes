package Array;

//You are given an array of prices where prices[i] is the price of a given stock on an ith day.
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

//hint: Keep track of minPrice
//For each day:
//Profit = currentPrice - minPrice
//Update max profit

//Time: O(1) space :O(n)
public class BestTimeToBuySellStock {
    public static int maxProfit(int[] price){
        int minprofit = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int prices : price){
            if(prices < minprofit){
                minprofit = prices;
            }
            int profit = prices-minprofit;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {

        int[] prices1 = {7,1,5,3,6,4};
        System.out.println("Output 1: " + maxProfit(prices1));

        int[] prices2 = {7,6,4,3,1};
        System.out.println("Output 2: " + maxProfit(prices2));
    }
}
