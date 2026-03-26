package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    // State constants
    static final int UNVISITED = 0;
    static final int VISITING  = 1;
    static final int VISITED   = 2;

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Step 1: Adjacency list banao
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        // pre[1] pehle lena hoga, tab pre[0] le sakte ho
        for(int[] pre : prerequisites)
            graph.get(pre[1]).add(pre[0]);

        // Step 2: State array — 0=unvisited, 1=visiting, 2=visited
        int[] state = new int[numCourses];

        // Step 3: Har node pe DFS
        for(int i = 0; i < numCourses; i++){
            if(state[i] == UNVISITED){
                if(!dfs(i, graph, state))
                    return false;
            }
        }
        return true;
    }

    boolean dfs(int node, List<List<Integer>> graph, int[] state){
        if(state[node] == VISITING) return false; // cycle!
        if(state[node] == VISITED)  return true;  // safe!

        state[node] = VISITING;

        for(int neighbor : graph.get(node)){
            if(!dfs(neighbor, graph, state))
                return false;
        }

        state[node] = VISITED;
        return true;
    }

    public static void main(String[] args) {
        CourseSchedule solution = new CourseSchedule();

        // Test 1: Cycle nahi hai → true
        System.out.println(solution.canFinish(4, new int[][]{{1,0},{2,0},{3,1},{3,2}}));
        // Expected: true

        // Test 2: Cycle hai → false
        System.out.println(solution.canFinish(2, new int[][]{{1,0},{0,1}}));
        // Expected: false

        // Test 3: Koi prerequisites nahi
        System.out.println(solution.canFinish(3, new int[][]{}));
        // Expected: true
    }
}