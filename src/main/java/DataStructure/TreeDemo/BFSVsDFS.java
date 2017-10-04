package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 3/3/17.
 * http://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/



           (1)
          /  \
         /   \
       (2)   (3)
       / \
      /  \
    (4)  (5)

   BFS or Level Order :
   Breadth First Traversal : 1 2 3 4 5

   Depth First Traversals:
      Preorder Traversal : 1 2 4 5 3
      Inorder Traversal  :  4 2 5 1 3
      Postorder Traversal : 4 5 2 3 1

 Time Complexity?
 All four traversals require O(n) time
 as they visit every node exactly once.

 Is there any difference in terms of
 Extra Space?

BFS :
Queue is used to maintain the store the nodes
Extra Space required for Level Order Traversal is O(w)
where w is maximum width of Binary Tree.
In level order traversal, queue one by one stores nodes of different level.

DFS :
Extra Space required for Depth First Traversals is O(h)
where h is maximum height of Binary Tree.
In Depth First Traversals, stack (or function call stack)
stores all ancestors of a node.

Comparasion :
************

Advantages:
************

Depth-first traversal on a binary tree generally requires
 less memory than breadth-first.
Depth-first traversal can be easily implemented with recursion.

Disadvantages:
***************
A DFS doesn't necessarily find the shortest path to a node,
 while breadth-first search does

Breadth-first traversal is often compared with depth-first traversal.
====================================================================

Advantages:
************

A BFS will not necessarily find a target as quickly as possible,
but it will find the shortest path between the starting point and the target.
A depth-first search will not necessarily find the shortest path.


Disadvantages
**************

A BFS on a binary tree generally requires more memory than a DFS.

--------------------------------------|--------------------------------
            BFS                       |         DFS
--------------------------------------|--------------------------------
 Good for Shortest path               |   Good for finding target node quickly
 Extra space O(W) W-Width             |   Required extra spance O(h) , h is height
 Queue is used to store nodes         |   Recursive call
 Both are search alg in graph/tree    |   Both are search alg in graph/tree
 Level by Level (Root->Left->Right)   |   Inorder -> Post -> Pre order
 More memory to store each level node |   No Extra memory
 BFS start from root                  |   DFS starts from leaves
 Big O - o(n)                         |   Big O - o(n)
 FIFO ( it need large memory)         |   LIFO


 Why not a depth-first search work well?
 =======================================
 First, the depth-first search would just find a path.
 It wouldn’t necessarily find the shortest path. Second,
 even if we just needed any path, it would be very inefficient.
 Two users might be only one degree of separation apart,
 but it could search millions of nodes in their”subtrees” before
 finding this relatively immediate connection.


------------------------------------------------------------------------------
 Applications of BFS                        |    Applications of DFS
------------------------------------------------------------------------------
 To find Shortest path                      |    Useful in Cycle detection
 Single Source & All pairs shortest paths   |    In Connectivity testing
 In Spanning tree                           |    Finding a path between V and W in the graph.
 In Connectivity	                        |    useful in finding spanning trees & forest.




             BFS Example                  DFS Example :

                 A                            A
               /  \                         /  \
              B    C                       B    C
             /    / \                     /    / \
            D    E   F                   D    E   F

     ===>A->B->C->D->E->F              ===> A->B->D->C->E->F

 CONS (BFS ):
 ============

 Requires a large amount of memory
 When traversing one tree level, you need a way to know which
 nodes to traverse once you get to the next one. The way this is
 done is by storing the pointers to a level's child nodes while searching it.
 The pointers are stored in a FIFO way, this means that BFS needs a relatively
 large amount of memory in order to store the pointers.
 The amount of course depends on the complexity of the graph tree and the
 amount of nodes and/or level

 Ref :
 =====
 Breadth First graph traversal algorithms also happen to be very computationally demanding
 in the way that they calculate the shortest path. Take for instance if we have a binary tree of depth 10.
 The binary tree contains nodes which contain a maximum of 2 child nodes each,
 this is otherwise known as having a branching factor equal to 2.
 if we wanted to compute the optimal path for this graph then we would have to traverse,
 in a worst case scenario, 512 distinct nodes. Given that on modern machines this isn’t exactly what we would consider demanding,
 imagine if we had a new graph that had 3 child nodes for every node and the same depth of 10.
 With this new graph we would have to traverse, in a worst case scenario, 19,683 different nodes.
 And given that this is only at depth 10 with 3 child nodes, you can easily extrapolate the numbers for yourself.
 With a branching factor of 10 and a depth of 16, it would take 350 years to compute the solution on an ordinary personal computer,
 give or take.

 https://tutorialedge.net/post/general/artificial-intelligence/breadth-first-search-java/


 */

public class BFSVsDFS {

}


class Tree {
    int data;
    Tree left , right ;

    public Tree(int data) {
        this.data = data;
        left=right=null ;
    }
}
