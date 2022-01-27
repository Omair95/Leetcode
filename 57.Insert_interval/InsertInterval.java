import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][] { { newInterval[0], newInterval[1]}};
        int[][] intervalsNew = new int[intervals.length + 1][intervals[0].length];

        for (int i = 0; i < intervals.length; ++i) {
            for (int j = 0; j < intervals[0].length; ++j) {
                intervalsNew[i][j] = intervals[i][j];
            }
        }

        intervalsNew[intervals.length][0] = newInterval[0];
        intervalsNew[intervals.length][intervals[0].length - 1] = newInterval[1];

        Arrays.sort(intervalsNew, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        int start = intervalsNew[0][0];
        int end = intervalsNew[0][1];

        for (int i = 0; i < intervalsNew.length; ++i) {
            int s = intervalsNew[i][0];
            int e = intervalsNew[i][1];

            if (s <= end) {
                end = Math.max(end, e);
            } else {
                res.add(new int[] { start, end });
                start = s;
                end = e;
            }
        }

        res.add(new int[] { start, end });
        return res.toArray(new int[res.size()][]);
    }

    public static void main (String [] args) {
        Arrays.stream(insert(new int[][]{{1, 5}}, new int[]{0, 3}));
    }
}