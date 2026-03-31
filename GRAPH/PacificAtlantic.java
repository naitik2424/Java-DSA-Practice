package GRAPH;

import java.util.*;

/*
 * ============================================================
 *  LeetCode 417 — Pacific Atlantic Water Flow
 * ============================================================
 *  PROBLEM:
 *    Given an m x n grid of heights, find all cells from which
 *    water can flow to BOTH the Pacific AND Atlantic ocean.
 *
 *    Pacific  → top row + left column
 *    Atlantic → bottom row + right column
 *    Water flows from high → equal or lower height (or reverse DFS: low → equal or higher)
 *
 * ============================================================
 *  APPROACH: Reverse DFS from ocean borders
 * ============================================================
 *  Instead of simulating water flowing DOWN from every cell (expensive),
 *  we reverse the direction:
 *    → Start from ocean borders and flow UPHILL (heights[nr][nc] >= heights[i][j])
 *    → Mark all reachable cells for Pacific
 *    → Mark all reachable cells for Atlantic
 *    → Answer = cells marked in BOTH grids
 *
 *  TIME:  O(m * n)
 *  SPACE: O(m * n)
 *
 * ============================================================
 *  PATTERN: Multi-source DFS / BFS from boundary
 * ============================================================
 *
 *  DRY RUN (small 3x3 example):
 *    heights = [[1,2,2],
 *               [3,2,3],
 *               [2,4,1]]
 *
 *    Pacific sources  → row 0 (all cols) + col 0 (all rows)
 *    Atlantic sources → row 2 (all cols) + col 2 (all rows)
 *
 *    After DFS:
 *      pacific[][] marks cells reachable from Pacific
 *      atlantic[][] marks cells reachable from Atlantic
 *
 *    Common cells → result
 */

public class PacificAtlantic {

    // 4-directional movement: down, up, right, left
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] pacific  = new int[m][n];  // 1 = reachable from Pacific
        int[][] atlantic = new int[m][n];  // 1 = reachable from Atlantic

        // ── Pacific: top row + left column ──────────────────────
        for (int j = 0; j < n; j++) dfs(heights, pacific,  0,   j, m, n);
        for (int i = 0; i < m; i++) dfs(heights, pacific,  i,   0, m, n);

        // ── Atlantic: bottom row + right column ─────────────────
        for (int j = 0; j < n; j++) dfs(heights, atlantic, m-1, j, m, n);
        for (int i = 0; i < m; i++) dfs(heights, atlantic, i,   n-1, m, n);

        // ── Collect cells reachable from BOTH oceans ─────────────
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] == 1 && atlantic[i][j] == 1) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    /*
     * DFS helper — reverse flow (uphill)
     *
     * We move to neighbour (nr, nc) only if:
     *   1. In bounds
     *   2. Not already visited
     *   3. heights[nr][nc] >= heights[i][j]  <- reverse: water can flow FROM nr,nc TO i,j
     */
    void dfs(int[][] heights, int[][] visited, int i, int j, int m, int n) {
        visited[i][j] = 1;

        for (int[] dir : dirs) {
            int nr = i + dir[0];
            int nc = j + dir[1];

            if (nr < 0 || nc < 0 || nr >= m || nc >= n) continue; // out of bounds
            if (visited[nr][nc] == 1) continue;                    // already visited
            if (heights[nr][nc] < heights[i][j]) continue;         // can't flow uphill in reverse

            dfs(heights, visited, nr, nc, m, n);
        }
    }

    // ── Quick local test ─────────────────────────────────────────
    public static void main(String[] args) {
        PacificAtlantic sol = new PacificAtlantic();

        int[][] heights = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };

        List<List<Integer>> result = sol.pacificAtlantic(heights);
        System.out.println("Cells that reach both oceans:");
        for (List<Integer> cell : result) {
            System.out.println("  [" + cell.get(0) + ", " + cell.get(1) + "]");
        }
        // Expected: [0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]
    }
}