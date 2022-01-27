import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];
        int s, e, i = 0;

        while (i < intervals.length) {
            s = intervals[i][0];
            e = intervals[i][1];

            if (s <= end) {
                end = Math.max(end, e);
            } else {
                res.add(new int[] { start, end });
                start = s;
                end = e;
            }
            ++i;
        }

        res.add(new int[] { start, end });
        return res.toArray(new int[res.size()][]);
    }

    public static void main (String [] args) {
        int [][] res = merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } } );
    }
}