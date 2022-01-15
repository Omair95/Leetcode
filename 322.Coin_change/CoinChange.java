import java.util.Arrays;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i < amount + 1; ++i) {
            for (int j = 0; j < coins.length; ++j) {
                if ((i - coins[j]) >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }

        return dp[amount] != 0 ? dp[amount] : -1;
    }

    public static void main (String[] args) {
        System.out.println(coinChange(new int[] { 83, 186, 408, 419 }, 6249));
    }

}