
public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0, t = 0, m = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; ++r) {
            t += nums[r];

            while (t >= target) {
                m = Math.min((r - l) + 1, m);
                t -= nums[l];
                ++l;
            }
        }

        return m == Integer.MAX_VALUE ? 0 : m;
    }

    public static void main (String [] args) {
        System.out.println(minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }));
    }
}