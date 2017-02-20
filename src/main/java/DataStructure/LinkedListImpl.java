package DataStructure;

/**
 * Created by muthuselvan on 2/15/17.
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

    }

    public void insertFirst(int data) {
        System.out.println("Insert first :" +data);
        LLNode newNode = new LLNode(data); // This will create the new node
        newNode.next = head ;
        head=newNode;
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
