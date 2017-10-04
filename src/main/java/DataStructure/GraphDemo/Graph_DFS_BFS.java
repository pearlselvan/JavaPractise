package DataStructure.GraphDemo;

/**
 * Created by muthuselvan on 9/5/17.
 * * =============================================================================================
 *
 * DFS : We can use stack to traverse :
 *
 *  DFS : Recursion -> hasPath(source, target) -> if not then ask my children ..
 *    hasPath(source,t)
 *       |________hasPath(child1,t)
 *                      |________hasPath(child2,t)
 *
 *
 * DFS : Goes DEEP ( to children ) before going asking its any one of the children
 * Problem : we might really run far away
 *
 * Have visited flag
 *
 * VIDEO : https://www.youtube.com/watch?v=Y40bRyPQQr0
 * code : http://www.geeksforgeeks.org/depth-first-traversal-for-a-graph/
 *
 *                         A
 *                       /  \
 *                      B\  C
 *                      | \ /
 *                      D--E
 *                      \  |
 *                       \ /
 *                        F
 *
 *               DFS : A - > B ->  D -> E -> F -> C

 *
 *
 * initially stack will be empty and visited flag will be 0
 *
 *
 * Application : https://www.youtube.com/watch?v=dE3wBxYobrU
 * -------------
 * Cycle Detection , Connected Components , Topological Sorting , mazez puzzle
 *
 *
 *
 *
 *
 * =============================================================================================
 *    BFS :    LEVEL BY LEVER
 *    ----
 * BFS : QUEUE  , NO RECURSION
 * Go level by level  , broder level ...
 *
 * Problem : Since we have cycles ,
 * each node will be visited infinite times
 * Solution : Use a boolean visited array ,
 * This flag will be 1 if we visited the node
 *
 *
 * Initially : visited = {0,0,0,0,0}
 * Once you visited the node , make the boolean values is true and add that node in queue ..
 *   Do the above step until queue is not empty
 *    inside the while loop : check adjancent node visited or not , if not visit -> mark visted -> add it Queue
 *
 * When pop from Q ?
 * -----------------
 * Once you print then pop from the queue :
 *
 *
 *
 *
 *  Code : http://www.geeksforgeeks.org/breadth-first-traversal-for-a-graph/
 *  Video : https://www.youtube.com/watch?v=0u78hx-66Xk
 *
 *   TIME COMPLEXITY :
 *   ==================
 *   O(V+E)  => O(V) + O(E)
 *    O(V)  == FROM WHILE QUEUE IS NOT EMPTY
 *    O(E)  == FROM FOR LOOP , INSIDE THE WHILE LOOP
 *
 */
public class Graph_DFS_BFS {
}
