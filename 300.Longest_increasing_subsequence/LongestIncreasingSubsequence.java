
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length + 1];
        dp[0] = 1;

        for (int i = 1; i < dp.length; ++i) {

        }

        return dp[nums.length];
    }

    public static void main (String[] args) {

    }
}