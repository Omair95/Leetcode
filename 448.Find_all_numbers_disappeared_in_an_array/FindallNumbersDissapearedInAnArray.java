import java.util.ArrayList;
import java.util.List;

public class FindallNumbersDissapearedInAnArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        for (int i = 0; i < nums.length; ++i) {
            int index = nums[i];
            if (nums[Math.abs(index) - 1] > 0) {
                nums[Math.abs(index) - 1] = nums[Math.abs(index) - 1] * (-1);
            }
        }

        List<Integer> res = new ArrayList<>();

        for (int j = 1; j <= nums.length; j++) {
            if (nums[j - 1] > 0) res.add(j);
        }

        return res;
    }

    public static void main (String [] args) {
        List<Integer> res = findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1});
        res.stream().forEach(x -> System.out.println(x));
    }
}