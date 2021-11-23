
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(longestPrefix) != 0) {
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
            }
        }

        return longestPrefix.toString();
    }

    public static void main (String [] args) {
        String[] s1 = { "flower", "flow", "flight" };
        String[] s2 = {"dog", "racecar", "car"};
       
        System.out.println(s1.toString() + " " + longestCommonPrefix(s1));
        System.out.println(s2.toString() + " " + longestCommonPrefix(s2));
         
    }
}
