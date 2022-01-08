import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            
            int[] result = {};

            for (int i = 0; i < nums.length; ++i) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if ((nums[i] + nums[j]) == target) {
                        result = new int[] {i, j};
                        return result;
                    }
                    
                }
            } 

            return result;
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = temp.get(target - nums[i]);
                return result;
            }
            temp.put(nums[i], i);
        }

        return result;
    }

    public static void main (String [] args) {

        int[] nums = new int[] { 2, 3, 4, 5, 9, 11 };
        int target = 9;
        int[] result1 = Solution.twoSum(nums, target);
        int[] result2 = twoSum(nums, target);

        for (int result : result1) {
            System.out.println (result + " ");
        }

        for (int i : result2) {
            System.out.println (i + " ");
        }
    }
}