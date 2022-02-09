import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock {

    // Two pointers pattern, keep track of max
    public static int maxProfit(int[] prices) {
        int l = 0, r = 1, max = 0;

        while (r < prices.length) {
            int p = prices[r] - prices[l];
            max = Math.max(max, p);

            if (p < 0) {
                ++l;
                if (l == r) ++r;
            }
            else ++r;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max profit = " + maxProfit(new int[] {7, 1, 4, 6, 2}));
        System.out.println("Max profit = " + maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
        System.out.println("Max profit = " + maxProfit(new int[] {7, 6, 4, 3, 1}));
    }
}