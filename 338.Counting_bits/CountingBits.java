import java.util.Arrays;

public class CountingBits {

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

    public static void main (String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
}