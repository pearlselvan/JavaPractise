package DataStructure;

/**
 * Created by muthuselvan on 2/6/17.
 */

/*

For Given :
     1
   /  \
  2   3
 / \
4   5



InOrder:
Algorithm Inorder(tree) :
1. Traverse the left subtree, i.e., call Inorder(left-subtree)
2. Visit the root.
3. Traverse the right subtree, i.e., call Inorder(right-subtree)

in-order : 4 2 1 5 3

PreOrder:
Algorithm Preorder(tree)
1. Visit the root.
2. Traverse the left subtree FROM ROOT, i.e., call Preorder(left-subtree)
3. Traverse the right subtree FROM ROOT, i.e., call Preorder(right-subtree)

Pre-order : 1 2 4 3 5

PostOrder :
Algorithm Postorder(tree)
1. Traverse the left subtree, i.e., call Postorder(left-subtree)
2. Traverse the right subtree, i.e., call Postorder(right-subtree)
3. Visit the root.

post-order : 4 5 2 3 1



Reff : http://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/


 */


public class DepthFirstSearch_InOrder_PreOrder_PostOrder {


}
