import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }

        for (int i = 0; i < t.length(); ++i) {
            char c = t.charAt(i);

            if (map.containsKey(c)) {
                int v = map.get(c);
                if (v == 1) map.remove(c);
                else map.put(c, --v);
            } else return false;
        }

        return map.size() == 0;
    }

    public static void main (String [] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}