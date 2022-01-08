import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int left = 0, right = 1, maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stocksPrices = new int[] {7, 1, 4, 6, 2};
        System.out.println("Max profit = " + maxProfit(stocksPrices));
    }
}