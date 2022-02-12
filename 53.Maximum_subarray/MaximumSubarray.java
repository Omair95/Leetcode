

public class MaximumSubarray {

    // Keep track of the max at each point, update current sum if its less than 0
    // Kadanes algorithm
    public static int maxSubArray(int[] nums) {
        int l = 0, r = nums.length, maxSum = nums[0], currentSum = 0;

        while (l < r) {
            if (currentSum < 0) currentSum = nums[l];
            else currentSum += nums[l];
            maxSum = Math.max(maxSum, currentSum);
            ++l;
        }

        return maxSum;
    }

    public static void main (String[] args) {

        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));

    }
}