package DataStructure.TreeDemo;

import java.util.Hashtable;

/**
 * Created by muthuselvan on 3/6/17.
 * http://www.geeksforgeeks.org/sorted-array-to-balanced-bst/

 Given a BST (Binary Search Tree) that may be unbalanced,
 convert it into a balanced BST that has minimum possible height.


 STEPS :
 ========

 1) Get the Middle of the array and make it root.
 2) Recursively do same for left half and right half.
 a) Get the middle of left half and make it left child of the root
 created in step 1.
 b) Get the middle of right half and make it right child of the
 root created in step 1.

 Exmaple :

 Input:
      30
    /
   20
  /
 10

 Output:
    20
  /   \
 10   30

-------------
 Input:
          4
         /
        3
       /
      2
     /
    1
 Output:
    3            3           2
  /  \         /  \        /  \
 1    4   OR  2    4  OR  1    3   OR ..
 \          /                   \
 2        1                     4
------------
 Input:
          4
        /   \
       3     5
      /       \
     2        6
    /          \
   1           7
     Output:
        4
     /    \
    2      6
  /  \    /  \
 1    3  5    7
------------------

 Implementation :
 A Simple Solution is to traverse nodes in Inorder
 and one by one insert into a self-balancing BST like AVL tree.
 Time complexity of this solution is O(n Log n) and this solution doesn’t guarantee

 An Efficient Solution can construct balanced BST in O(n) time with minimum possible height.
 Below are steps.

 Traverse given BST in inorder and store result in an array.
 This step takes O(n) time.
 Note that this array would be sorted as inorder traversal of BST
 always produces sorted sequence.
 Build a balanced BST from the above created sorted array using
 the recursive approach discussed here. This step also takes O(n) time as
 we traverse every element exactly once and processing an element takes O(1) time.

 */
public class BST_To_BalancedBST {

    public static void main(String[] args) {
//        Hashtable<K,V> hashtable = new Hashtable<K, V>();
    }

}
