package GRAPH;

public class FloodFill {

    // ✅ Main Solution
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;       // rows
        int n = image[0].length;    // columns
        int oldColor = image[sr][sc];

        // Edge case: same color hai toh kuch mat karo
        if (oldColor == color) return image;

        dfs(image, sr, sc, color, oldColor, m, n);
        return image;
    }

    // ✅ DFS Helper
    void dfs(int[][] image, int sr, int sc,
             int color, int oldColor, int m, int n) {

        // Boundary check
        if (sr < 0 || sc < 0 || sr >= m || sc >= n) return;

        // Different color → return
        if (image[sr][sc] != oldColor) return;

        // Fill color
        image[sr][sc] = color;

        // 4 directions
        dfs(image, sr + 1, sc, color, oldColor, m, n); // down
        dfs(image, sr - 1, sc, color, oldColor, m, n); // up
        dfs(image, sr, sc + 1, color, oldColor, m, n); // right
        dfs(image, sr, sc - 1, color, oldColor, m, n); // left
    }

    // ✅ Main Method — Test karo
    public static void main(String[] args) {
        FloodFill solution = new FloodFill();

        // Test Case 1
        int[][] image1 = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int[][] result1 = solution.floodFill(image1, 1, 1, 2);
        System.out.println("Test Case 1:");
        printImage(result1);
        // Expected:
        // [2, 2, 2]
        // [2, 2, 0]
        // [2, 0, 1]

        // Test Case 2 — Same color edge case
        int[][] image2 = {
            {0, 0, 0},
            {0, 0, 0}
        };
        int[][] result2 = solution.floodFill(image2, 0, 0, 0);
        System.out.println("Test Case 2 (same color):");
        printImage(result2);
        // Expected: same image — no change

        // Test Case 3
        int[][] image3 = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int[][] result3 = solution.floodFill(image3, 0, 0, 3);
        System.out.println("Test Case 3:");
        printImage(result3);
        // Expected:
        // [3, 3, 3]
        // [3, 3, 0]
        // [3, 0, 1]
    }

    // ✅ Helper — Image print karo
    static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}