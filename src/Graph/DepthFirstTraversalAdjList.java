package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstTraversalAdjList {
    public static void main(String args[]) {
        Graph1 g = new Graph1(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS();
    }
}

class Graph1 {
    private int V;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    Graph1(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);  // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS() {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        for (int i = 0; i < V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }
}
/**
 Let's illustrate this with an example:
            A---B---D
            \  /
              C
 Node A is connected with node B
 Node B is connected with nodes D, C
 Node C is connected with nodes A, B
 Node D is connected with nodes B
 All the nodes are unvisited at the beginning (node.visited == false)
 Call .depthFirstSeach() with an arbitrary node as the starting node, let's say depthFirstSearch(B)
 mark B as visited
 Does B have any unvisited neighbors? Yes -> the first unvisited node is D, so call depthFirstSearch(D)
 mark D as visited
 Does D have any unvisited neighbors? No -> (B has already been visited) return
 Does B have any unvisited neighbors? Yes -> the first unvisited node is C, so call depthFirstSearch(C)
 mark C as visited
 Does C have any unvisited neighbors? Yes -> the first unvisited node is A, so call depthFirstSearch(A)
 mark A as visited
 Does A have any unvisited neighbors? No. -> return
 Does C have any unvisited neighbors? No -> return
 Does B have any unvisited neighbors? No -> return
 Calling DFS on our graph would give us the traversal B,D,C,A (the order of visitation). When the algorithm is written out like this, it's easy to translate it to code:
 */