package DataStructure;

/**
 * Created by muthuselvan on 3/10/17.
 * http://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 */

/*
Use Hashing:
Traverse the list one by one and keep putting the node addresses in a Hash Table.
At any point, if NULL is reached then return false
and if next of current node points to any of the previously stored nodes
in Hash then return true.

Mark Visited Nodes:
This solution requires modifications to basic linked list data structure.
Have a visited flag with each node.
Traverse the linked list and keep marking visited nodes
.If you see a visited node again then there is a loop.
This solution works in O(n)
but requires additional information with each node.
A variation of this solution that doesn’t require modification to basic
data structure can be implemented using hash.
Just store the addresses of visited nodes in a hash and
 if you see an address that already exists in hash then there is a loop.

Floyd’s Cycle-Finding Algorithm:
This is the fastest method. Traverse linked list using two pointers.
Move one pointer by one and other pointer by two.
If these pointers meet at some node then there is a loop.
If pointers do not meet then linked list doesn’t have loop.
 */
public class LinkedListLoopCheck {

    static NodeLoop head ;

    public static void main(String[] args) {
        LinkedListLoopCheck list = new LinkedListLoopCheck();
        list.head = new NodeLoop(10);
        list.head.next = new NodeLoop(15);
        list.head.next.next = new NodeLoop(20);
        list.head.next.next.next = new NodeLoop(120);
        printList(head);
        printMiddle();

        list.head.next = list.head; ///*Create loop for testing */
        detectLoop();


    }

    public static void printList(NodeLoop node) {
        while (node!= null) {
            System.out.print(node.data +"-");
            node=node.next;
        }
    }

    // Function that detects loop in the list
    // In the Floyd’s algo, the slow and fast pointers meet at a loop node
    // We know that Floyd’s Cycle detection algorithm terminates when fast and slow pointers meet at a common point

        public static int detectLoop() {
        NodeLoop slowPtr =head ;
        NodeLoop fastPrt = head ;

        while (slowPtr!=null && fastPrt!=null && fastPrt.next!=null){
            slowPtr = slowPtr.next;
            fastPrt = fastPrt.next.next;

            if (slowPtr == fastPrt) {
                System.out.println("Loop detected ..");
                return 1 ;
            }
        }
  return 0 ;
    }

    /* Function to print middle of linked list */
    static void printMiddle()
    {
        NodeLoop slow_ptr = head;
        NodeLoop fast_ptr = head;
        if (head != null)
        {
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                    slow_ptr.data + "] \n");
        }
    }




}

class NodeLoop {

    int data ;
    NodeLoop next ;

    public NodeLoop(int data) {
        this.data = data;
        next = null ;
    }
}
