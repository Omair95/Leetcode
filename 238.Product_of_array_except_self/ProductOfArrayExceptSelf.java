
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int totalMult = 1;
        for (var num : nums) totalMult = totalMult*num;
        int result [] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = totalMult/nums[i];
        }

        return result;
    }

    public static void main (String [] args) {
        int[] test1 = {1, 2, 3};
        int[] result = productExceptSelf(test1);
        for (var r : result) System.out.println(r);
    }
}