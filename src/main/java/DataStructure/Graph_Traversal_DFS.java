package DataStructure;

import java.util.LinkedList;

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


 */
public class Graph_Traversal_DFS {

    public static void main(String[] args) {
         LinkedList<Integer> adj[];




    }

}

class Graph {

    private int v ; //number of nodes or vertices
    private LinkedList<Integer> adj[]; //Ex : 1-2,3 will represent path from node 1 to 2 and 3

    public Graph(int v) {
    this.v = v ;
    adj=new LinkedList[v];

    for (int i=0;i<adj.length;i++) {
        adj[i] = new LinkedList<>();
    }
    }

//    void addEdge(int ) {
//        adj[]
//    }


}


