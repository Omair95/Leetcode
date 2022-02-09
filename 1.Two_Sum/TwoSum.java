import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // Brute force
    public static int[] twoSumBruteForce(int[] nums, int target) {
        int[] res = new int[] {};

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if ((nums[i] + nums[j]) == target) {
                    res = new int[] { i, j };
                    return res;
                }
            }
        }

        return res;
    }

    // Using auxiliary hashmap to store visited numbers
    public static int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] res = new int[] {};

        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res = new int[] { i, m.get(target - nums[i]) };
                return res;
            }

            m.put(nums[i], i);
        }

        return res;
    }

    // Using two pointers pattern
    public static int[] twoSumTwoPointers(int[] nums, int target) {
        int[] copy = nums.clone();
        Arrays.sort(nums);

        int l = 0, r = nums.length - 1, i = 0, j = 0;

        while (l <= r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                i = nums[l];
                j = nums[r];
                break;
            }
            else if (sum < target) ++l;
            else --r;
        }

        int res1 = 0, res2 = 0;

        for (int k = 0; k < copy.length; ++k) {
            if (copy[k] == i && res1 == 0) res1 = k;
            if (copy[k] == j && k != res1) res2 = k;
        }

        return new int[] { res1, res2 };
    }

    public static void main (String [] args) {
        System.out.println(Arrays.toString(twoSumBruteForce(new int[] { 2, 3, 4, 5, 9, 11 }, 11)));
        System.out.println(Arrays.toString(twoSumHashMap(new int[] { 2, 3, 4, 5, 9, 11 }, 11)));
        System.out.println(Arrays.toString(twoSumTwoPointers(new int[] { 2, 5, 5, 11 }, 10)));
    }
}