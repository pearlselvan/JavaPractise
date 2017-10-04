package DataStructure.GraphDemo;

/**
 * Created by muthuselvan on 9/5/17.
 * http://www.geeksforgeeks.org/graph-and-its-representations/
 *
 * Graph Representation :
    A finite set of vertices also called as nodes.
    A finite set of ordered pair of the form (u, v) called as edge.
    The pair is ordered because (u, v) is not same as (v, u) in case of directed graph(di-graph).
    The pair of form (u, v) indicates that there is an edge from vertex u to vertex v.
    The edges may contain weight/value/cost

    FB / twitter / google -> Each node represent person and its detail : age / sex / city /
 *
 * What is Adjacency Matrix ?
 * * -------------------------
 *  its 2D ,
 *
 * What is Adjacency List ?
 * -------------------------
   Array of linked list
 * size of array = no of vertices
 * Entry array[i] represents the linked list of vertices adjacent to the ith vertex.
 *
 * Pros and Cons ?
 * * -------------------------
 * Matrix :
 * * -------
 * Pros: Representation is easier to implement and follow. Removing an edge takes O(1) time.
 * Queries like whether there is an edge from vertex ‘u’ to vertex ‘v’ are efficient and can be done O(1).
   Cons: Consumes more space O(V^2). Even if the graph is sparse(contains less number of edges),
   it consumes the same space. Adding a vertex is O(V^2) time.
 *
 * Sample program for Matrix ?
 *
 *
 * Sample progeam for List ?

 *
 *
 *
 * Big o notation ?
 *
 *
 * What are the interview question ?
 *
 *
 *
 */
public class Adjacency_Matrix_List_Graph_Representation {
}
