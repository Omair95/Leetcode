import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumBruteForce(int[] nums, int target) {

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

    public static int[] twoSumHashMap(int[] nums, int target) {
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

    public static int[] twoSumPointers(int[] nums, int target) {
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums2);

        int a = 0, b = 0;
        int l = 0, r = nums2.length-1;

        while(l < r){
            int sum = nums2[l] + nums2[r];
            if(sum < target)
                l++;
            else if(sum > target)
                r--;
            else{
                a = nums2[l];
                b = nums2[r];
                break;
            }
        }


        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == a) {
                res[0] = i;
                break;
            }
        }

        if(a != b) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == b) {
                    res[1] = i;
                    break;
                }
            }
        } else {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == b && i != res[0]) {
                    res[1] = i;
                    break;
                }
            }
        }

        return res;
    }

    public static void main (String [] args) {
        System.out.println(Arrays.toString(twoSumBruteForce(new int[] { 2, 3, 4, 5, 9, 11 }, 11)));
        System.out.println(Arrays.toString(twoSumHashMap(new int[] { 2, 3, 4, 5, 9, 11 }, 11)));
        System.out.println(Arrays.toString(twoSumPointers(new int[] { 2, 3, 4, 5, 9, 11 }, 11)));
    }
}