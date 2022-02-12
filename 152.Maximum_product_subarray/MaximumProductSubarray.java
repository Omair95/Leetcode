import java.sql.SQLOutput;
import java.util.*;


public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int l = 0, r = nums.length, maxProd = nums[0], currentProd = 1;

        while (l < r) {
            if (currentProd < 0) currentProd = 1;
            currentProd *= nums[l];
            maxProd = Math.max(maxProd, currentProd);
            ++l;
        }

        return maxProd;
    }

    public static void main (String[] args) {

        System.out.println(maxProduct(new int[] {-2,0,-1}));

    }
}