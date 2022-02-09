import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; ++i) {
            if ((i + 1) < nums.length && nums[i] == nums[i + 1]) return true;
        }

        return false;
    }

    public static void main (String[] args) {
        System.out.println(containsDuplicate(new int[] { 3, 3 }));
        System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
     }
}