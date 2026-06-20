package Heap;

import java.util.PriorityQueue;

public class LC378_KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // First element of every row
        for (int r = 0; r < n; r++) {
            pq.add(new int[]{matrix[r][0], r, 0});
        }

        for (int i = 0; i < k - 1; i++) {
            int[] curr = pq.poll();
            int row = curr[1];
            int col = curr[2];

            if (col + 1 < n) {
                pq.add(new int[]{
                        matrix[row][col + 1],
                        row,
                        col + 1
                });
            }
        }

        return pq.peek()[0];
    }
}