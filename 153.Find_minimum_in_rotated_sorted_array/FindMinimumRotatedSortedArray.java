

public class FindMinimumRotatedSortedArray {

    public static int findMin(int[] nums) {
        int l = 0, r = nums.length - 1, min = nums[0];

        while (l <= r) {
            if (nums[l] < nums[r]) {
                min = Math.min(min, nums[l]);
                return min;
            }

            int m = (l+r)/2;
            min = Math.min(min, nums[m]);

            if (nums[m] >= nums[l]) l = m + 1;
            else r = m - 1;
        }

        return min;
    }

    public static void main (String[] args) {

        System.out.println(findMin(new int[] { 4, 5, 1, 2, 3}));
        System.out.println(findMin(new int[] { 4,5,6,7,0,1,2}));
    }
}