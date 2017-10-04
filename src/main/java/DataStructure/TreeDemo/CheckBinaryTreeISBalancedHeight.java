package DataStructure.TreeDemo;

import java.util.BitSet;

/**
 * Created by muthuselvan on 4/1/17.
 *
 * 0(N^2)
 * ======
 * http://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
 *
 * o(N)- Bottom up approach : but its c code ?
 * ---------------------------
 * http://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
 * https://leetcode.com/problems/balanced-binary-tree/discuss/
 *
 * 0(N) - Recursion :
 * ------------------
 * https://leetcode.com/problems/balanced-binary-tree/discuss/
 *
 * Logic :
 * =======
 * To check if a tree is height-balanced, get the height of left and right subtrees.
 * Return true if difference between heights is not more than 1 and left and right subtrees are balanced,
 * otherwise return false.
 */
public class CheckBinaryTreeISBalancedHeight {

    BalTree root ;

    BitSet bitSet = new BitSet(10000);
    public static void main(String[] args) {

        CheckBinaryTreeISBalancedHeight tree = new CheckBinaryTreeISBalancedHeight();
        tree.root = new BalTree(10);

        tree.root.left=new BalTree(20);
        tree.root.right=new BalTree(30);

        tree.root.left.right=new BalTree(40);
        tree.root.left.left=new BalTree(50);


        tree.root.right.left=new BalTree(60);
        tree.root.right.right=new BalTree(70);

        System.out.println("-" +isBalanced(tree.root));


        preOrder(tree.root);


    }



    public static boolean isBalanced(BalTree node) {
        int lh;
        int rh;

        if (node == null)
            return true;
        System.out.println(getHeight(node));

        return false;
    }


    public static int getHeight(BalTree node) {

        if (node==null)
            return 0;

        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    public static void preOrder(BalTree root) {

        if (root ==null)
            return;
        System.out.println( root.data);
        preOrder(root.left);
        preOrder(root.right);



    }

}


class BalTree {

    BalTree left,right ;
    int data;

    public BalTree(int data) {
        this.data=data;
        left=right=null;


    }
}
