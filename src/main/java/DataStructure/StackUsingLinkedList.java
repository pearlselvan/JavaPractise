package DataStructure;

/**
 * Created by muthuselvan on 3/16/17.
 * http://www.java2blog.com/2016/09/implement-stack-using-linked-list-in-java.html
 * http://btechsmartclass.com/DS/U2_T3.html
 *
 */
public class StackUsingLinkedList {

    private StackNode head ;


    public static void main(String[] args) {

        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.printList(stackUsingLinkedList.head);


    }
    public void push(int data) {
        StackNode oldNode = head;
        head  = new StackNode();
        head.next = oldNode;
        head.data = data ;
//        if (head ==null) {
//            head.next = newNode;
//        }

    }



    public void pop() {

    }

    public void printList(StackNode head) {
        StackNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

class StackNode {
    int count ;

    int data ;
    StackNode next ;

    public StackNode() {
        count++;
    }



//    public StackLL(int data) {
//        this.data = data;
//        this.next = null ;
//    }
}
