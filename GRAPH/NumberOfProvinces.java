package GRAPH;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                dfs(isConnected, visited, i, n);
            }
        }
        return count;
    }

    void dfs(int[][] isConnected, boolean[] visited, int city, int n){
        visited[city] = true;
        for(int j = 0; j < n; j++){
            if(isConnected[city][j] == 1 && !visited[j])
                dfs(isConnected, visited, j, n);
        }
    }

    public static void main(String[] args) {
        NumberOfProvinces solution = new NumberOfProvinces();

        // Test 1: 2 provinces
        int[][] test1 = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println("Test 1: " + solution.findCircleNum(test1));
        // Expected: 2

        // Test 2: 3 provinces (sab alag)
        int[][] test2 = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println("Test 2: " + solution.findCircleNum(test2));
        // Expected: 3

        // Test 3: 1 province (sab connected)
        int[][] test3 = {{1,1,1},{1,1,1},{1,1,1}};
        System.out.println("Test 3: " + solution.findCircleNum(test3));
        // Expected: 1
    }
}