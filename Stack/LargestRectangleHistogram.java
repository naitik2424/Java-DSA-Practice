// LeetCode 84

// Pattern: Monotonic Increasing Stack (Nearest Smaller)
import java.util.*;

public class LargestRectangleHistogram {

    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() &&
                   currentHeight < heights[stack.peek()]) {

                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;
                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] heights = {2,1,5,6,2,3};
        int result = largestRectangleArea(heights);

        System.out.println(result);
    }
}