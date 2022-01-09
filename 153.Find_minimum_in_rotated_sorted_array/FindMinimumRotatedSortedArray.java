

public class FindMinimumRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, res = nums[0];

        while (left <= right) {
            if (nums[left] < nums[right]) {
                res = Math.min(res, nums[left]);
                return res;
            }

            int middle = (right + left)/2;
            res = Math.min(res, nums[middle]);
            if (nums[middle] >= nums[left]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return res;
    }

    public static void main (String[] args) {

        System.out.println(findMin(new int[] { 4, 5, 1, 2, 3}));
    }
}