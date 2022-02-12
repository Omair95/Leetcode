
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int r = 0;

        for (int i = 0; i < stones.length(); ++i) {
            if (jewels.indexOf(stones.charAt(i)) != -1) ++r;
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}