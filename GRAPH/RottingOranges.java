package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int minutes = 0;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Saare rotten queue mein, fresh count karo
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2) queue.add(new int[]{i, j});
                if(grid[i][j] == 1) fresh++;
            }
        }

        // Step 2: 4 directions
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        // Step 3: Multi-Source BFS
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k = 0; k < size; k++){
                int[] curr = queue.poll();
                int row = curr[0], col = curr[1];
                for(int[] dir : dirs){
                    int nr = row + dir[0];
                    int nc = col + dir[1];
                    if(nr<0||nc<0||nr>=m||nc>=n) continue;
                    if(grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        queue.add(new int[]{nr, nc});
                    }
                }
            }
            minutes++;
        }

        return fresh > 0 ? -1 : minutes == 0 ? 0 : minutes - 1;
    }

    public static void main(String[] args) {
        RottingOranges solution = new RottingOranges();

        // Test 1: Normal case
        int[][] grid1 = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println("Test 1: " + solution.orangesRotting(grid1));
        // Expected: 4

        // Test 2: Impossible case
        solution = new RottingOranges();
        int[][] grid2 = {{2,1,1},{0,1,1},{1,0,1}};
        System.out.println("Test 2: " + solution.orangesRotting(grid2));
        // Expected: -1

        // Test 3: No fresh oranges
        solution = new RottingOranges();
        int[][] grid3 = {{0,2}};
        System.out.println("Test 3: " + solution.orangesRotting(grid3));
        // Expected: 0
    }
}