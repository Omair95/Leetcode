
public class ProductOfArrayExceptSelf {

    // User prefix and postfix arrays to store results
    public static int[] productExceptSelfPreProFix(int[] nums) {

        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            if (i == 0) pre[i] = nums[i];
            else pre[i] = nums[i] * pre[i-1];
        }

        for (int i = nums.length - 1; i >= 0; --i) {
            if (i == (nums.length - 1)) post[i] = nums[i];
            else post[i] = nums[i] * post[i + 1];
        }

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            if (i == 0) {
                res[i] = post[i + 1];
            } else if (i == (nums.length - 1)) {
                res[i] = pre[i - 1];
            } else {
                res[i] = pre[i - 1] * post[i + 1];
            }
        }

        return res;
    }

    // In place pre post fix calculation
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prefix = 1;

        for (int i = 0; i < nums.length; ++i) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        int postFix = 1;

        for (int i = nums.length - 1; i >= 0; --i) {
            res[i] *= postFix;
            postFix *= nums[i];
        }

        return res;
    }

    public static void main (String [] args) {
        int[] result = productExceptSelf(new int[] {1, 2, 3, 4});
        for (var r : result) System.out.println(r);
    }
}