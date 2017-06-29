package DataStructure.LinkedListDemos;

import java.util.Stack;

/**
 * Created by muthuselvan on 4/19/17.
 * http://www.crazyforcode.com/check-singly-linked-list-palindrome/
 *
 *
 * Using Recursion and Iterative Method :
 * ---------------------------------------
 * http://www.geeksforgeeks.org/write-a-function-to-reverse-the-nodes-of-a-linked-list/
 *
 */
public class SinglyLinkedListisPalindrome {
    static PNode head ;
    public SinglyLinkedListisPalindrome() {

    }
    public static void main(String[] args) {
        SinglyLinkedListisPalindrome singlyLinkedListisPalindrome = new SinglyLinkedListisPalindrome();
        singlyLinkedListisPalindrome.append2(10);
        singlyLinkedListisPalindrome.append2(20);
        singlyLinkedListisPalindrome.append2(201);
        singlyLinkedListisPalindrome.append2(20);
        singlyLinkedListisPalindrome.append2(10);
        singlyLinkedListisPalindrome.printList();

        PNode reverse = singlyLinkedListisPalindrome.reverserLinkedListAndClone(head);

//        singlyLinkedListisPalindrome.printWithNode(reverse);
        System.out.println("[[[  Is palindronme >>>>>>>>>" +singlyLinkedListisPalindrome.isEqualafterReversed(head,reverse));


        System.out.println("Using Stack" +singlyLinkedListisPalindrome.isPalindromeUsingStack(head));




    }

    public void printWithNode(PNode head) {

        while(head.next != null) {
            System.out.println("<" +head.data+" >");
            head=head.next;

        }

    }


    boolean isEqualafterReversed(PNode original, PNode reversed) {

        while (original!=null && reversed!=null) {
            if (original.data!=reversed.data) {
                return false;
            }
            original=original.next;
            reversed=reversed.next;
        }
        return original==null && reversed == null;

    }

    public void append(int data) {
        PNode new_node = new PNode(data);
        if (head == null) {
            PNode firstNode = new PNode(data);
            return;
        }
        new_node.next = null;
        PNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
        return;
    }

    public PNode reverserLinkedListAndClone(PNode node) {

        PNode temp = null;

        while(node!=null) {
            PNode clone=new PNode(node.data);
            clone.next=temp;
            temp= clone;
            node=node.next;

        }

     return temp;

    }


    public boolean isPalindromeUsingStack(PNode node) {

        PNode slow = head;
        PNode fast = head;
        Stack<Integer> palindrom = new Stack<>();

        while (slow!=null && fast!=null && fast.next!=null) {
           palindrom.push(slow.data);
           slow=slow.next;
           fast=fast.next.next;
        }

        if (fast!=null) {
            slow=slow.next;
        }
        System.out.println(slow.data);

        while(slow!=null) {
            int data = palindrom.pop().intValue();

            if (data != slow.data) {
                System.out.println("Palindrom is True using stack");
                return false;

            }

            slow=slow.next ;
        }


        return true;
    }

    public void append2(int data) {
        System.out.println("Appening " +data);
        /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        PNode newNode = new PNode(data); // Node which is going to insert

        /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null) {
//            PNode firstNode = new PNode(data);
            newNode.next=head;
            head=newNode;
            return;
        }

        //last node will be null
         /* 4. This new node is going to be the last node, so
         make next of it as null */
        newNode.next = null ;

        /* 5. Else traverse till the last node */
        PNode last =  head ;
        while (last.next != null) {
            last=last.next;
        }

        /* 6. Change the next of last node */
        last.next = newNode;
        return;

    }

    public void push(int new_data)
    {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        PNode new_node = new PNode(new_data);

    /* 3. Make next of new Node as head */
        new_node.next = head;

    /* 4. Move the head to point to new Node */
        head = new_node;
    }


    public void printList() {
        System.out.println("print order ..");
        PNode printNode = head ;
        while (printNode!=null) {
            System.out.print("->"+printNode.data);
            printNode=printNode.next;
        }

    }

    public void display() {
        PNode temp = head;
        while (temp!=null) {
            System.out.println("[" +temp.data +"]");
            temp=temp.next;
        }

    }
}


class PNode {
    int data;
    PNode next ;

    public PNode(int data) {
        this.data = data;
        next = null ;
    }


}
