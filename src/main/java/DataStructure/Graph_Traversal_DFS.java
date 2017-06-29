package DataStructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by muthuselvan on 4/1/17.
 * http://www.java2blog.com/2015/12/depth-first-search-in-java.html , This is for understanding
 *
 * 1. DFS Using Stack
 *
 *
 * 2. DFS Using Recursive
 *
 *
 * http://www.geeksforgeeks.org/depth-first-traversal-for-a-graph/ , This is for coding , implemented ising list
 * The only catch here is, unlike trees, graphs may contain cycles,
 * so we may come to the same node again. To avoid processing a node more than once,
 * we use a boolean visited array.
   For example, in the following graph, we start traversal from vertex 2. When we come
   to vertex 0, we look for all adjacent vertices of it. 2 is also an adjacent
   vertex of 0. If we don’t mark visited vertices, then 2 will be processed
   again and it will become a non-terminating process.
   A Depth First Traversal of the following graph is 2, 0, 1, 3.


 http://www.geeksforgeeks.org/depth-first-traversal-for-a-graph/

 Using stack : https://www.tutorialspoint.com/data_structures_algorithms/depth_first_traversal.htm


 */
public class Graph_Traversal_DFS {

    public static void main(String[] args) {
         LinkedList<Integer> adj[];

         Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println(g);
        g.DFS(0);
        g.findneighbors(3);

        g.DFSUsingStack(0);

    }

}

class Graph {

    private int V ; //number of nodes or vertices
    private LinkedList<Integer> adj[]; //Ex : 1-2,3 will represent path from node 1 to 2 and 3

    public Graph(int v) {
    this.V = v ;
    adj=new LinkedList[v];

    for (int i=0;i<adj.length;i++) {
        adj[i] = new LinkedList<>();
    }
    }

    // A function used by DFS
    void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+"-> ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
//            System.out.print(n);
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }


    void DFSUtilUsingStack(int v, boolean visited[]) {
        Stack<Integer> visitedStack = new Stack<>();

        visited[v] = true;

        visitedStack.push(v);

        Iterator<Integer> i = adj[v].listIterator();

        while (!visitedStack.empty()) {
//            System.out.println("Checking : " +visitedStack.peek());

            int top = visitedStack.pop();

            if (!visited[top])
                continue;


//            while (i.hasNext()) {
//                int n = i.next();
//                visitedStack.push(n);
//                visited[n] = true;
//
//            }

            if (i.hasNext()) {
                int n = i.next();
                visitedStack.push(n);
                System.out.print("Visited : " + visitedStack.peek());
                visited[n] = true;
            }
//             else {
//                visitedStack.pop();
//            }
        }

    }


    void findneighbors(int vertex) {

        Iterator<Integer> iterator = adj[vertex].listIterator();

        while (iterator.hasNext()) {
            int data=iterator.next();
            System.out.println("Neibhour of " +vertex+ " is " +data);
        }


    }


    void DFSUsingStack(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)

        boolean stackvisited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal

        DFSUtilUsingStack(v,stackvisited);
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
        boolean stackvisited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
        DFSUtilUsingStack(v,stackvisited);
    }

    //Adding edge from vertex
    public void addEdge(int vertex , int edge) {
        adj[vertex].add(edge); //Added edge in given vertex
    }

    @Override
    public String toString() {
        return "GraphDemo{" +
                "v=" + V +
                ", adj=" + Arrays.toString(adj) +
                '}';
    }

//    void addEdge(int ) {
//        adj[]
//    }


}


