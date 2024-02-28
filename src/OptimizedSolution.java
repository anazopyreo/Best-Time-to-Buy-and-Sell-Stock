// Testing runtime 1 ms
public class OptimizedSolution {
    public static int maxProfit(int[] prices) {
        int lowPrice = Integer.MAX_VALUE;
        int highProfit = 0;
        for(int currentPrice : prices){
            lowPrice = Math.min(lowPrice, currentPrice);
            highProfit = Math.max(highProfit, currentPrice - lowPrice);
        }
        return highProfit;
    }
}