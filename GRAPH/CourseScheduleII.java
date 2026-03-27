package GRAPH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseScheduleII {

    List<Integer> result = new ArrayList<>();

    static final int UNVISITED = 0;
    static final int VISITING  = 1;
    static final int VISITED   = 2;

    public int[] findOrder(int numCourses, int[][] prerequisites) {

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
                    return new int[]{};  // cycle → empty array
            }
        }

        // Step 4: Reverse aur return
        Collections.reverse(result);
        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
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
        result.add(node);  // fully explored → add karo!
        return true;
    }

    public static void main(String[] args) {
        CourseScheduleII solution = new CourseScheduleII();

        // Test 1: Cycle nahi → valid order
        int[] ans1 = solution.findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}});
        System.out.print("Test 1: ");
        for(int x : ans1) System.out.print(x + " ");
        System.out.println();
        // Expected: [0,2,1,3] or [0,1,2,3]

        // Test 2: Cycle hai → empty array
        solution = new CourseScheduleII();
        int[] ans2 = solution.findOrder(2, new int[][]{{1,0},{0,1}});
        System.out.print("Test 2: ");
        if(ans2.length == 0) System.out.println("[]");
        // Expected: []

        // Test 3: No prerequisites
        solution = new CourseScheduleII();
        int[] ans3 = solution.findOrder(3, new int[][]{});
        System.out.print("Test 3: ");
        for(int x : ans3) System.out.print(x + " ");
        System.out.println();
        // Expected: [0,1,2] or any order
    }
}