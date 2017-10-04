package DataStructure.GraphDemo;

/**
 * Created by muthuselvan on 9/5/17.
 * http://www.geeksforgeeks.org/detect-cycle-undirected-graph/
 *
 *https://www.youtube.com/watch?v=rKQaZuoUR4M
 *
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/graph/CycleInDirectedGraph.java
 *
 * How to find cycle in DFS ?
 * ---------------------------
 *
 *  We do a DFS traversal of the given graph. For every visited vertex ‘v’,
 *  if there is an adjacent
 *  ‘u’ such that u is already visited and u is not parent of v,
 *  then there is a cycle in graph. If we don’t find such an adjacent
 *  for any vertex, we say that there is no cycle
 *
 *  Code :
 *  ------
 *  * http://www.geeksforgeeks.org/detect-cycle-undirected-graph/
 *
 * Time Complexity:
 * ----------------
 * The program does a simple DFS Traversal of graph and graph
 * is represented using adjacency list. So the time complexity is O(V+E)
 *
 *
 * Maintain 3 sets :
 * White Set : all the vertices which is not been visited at all
 * Gray Sets : being visted right now
 * Block sets : visited including its children
 *
 *
 * while DFS ,  if we encounter vertex in gray set then we found cycle , why because when vertex in gray set it mean
 * its niighboun and its neigbout is explored ... that hierachry ..this indicating that cycle in graph
 *
 *  No Cycle :
 *  ----------
 *  When ?  if we moved all the vertices to Block Set from White set then No cycle
 *
 *
 */
public class Detect_Cycle_UnDirected_Graph_Using_DFS {
}
