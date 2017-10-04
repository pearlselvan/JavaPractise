package CodingPractise;

//import DataStructure.LinkedListDemos.Rev;

/**
 * Created by muthuselvan on 8/4/17.
 */
public class ReverseKthNode {

    Node first ;


    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth=null;


//        revese(first,2);

    }


    public static Node reverseListUsingRecursion(Node head) {
        if(head==null || head.next == null)
            return head;

        //get second node
        Node second = head.next;
        //set first's next to be null
        head.next = null;

        Node rest = reverseListUsingRecursion(second);
        second.next = head;

        return rest;
    }


    public static Node revese(Node first) {

        Node current = first ;
        Node prev = null;
        Node next = null;
        next=current.next;
        int count = 0 ;

        while ((current.next!= null) ){
            next=current.next;
            current=prev;
            prev=current;
            next=current;

        }

        return current;

//        if (next!=null)
//            first.next=revese(next,k);
//        return prev;
    }

}


class Node {
    int data ;
    Node next ;

    public Node(int data) {
        this.data = data;

    }
}
