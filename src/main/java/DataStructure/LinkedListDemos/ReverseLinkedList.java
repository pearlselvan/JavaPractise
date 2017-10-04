package DataStructure.LinkedListDemos;

import java.util.Stack;

/**
 * Created by muthuselvan on 4/3/17.
 * http://algorithms.tutorialhorizon.com/reverse-a-linked-list/
 * http://www.geeksforgeeks.org/write-a-function-to-reverse-the-nodes-of-a-linked-list/
 *
 * Iterative Vs Recursion :
 * ------------------------
 * iterative function is one that loops to repeat some part of the code, and
 * a recursive function is one that calls itself again to repeat the code
 *
 * Approach: 1
 * -----------

 Iter­a­tive:
 http://algorithms.tutorialhorizon.com/reverse-a-linked-list/

     Cre­ate 3 nodes, cur­rN­ode, Pre­vN­ode and nextNode.
     Ini­tial­ize them as cur­rN­ode = head; nextN­ode = null;pre­vN­ode = null;
     Now keep revers­ing the point­ers one by one till currNode!=null.


 Big O
 ------
 Time Complexity: O(n)
 Space Complexity: O(1)




 Approach: 2
 * -----------
 Recur­sion:
 http://algorithms.tutorialhorizon.com/reverse-a-linked-list-part-2/

 Tra­verse till the end of list through recursion.
 Make the last node as head.
 Now you are at the end of the list and rest of the nodes are stores in a stack
 Now while com­ing back, each node will pop out from the stack in reverse order
 take these nodes and start point­ing it to next node com­ing out of stack.

 Time Complexity: O(n)
 Space Complexity: O(1)

 *
 */
public class ReverseLinkedList {

    static Rev head ;
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.push(10);
        reverseLinkedList.push(20);
        reverseLinkedList.push(30);
        reverseLinkedList.diaply(head);

        reverseLinkedList.reverse(head);
        reverseLinkedList.diaply(head);

        /*
        Stack<Integer> reverseStack = reverseStack();
        System.out.println("Size" +reverseStack.size());

        while (!reverseStack.empty()) {
            System.out.println("R - " +reverseStack.pop());
        }

 */
        System.out.println("Using Recursion .............");
        reverseLinkedList.reverseRecursively();
        reverseLinkedList.diaply(head);

    }

 //using stack
    public static Stack<Integer> reverseStack() {
        Stack<Integer> stack = new Stack<>();
        Rev current = head ;
        while (current!=null) {
            System.out.println("Adding " +current.data);
            stack.push(current.data);

            current=current.next;
        }

        return stack;
    }


    public  void push(int data) {
        Rev new_node=new Rev(data);
        new_node.next=head;
        head=new_node;
    }

    public void reverseRecursively(){
        head = reverseRecursively(head);
        System.out.println(head.data);
    }

    private static Rev reverseRecursively(Rev node){
        Rev newHead; //base case - tail of original linked list
        if((node.next == null))
        {
            return node;
        }
        newHead = reverseRecursively(node.next);
        //reverse the link e.g. C->D->null will be null
        //The below statement will be executed when base or exit condition (node.next ==null) is reached
        node.next.next = node;
        node.next = null;

        return newHead;
    }




    public static Rev reverseListUsingRecursion(Rev head) {
        if(head==null || head.next == null)
            return head;

        //get second node
        Rev second = head.next;
        //set first's next to be null
        head.next = null;

        Rev rest = reverseListUsingRecursion(second);
        second.next = head;

        return rest;
    }



    //Iterative approach
    /*
    Time Complexity: O(n)
    Space Complexity: O(1)
     */
    public Rev reverseUsinIterative(Rev first){
        Rev current=first;
        Rev next=null;
        Rev prev=null;

        while (current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
        }

        first=prev;
        return first;

    }

    /* Function to reverse the linked list */
    Rev reverse(Rev node) {
        Rev prev = null;
        Rev current = node;
        Rev next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void insert(int data) {
        Rev new_node = new Rev(data);
        if (head==null) {
            Rev first = new Rev(data);
        }
        new_node.next=head;
        head=new_node;
    }

    public void diaply(Rev current) {
        current = head ;
        while (current!=null) {
            System.out.println("-> " +current.data);
            current=current.next;
        }
    }

}

class Rev {

    int data ;
    Rev next ;

    public Rev(int data) {
        this.data = data;
        this.next=null;
    }
}
