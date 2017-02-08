package DataStructure;

/**
 * Created by muthuselvan on 2/7/17.

 For Given :
     1
    / \
   2   3
 /  \
4   5

 Level order means : from top and left and right
 1 2 3 4 5

 Implementation for printLevelorder for given tree:
 ---------------------------------------------------
 printLevelorder(tree)
 for d = 1 to height(tree)
 printGivenLevel(tree, d);
 Reff : http://www.geeksforgeeks.org/level-order-tree-traversal/
 */

public class BreathFirstTraversal_LevelOrder {
    NodeBFT root ;
    public BreathFirstTraversal_LevelOrder() {
        root=null ;
    }

    public static void main(String[] args) {
        BreathFirstTraversal_LevelOrder BFT = new BreathFirstTraversal_LevelOrder();
    }

/* Compute the "height" of a tree -- the number of
nodes along the longest path from the root node
down to the farthest leaf node.

Need iterate till height of the tree to printLevelorder
method

This recursive function will call till root is null
 */

int height(NodeBFT root) {
Integer lheight = 0 ;
Integer rheight = 0 ;
if (root == null)
return 0;
else {
lheight = height(root.left);
rheight = height(root.right);
if (lheight > rheight)
return (lheight+1);
else return (rheight+1);
}
}

    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    /* Print nodes at the given level */
    void printGivenLevel (NodeBFT root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

}

class NodeBFT {
    int data ;
    NodeBFT left ;
    NodeBFT right ;
    public NodeBFT(int data) {
        this.data = data;
        left = right = null ;
    }

}
