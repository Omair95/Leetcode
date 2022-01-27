import java.util.Arrays;

public class NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int prevEnd = intervals[0][1], res = 0;

        for (int i = 1; i < intervals.length; ++i) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start >= prevEnd) {
                prevEnd = end;
            } else {
                ++res;
                prevEnd = Math.min(prevEnd, end);
            }
        }

        return res;
    }

    public static void main (String [] args) {

    }
}