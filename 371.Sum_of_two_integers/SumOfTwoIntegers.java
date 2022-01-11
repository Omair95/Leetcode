
public class SumOfTwoIntegers {

    public static int getSum(int a, int b) {
        while (b != 0) {
            int tmp = ( a & b ) << 1;
            a = a ^ b;
            b = tmp;
        }
        return a;
    }

    public static void main (String[] args) {
        System.out.println(getSum(3, 4));
    }
}