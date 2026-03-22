package GRAPH;
import java.util.*;
public class NumIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j, m, n);
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n) return;
        if(grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid, i-1, j, m, n); // up
        dfs(grid, i+1, j, m, n); // down
        dfs(grid, i, j-1, m, n); // left
        dfs(grid, i, j+1, m, n); // right
    }

public static void main(String[] args){
    NumIslands obj = new NumIslands();
    char[][] grid = {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };
    System.out.println("Number of islands: " + obj.numIslands(grid));

}
}