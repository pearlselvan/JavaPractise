package DataStructure;

/**
 * Created by muthuselvan on 2/15/17.
 */

/*
First node of linked list is called head and last node is called tail.
A linked list is said empty if it doesn't contain any node i.e. head points to null.

 */

/*
INSERT :
1) At the front of the linked list
2) After a given node.
3) At the end of the linked list.
http://quiz.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
 */
public class LinkedListImpl {

    LLNode head ;


    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.insertFirst(50);
        linkedList.append(100);
        linkedList.insertFirst(40);
        linkedList.insertFirst(30);
        linkedList.insertFirst(10);
        linkedList.insertAfter(linkedList.head,15); // inser after head
        linkedList.insertAfter(linkedList.head.next,17); // inser after head //head -> next -> insert
        linkedList.printList();
        System.out.println("----Printing reverse----");

        linkedList.printreverseLinkedList(linkedList.head);
        linkedList.printreverseLinkedListUsingOneWalk(linkedList.head);

    }

    public void insertFirst(int data) {
        System.out.println("Insert first :" +data);
        LLNode newNode = new LLNode(data); // This will create the new node
        newNode.next = head ;
        head=newNode;
    }


    /*
Complexity
O(n)O(n) time and O(1)O(1) space.
We pass over the list only once, and maintain a constant
number of variables in memory.

In one pass from head to tail of our input list,
we point each node's next pointer to the previous item.

The order of operations is important here!
We're careful to copy current.next into next
before setting current.next to previous.
Otherwise "stepping forward" at the end could actually
mean stepping back to previous!
     */

    public void printreverseLinkedListUsingOneWalk(LLNode head) {
        LLNode current = head ;
        LLNode previuosNode = null ;
        LLNode nextNode = null ;

        System.out.println("Printing Reverse using OneWalk");
        while (current != null) {

            nextNode = current.next;

            current.next = previuosNode;

            previuosNode = current ;


            System.out.println("<= :" +previuosNode.data);


            current = nextNode;



        }



    }

    public void printreverseLinkedList(LLNode first) {
        if (first == null) {
            return;
        }
        printreverseLinkedList(first.next);
        System.out.print("->" +first.data);
    }

    public void insertAfter(LLNode prevNode , int data) {
        System.out.println("Inserting " +data +" after : " +prevNode.data);

        if (prevNode == null) {
            System.out.println("Node is empty ..insert first");
            return;
        }

        LLNode newNode = new LLNode(data);

        newNode.next = prevNode.next;
        prevNode.next = newNode;
        return;






    }

    public void append(int data) {
        System.out.println("Appening " +data);
          LLNode newNode = new LLNode(data); // Node which is going to insert

        if (head == null) {
            LLNode firstNode = new LLNode(data);
            return;
        }

        //last node will be null
        newNode.next = null ;
        LLNode last =  head ;

        while (last.next != null) {
            last=last.next;
        }

        last.next = newNode;
        return;

    }

    public void printList() {
        System.out.println("print order ..");
        LLNode printNode = head ;
        while (printNode!=null) {
            System.out.print("->"+printNode.data);
            printNode=printNode.next;
        }

    }


}





class LLNode {
    LLNode next ;
    int data ;

    public LLNode(int data) {
        this.data = data;
        next = null;
    }
}
