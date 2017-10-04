package DataStructure.GraphDemo;
/**
 * Created by muthuselvan on 9/6/17.
 * http://www.geeksforgeeks.org/algorithms-gq/graph-shortest-paths-gq/
 *
 *
 *   Comparing :
 *  ===========
 *
 *  A* Vs dijkstra Vs BFS :
 *  =======================
 *  https://www.slant.co/topics/3893/versus/~a-algorithm_vs_dijkstra-s-algorithm_vs_breadth-first-search
 *
 *  About : Dig :
 *  https://www.slant.co/improve/topics/3893/viewpoints/1/~2d-pathfinding-algorithms~dijkstra-s-algorithm
 *
 *  About : BFS :
 *  https://www.slant.co/improve/topics/3893/viewpoints/3/~2d-pathfinding-algorithms~breadth-first-search
 *
 * ---------------------------------------------------------------------------------------------------------
 *    Dig                                              |
 * ---------------------------------------------------------------------------------------------------------
 * 1.Dijkstra is an uninformed algorithm.              |BFS is complete, which means that it will
 * This means that it does not need to know the        |always find a solution if it exists
 * target node beforehand. For this reason it's        |
 * optimal in cases where you don't                    |
 * have any prior knowledge of the                     |
 * graph when you cannot estimate                      |
 * the distance between each node and the target.      |
 * -----------------------------------------------------------------------------------------------------------                                                    |
 * 2.Since Dijkstra picks edges with the smallest cost |BFS is very useful when you want to find
 * at each step it usually covers a large area of the  |the shortest and most optimal path by
 * graph. This is especially useful when you have      |traversing as few edges as possible
 * multiple target nodes but you don't                 |
 * know which one is the closest.                      |
 * -----------------------------------------------------------------------------------------------------------
 * Cons (Negative value):                              | Cons (Large memory)
 * ----------------------                              |--------------------
 * If we take for example 3 Nodes (A, B and C)         |When traversing one tree level,
 * where they form an undirected graph with            |you need a way to know which nodes to traverse once you get
 * edges: AB = 3, AC = 4, BC=-2,                       |to the next one.
 * the optimal path from A to C costs                  |The way this is done is by storing the pointers to a
 * 1 and the optimal path from A to B costs 2.         |level's child nodes while searching it.
 * If we apply Dijkstra's algorithm: starting from A   |The pointers are stored in a FIFO way,
 * it will first examine B because it is the closest   |this means that BFS needs a relatively
 * node.                                               |large amount of memory in order to store the pointers.
 * and will assign a cost of 3 to it and therefore     |The amount of course depends on the complexity
 * mark it closed which means that its cost will never |of the graph tree and the amount of nodes and/or levels.
 * be reevaluated. This means that Dijkstra's          |
 * cannot evaluate negative edge weights.              |
 * ---------------------------------------------------------------------------------------------------------------


**/