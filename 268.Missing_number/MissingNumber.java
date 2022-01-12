import java.util.HashMap;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1))/2, currentSum = 0;
        for (int nu : nums) {
            currentSum += nu;
        }
        return expectedSum - currentSum;
    }

    public static void main (String[] args) {
        System.out.println(missingNumber(new int[] { 3, 0, 1 }));
        System.out.println(missingNumber(new int[] { 0, 1 }));
        System.out.println(missingNumber(new int[] { 9,6,4,2,3,5,7,0,1 }));
    }
}