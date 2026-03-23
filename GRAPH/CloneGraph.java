package GRAPH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Step 1: Node class define karo
class Node {
    public int val;
    public List<Node> neighbors;

    public Node(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }
}

class CloneGraph {
    HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null) return null;
        return dfs(node);
    }

    Node dfs(Node node) {
        if(visited.containsKey(node)){
            return visited.get(node);
        }

        Node clone = new Node(node.val);
        visited.put(node, clone);

        for(Node neighbor : node.neighbors){
            clone.neighbors.add(dfs(neighbor)); // ✅ dfs call
        }

        return clone;
    }

    // Step 2: main method class ke andar!
    public static void main(String[] args) {
        CloneGraph solution = new CloneGraph();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.neighbors.add(node2);
        node1.neighbors.add(node3);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node1);
        node3.neighbors.add(node2);

        Node clonedGraph = solution.cloneGraph(node1);
        System.out.println("Cloned node val: " + clonedGraph.val); // ✅ verify
    }
}