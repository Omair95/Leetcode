
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = (r-l)*Math.min(height[l], height[r]);

        while (l < r) {
            int currentMax = (r-l)*Math.min(height[l], height[r]);
            max = Math.max(currentMax, max);
            if (height[l] < height[r]) ++l;
            else --r;
        }

        return max;
    }

    public static void main (String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[] { 1, 1}));
    }
}