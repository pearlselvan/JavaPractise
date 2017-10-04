package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 9/26/17.
 * http://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
 *
 * What is minimun deepth ? First Recall ?
 *
 *  How to find deepth ? or hight ?
 *  ===============================
 * The idea is to traverse the given Binary Tree.
 * For every node, check if it is a leaf node. If yes, then return 1.
 * If not leaf node then if left subtree is NULL, then recur for right subtree.
 * nd if right subtree is NULL, then recur for left subtree. If both left and right
 * subtrees are not NULL, then take the minimum of two heights.
 *
 */
public class MinimumDepth_BinaryTree {

    public static void main(String[] args) {

    }



}
