// Testing runtime 3 ms
public class TwoPointerSolution {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int buyDay = 0;
        int sellDay = 1;
        while(sellDay < prices.length){
            if(prices[buyDay] < prices[sellDay]){
                int profit = prices[sellDay] - prices[buyDay];
                if(profit > max) max = profit;
            }
            else buyDay = sellDay;
            sellDay++;
        }
        return max;
    }
}