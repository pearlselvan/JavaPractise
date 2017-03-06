package DataStructure;

/**
 * Created by muthuselvan on 3/5/17.
 */
//https://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/

/*
Two types of circular :
1. Singly Linked List as Circular :
------------------------------------
The next pointer of the last node points to the first node.


2. Doubly Linked List as Circular :
------------------------------------
The next pointer of the last node points to the first node ( same as in above 1 )
 and
the previous pointer of the first node points to the last node making
the circular in both directions

Advantages
-----------
1.List can be traversed bothways from head to tail as well as tail to head
2.Being a circular linked list tail can be reached with one operation from head node

Disadvantages
-------------
It takes slightly extra memory in each node to accomodate previous pointer

Practical Applications:
-----------------------
Managing songs playlist in media player applications
Managing shopping cart in online shopping





 */

/*

http://techyrajeev.blogspot.com/2012/03/java-tutorial-on-circular-doubly-linked.html
 */

public class DoublyLinkedListAsCircular {

    LLNode head ;
    public static void main(String[] args) {

    }

    public void insert(int data) {

        LLNode newNode = new LLNode(data);

    }

    public void dislay(LLNode head) {

    }


}

//class for DoublyLinkedListAsCircular
class DLL {

    DLL next ;
    DLL previous ;
    int data ;




}

