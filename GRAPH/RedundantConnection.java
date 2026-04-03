package GRAPH;

public class RedundantConnection {

    int[] parent;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];

        // Step 1: Har node khud ka parent
        // parent[i] = i → main khud apna boss hoon!
        for(int i = 0; i <= n; i++)
            parent[i] = i;

        // Step 2: Har edge process karo
        for(int[] edge : edges){
            int u = edge[0], v = edge[1];

            // Dono ka root same → CYCLE → Redundant!
            if(find(u) == find(v)){
                return edge;
            } else {
                // Alag group → Union karo
                union(u, v);
            }
        }
        return new int[]{};
    }

    // find → ultimate boss dhundho (root)
    int find(int x){
        if(x == parent[x]) return x;  // khud ka boss = root!
        return find(parent[x]);        // upar jaao!
    }

    // union → 2 groups ko ek karo
    void union(int x, int y){
        parent[find(x)] = find(y);  // x ka root → y ka root ka child
    }

    public static void main(String[] args) {
        RedundantConnection solution = new RedundantConnection();

        // Test 1
        int[][] edges1 = {{1,2},{1,3},{2,3}};
        int[] ans1 = solution.findRedundantConnection(edges1);
        System.out.println("Test 1: [" + ans1[0] + "," + ans1[1] + "]");
        // Expected: [2,3]

        // Test 2
        solution = new RedundantConnection();
        int[][] edges2 = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        int[] ans2 = solution.findRedundantConnection(edges2);
        System.out.println("Test 2: [" + ans2[0] + "," + ans2[1] + "]");
        // Expected: [1,4]
    }
}