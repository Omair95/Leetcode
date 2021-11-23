
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

    public static void main (String [] args) {

        int[] nums = new int[] { 2, 3, 4, 5, 9, 11 };
        int target = 9;
        int[] result = Solution.twoSum(nums, target);

        for (int i : result) {
            System.out.println (i + " ");
        }
    }
}