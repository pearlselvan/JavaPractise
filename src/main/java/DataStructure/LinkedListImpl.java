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

//        linkedList.insertFirestwithNullCheck(51);
//        linkedList.insertFirst(50);
        linkedList.insertFirst(140);
        linkedList.append(40);
        linkedList.append(30);
        linkedList.append(20);
//        linkedList.printMiddle();
//        linkedList.insertBefore(linkedList.head.next,44);
//        linkedList.printList();
//        linkedList.append(100);

//        linkedList.insertFirst(30);
//        linkedList.insertFirst(10);
//        linkedList.insertAfter(linkedList.head,15); // inser after head
//        linkedList.insertAfter(linkedList.head.next,17); // inser after head //head -> next -> insert
//        linkedList.printList();
        linkedList.deleteWithData(30);
        linkedList.printList();
        System.out.println("----Printing reverse----");

//        linkedList.printreverseLinkedList(linkedList.head);
//        linkedList.printreverseLinkedListUsingOneWalk(linkedList.head);

    }

    //https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html
    /*
    Step 1: Create a newNode with given value.
    Step 2: Check whether list is Empty (head == NULL)
    Step 3: If it is Empty then, set newNode→next = NULL and head = newNode.
    Step 4: If it is Not Empty then, set newNode→next = head and head = newNode.
     */
    //http://quiz.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
    public void insertFirst(int data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        LLNode newNode = new LLNode(data); // This will create the new node

        /* 3. Make next of new Node as head */
        newNode.next = head ;  //change new node's next pointer points to head (head mean first node ) by storing head address into newNode.next
       /* 4. Move the head to point to new Node */
        head=newNode; //based on the above the new node will become then we need  storing head address in newnode.next thats current node
//        System.out.println("Head Address : " +head);
    }



    public void printMiddle() {
        LLNode fast = head ;
        LLNode slow= head  ;
        if (head!=null) {
            while (fast!=null && fast.next != null) {
//                while (fast!=null) {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        System.out.println("Middle : " +slow.data);

    }

    public void insertBefore(LLNode beforeNode , int data) {
        LLNode newNode = new LLNode(data);
        newNode.next = beforeNode;
        beforeNode.next = newNode;

    }

    public void insertFirestwithNullCheck(int data) {
        LLNode newNode = new LLNode(data);
        if (head == null) {
            head = newNode;
            return;


        }
        newNode.next = head;
        head = newNode;
    }
    //https://www.youtube.com/watch?v=njTh_OwMljA&list=PLX6IKgS15Ue02WDPRCmYKuZicQHit9kFt&index=28
    public void deleteWithData(int data ) {
        System.out.println("Deleing 1 " +data);

        if (head == null ) return;

        if (head.data == data) {
            head=head.next;
        }

        LLNode current = head ;

        while (current.next!=null) {
            if (current.next.data == data) {
                System.out.println("Deleting " +data);
// This will stop before deleting the node that is previous node
                // we need walk around the node
                current.next = current.next.next;
                return;
            }
            current=current.next;
        }

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
            previuosNode = current;
            System.out.println("<= :" + previuosNode.data);
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
        /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
          LLNode newNode = new LLNode(data); // Node which is going to insert

        /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null) {
            LLNode firstNode = new LLNode(data);
            return;
        }

        //last node will be null
         /* 4. This new node is going to be the last node, so
         make next of it as null */
        newNode.next = null ;

        /* 5. Else traverse till the last node */
        LLNode last =  head ;
        while (last.next != null) {
            last=last.next;
        }

        /* 6. Change the next of last node */
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
