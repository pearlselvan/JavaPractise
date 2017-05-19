package DataStructure;

/**
 * Created by muthuselvan on 2/6/17.
 */

/*

http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/
Nodes smaller than root goes to the left of the root
and Nodes greater than root goes to the right of the root.
left < root < right
 */


/*

Binary Search Tree Opearation :

1 >>> Find element : Find(int n) >>> o(log(n))

1. Start from the root and com­pare root.data with n
2. if root.data is greater than n that means we need to go to the left of the root.
3. if root.data is smaller than n that means we need to go to the right of the root.
4. if any point of time root.data is equal to the n then we have found the node, return true.
5. if we reach to the leaves (end of the tree) return false, we didn’t find the element
 */

public class BinarySearchTree {
    public static NodeBST root ;

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(100);
        binarySearchTree.insert(2);
        System.out.println(binarySearchTree.find(100));
        System.out.println(binarySearchTree.find(1000));
        binarySearchTree.display(binarySearchTree.root);

    }


    public void inOrder() {
    //http://javabeat.net/binary-search-tree-traversal-java/
    }

    public void postOrder() {
    //http://javabeat.net/binary-search-tree-traversal-java/
    }

    public void preOrder() {
        //http://javabeat.net/binary-search-tree-traversal-java/
    }

    public BinarySearchTree() {
        this.root = null ;
    }

    //use recursion
    //To know about how we are dis­play­ing nodes in increas­ing order
    public void display(NodeBST root) {
        if (root != null ) {
            display(root.left);
            System.out.print(" => " +root.data);
            display(root.right);
        }
    }

    public boolean find(int data) {
        NodeBST current = root ;
        while(current != null ) {
            if (current.data == data) {
                return true;
            } else if (current.data > data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void insert(int data) {
        NodeBST newNode = new NodeBST(data);
        if (root == null) {
        root = newNode ;
        return;
        }

        NodeBST current = root; // current will point to the root which we created as first node so if we may to change if
        NodeBST parent = null ; // inserting node is greater then current node , in that case current node will become parent
        //thats why we initilized the parent node as null ...
        // the following loop will check the current.data with data which we are going to insert

        while(true) {
          parent = current ;  //

          if (data < current.data) {
              current = current.left;
              if (current == null) {
                  parent.left = newNode;
                  return;
              }
          } else {
              current = current.right;
              if (current == null) {
                  parent.right= newNode;
                  return;
              }
          }
        }
    }
}

class NodeBST {
    int data ;
    NodeBST right ;
    NodeBST left ;

    public NodeBST(int data) {
        this.data = data;
        right = null ;
        left =  null  ;
    }


}
