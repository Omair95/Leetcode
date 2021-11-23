
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int temp = x;
        int reverseNumber = 0;

        while (x > 0) {
            reverseNumber = reverseNumber*10 + x%10;
            x = x / 10;
        }

        return reverseNumber == temp;
    }

    public static void main (String [] args) {

        int a = 1714121;
        int b = 1221;
        int c = 666666;

        System.out.println("Is palindrome? " + isPalindrome(a));
        System.out.println("Is palindrome? " + isPalindrome(b));
        System.out.println("Is palindrome? " + isPalindrome(c));
    } 
}
