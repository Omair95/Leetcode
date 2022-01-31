import java.util.List;

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); ++i) {
            List<Integer> l = triangle.get(i);
            sum += l.stream().sorted().findFirst().get();
        }

        return sum;
    }

    public static void main (String [] args) {
        
    }
}