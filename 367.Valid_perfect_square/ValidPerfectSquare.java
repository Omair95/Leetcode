

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
       int l = 1, r = num;

       while (l <= r) {
           long m = (l+r) >>> 1;;

            if ((m*m) == num) return true;
            else if ((m*m) < num) l = (int) m + 1;
            else r = (int) m - 1;
       }

       return false;
    }

    public static void main (String [] args) {
        System.out.println(isPerfectSquare(17));
    }
}