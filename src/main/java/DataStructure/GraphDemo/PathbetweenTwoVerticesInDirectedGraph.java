package DataStructure.GraphDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by muthuselvan on 6/11/17.
 * http://www.geeksforgeeks.org/find-if-there-is-a-path-between-two-vertices-in-a-given-graph/
 * http://www.mathcs.emory.edu/~cheung/Courses/323/Syllabus/Graph/bfs.html
 * Hacker Rank : https://www.youtube.com/watch?v=zaBhtODEL0w&list=PLX6IKgS15Ue02WDPRCmYKuZicQHit9kFt&index=6
 *
 * BFS is preferred one because DFS is recursive one
 * but BFS is level by level , we can use Q for adding all its child and we need maintain
 * boolean value to mark the node is visited
 *
 *  [ 0 ] ---> [ 1 ] ----> [ 2 ]
 *  [ 1 ] ---->[ 2 ] ----> [ 0 ]  ----> [ 3 ]
 *  [ 2 ] ---->[ 0 ] ----> [ 3 ]
 *  [ 3 ] ----> [ 3 ]
 */
public class PathbetweenTwoVerticesInDirectedGraph {

    public static void main(String[] args) {

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int u = 1;
        int v = 3;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;

        u = 3;
        v = 1;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;
    }

    }


// This class represents a directed graph using adjacency list
// representation
class Graph {
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency List

    //Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    //prints BFS traversal from a given source s
    Boolean isReachable(int s, int d) {
//        LinkedList<Integer> temp;
        // Mark all the vertices as not visited(By default set
        // as false)
        boolean visited[] = new boolean[V];
        // Create a queue for BFS
//      LinkedList<Integer> queue = new LinkedList<Integer>();  [ OR ]
        Queue<Integer> queue = new LinkedList<>();
        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);
        // 'i' will be used to get all adjacent vertices of a vertex
        Iterator<Integer> i;
        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.println("Polling Q " +s);
            int n;
            i = adj[s].listIterator();
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            while (i.hasNext()) {
                n = i.next();
                // If this adjacent node is the destination node,
                // then return true
                if (n == d)
                    return true;
                // Else, continue to do BFS
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        // If BFS is complete without visited d
        return false;
    }
}
