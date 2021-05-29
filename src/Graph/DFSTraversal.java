package Graph;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

class DFSTraversal {

    static class Graph {

        Integer nodes;
        List<List<Integer>> adjlist;
        boolean[] visited;

        Graph(int arg_nodes) {
            nodes = arg_nodes;
            adjlist = new ArrayList<>(nodes);
            for (int i = 0; i < nodes; i++)
                adjlist.add(new ArrayList<>());
            visited = new boolean[nodes];
        }

        void AddEdge(int src, int dst) {
            adjlist.get(src).add(dst);
            adjlist.get(dst).add(src);
        }

        // DFS recursive implementation
        void DFS(int src) {
            visited[src] = true;
            System.out.print(src + " ");
            for (int adj_node : adjlist.get(src)) {
                if (!visited[adj_node]) {
                    DFS(adj_node);
                }
            }
        }

        // DFS iterative implementation
        void DFS_Iterative(int src) {
            Stack<Integer> stk = new Stack<>();
            stk.push(src);
            while (!stk.empty()) {
                src = stk.pop();

                if (visited[src])
                    continue;

                visited[src] = true;
                System.out.print(src + " ");

                List<Integer> adjNodeList = adjlist.get(src);
                for (int i = adjNodeList.size() - 1; i >= 0; i--) {
                    if(!visited[adjNodeList.get(i)])
                        stk.push(adjNodeList.get(i));
                }
            }
        }

        // Mark nodes unvisited for next traversal
        void MarkUnvisited() {
            Arrays.fill(visited, false);
        }
    }

    public static void main(String[] args) {

        /**
         * 0-> 1 -> 2
         * 1-> 0 -> 3-> 4
         * 2-> 0 -> 3
         * 3-> 1 -> 2 -> 5
         * 4-> 1 -> 6
         * 5-> 3 -> 6
         * 6-> 4 -> 5
         */
        Graph g = new Graph(7);
        g.AddEdge(0, 1);
        g.AddEdge(0, 2);
        g.AddEdge(1, 3);
        g.AddEdge(1, 4);
        g.AddEdge(2, 3);
        g.AddEdge(3, 5);
        g.AddEdge(4, 6);
        g.AddEdge(5, 6);

        System.out.println("DFS Recursive Graph Traversal ");
        System.out.print("\nSource Node (0): ");
        g.DFS(0);

        g.MarkUnvisited();
        System.out.print("\nSource Node (3): ");
        g.DFS(3);
        g.MarkUnvisited();

        System.out.println("\n\nDFS Iterative Graph Traversal");
        System.out.print("\nSource Node (0): ");
        g.DFS_Iterative(0);
        g.MarkUnvisited();
        System.out.print("\nSource Node (3): ");
        g.DFS_Iterative(3);
        g.MarkUnvisited();

        Graph t = new Graph(10);
        t.AddEdge(0, 1);
        t.AddEdge(0, 6);
        t.AddEdge(0, 7);
        t.AddEdge(1, 2);
        t.AddEdge(1, 4);
        t.AddEdge(1, 5);
        t.AddEdge(2, 3);
        t.AddEdge(7, 8);
        t.AddEdge(7, 9);

        System.out.println("\n\nDFS Recursive Tree Traversal");
        System.out.print("\nRoot Node (0): ");
        t.DFS(0);
        t.MarkUnvisited();
        System.out.print("\nRoot Node (4): ");
        t.DFS(4);
        t.MarkUnvisited();

        System.out.println("\n\nDFS Iterative Tree Traversal");
        System.out.print("\nSource Node (0): ");
        t.DFS_Iterative(0);
        t.MarkUnvisited();
        System.out.print("\nSource Node (4): ");
        t.DFS_Iterative(4);
        t.MarkUnvisited();
    }
}
