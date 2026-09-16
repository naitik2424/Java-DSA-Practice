package array;

import java.util.*;

public class ImageOverlap {

    public static int largestOverlap(int[][] img1, int[][] img2) {

        ArrayList<int[]> a = new ArrayList<>();
        ArrayList<int[]> b = new ArrayList<>();

        int n = img1.length;

        // img1 ke 1 ke coordinates
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (img1[i][j] == 1) {
                    a.add(new int[]{i, j});
                }

                if (img2[i][j] == 1) {
                    b.add(new int[]{i, j});
                }
            }
        }

        HashMap<String, Integer> map = new HashMap<>();

        int ans = 0;

        // Har 1 of img1 ko har 1 of img2 se compare
        for (int[] p1 : a) {
            for (int[] p2 : b) {

                int x = p2[0] - p1[0];
                int y = p2[1] - p1[1];

                String key = x + "," + y;

                map.put(key, map.getOrDefault(key, 0) + 1);

                ans = Math.max(ans, map.get(key));
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] img1 = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        int[][] img2 = {
            {0, 1, 0},
            {0, 0, 1},
            {0, 0, 0}
        };

        int result = largestOverlap(img1, img2);

        System.out.println("Maximum Overlap = " + result);
    }
}