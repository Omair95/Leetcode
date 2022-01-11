
public class NumberOfOneBits {

    public static int hammingWeight(int n) {
        int c = 0;
        while (n != 0) {
            c += n&1;
            n = n >>> 1;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(5));
    }
}