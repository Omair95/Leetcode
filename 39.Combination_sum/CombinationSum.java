import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return null;
    }

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) ++l;
            else if (!Character.isLetterOrDigit(s.charAt(r))) --r;
            else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
                --r; ++l;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}