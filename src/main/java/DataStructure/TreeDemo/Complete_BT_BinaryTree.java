package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 9/6/17.
 *
 * Using Iterative Solution :
 * ==========================
 * http://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-complete-tree-or-not/
 *
 * Using Recursion Solution :
 * ==========================
 * http://www.geeksforgeeks.org/check-whether-binary-tree-complete-not-set-2-recursive-solution/
 *
 * What is complete BT ?
 -------------------
 *
 *  A complete binary tree is a binary tree in which every level,
 *  except possibly the last, is completely filled, and all nodes
 *  are as far left as possible
 *
 * http://www.geeksforgeeks.org/check-whether-binary-tree-complete-not-set-2-recursive-solution/
 *
 *  In case of a complete binary tree will strictly less be than the number
 *  of nodes in the complete binary tree.
 *
 *  What is NOT complete BT ?
 ---------------------------------
 *  http://www.geeksforgeeks.org/check-whether-binary-tree-complete-not-set-2-recursive-solution/
 *  Assigned indices are equal to the number of nodes in the binary tree.
 *
 * How to check is it complete BT ?
 * ---------------------------------

 1.Calculate the number of nodes (count) in the binary tree.
 2. Start recursion of the binary tree from the root node of the
 binary tree with index (i) being set as 0 and the number of nodes in the binary (count).
 3.If the current node under examination is NULL, then the tree is a complete binary tree. Return true.
 4.If index (i) of the current node is greater than or equal to the number of nodes in
 the binary tree (count) i.e. (i>= count), then the tree is not a complete binary. Return false.
 5.Recursively check the left and right sub-trees of the binary tree for same condition.
 For the left sub-tree use the index as (2*i + 1) while for the right sub-tree use the index as (2*i + 2).

 *
 */
public class Complete_BT_BinaryTree {
}
