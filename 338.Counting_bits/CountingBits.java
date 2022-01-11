import java.util.Arrays;

public class CountingBits {

    // O (n log n)
    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i <= n; ++i) {
            int c = 0, tmp = i;
            while (tmp > 0) {
                c += tmp&1;
                tmp = tmp >>> 1;
            }
            res[i] = c;
        }

        return res;
    }

    // O (n) using Dynamic programming
    public static int[] countBitsDP(int n) {
        int off = 1;
        int[] res = new int[n+1];
        res[0] = 0;
        for (int i = 1; i <= n; ++i) {
            if (off * 2 == i) off = i;
            res[i] = 1 + res[i - off];
        }
        return res;
    }

    public static void main (String[] args) {
        System.out.println(Arrays.toString(countBitsDP(5)));
    }
}