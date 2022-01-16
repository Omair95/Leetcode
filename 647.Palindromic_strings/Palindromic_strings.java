
public class Palindromic_strings {

    public static int countSubstrings(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {

            // Odd string
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                ++n;
                --l;
                ++r;
            }

            // Even string

            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                ++n;
                --l;
                ++r;
            }
        }
        return n;
    }

    public static void main (String [] args) {
        System.out.println(countSubstrings("aaa"));
    }
}