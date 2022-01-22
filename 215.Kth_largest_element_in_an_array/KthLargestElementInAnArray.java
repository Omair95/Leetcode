import java.util.Arrays;

public class KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            --k;
            if (k == 0) {
                res = nums[i];
                break;
            }
        }

        return res;
    }

    public static void main (String [] args) {
        System.out.println(findKthLargest(new int[] { 3,2,1,5,6,4 }, 2));
    }
}