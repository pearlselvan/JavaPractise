package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 2/6/17.
 */
/*
A binary tree is a tree where every node has two or fewer children.
 The children are usually called left and right.
 */
public class BinaryTree {

    BTNode root ;

    public BinaryTree() {
        this.root = null;
    }

    /*
           10
          /  \
        20   30
       /  \
     40   50
     */

    public static void main(String[] args) {
        BinaryTree  binaryTree  = new BinaryTree();
        binaryTree.root = new BTNode(10);
        binaryTree.root.left = new BTNode(20);
        binaryTree.root.right = new BTNode(30);
        binaryTree.root.left.left = new BTNode(40);
        binaryTree.root.left.right = new BTNode(50);

        binaryTree.insert(2);

        System.out.print("Pre - Order:");
        binaryTree.printPreOrder(binaryTree.root);
        System.out.print("Post - Order:");
        binaryTree.printPostOrder(binaryTree.root);
        System.out.print("In - Order:");
        binaryTree.printinOrder(binaryTree.root);

        BTNode searchNode = binaryTree.search(binaryTree.root,10);
        System.out.println("Found " +searchNode.data);


    }


    void display(BTNode root) {

        while (root!=null) {
            System.out.println(root.data);

        }

    }

    void insert(int key) {
        BTNode newNode = new BTNode(key);
        BTNode parent = null;
        BTNode current = root;
        while (current != null) {
            parent = current;
            if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
            if (key < parent.data) {
                parent.left = newNode;
            } else {
                parent.right = newNode;

            }
            System.out.println(root);

    }

    void printPostOrder(BTNode node) {
        if (node !=null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print("[ " +node.data +" ]");
        }
    }


    BTNode search(BTNode node , int key) {

        if (node == null) return null;
        if (node.data == key) return node;

        if (node.data < key) {
            search(node.right,key);
        }

        if (node.data < key) {
            search(node.left,key);
        }

        return null;



    }

    void printinOrder(BTNode node) {
        if (node!=null) {
            printinOrder(node.left);
            System.out.print("[ "+node.data+ "]");
            printinOrder(node.right);
        }

    }

    void printPreOrder(BTNode node) {

        if (node != null) {
            System.out.print("[ "+node.data+" ]");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }
}



class BTNode {

    int data ;
    BTNode left , right ;

    public BTNode(int data) {
        this.data = data;
        left= right= null;
    }


}
