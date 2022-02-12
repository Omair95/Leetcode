

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int l = 0, r = 1, max = 0, sum = nums[l];

        while (r < nums.length) {
            sum += nums[r];
            if (sum < max) {
                sum = nums[r];
                ++l;
                if (l == r) ++r;
            }
            ++r;
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main (String[] args) {

        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));

    }
}