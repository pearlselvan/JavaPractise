package DataStructure;

/**
 * Created by muthuselvan on 3/21/17.
 * Given a singly linked list, rotate the linked list counter-clockwise by k nodes
 * IP : 10->20->30->40->50->60 and k is 4,
 * OP: 50->60->10->20->30->40.
 * Assume that k is smaller than the count of nodes in linked list.
 *
 * impl :
 * 1 .To rotate the linked list, we need to change next of kth node to NULL ( 60 is NULL)
 * 2. next of last node to previous head node, ( that 60 is to point to head node : 60 )
 * 3. finally change head to (k+1)th node. ( change 50 as head )
 *
 * When to start the above step 1 to 3 :
 * Traverse the list from beginning and stop at kth node.
 * Store pointer to kth node. We can get (k+1)th node using kthNode->next.
 * Keep traversing till end and store pointer to last node also.
 * Finally, change pointers as stated above.


 *
 */
public class RotateLinkedList {

    RLL head ;

    public static void main(String[] args) {
      /*
      Given list
        10 20 30 40 50 60
      Rotated Linked List
        50 60 10 20 30 40
       */

        RotateLinkedList llist = new RotateLinkedList();

        // create a list 10->20->30->40->50->60
        for (int i = 40; i >= 10; i -= 10)
            llist.push(i);

        System.out.println("Given list");
        llist.printList();

        llist.rotate(2);

        System.out.println("Rotated Linked List");
        llist.printList();

    }




    void printList()
    {
        RLL temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    /*  Given a reference (pointer to pointer) to the head
        of a list and an int, push a new node on the front
        of the list. */
    void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        RLL new_node = new RLL(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
  //http://www.geeksforgeeks.org/rotate-a-linked-list/
    public void rotate(int numberOfRotatio) {

        //1 . check nTime is zero
        //2 . iterate till Ntime
        //3 . check numberOfRotatio greater then number of node values
        //4. assign the current node ( when while loop terminate ) to kthNode for
        //5   make last node as head : how , do while from current.next !=null then current.next = head


        if (numberOfRotatio == 0) return;

        // Let us understand the below code for example k = 4
        // and list = 10->20->30->40->50->60.
        RLL current  = head;

        // current will either point to kth or NULL after this
        // loop. current will point to node 40 in the above example
        int count = 1;
        while (count < numberOfRotatio && current !=  null)
        {
            current = current.next;
            count++;
        }

        // If current is NULL, k is greater than or equal to count
        // of nodes in linked list. Don't change the list in this case
        if (current == null)
            return;

        // current points to kth node. Store it in a variable.
        // kthNode points to node 40 in the above example
        RLL kthNode = current;

        // current will point to last node after this loop
        // current will point to node 60 in the above example
        while (current.next != null)
            current = current.next;

        // Change next of last node to previous head
        // Next of 60 is now changed to node 10

        current.next = head;

        // Change head to (k+1)th node
        // head is now changed to node 50
        head = kthNode.next;

        // change next of kth node to null
        kthNode.next = null;








    }
}

class RLL {
     RLL next ;
     int data ;

    public RLL(int data) {
        this.data=data;
        this.next = null ;
    }

}
