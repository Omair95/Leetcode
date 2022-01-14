import java.util.Arrays;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int s = 0, c = 0;
        int i = coins.length - 1;
        while (i >= 0) {
            if (s == amount) return c;
            else if ( (s + coins[i] > amount)) --i;
            else {
                s += coins[i];
                ++c;
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        System.out.println(coinChange(new int[] { 83, 186, 408, 419 }, 6249));
    }

}