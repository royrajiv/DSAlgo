package Graph.AllPathsInDAG;

import java.util.ArrayList;
import java.util.List;

class Graph {

    private List<Integer> path;

    public void FindAllPaths (List<List<Integer>> graph, int src, int dst) {

        // Clear previously stored paths
        path = new ArrayList<Integer>();
        path.clear();

        System.out.print("Source : " + src + " Destination : " + dst);

        path.add(src);

        DFS (graph, src, dst, path);
    }

    public void DFS (List<List<Integer>> graph, int src , int dst, List<Integer> path) {

        if (src == dst) {
            System.out.print("\nPath : " );
            for (Integer node : path)
                System.out.print(node + " ");
        } else {
            for (Integer adjnode : graph.get(src)) {
                path.add(adjnode);
                DFS (graph, adjnode, dst, path);
                path.remove(path.size()-1);
            }
        }
    }

    public static void ClearConnections(List<Integer> node1, List<Integer> node2, List<Integer> node3,
                                        List<Integer> node4, List<Integer> node5) {
        node1.clear();
        node2.clear();
        node3.clear();
        node4.clear();
        node5.clear();
    }

    public static void main (String[] args) {

        Graph obj = new Graph();
        List<Integer> from_node_0, from_node_1, from_node_2, from_node_3, from_node_4;

        from_node_0 = new ArrayList<Integer>();
        from_node_1 = new ArrayList<Integer>();
        from_node_2 = new ArrayList<Integer>();
        from_node_3 = new ArrayList<Integer>();
        from_node_4 = new ArrayList<Integer>();

        List<List<Integer>> graph1 = new ArrayList<List<Integer>>();
        // Graph 1

        /*  2 ---> 3
            ^      ^
            |      |
            0 ---> 1 */

        //  {{1,2}, {3}, {3}, {}}; // 0 -> (1,2); 1 -> (3); 2 -> (3); 3 -> (None)

        from_node_0.add(1);
        from_node_0.add(2);
        from_node_1.add(3);
        from_node_2.add(3);

        graph1.add(from_node_0);
        graph1.add(from_node_1);
        graph1.add(from_node_2);
        graph1.add(from_node_3);

        System.out.println("\n\nAll paths in graph G1");
        obj.FindAllPaths (graph1, 0, 3);

        // Graph 2
        //  {{1,2}, {2,3}, {3}, {}}; // 0 -> (1,2); 1 -> (2,3); 2 -> (3); 3 -> (None)
        ClearConnections(from_node_0, from_node_1, from_node_2, from_node_3, from_node_4);

        from_node_0.add(1);
        from_node_0.add(2);
        from_node_1.add(2);
        from_node_1.add(3);
        from_node_2.add(3);

        List<List<Integer>> graph2 = new ArrayList<List<Integer>>();

        graph2.add(from_node_0);
        graph2.add(from_node_1);
        graph2.add(from_node_2);
        graph2.add(from_node_3);

        System.out.println("\n\nAll paths in graph G2");
        obj.FindAllPaths (graph2, 0 , 3);

        // Graph 3
        //  {{4, 3, 1}, {3, 2, 4}, {3}, {4}}; // 0 -> (4, 3, 1); 1 -> (3, 2, 4); 2 -> (3); 3 -> (4)
        ClearConnections(from_node_0, from_node_1, from_node_2, from_node_3, from_node_4);
        from_node_0.add(4);
        from_node_0.add(3);
        from_node_0.add(1);
        from_node_1.add(3);
        from_node_1.add(2);
        from_node_1.add(4);
        from_node_2.add(3);
        from_node_3.add(4);

        List<List<Integer>> graph3 = new ArrayList<List<Integer>>();

        graph3.add(from_node_0);
        graph3.add(from_node_1);
        graph3.add(from_node_2);
        graph3.add(from_node_3);
        graph3.add(from_node_4);

        System.out.println("\n\nAll paths in graph G3");
        obj.FindAllPaths (graph3, 0, 4);
    }
}

