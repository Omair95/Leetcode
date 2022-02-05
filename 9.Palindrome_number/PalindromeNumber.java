import java.util.LinkedList;
import java.util.Deque;

public class PalindromeNumber {

    public static void main (String [] args) {

        Deque<Integer> d = new LinkedList();

        for (int i = 0; i < 10; ++i) {
            d.add(i);
        }

        d.stream().forEach(System.out::println);
    }

}
