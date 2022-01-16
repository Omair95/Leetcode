
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        String res = "";
        int cLen = 0;
        for (int i = 0; i < s.length(); ++i) {
            int l = i, r = i;

            // Odd string case
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > cLen) {
                    res = s.substring(l, r + 1);
                    cLen = res.length();
                }
                --l;
                ++r;
            }

            // Even strings case
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > cLen) {
                    res = s.substring(l, r + 1);
                    cLen = res.length();
                }
                --l;
                ++r;
            }
        }

        return res;
    }

    public static void main (String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}