package GRAPH;

import java.util.*;

public class PathExistsGraph {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // Step 1: Build graph
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u); // undirected
        }

        // Step 2: visited array
        boolean[] visited = new boolean[n];

        // Step 3: DFS call
        return dfs(graph, source, destination, visited);
    }

    private boolean dfs(List<List<Integer>> graph, int node, int destination, boolean[] visited){

        if(node == destination) return true;

        visited[node] = true;

        for(int neighbor : graph.get(node)){

            if(!visited[neighbor]){

                if(dfs(graph, neighbor, destination, visited)){
                    return true;
                }

            }
        }

        return false;
    }

    public static void main(String[] args){

        int n = 6;
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int source = 0;
        int destination = 5;

        PathExistsGraph obj = new PathExistsGraph();

        boolean result = obj.validPath(n, edges, source, destination);

        System.out.println("Path Exists: " + result);
    }
}