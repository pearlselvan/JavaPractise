package DataStructure.LinkedListDemos;

/**
 * Created by muthuselvan on 8/6/17.
 */
public class ReverseLinkedListIterative {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;  //-----> Return because prev will contain previous nod when iterating the node
        Node current = node;
        Node next = null;
        //How to get the address of the current ..yes current.next will contain address of the current
        while (current != null) {
            next = current.next;  //first store the address for current in next ..
            current.next = prev; // initially prev is null
            prev = current; // then move / replace the prev to current
            current = next; // then move / replace current to next
        }
        return prev; //finally return prev
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedListIterative list = new ReverseLinkedListIterative();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

}
