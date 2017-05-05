package DataStructure;

/**
 * Created by muthuselvan on 3/3/17.
 * http://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/
 */

/*
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
