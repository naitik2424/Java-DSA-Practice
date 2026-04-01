package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExit {

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int startRow = entrance[0];
        int startCol = entrance[1];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startRow, startCol});
        maze[startRow][startCol] = '+'; // entrance visited mark

        int steps = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty()){
            int size = queue.size();
            steps++; // ek level = ek step

            for(int k = 0; k < size; k++){
                int[] curr = queue.poll();
                int row = curr[0], col = curr[1];

                for(int[] dir : dirs){
                    int nr = row + dir[0];
                    int nc = col + dir[1];

                    // Boundary check
                    if(nr<0||nc<0||nr>=m||nc>=n) continue;

                    // Wall → skip
                    if(maze[nr][nc] == '+') continue;

                    // Border pe hai → EXIT mila!
                    if(nr==0||nc==0||nr==m-1||nc==n-1)
                        return steps;

                    // Visited mark + queue mein daalo
                    maze[nr][nc] = '+';
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        NearestExit solution = new NearestExit();

        // Test 1: Normal case
        char[][] maze1 = {
            {'+','+','.','+'},
            {'.','.','.','+'},
            {'+','+','+','.'}
        };
        System.out.println("Test 1: " + solution.nearestExit(maze1, new int[]{1,0}));
        // Expected: 2

        // Test 2: Exit at border
        solution = new NearestExit();
        char[][] maze2 = {
            {'+','+','+'},
            {'.','.','.'},
            {'+','+','+'}
        };
        System.out.println("Test 2: " + solution.nearestExit(maze2, new int[]{1,0}));
        // Expected: 2

        // Test 3: No exit
        solution = new NearestExit();
        char[][] maze3 = {
            {'.', '+'}
        };
        System.out.println("Test 3: " + solution.nearestExit(maze3, new int[]{0,0}));
        // Expected: -1
    }
}