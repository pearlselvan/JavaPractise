package DataStructure.GraphDemo;

/**
 * Created by muthuselvan on 8/31/17.
 * http://www.geeksforgeeks.org/shortest-path-for-directed-acyclic-graphs/
 *
 * Time Complexity: Time complexity of topological sorting is O(V+E).
 * After finding topological order, the algorithm process all vertices and for every vertex,
 * it runs a loop for all adjacent vertices. Total adjacent vertices in a graph is O(E).
 * So the inner loop runs O(V+E) times. Therefore,
 * overall time complexity of this algorithm is O(V+E).
 *
 *
 * We can use Dijkstra’s algorithm but if its negative then this will not work :
 *
 */
public class ShortestPathDirectedAcyclicGraphs_DAG {
}
