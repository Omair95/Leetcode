import java.util.HashMap;

public class FindFirstPalindromicStringInTheArray {
    public static boolean palindrome(String s) {
        int l = 0, r = s.length() - 1;
        HashMap<Character, Character> m = new HashMap<>();

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            ++l;
            --r;
        }

        return true;
    }

    public static String firstPalindrome(String[] words) {
        String res = "";
        for (int i = 0; i < words.length; ++i) {
            if (palindrome(words[i])) {
                res = words[i];
                return res;
            }
        }
        return res;
    }

    public static void main (String [] args) {
        System.out.println(firstPalindrome(new String[] { "notapalindrome", "racecar" }));
    }
}