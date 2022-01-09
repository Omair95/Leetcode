

public class SearchInRotatedSortedArray  {

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, res = -1;

        while (l <= r) {
            int m = (l + r)/2;
            if (nums[m] == target) {
                res = m;
                return res;
            }
            if (nums[l] <= nums[m]) {
                if (target > nums[m]) l = m + 1;
                else if (target < nums[l]) l = m + 1;
                else r = m - 1;
            }
            else {
                if (target < nums[m]) r = m - 1;
                else if (target > nums[r]) r = m - 1;
                else l = m + 1;
            }
        }
        return res;
    }

    public static void main (String[] args) {
        System.out.println(search(new int[] { 1 }, 1));
    }
}