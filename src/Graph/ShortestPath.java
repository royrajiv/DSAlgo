package Graph;// Java program to find shortest path in an undirected graph

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ShortestPath {
    //define Graph object
    Map<Integer, List<Integer>> graph = new HashMap();
    int v;

    // Driver Program
    public ShortestPath(int noOfVertices) {
        // No of vertices
        v = noOfVertices;

        //initialize/populate vertices in the graph
        for (int i = 0; i < v; i++) {
            graph.put(i, new ArrayList());
        }
    }

    // function to form edge between two vertices
    // source and dest
    public void addEdge(int i, int j) {
        graph.get(i).add(j);
        graph.get(j).add(i);
    }

    public int getShortestPath(int source, int dest) {
        boolean isRouteFound = false;
        boolean[] visited = new boolean[v];
        int[] distances = new int[v];
        int[] prevNodes = new int[v];

        Arrays.fill(prevNodes, -1);
        Arrays.fill(distances, -1);

        java.util.Queue<Integer> queue = new LinkedList<Integer>();
        distances[source] = 0;
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int currentNode = queue.remove();
            for(Integer adjNode : graph.get(currentNode)){
                if(!visited[adjNode]){
                    distances[adjNode] = distances[currentNode]+1;
                    prevNodes[adjNode] = currentNode;
                    visited[adjNode] = true;
                    queue.add(adjNode);
                    if(adjNode == dest){
                        isRouteFound = true;
                        break;
                    }
                }
            }
        }

        if(isRouteFound){
            java.util.List<Integer> path = new LinkedList<Integer>();
            int prevNode = dest;
            path.add(prevNode);
            //previous[i] will be 0 for source node
            while (prevNodes[prevNode] != -1) {
                prevNode = prevNodes[prevNode];
                path.add(prevNode);
            }
            Collections.reverse(path);
            System.out.println(source + " -> " + dest + " path: " + path);
            System.out.println();
            return distances[dest];
        }
        return -1;
    }

}
