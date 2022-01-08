

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
       int maxSum = nums[0], currentSum = 0;

       for (var n : nums) {
           if (currentSum < 0) currentSum = 0;
           currentSum += n;
           maxSum = Math.max(currentSum, maxSum);
       }

       return maxSum;
    }

    public static void main (String[] args) {

        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));

    }
}