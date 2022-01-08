import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], 1);
            else return true;
        }

        return false;
    }

    public static void main (String[] args) {

        int[] nums = new int[] { 3, 3 };

        System.out.println(containsDuplicate(nums));
     }
}