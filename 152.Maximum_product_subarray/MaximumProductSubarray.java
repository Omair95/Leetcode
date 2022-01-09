import java.sql.SQLOutput;
import java.util.*;


public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int max = nums[0], min = nums[0], maxProd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > maxProd) maxProd = max;
        }
        return maxProd;
    }

    public static void main (String[] args) {

        System.out.println(maxProduct(new int[] {-3, -1, -1}));

    }
}